package kr.hs.study.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UploadController {
	
	
	@Autowired
	@Qualifier("uploadPath")
	private String uploadPath;
	   @GetMapping("/upload")
	   public String upload() {
	      return "upload";
	   }
	   
	   @PostMapping("/file_uploads")
	   public ModelAndView re_upload(MultipartFile file,ModelAndView mv) throws Exception{
	      System.out.println("file : "+file);
	      System.out.println("fileName : "+file.getOriginalFilename());
	      System.out.println("fileSize : "+file.getSize());
	      System.out.println("filetype : "+file.getContentType());
	      System.out.println("filename2 : "+file.getName());
	      
	      
	      String savedName=file.getOriginalFilename();
	      File a=new File(uploadPath, savedName);
	      //이상한 폴더의 이상한 이름의 파일을 실제디렉토리에
	      //원래 이름으로 복사
	      FileCopyUtils.copy(file.getBytes(),a);
	      mv.setViewName("uploadResult");
	      mv.addObject("savedname",savedName);
	      return mv;
	   }
}
