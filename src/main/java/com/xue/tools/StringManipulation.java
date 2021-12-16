package com.xue.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.xue.baidu.tool.BadiDuFanYi;

/**
 * 
 * @author 86187
 * @time 2021年12月6日09:59:57
 * 这是一个字符串处理类，素有的字符处理都放在这儿
 *
 */

public class StringManipulation {

	public static final Logger log = Logger.getLogger( StringManipulation.class ) ;


//	 StringBuilder StrinSum = new StringBuilder();
		String StrinSum = "";

	/*
	 * 
	 * 查询股票信息
	 * 
	 */
	public static String StringMatching(String tmp,String matcherobj)
	{

		if ( tmp == null ) 
		{
			return null;
		}

		String obj = tmp.substring(tmp.indexOf("{")+1,tmp.indexOf("}"));
		Pattern pattern = Pattern.compile( matcherobj );
		
		Matcher matcher = pattern.matcher(obj);
		if ( matcher.find() )
		{
			return obj;
		}

		try {
			return StringMatching( tmp.substring(tmp.indexOf("}")+2 ),matcherobj );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

	/*
	 * 匹配一个字符串中的数字(金额数字)
	 * 2021年12月8日13:39:59
	 * 
	 */

	public static String MatchingAmount(String obj) {
		String regxp = "((-)?(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){1,2})?)";
		Pattern p = Pattern.compile(regxp);
		Matcher m = p.matcher(obj);
		if (m.find()) {
			return m.group(1);
		}
		else
			return null;
	}


	/**
	 * 
	 * @param tmp
	 * @return
	 * 将前端上送的图片翻译成汉字
	 */
	public String StringMatchingBaiduApi(String tmp )
	{
		if ( tmp == null ) 
		{
			return null;
		}

		String[] obj = tmp.substring(tmp.indexOf("{")+1,tmp.indexOf("}")).split("\"");
		System.out.println("ojb===="+obj[3]);
		log.debug(obj[3]);

		try {
			//将英文翻译成中文
//			StrinSum = StrinSum+BadiDuFanYi.BaiDuFanYiYinToHan(obj[3])+",";
			StrinSum = StrinSum+obj[3] + " ";
//			StrinSum.append(obj[3]);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			return StringMatchingBaiduApi ( tmp.substring(tmp.indexOf("}")+2 ) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug( StrinSum );
			return  BadiDuFanYi.BaiDuFanYiYinToHan(  StrinSum );
		}

	}


	/**
	 * 
	 * @param tmp
	 * @return
	 * 将前端上送图片的汉字识别出来(不翻译)
	 */
	public String StringPhotoCharRecon(String tmp )
	{
		if ( tmp == null ) 
		{
			return null;
		}

		String[] obj = tmp.substring(tmp.indexOf("{")+1,tmp.indexOf("}")).split("\"");
		System.out.println("ojb===="+obj[3]);
		log.debug(obj[3]);

		try {
			StrinSum = StrinSum+obj[3] + " ";
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			log.error(e1);
		}

		try {
			return StringPhotoCharRecon ( tmp.substring(tmp.indexOf("}")+2 ) );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug( StrinSum );
			return StrinSum;
		}

	}





	public static void main(String[] args) {
		
		StringManipulation stringManipulation = new StringManipulation();
		String obj = "{\"words\":\"Call for Papers: Irritable bowel syr\"},{\"words\":\"arome\"},{\"words\":\"Call for Papers: Targeted therapies for cancel\"},{\"words\":\"We are pleased to announce the launch of our new article\"},{\"words\":\"BMC Medicine and bmc cancer are welcoming submissions\"},{\"words\":\"collection seeking submissions on all novel, impact\"},{\"words\":\"to a new joint collection on cancer targeted therapies We\"},{\"words\":\"advances of irritable bowel syndrome, including disease\"},{\"words\":\"are seeking manuscripts on all aspects of molecular targeted\"},{\"words\":\"burden, etiology, pathophysiology, and therapies.\"},{\"words\":\"etaples\"},{\"words\":\"Iding novel therapies, treatment resistance,\"},{\"words\":\"our Privacy\"},{\"words\":\"We use cookies to make sure that our website works properly, as well as some optional cookies to personalise content and advertising, provide social media features and analyse\"},{\"words\":\"how people use our site. By accepting some or all optional cookies you give consent to the processing of your personal data, including transfer to third parties, some in countries\"},{\"words\":\"tside of the European Economic Area that do not offer the same data protection standards as the\"},{\"words\":\"clicking on Manage Settings, where you can also find more information about how your personal data is processed. Further information can be found in our privacy_policy.\"},{\"words\":\"Ac\"}";
		String tmp = stringManipulation.StringMatchingBaiduApi(obj);
		System.out.println("tmp===="+tmp);

	}



}
