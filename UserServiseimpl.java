package com.yang.text.service.impl;

import com.yang.text.dao.UserDao;
import com.yang.text.dao.impl.UserDaoImpl;
import com.yang.text.pojo.StudentScore;
import com.yang.text.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
//@Component//Ioc
@Service
public class UserServiseimpl implements UserService {
//    @Autowired
//    private UserDao UserDao;
//private final UserDao UserDao;
//@Autowired
//    public UserServiseimpl(com.yang.text.dao.UserDao userDao) {
//        UserDao = userDao;
//    }
private UserDao UserDao;
@Autowired
    public void setUserDao(com.yang.text.dao.UserDao userDao) {
        UserDao = userDao;
    }

    @Override
    public List<StudentScore> findAll() {
        List<String> lines=UserDao.findAll();
        List<StudentScore> tes=lines.stream().map(line ->{
            String[] parts = line.split(",");
            String studentname = parts[0];
            Integer yu = Integer.parseInt(parts[1]);
            Integer shu = Integer.parseInt(parts[2]);
            Integer ying = Integer.parseInt(parts[3]);
            return new StudentScore(studentname,yu,shu,ying);
        }).collect(Collectors.toList());
        return tes;
    }
}
