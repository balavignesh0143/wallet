package com.dao;

import java.util.HashMap;

import com.bean.TransferDetails;
import com.bean.UserDetails;

public class Store implements StoreInter {
	
	UserDetails ud;
	TransferDetails td;
	
	HashMap<Long,UserDetails> hm=new HashMap<Long,UserDetails>();
	HashMap<Long,TransferDetails> hm1=new HashMap<Long,TransferDetails>();
	
	public void addDetails(UserDetails ud)
	{
		this.ud=ud;
		hm.put(ud.getAccNo(),ud);
		System.out.println(hm);
	}
	
	/*public void transferDetails(TransferDetails td)
	{
		this.td=td;
		hm1.put(td.getAcc1(),td);
	}*/

	public HashMap<Long,UserDetails> hm()
	{
		return hm;
	}
	
	public HashMap<Long,TransferDetails> hm1()
	{
		return hm1;
	}

	@Override
	public void transferDetails(TransferDetails td) {
		this.td=td;
		hm1.put((long) td.getAcc1(),td);
	}
}
