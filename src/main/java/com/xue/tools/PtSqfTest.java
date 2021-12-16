package com.xue.tools;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xue.entity.model.SqfShares;
import com.xue.repository.dao.SqfSharesMapper;

@Component
public class PtSqfTest {


	public static Logger log = Logger.getLogger( PtSqfTest.class );

	@Autowired
	SqfSharesMapper sqfSharesMapper;

	public void sqftest( )
	{

		SqfShares sqfShares = new SqfShares();

		sqfShares = sqfSharesMapper.selall_by_securities_code_entrusted_price_purchase_entrusted_quantity_purchase("300348","19.8" , "100");

		System.out.println("wocao======"+sqfShares.getSecuritiesName()+sqfShares.getSecuritiesCode() );
		log.debug("sqfshare==="+sqfShares.getSecuritiesName() );



	}

	public static void main(String[] args) {
		
		PtSqfTest sqf = new PtSqfTest();
		sqf.sqftest();
		
	}


}
