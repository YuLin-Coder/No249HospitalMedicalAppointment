package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 检测结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("jiancejieguo")
public class JiancejieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiancejieguoEntity() {
		
	}
	
	public JiancejieguoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 检测名称
	 */
					
	private String jiancemingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fasongriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：检测名称
	 */
	public void setJiancemingcheng(String jiancemingcheng) {
		this.jiancemingcheng = jiancemingcheng;
	}
	/**
	 * 获取：检测名称
	 */
	public String getJiancemingcheng() {
		return jiancemingcheng;
	}
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
