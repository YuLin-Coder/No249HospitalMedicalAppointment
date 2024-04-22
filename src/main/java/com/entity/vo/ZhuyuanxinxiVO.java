package com.entity.vo;

import com.entity.ZhuyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 住院信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public class ZhuyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 医院名称
	 */
	
	private String yiyuanmingcheng;
		
	/**
	 * 科室名称
	 */
	
	private String keshimingcheng;
		
	/**
	 * 住院名称
	 */
	
	private String zhuyuanmingcheng;
		
	/**
	 * 费用
	 */
	
	private Integer feiyong;
		
	/**
	 * 住院日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhuyuanriqi;
		
	/**
	 * 住院备注
	 */
	
	private String zhuyuanbeizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：医院名称
	 */
	 
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
				
	
	/**
	 * 设置：科室名称
	 */
	 
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
				
	
	/**
	 * 设置：住院名称
	 */
	 
	public void setZhuyuanmingcheng(String zhuyuanmingcheng) {
		this.zhuyuanmingcheng = zhuyuanmingcheng;
	}
	
	/**
	 * 获取：住院名称
	 */
	public String getZhuyuanmingcheng() {
		return zhuyuanmingcheng;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(Integer feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Integer getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：住院日期
	 */
	 
	public void setZhuyuanriqi(Date zhuyuanriqi) {
		this.zhuyuanriqi = zhuyuanriqi;
	}
	
	/**
	 * 获取：住院日期
	 */
	public Date getZhuyuanriqi() {
		return zhuyuanriqi;
	}
				
	
	/**
	 * 设置：住院备注
	 */
	 
	public void setZhuyuanbeizhu(String zhuyuanbeizhu) {
		this.zhuyuanbeizhu = zhuyuanbeizhu;
	}
	
	/**
	 * 获取：住院备注
	 */
	public String getZhuyuanbeizhu() {
		return zhuyuanbeizhu;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
