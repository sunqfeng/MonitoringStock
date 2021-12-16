package com.xue.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.xue.entity.model.StockInfor;

/***
 * 获取股票信息
 * 
 * @author 86187
 *
 */

/*
 * 0：”大秦铁路”，股票名字； 1：”27.55″，今日开盘价； 2：”27.25″，昨日收盘价； 3：”26.91″，当前价格；
 * 4：”27.55″，今日最高价； 5：”26.20″，今日最低价； 6：”26.91″，竞买价，即“买一”报价；
 * 7：”26.92″，竞卖价，即“卖一”报价； 8：”22114263″，成交的股票数，因为股票交易以一百股为基本单位，因此在使用时，一般把该值除以一百；
 * 9：”589824680″，成交金额，单位为“元”，为了一目了然，一般以“万元”为成交金额的单位，因此一般把该值除以一万；
 * 10：”4695″，“买一”申请4695股，即47手； 11：”26.91″，“买一”报价； 12：”57590″，“买二”
 * 13：”26.90″，“买二” 14：”14700″，“买三” 15：”26.89″，“买三” 16：”14300″，“买四”
 * 17：”26.88″，“买四” 18：”15100″，“买五” 19：”26.87″，“买五” 20：”3100″，“卖一”申报3100股，即31手；
 * 21：”26.92″，“卖一”报价 (22, 23), (24, 25), (26,27), (28, 29)分别为“卖二”至“卖四的状况”
 * 30：”2008-01-11″，日期； 31：”15:05:32″，时间；app
 */

public class GetStockInfo {

	private static Logger log = Logger.getLogger( GetStockInfo.class );

	public static String getEncoding(String str) {
		String encode;

		encode = "UTF-16";
		try {
			if (str.equals(new String(str.getBytes(), encode))) {
				return encode;
			}
		} catch (Exception ex) {
		}

		encode = "ASCII";
		try {
			if (str.equals(new String(str.getBytes(), encode))) {
				return "字符串<< " + str + " >>中仅由数字和英文字母组成，无法识别其编码格式";
			}
		} catch (Exception ex) {
		}

		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(), encode))) {
				return encode;
			}
		} catch (Exception ex) {
		}

		encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(), encode))) {
				return encode;
			}
		} catch (Exception ex) {
		}

		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(), encode))) {
				return encode;
			}
		} catch (Exception ex) {
		}

		/*
		 * ......待完善
		 */

		return "未识别编码格式";
	}

	/**
	 * 
	 * @param urlString
	 * @return
	 * @throws IOException
	 */

	public static String getBufferedReaderByUrl(String urlString) throws IOException {
		/* read file from URL */
		BufferedReader bf = null;
		URL fileUrl = null;
		try {
			fileUrl = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bf = new BufferedReader(new InputStreamReader(fileUrl.openStream(), "gbk"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String line = null;
		String message = new String();
		final StringBuffer buffer = new StringBuffer(2048);

		while ((line = bf.readLine()) != null) {
			message += line;
		}
		System.out.println("message==+" + message);
		String[] obj = message.split("=");
		System.out.println("obj[0]===" + obj[1].replaceAll("\"", ""));

		return obj[1].replaceAll("\"", "");
	}

	public static StockInfor GetstockInof(String code) {

		log.debug("GetstockInof>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>begin");

		StockInfor stockInfor = new StockInfor();

		String obj = "";
		String url = "http://hq.sinajs.cn/list=sz" + code;
		try {
			obj = getBufferedReaderByUrl(url);
//			System.out.println("obj888888==="+obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("obj0000====="+obj);
		if (obj == null || obj.length() <= 10) {
			url = "http://hq.sinajs.cn/list=sh" + code;
			try {
				obj = getBufferedReaderByUrl(url);
//				System.out.println("obj111==="+obj);
				log.debug( "obj==="+obj );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

//		System.out.println("obj44444==="+obj);
		log.debug("obj===="+obj);

		String[] tmp = obj.split(",");

		log.debug("tmp===="+tmp);

		stockInfor.setStockName(tmp[0] );
		stockInfor.setOpeningPrice( tmp[1] );
		stockInfor.setClosingPrice(tmp[2] );
		stockInfor.setCurrentPrice( tmp[3] );
		stockInfor.setHighPrice( tmp[4] );
		stockInfor.setLowestPrice(tmp[5]);

		System.out.println("obj===" + obj);

		log.debug("GetstockInof<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<end");

		return stockInfor;
	}

	public static void main(String[] args) throws IOException {
		StockInfor stockInfor = new StockInfor();

		stockInfor = GetstockInof("600268");
	}

}
