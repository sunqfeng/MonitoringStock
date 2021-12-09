package com.xue.service.sys.Impl;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SqfShares;
import com.xue.entity.model.StockInfor;
import com.xue.service.sys.SqfSharesService;
import com.xue.service.sys.TimedTask;
import com.xue.tools.GetStockInfo;
import com.xue.tools.MailDeal;

@Component
public class TimedTaskImpl implements TimedTask {
	
	private static final Logger log = LoggerFactory.getLogger(TimedTaskImpl.class);


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

//			String Gpsy = sqfShares.getEntrustedPricePurchase()*sqfShares.getEntrustedQuantityPurchase()-

			StockMsg = "股票名称:"+sqfShares.getSecuritiesName()+" | "+"股票代码:"+sqfShares.getSecuritiesCode()+" | "+"买入价格:"+sqfShares.getEntrustedPricePurchase() + " | " + "当前价格:"+ stockInfor.getCurrentPrice() +" | "+"买入数量:"+sqfShares.getEntrustedQuantityPurchase()+" | "+"股票收益:"+Gpsy;

	    	e.SendSimpleEmail("股票信息",StockMsg,"1049245996@qq.com");

			log.debug("for list sqfShares==="+sqfShares.getSecuritiesName());
		}

		log.debug("wooooooo=="+sqfShares.getSecuritiesName());


	}

}
