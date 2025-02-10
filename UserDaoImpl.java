package com.yang.text.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.yang.text.dao.UserDao;
import com.yang.text.pojo.StudentScore;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
//@Component//Ioc
@Repository//("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public List<String> findAll() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("text");
        ArrayList<String> lines= IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
        return lines;
    }


}
