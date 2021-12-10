package com.xue.service.sys.Impl;


import org.apache.log4j.Logger;

import com.xue.service.sys.PictureDeal;
import com.xue.tools.GeneralBasic;
import com.xue.tools.StringManipulation;

public class BaiDuApi implements PictureDeal {

	
	public static Logger log = Logger.getLogger(BaiDuApi.class);


	@Override
	public void IdentifyPicture(String pwd) {
		// TODO Auto-generated method stub
		log.debug( "IdentifyPicture>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>begin" );
		log.debug("pwd===="+pwd);
		ImageProcessingPortal(pwd);

		log.debug( "IdentifyPicture<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<end" );

	}

	@Override
	public void ImageProcessingPortal(String obj) {

	}

	@Override
	public String ImageProcessingBaidu(String obj) {
		// TODO Auto-generated method stub

		log.debug("ImageProcessingBaidu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>begin");
		log.debug("obj==="+obj);
		System.out.println("obj==="+obj);

		String objstring = GeneralBasic.generalBasic( obj );
		System.out.println("objstring"+objstring);
		log.debug("objstring==="+objstring );

		String fyczw =StringManipulation.StringMatchingBaiduApi(objstring);
		log.debug("zjdmarry==="+fyczw );
		
		log.debug("ImageProcessingBaidu<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<end");

		System.out.println("fyczw==="+fyczw);

		return fyczw;


	}

	public static void main(String[] args) {
		BaiDuApi baiDuApi = new BaiDuApi();
		baiDuApi.ImageProcessingBaidu("D:\\java_picture\\微信图片_20211210154334.png");
		
	}

}
