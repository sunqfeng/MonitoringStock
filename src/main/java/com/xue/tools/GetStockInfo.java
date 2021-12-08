package com.xue.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/***
 * 获取股票信息
 * @author 86187
 *
 */

public class GetStockInfo {


	 public static String getEncoding(String str) 
	    {    
	        String encode;
			
		encode = "UTF-16";   		
	        try 
		{    
	            if(str.equals(new String(str.getBytes(), encode))) 
		    {   
	                return encode;    
	            }    
	        } 
		catch(Exception ex) {} 
			
		encode = "ASCII";    
	        try 
		{    
	            if(str.equals(new String(str.getBytes(), encode)))
		    {    
	                return "字符串<< " + str + " >>中仅由数字和英文字母组成，无法识别其编码格式";    
	            }    
	        } 
		catch(Exception ex) {}    
			
		encode = "ISO-8859-1";    
	        try 
		{    
	            if(str.equals(new String(str.getBytes(), encode))) 
		    {    
	                return encode;    
	            }    
	        } 
		catch(Exception ex) {}    
			
		encode = "GB2312";    
	        try 
		{    
	            if(str.equals(new String(str.getBytes(), encode))) 
		    {    
	                return encode;    
	            }    
	        } 
		catch(Exception ex) {} 
			
		encode = "UTF-8";    
	        try 
		{    
	            if(str.equals(new String(str.getBytes(), encode))) 
		    {    
	                return encode;    
	            }    
	        } 
		catch(Exception ex) {}    
	        
	        /*
		 *......待完善
		 */
			
	        return "未识别编码格式";    
	    }  


	 /**
	  * 0：豆粕连续，名字
		1：145958，不明数字（难道是数据提供商代码？）
		2：3170，开盘价
		3：3190，最高价
		4：3145，最低价
		5：3178，昨日收盘价 （2013年6月27日）
6：3153，买价，即“买一”报价
7：3154，卖价，即“卖一”报价
8：3154，最新价，即收盘价
9：3162，结算价
10：3169，昨结算
11：1325，买 
	  * 
	  * @param urlString
	  * @return
	  * @throws IOException
	  */



	public static String getBufferedReaderByUrl(String urlString) throws IOException {
        /*read file from URL*/
        BufferedReader bf = null;
        URL fileUrl = null;
		try {
			fileUrl = new URL(urlString);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			bf = new BufferedReader(new InputStreamReader(fileUrl.openStream(),"gbk"));
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
         System.out.println("message==+"+message);
         String[] obj = message.split("=");
         System.out.println("obj[0]==="+obj[1].replaceAll("\"", ""));

        return obj[0];
    }

	public static void main(String[] args) throws IOException {
		getBufferedReaderByUrl("http://hq.sinajs.cn/list=sz300348");
	}

}
