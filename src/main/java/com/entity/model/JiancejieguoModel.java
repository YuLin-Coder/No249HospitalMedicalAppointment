package com.entity.model;

import com.entity.JiancejieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 检测结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public class JiancejieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 检测地点
	 */
	
	private String jiancedidian;
		
	/**
	 * 检测类型
	 */
	
	private String jianceleixing;
		
	/**
	 * 费用
	 */
	
	private String feiyong;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 检测结果
	 */
	
	private String jiancejieguo;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 发送日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongriqi;
				
	
	/**
	 * 设置：检测地点
	 */
	 
	public void setJiancedidian(String jiancedidian) {
		this.jiancedidian = jiancedidian;
	}
	
	/**
	 * 获取：检测地点
	 */
	public String getJiancedidian() {
		return jiancedidian;
	}
				
	
	/**
	 * 设置：检测类型
	 */
	 
	public void setJianceleixing(String jianceleixing) {
		this.jianceleixing = jianceleixing;
	}
	
	/**
	 * 获取：检测类型
	 */
	public String getJianceleixing() {
		return jianceleixing;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(String feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public String getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：检测结果
	 */
	 
	public void setJiancejieguo(String jiancejieguo) {
		this.jiancejieguo = jiancejieguo;
	}
	
	/**
	 * 获取：检测结果
	 */
	public String getJiancejieguo() {
		return jiancejieguo;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：发送日期
	 */
	 
	public void setFasongriqi(Date fasongriqi) {
		this.fasongriqi = fasongriqi;
	}
	
	/**
	 * 获取：发送日期
	 */
	public Date getFasongriqi() {
		return fasongriqi;
	}
			
}
