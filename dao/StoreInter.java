package com.dao;

import com.bean.TransferDetails;
import com.bean.UserDetails;

public interface StoreInter {
	public void addDetails(UserDetails ud);
	public void transferDetails(TransferDetails td);
}
