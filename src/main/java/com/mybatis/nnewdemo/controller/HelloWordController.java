package com.mybatis.nnewdemo.controller;


import com.mybatis.nnewdemo.entity.User;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

@RestController
@CrossOrigin
public class HelloWordController {

    @RequestMapping("/hello")
    public String HelloWord(@RequestParam String studentname){
        return studentname;
    }
    @RequestMapping("/hello/{Id}")
    public String HelloWord1(@PathVariable String Id, @RequestHeader("temp") String temp){
        return Id + "   "+temp;
    }
    @RequestMapping("/loadfile")
    public String UpLoadFile(@RequestParam MultipartFile file) throws FileNotFoundException {
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        File upload = new File(path.getAbsolutePath(),"static/files/");
        if(!upload.exists()) upload.mkdirs();
        System.out.println(ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "asdfasf");
        System.out.println("upload url:"+upload.getAbsolutePath());
        System.out.println("path:"+path.getAbsolutePath());
        File dest = new File(upload.getAbsolutePath() + "/" + new Date().toString() + file.getOriginalFilename());
        try {
            file.transferTo(dest);
        }catch (IOException e){

        }
        return file.getName();
    }
}
