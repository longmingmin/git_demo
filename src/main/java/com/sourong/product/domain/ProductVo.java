package com.sourong.product.domain;

import java.util.Date;

public class ProductVo {
	private Integer proID;
	private String proName;
	private String proIntroduce;
	private String proIcon;
	private Date createtime;
	private Date mtime;
	private Integer proGrounding;
	public Integer getProID() {
		return proID;
	}
	public void setProID(Integer proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProIntroduce() {
		return proIntroduce;
	}
	public void setProIntroduce(String proIntroduce) {
		this.proIntroduce = proIntroduce;
	}
	public String getProIcon() {
		return proIcon;
	}
	public void setProIcon(String proIcon) {
		this.proIcon = proIcon;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getMtime() {
		return mtime;
	}
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}
	public Integer getProGrounding() {
		return proGrounding;
	}
	public void setProGrounding(Integer proGrounding) {
		this.proGrounding = proGrounding;
	}
	@Override
	public String toString() {
		return "ProductVo [proID=" + proID + ", proName=" + proName + ", proIntroduce=" + proIntroduce + ", proIcon="
				+ proIcon + ", createtime=" + createtime + ", mtime=" + mtime + ", proGrounding=" + proGrounding + "]";
	}
}
