package com.xue.service.sys.Impl;


import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

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

		StringManipulation stringManipulation = new StringManipulation();
		log.debug("ImageProcessingBaidu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>begin");
		log.debug("obj==="+obj);
		System.out.println("obj==="+obj);

		//obj.substring(obj.indexOf("[")+1, obj.lastIndexOf("]") ) ;
		String objstring = GeneralBasic.generalBasic( obj ).substring( GeneralBasic.generalBasic( obj ).indexOf("[")+1  , GeneralBasic.generalBasic( obj ).indexOf("]") );
		System.out.println("objstring"+objstring );
		log.debug("objstring==="+objstring  );

		String fyczw =stringManipulation.StringMatchingBaiduApi( objstring );
		log.debug("zjdmarry==="+fyczw );
		
		log.debug("ImageProcessingBaidu<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<end");

		System.out.println("fyczw==="+fyczw);

		return fyczw;


	}

	public static void main(String[] args) {
		BaiDuApi baiDuApi = new BaiDuApi();
		baiDuApi.ImageProcessingBaidu("D:\\java_picture\\微信图片_20211210154334.png");
		
	}

	@Override
	public String ImageUploadProcessing(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 识别出来图片中的文字
	 */

	@Override
	public String BaiDuPhChaRe(String obj) {
		// TODO Auto-generated method stub
		StringManipulation stringManipulation = new StringManipulation();

		log.debug("BaiDuPhChaRe>>>>>>>>>>>>>>>>>>>>>>>>>begin");

		String objstring = GeneralBasic.generalBasic( obj ).substring( GeneralBasic.generalBasic( obj ).indexOf("[")+1  , GeneralBasic.generalBasic( obj ).indexOf("]") );
		log.debug("BaiDuPhChaRe======"+objstring);

		String tmp = stringManipulation.StringPhotoCharRecon(objstring);

		log.debug("tmp====="+tmp);

		log.debug("BaiDuPhChaRe<<<<<<<<<<<<<<<<<<<<<<<<<end");

		return tmp;
	}

}
