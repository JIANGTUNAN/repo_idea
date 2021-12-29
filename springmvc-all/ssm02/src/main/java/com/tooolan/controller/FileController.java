package com.tooolan.controller;


import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileController {

    @ResponseBody
    @RequestMapping("/fileUpload")
    public Map<String, String> fileUpload(MultipartFile headPhoto, HttpServletRequest request) throws IOException {
        Map<String, String> map = new HashMap<>();

        //控制文件大小
//        if (headPhoto.getSize() > 1024 * 1024 * 5) {
//            map.put("message", "文件大小不能超过5M");
//            return map;
//        }

        // 指定文件存储目录
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        File dir = new File(realPath);
        //如果路径不存在就创建
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //获取文件名
        String filename = headPhoto.getOriginalFilename();

        //使用UUID解决文件名冲突问题
        String uuid = UUID.randomUUID().toString();

        //获取拓展名
        String extendsName = filename.substring(filename.lastIndexOf("."));

        //控制文件类型
        if (!extendsName.equals(".png")) {
            map.put("message", "文件类型必须是PNG");
            return map;
        }

        //新的文件名
        String newFileName = uuid.concat(extendsName);

        //文件存储位置
        File file = new File(dir, newFileName);

        //文件保存
        headPhoto.transferTo(file);
        map.put("message", "文件上传成功");
        map.put("newFileName", newFileName);
        map.put("fileType", headPhoto.getContentType());
        return map;
    }

    @RequestMapping("/fileDownload")
    public void fileDownLoad(String photo, String filetype, HttpServletResponse response) throws IOException {
        System.out.println(photo + filetype);
        response.setHeader("Content-Disposition", "attachment;filename=" + photo);
        response.setContentType(filetype);
        InputStream inputStream = new URL("http://localhost:8080/ssm02/upload/" + photo).openStream();
        ServletOutputStream outputStream = response.getOutputStream();
        IOUtils.copy(inputStream, outputStream);
    }
}
