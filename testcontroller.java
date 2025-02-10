package com.yang.text.controller;
import com.yang.text.pojo.StudentScore;
import cn.hutool.core.io.IoUtil;
import com.yang.text.service.UserService;
import com.yang.text.service.impl.UserServiseimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
public class testcontroller {
    @Autowired
    private UserService UserService ;
    @RequestMapping("/list")
    public List<StudentScore>  list(@RequestParam(required = false)String name) throws Exception {
//        InputStream in = new FileInputStream(new File("D:\\env\\testjava\\text\\src\\main\\resources\\text"))
        List<StudentScore> tes = UserService.findAll();

        if(name!=null&& !name.isEmpty()){
            tes = tes.stream().filter(s->s.getName().contains(name)).collect(Collectors.toList());
        }


        return tes;
    }
}
