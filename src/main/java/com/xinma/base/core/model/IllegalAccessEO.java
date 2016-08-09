package com.xinma.base.core.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 用户非法访问数据结构,一般用于用户访问频繁
 * 
 * @author Alauda
 *
 * @date 2016年6月27日
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IllegalAccessEO implements Serializable {

	private static final long serialVersionUID = -6854714956931513914L;

	/**
	 * 访问者IP
	 */
	private String ip;

	/**
	 * 访问者IP进入黑名单时间
	 */
	private Date date;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public IllegalAccessEO() {
		super();
	}

	public IllegalAccessEO(String ip, Date date) {
		super();
		this.ip = ip;
		this.date = date;
	}
}
