package com.xue.service.sys.Impl;

import java.io.File;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.xue.service.sys.PictureDeal;
import com.xue.tools.GeneralBasic;

@Component
public class PictureDealImpl implements PictureDeal {

	public static Logger log = Logger.getLogger(PictureDealImpl.class);

	@Override
	public void IdentifyPicture(String pwd) {
		// TODO Auto-generated method stub
		log.info("IdentifyPicture>>>>>>>>>>>>>>>>>>>begin");
		log.debug("pwd== "+pwd);
		File picturefilepwd = new File(pwd);
		File[] tempList = picturefilepwd.listFiles();
		// 解析图片内容
//		for (int i = 0; i < tempList.length; i++) {
//			if (tempList[i].isFile()) {
//				System.out.println("========================================================");
//				GeneralBasic.generalBasic(tempList[i].toString());
//				System.out.println("========================================================");
//			}
//			if (tempList[i].isDirectory()) {
//			}
//		}

		System.out.println(" GeneralBasic.generalBasic ====" + GeneralBasic.generalBasic( pwd ) );
		


		log.info("IdentifyPicture<<<<<<<<<<<<<<<<<end");

	}

	/*
	 * 图片处理入口,将识别出来的图片文字全部传入该函数中
	 */
	@Override
	public void ImageProcessingPortal(String obj) {
		// TODO Auto-generated method stub
		System.out.println("ImageProcessingPortal>>>>>>>>>>>>>>>>>>>>>>>>>>>begin");

		System.out.println("ImageProcessingPortal<<<<<<<<<<<<<<<<<<<<<<<<<<<end");
		
	}


}
