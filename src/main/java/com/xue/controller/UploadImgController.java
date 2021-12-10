package com.xue.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xue.service.sys.PictureDeal;
import com.xue.service.sys.Impl.BaiDuApi;

/*
 * @au sqf
 */

@Controller
@RequestMapping("/sys/picture")
public class UploadImgController {

	public static Logger log = Logger.getLogger(UploadImgController.class);

	@Autowired
	private PictureDeal pictureDeal;

	BaiDuApi baiDuApi = new BaiDuApi(); 

	@RequestMapping(value = "/uploadPage")
	public String uploadPage() {
		return "uploadPage"; // 过度跳转页
	}

	@RequestMapping(value = "/baiduapi")
	public String baiduapi() {
		return "baidufanyiPage"; // 过度跳转页
	}


	@PostMapping(value = "/upload")
	public String uplaod(HttpServletRequest req, @RequestParam("file") MultipartFile file, Model m) {// 1. 接受上传的文件
																										// @RequestParam("file")
																										// MultipartFile
																										// file
		try {

			// 取日期

			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			String datepwd = formatter.format(date);

			String objpwd = "/home/centos/picture/" + datepwd;

			log.debug("objpwd==" + objpwd);

			// 2.根据时间戳创建新的文件名，这样即便是第二次上传相同名称的文件，也不会把第一次的文件覆盖了
			String fileName = System.currentTimeMillis() + file.getOriginalFilename();
			// 3.通过req.getServletContext().getRealPath("") 获取当前项目的真实路径，然后拼接前面的文件名
			String destFileName = "/home/centos/picture/" + datepwd + "/" + fileName;
			File destFile = new File(destFileName);
			// 4.第一次运行的时候，这个文件所在的目录往往是不存在的，这里需要创建一下目录（创建到了webapp下uploaded文件夹下）
			destFile.getParentFile().mkdirs();
			// 5.把浏览器上传的文件复制到希望的位置
			file.transferTo(destFile);
			// 6.把文件名放在model里，以便后续显示用
			m.addAttribute("fileName", fileName);
			pictureDeal.IdentifyPicture(destFileName);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "上传失败," + e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return "上传失败," + e.getMessage();
		}

		return "showImg";
	}

	@PostMapping(value = "/baidufanyi")
	public String baidufanyi(HttpServletRequest req, @RequestParam("file") MultipartFile file, Model m, Map <String, Object> map) {// 1. 接受上传的文件 // @RequestParam("file") // MultipartFile // file
		try {
			// 取日期
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			String datepwd = formatter.format(date);

			String objpwd = "/home/centos/picture/" + datepwd;

			log.debug("objpwd==" + objpwd);

			// 2.根据时间戳创建新的文件名，这样即便是第二次上传相同名称的文件，也不会把第一次的文件覆盖了
			String fileName = System.currentTimeMillis() + file.getOriginalFilename();
			// 3.通过req.getServletContext().getRealPath("") 获取当前项目的真实路径，然后拼接前面的文件名
			String destFileName = "/home/centos/picture/" + datepwd + "/" + fileName;
			File destFile = new File(destFileName);
			// 4.第一次运行的时候，这个文件所在的目录往往是不存在的，这里需要创建一下目录（创建到了webapp下uploaded文件夹下）
			destFile.getParentFile().mkdirs();
			// 5.把浏览器上传的文件复制到希望的位置
			file.transferTo(destFile);
			// 6.把文件名放在model里，以便后续显示用
			m.addAttribute("fileName", fileName);
			System.out.println("destFileName==="+destFileName);
			String tmp = baiDuApi.ImageProcessingBaidu( destFileName );
			log.debug(tmp);
			System.out.println("tmp==="+tmp);

			map.put("sqf", tmp);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "上传失败," + e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return "上传失败," + e.getMessage();
		}

		return "tpfyhy";
	}
}
