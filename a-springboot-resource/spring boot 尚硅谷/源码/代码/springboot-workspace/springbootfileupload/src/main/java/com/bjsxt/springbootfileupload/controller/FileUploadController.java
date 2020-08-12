package com.bjsxt.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 文件上传
 */
@RestController
public class FileUploadController {

    /**
     * 文件上传
     */
    @PostMapping("/fileUploadController")
    public String fileUpload(MultipartFile file)throws Exception{
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("c:/"+file.getOriginalFilename()));
        return "OK";
    }
}
