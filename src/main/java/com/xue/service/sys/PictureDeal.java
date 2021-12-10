package com.xue.service.sys;

import org.springframework.stereotype.Service;

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

}
