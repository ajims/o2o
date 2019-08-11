package com.imooc.o2o.entity;

import java.util.Date;

public class ProductImg {
	private long productImgId;
	private String imgAddr;
	private String imgDesc;
	private Integer priotity;
	private Date createTime;
	private long productId;
	public long getProductImgId() {
		return productImgId;
	}
	public void setProductImgId(long productImgId) {
		this.productImgId = productImgId;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	public String getImgDesc() {
		return imgDesc;
	}
	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}
	public Integer getPriotity() {
		return priotity;
	}
	public void setPriotity(Integer priotity) {
		this.priotity = priotity;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	
}
