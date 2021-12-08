package com.xue.service.sys.Impl;

import java.io.File;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.xue.service.sys.PictureDeal;
import com.xue.tools.GeneralBasic;
import com.xue.tools.StringManipulation;

@Component
public class PictureDealImpl implements PictureDeal {

	public static Logger log = Logger.getLogger(PictureDealImpl.class);

	@Override
	public void IdentifyPicture(String pwd) {
		// TODO Auto-generated method stub
		log.info("IdentifyPicture>>>>>>>>>>>>>>>>>>>begin");
		log.debug("pwd== "+pwd);
		ImageProcessingPortal(pwd);
//		File picturefilepwd = new File(pwd);
//		File[] tempList = picturefilepwd.listFiles();
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

//		System.out.println(" GeneralBasic.generalBasic ====" + GeneralBasic.generalBasic( pwd ) );
		


		log.info("IdentifyPicture<<<<<<<<<<<<<<<<<end");

	}

	/*
	 * 图片处理入口,将识别出来的图片文字全部传入该函数中
	 */
	@Override
	public void ImageProcessingPortal(String obj) {
		// TODO Auto-generated method stub
		log.debug("ImageProcessingPortal>>>>>>>>>>>>>>>>>>>>>>>>>begin");

		String objstring = GeneralBasic.generalBasic( obj );
		log.debug("objstring==="+objstring );

		objstring =StringManipulation.StringMatching(objstring, "证券代码");

		log.debug("objstring==="+objstring );

		log.debug("ImageProcessingPortal<<<<<<<<<<<<<<<<<<<<<<<<<end");
		
	}

	public static void main(String[] args) {
		PictureDealImpl pictureDealImpl = new PictureDealImpl();
		String obj = "{\"words_result\":[{\"words\":\"11:34o\"},{\"words\":\"54K/s8灬 lll HD ball (88\"},{\"words\":\"详情页面\"},{\"words\":\"证券代码300657\"},{\"words    \":\"委托状态全部成交\"},{\"words\":\"委托类别买入\"},{\"words\":\"委托价格19.65\"},{\"words\":\"委托数量100\"},{\"words\":\"成交价格1965\"},{\"words\":\"成交数量100\"},{\"words\":\"撤单数量0\"},{\"words\":\"冻结资金1970\"},{\"words\":\"委    托编号188779\"},{\"words\":\"委托日期2021-1201\"},{\"words\":\"委托时间10:21:25\"},{\"words\":\"股东号0272858645\"},{\"words\":\"交易所深圳A\"},{\"words\":\"结果说明全部成交\"},{\"words\":\"上一条\"},{\"words\":\"下一条\"}],\"words_res    ult_num\":20,\"log_id\":1468421337859379850}";

		String[] sss = StringManipulation.StringMatching(obj, "委托价格").split("\"");

		String tmp = StringManipulation.MatchingAmount(sss[3]);

		System.out.println(sss[3]+"|"+tmp);

		
	}
	


}
