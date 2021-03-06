package com.gs.bean;

import java.util.Date;
/**
 * 
 * @author 曾创
 *建材商收藏表t_supply_col				
 */
public class SupplyCol {

	private String id;//	unique_identifier	编号	主键，uuid
	private String customer_id;//	unique_identifier	用户编号	外键，关联到t_customer表的id字段
	private String supply_id;//	unique_identifier	建材商编号	外键，关联到t_supply表的id字段
	private Date created_time;//	datetime	创建时间	添加时的系统当前时间
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getSupply_id() {
		return supply_id;
	}
	public void setSupply_id(String supply_id) {
		this.supply_id = supply_id;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

}
