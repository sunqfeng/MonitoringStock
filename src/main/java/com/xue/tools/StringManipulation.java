package com.xue.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author 86187
 * @time 2021年12月6日09:59:57
 * 这是一个字符串处理类，素有的字符处理都放在这儿
 *
 */

public class StringManipulation {


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

}
