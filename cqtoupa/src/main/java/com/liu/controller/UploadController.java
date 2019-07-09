package com.liu.controller;

import java.io.File;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping(value = "/upload.do")
	public String upload(
			@RequestParam(value = "file1", required = false) MultipartFile file,String username,
			HttpServletRequest request, ModelMap model) {
		System.out.println("username:"+username);
		
		 // ÉÏ´«µØÖ·
        String path = request.getSession().getServletContext()
                .getRealPath("upload");
        System.out.println(path);
        String fileName = new Random().nextInt(100)+file.getOriginalFilename();
        System.out.println(fileName);
        File targetFile = new File(path,  fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
 
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		return "index";
	}

}
