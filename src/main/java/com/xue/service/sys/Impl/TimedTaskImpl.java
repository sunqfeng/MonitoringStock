package com.xue.service.sys.Impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xue.entity.model.SqfShares;
import com.xue.entity.model.StockInfor;
import com.xue.service.sys.SqfSharesService;
import com.xue.service.sys.TimedTask;
import com.xue.tools.DateClass;
import com.xue.tools.GetStockInfo;
import com.xue.tools.MailDeal;

@Component
public class TimedTaskImpl implements TimedTask {
	
	public static Logger log = Logger.getLogger(TimedTaskImpl.class);

	@Autowired
	private SqfSharesService sqfSharesService;

	SqfShares sqfShares = new SqfShares();

	MailDeal e = new MailDeal();
	/*
	 * 监控股票信息
	 * 
	 */
	@Override
	public void TimedTaskSqfShares() {
		// TODO Auto-generated method stub
		log.debug("TimedTaskSqfShares>>>>>>");

		StockInfor stockInfor = new StockInfor();
		long difdate = 0L;

		List<SqfShares> listSqfShares = sqfSharesService.selall_by_whether_monitor("1");

		for ( SqfShares sqfShares:listSqfShares  )
		{
			String StockMsg = "";

			log.debug("sqfShares===" + sqfShares.getSecuritiesCode() );//股票代码

			stockInfor = GetStockInfo.GetstockInof( sqfShares.getSecuritiesCode() );

			//股票名称+股票代码+买入价格+买入数量+持有天数+当前收益

			//买入价格
			BigDecimal Mrjg =new BigDecimal(sqfShares.getEntrustedPricePurchase() );
			//买入数量
			BigDecimal Mrsl =new BigDecimal(sqfShares.getEntrustedQuantityPurchase()  );

			//当前价格
			BigDecimal Dqjg = new BigDecimal( stockInfor.getCurrentPrice() );

			BigDecimal Gpsy = Mrsl.multiply(Dqjg).subtract( Mrjg.multiply( Mrsl ) );

			//持有天数
			if ( sqfShares.getDateEntrustmentPurchase() != null )
			{

				//获取时间
				SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
				Date enddate = new Date(System.currentTimeMillis());

				SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
				Date begindate = null;
				try {
					begindate = sdf.parse( sqfShares.getDateEntrustmentPurchase() );
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				log.debug("begindate======"+begindate);
				log.debug("enddate======"+ enddate );

				try {
					difdate =  DateClass.daysBetween(begindate, enddate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				log.debug("difdate====" +difdate );
			}

//			String Gpsy = sqfShares.getEntrustedPricePurchase()*sqfShares.getEntrustedQuantityPurchase()-

			StockMsg = "股票名称:"+sqfShares.getSecuritiesName()+" | "+"股票代码:"+sqfShares.getSecuritiesCode()+" | "+"持有天数:"+difdate+" | "+"买入价格:"+sqfShares.getEntrustedPricePurchase() + " | " + "当前价格:"+ stockInfor.getCurrentPrice() +" | "+"买入数量:"+sqfShares.getEntrustedQuantityPurchase()+" | "+"股票收益:"+Gpsy;

	    	e.SendSimpleEmail("股票信息",StockMsg,"1049245996@qq.com");

			log.debug("for list sqfShares==="+sqfShares.getSecuritiesName());
		}

		log.debug("wooooooo=="+sqfShares.getSecuritiesName());


	}

}
