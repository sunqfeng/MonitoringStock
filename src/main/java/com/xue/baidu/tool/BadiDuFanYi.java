package com.xue.baidu.tool;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class BadiDuFanYi {

	
	private static final Logger log = LoggerFactory.getLogger(BadiDuFanYi.class);

	// 在平台申请的APP_ID 详见
	// http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
	private static final String APP_ID = "20211209001023782";
	private static final String SECURITY_KEY = "OC2Vml_NMbjHSNrla6b4";

	@SuppressWarnings("unchecked")

	/*
	 * 英文-》中文
	 * 
	 */
	public static String BaiDuFanYiYinToHan(String obj) {

		TransApi api = new TransApi(APP_ID, SECURITY_KEY);
		String result = "";

		try {
			result = api.getTransResult(obj, "auto", "zh");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("resutl==" + result);

		// 转成map
		Map<String, String> mapResult = JSON.parseObject(result, Map.class);
		List<Map<String, String>> transResult = (List<Map<String, String>>) JSONArray
				.parse(JSON.toJSONString(mapResult.get("trans_result")));
		int i = 0;
		// 获取翻译结果
		String transQuery = transResult.get(i).get("dst");
		try {
			// 解码
			transQuery = transQuery.replaceAll("%(?![0-9a-fA-F]{2})", "%25");
			transQuery = URLDecoder.decode(transQuery, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println("transQuery==="+transQuery);
		log.debug("transQuery===="+transQuery);

		return transQuery;
	}

	public static void main(String[] args) {

		BadiDuFanYi.BaiDuFanYiYinToHan("In Figure 2C, the confocal images of two comparison groups (i.e., Coumarin-6-co-loaded SIMVA in water and Coumarin-6-co-loaded SIMVA in 5% DMSO) were repeated. Figure 2C represents cellular uptakes of Coumarin-6-co-loaded simvastatin (SIMVA) formulations though the ASBT-unexpressed MDCK cells which were indirectly measured qualitive data by detecting Coumarin-6 in the various SIMVA formulations in order to support the quantitative data (Figure 2E, F). In addition, this unrecognized error was occurred between the comparison groups, not in the formulation groups, which might be caused by wrong attachment of the images while organizing the subfigures in Figure 2 due to the similarity of results between these two groups.");

	}

}
