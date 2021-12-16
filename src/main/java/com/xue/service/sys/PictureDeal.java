package com.xue.service.sys;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface PictureDeal {

	/*
	 * 识别图片中的文字并将信息插入数据库
	 */
	public void IdentifyPicture(String pwd);

	/*
	 * 2021年12月5日21:05:27
	 * 股票图片处理入口,将识别出来的图片文字全部传入该函数中
	 */
	public void ImageProcessingPortal(String obj);

	public String ImageProcessingBaidu(String obj);

	/*
	 * 将上传图片的处理函数进行封装
	 */
	public String ImageUploadProcessing(MultipartFile file );


	/*
	 * 
	 * 百度文字识别，仅仅识别出来图片中文字
	 */
	public String BaiDuPhChaRe(String obj);


}
