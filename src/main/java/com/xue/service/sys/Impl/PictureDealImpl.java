package com.xue.service.sys.Impl;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xue.entity.model.SqfShares;
import com.xue.entity.model.StockInfor;
import com.xue.repository.dao.SqfSharesMapper;
import com.xue.service.sys.PictureDeal;
import com.xue.service.sys.SqfSharesService;
import com.xue.tools.GeneralBasic;
import com.xue.tools.GetStockInfo;
import com.xue.tools.StringManipulation;

@Component
public class PictureDealImpl implements PictureDeal {

	public static Logger log = Logger.getLogger(PictureDealImpl.class);

	@Autowired
	SqfSharesService sqfSharesService;

	@Autowired
	SqfSharesMapper sqfSharesMapper;

	@Override
	public void IdentifyPicture(String pwd) {
		// TODO Auto-generated method stub
		log.info("IdentifyPicture>>>>>>>>>>>>>>>>>>>begin");
		log.debug("pwd== " + pwd);
		ImageProcessingPortal(pwd);

		log.info("IdentifyPicture<<<<<<<<<<<<<<<<<end");

	}

	/*
	 * 股票图片处理入口,将识别出来的图片文字全部传入该函数中
	 */
	@Override
	public void ImageProcessingPortal(String obj) {
		// TODO Auto-generated method stub
		StockInfor stockInfor = new StockInfor();

		log.debug("ImageProcessingPortal>>>>>>>>>>>>>>>>>>>>>>>>>begin");
		SqfShares sqfShares = new SqfShares();

		String objstring = GeneralBasic.generalBasic(obj);
		log.debug("objstring===" + objstring);

		String zjdm = StringManipulation.StringMatching(objstring, "证券代码");
		log.debug("zjdmarry===" + zjdm);
		if (zjdm != null || zjdm.length() != 0) {
			// 插入股票信息主表
			String[] zjdmarry = StringManipulation.StringMatching(objstring, "证券代码").split("\"");
			zjdm = StringManipulation.MatchingAmount(zjdmarry[3]);
			sqfShares.setSecuritiesCode(zjdm);

			log.debug( "zjdm==="+zjdm );
			// 获取股票信息
			stockInfor = GetStockInfo.GetstockInof(zjdm);
			sqfShares.setSecuritiesName(stockInfor.getStockName()); // 股票名称

			String[] wtzt = StringManipulation.StringMatching(objstring, "委托状态").split("\"");
			sqfShares.setDelegateStatus(wtzt[3]);
			String[] wtlb = StringManipulation.StringMatching(objstring, "买入").split("\"");

			if (wtlb[3] != null || wtlb[3].length() != 0) // 买入
			{
				sqfShares.setDelegationCategory("0");
				String[] wtjgarry = StringManipulation.StringMatching(objstring, "委托价格").split("\"");
				log.debug("wtjgarry=="+ wtjgarry );
				String wtjg = StringManipulation.MatchingAmount( wtjgarry[3] );
				log.debug("wtjg======"+wtjg);

				String[] scjsl = StringManipulation.StringMatching(objstring, "成交数量").split("\""); //成交数量
				log.debug(scjsl[3]);

				String[] sdjzj = StringManipulation.StringMatching(objstring, "冻结资金").split("\""); //冻结资金
				log.debug(sdjzj[3]);

				String scjsltmp = StringManipulation.MatchingAmount( scjsl[3] );
				String sdjzjtmp = StringManipulation.MatchingAmount( sdjzj[3] );

				log.debug( sdjzjtmp + "|"+ sdjzjtmp );

				BigDecimal Bscjsl  = new BigDecimal( scjsltmp );
				BigDecimal Bsdjzj  = new BigDecimal( sdjzjtmp );

				log.debug( Bscjsl +"|"+ Bsdjzj );

				BigDecimal sjjg =  Bsdjzj.divide(Bscjsl);

				log.debug(sjjg);

				//比较识别出来的价格与计算出来的价格差异，差异大使用计算出来的价格
				sqfShares.setEntrustedPricePurchase(String.valueOf( sjjg ));
				String[] cjslarry = StringManipulation.StringMatching(objstring, "成交数量").split("\"");
				String cjsl = StringManipulation.MatchingAmount(cjslarry[3]);
				sqfShares.setEntrustedQuantityPurchase(cjsl);

				sqfShares.setWhetherMonitor("1");

				//获取时间
				SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd,HH:mm:ss");
				Date date = new Date(System.currentTimeMillis());
				String[] sDate = formatter.format(date).split(",");
				log.debug("sDate===="+ sDate);

				sqfShares.setDateEntrustmentPurchase(sDate[0]); //日期 买入
				sqfShares.setTimeEntrustmentPurchase(sDate[1]); //时间 买入

				log.debug("sqfShares==="+sqfShares.getEntrustedPricePurchase()+"|"+sqfShares.getEntrustedQuantityPurchase());
				sqfSharesMapper.insert(sqfShares);

			} else // 卖出
			{

				String[] wtjgarry = StringManipulation.StringMatching(objstring, "委托价格").split("\"");
				String wtjg = StringManipulation.MatchingAmount(wtjgarry[3]);
				sqfShares.setEntrustedPriceSellout(wtjg);

				String[] cjslarry = StringManipulation.StringMatching(objstring, "成交数量").split("\"");
				String cjsl = StringManipulation.MatchingAmount(cjslarry[3]);
				sqfShares.setEntrustedQuantitySellout(cjsl);

				sqfShares.setWhetherMonitor("0");

				sqfSharesService.updateByPrimaryKeySelective(sqfShares);

			}

		}

		log.debug("ImageProcessingPortal<<<<<<<<<<<<<<<<<<<<<<<<<end");

	}

	@Override
	public String ImageProcessingBaidu(String obj) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 图片上传处理函数
	 */
	@Override
	public String ImageUploadProcessing(MultipartFile file ) {
		// TODO Auto-generated method stub
		log.debug("ImageUploadProcessing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>begin");

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
		try {
			file.transferTo(destFile);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6.把文件名放在model里，以便后续显示用
		System.out.println("destFileName===" + destFileName);

		log.debug( destFileName );

		log.debug("ImageUploadProcessing<<<<<<<<<<<<<<<<<<<<<<<<<<<end");

		return destFileName;
	}


	public void test()
	{

		SqfShares sqfShares = new SqfShares();
		sqfShares.setSecuritiesCode("300348");
		sqfShares.setSecuritiesName("wooooo");
		sqfShares.setWhetherMonitor("1");

		System.out.println("sqf==="+sqfShares.getSecuritiesName());

		sqfSharesMapper.insert(sqfShares);

	}

	public static void main(String[] args) {
		PictureDealImpl pictureDealImpl = new PictureDealImpl();

		pictureDealImpl.test();

	}

	@Override
	public String BaiDuPhChaRe(String obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
