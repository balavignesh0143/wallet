package com.bean;

public class TransferDetails {
	
	private long acc1;
	private long acc2;
	private double transferAmt;
	
	public double getAcc1() {
		return acc1;
	}
	public void setAcc1(long acc1) {
		this.acc1 = acc1;
	}
	public double getAcc2() {
		return acc2;
	}
	public void setAcc2(long acc2) {
		this.acc2 = acc2;
	}
	public double getTransferAmt() {
		return transferAmt;
	}
	public void setTransferAmt(double transferAmt) {
		this.transferAmt = transferAmt;
	}
	
	public TransferDetails(long acc1,long acc2,double transferAmt)
	{
		this.acc1=acc1;
		this.acc2=acc2;
		this.transferAmt=transferAmt;
	}

}
