package com.xue.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class YouDaoFanYi {


	 public static void main(String[] args) {
         
//	        System.out.print(creatUrl("你好", "en",""));

		 try {
			YouDaoFanYi.YouDaoApi("你好");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }

	    static String appKeyID = "18f581e89e66d1b9";
	    static String appKey = "z1PyEIlVqBLolunwvhIAFrUvupwQ1yME";
	     
	    /**
	     *  生成有道URL
	     * @param 要搜索的词
	     * @param 源语言
	     * @param 目标语言
	     * @return
	     */
	    public static String creatUrl(String query,String from,String to)
	    {
	         
	        String salt = String.valueOf(System.currentTimeMillis());
	        String sign = md5(appKeyID + query + salt + appKey);
	        Map<String, String> params = new HashMap<String,String>();
	        params.put("q", query);
	        params.put("from", from);
	        params.put("to", to);
	        params.put("sign", sign);
	        params.put("salt", salt);
	        params.put("appKey", appKeyID);
	         
	        String urlStr = "https://openapi.youdao.com/api";
	        return getUrlWithQueryString(urlStr, params);
	 
	    }
	    public static String createParam(String query,String from,String to)
	    {
	        String salt = String.valueOf(System.currentTimeMillis());
	        String sign = md5(appKeyID + query + salt + appKey);
	        Map<String, String> params = new HashMap<String,String>();
	        params.put("q", query);
	        params.put("from", from);
	        params.put("to", to);
	        params.put("sign", sign);
	        params.put("salt", salt);
	        params.put("appKey", appKeyID);
	         
	        String urlStr = "";
	        return getUrlWithQueryString(urlStr, params);
	    }
	    /**
	     *  生成32位md5摘要
	     * @param str
	     * @return
	     */
	    public static String md5(String string)
	    {
	        if(string == null)
	        {
	            return null;
	        }
	        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	        byte [] btInput = string.getBytes();
	        try {
	            /** 获得MD5摘要算法的 MessageDigest对象 **/
	            MessageDigest mdInst = MessageDigest.getInstance("MD5");
	            /** 使用指定的字节更新摘要 **/
	            mdInst.update(btInput);
	            /** 获得密文 **/
	            byte []md = mdInst.digest();
	            /** 把密文转换成十六进制的字符串形式 **/
	            int j = md.length;
	            char str[] = new char[j*2];
	            int k = 0;
	            for(byte byte0 : md){
	                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
	                str[k++] = hexDigits[byte0 & 0xf];
	            }
	            return new String(str);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	    public static String getUrlWithQueryString(String url,Map<String, String>params)
	    {
	        if (params == null) {
	            return url;
	        }
	         
	        StringBuilder builder = new StringBuilder(url);
	        if (url.contains("?")) {
	            builder.append("&");
	        } else {
	            builder.append("?");
	        }
	         
	        int i = 0;
	        for (String key : params.keySet()) {
	            String value = params.get(key);
	            if (value == null) { //过滤空key
	                continue;
	            }
	             
	            if (i != 0) {
	                builder.append('&');
	            }
	             
	            builder.append(key);
	            builder.append('=');
	            builder.append(encode(value));
	             
	            i++;
	             
	        }  
	        return builder.toString();
	    }
	    /**
	     *  进行URL编码
	     * @param input
	     * @return
	     */
	    public static String encode(String input)
	    {
	        if (input == null) {
	            return ""; 
	        }
	         
	        try {
	            return URLEncoder.encode(input,"utf-8");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return input;
	    }


	    public static String YouDaoApi(String obj) throws IOException
	    {

	    	URL url = new URL("http://fanyi.youdao.com/openapi.do");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.addRequestProperty("encoding", "UTF-8");
            connection.setDoInput(true);
            connection.setDoOutput(true);

            connection.setRequestMethod("POST");

            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);


            bw.write("keyfrom=fadabvaa&key=z1PyEIlVqBLolunwvhIAFrUvupwQ1yME&type=data&doctype=json&version=1.1&q=你好");
            bw.flush();

            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            StringBuilder builder = new StringBuilder();
            while((line = br.readLine()) != null){
                builder.append(line);
            }

            bw.close();
            osw.close();
            os.close();

            br.close();
            isr.close();
            is.close();

            System.out.println(builder.toString());

			return obj;
	    }

}
