package com.entity.model;

import com.entity.JiankangdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康档案
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public class JiankangdanganModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身高cm
	 */
	
	private String shengaocm;
		
	/**
	 * 体重kg
	 */
	
	private String tizhongkg;
		
	/**
	 * 血压pa
	 */
	
	private String xueyapa;
		
	/**
	 * 血糖g
	 */
	
	private String xuetangg;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 睡眠时间
	 */
	
	private String shuimianshijian;
		
	/**
	 * 运动情况
	 */
	
	private String yundongqingkuang;
		
	/**
	 * 附件
	 */
	
	private String fujian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：身高cm
	 */
	 
	public void setShengaocm(String shengaocm) {
		this.shengaocm = shengaocm;
	}
	
	/**
	 * 获取：身高cm
	 */
	public String getShengaocm() {
		return shengaocm;
	}
				
	
	/**
	 * 设置：体重kg
	 */
	 
	public void setTizhongkg(String tizhongkg) {
		this.tizhongkg = tizhongkg;
	}
	
	/**
	 * 获取：体重kg
	 */
	public String getTizhongkg() {
		return tizhongkg;
	}
				
	
	/**
	 * 设置：血压pa
	 */
	 
	public void setXueyapa(String xueyapa) {
		this.xueyapa = xueyapa;
	}
	
	/**
	 * 获取：血压pa
	 */
	public String getXueyapa() {
		return xueyapa;
	}
				
	
	/**
	 * 设置：血糖g
	 */
	 
	public void setXuetangg(String xuetangg) {
		this.xuetangg = xuetangg;
	}
	
	/**
	 * 获取：血糖g
	 */
	public String getXuetangg() {
		return xuetangg;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：睡眠时间
	 */
	 
	public void setShuimianshijian(String shuimianshijian) {
		this.shuimianshijian = shuimianshijian;
	}
	
	/**
	 * 获取：睡眠时间
	 */
	public String getShuimianshijian() {
		return shuimianshijian;
	}
				
	
	/**
	 * 设置：运动情况
	 */
	 
	public void setYundongqingkuang(String yundongqingkuang) {
		this.yundongqingkuang = yundongqingkuang;
	}
	
	/**
	 * 获取：运动情况
	 */
	public String getYundongqingkuang() {
		return yundongqingkuang;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
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
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
