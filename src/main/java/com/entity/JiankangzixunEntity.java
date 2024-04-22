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
 * 健康资讯
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("jiankangzixun")
public class JiankangzixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangzixunEntity() {
		
	}
	
	public JiankangzixunEntity(T t) {
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
	 * 资讯标题
	 */
					
	private String zixunbiaoti;
	
	/**
	 * 资讯封面
	 */
					
	private String zixunfengmian;
	
	/**
	 * 资讯类型
	 */
					
	private String zixunleixing;
	
	/**
	 * 资讯简介
	 */
					
	private String zixunjianjie;
	
	/**
	 * 资讯内容
	 */
					
	private String zixunneirong;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：资讯标题
	 */
	public void setZixunbiaoti(String zixunbiaoti) {
		this.zixunbiaoti = zixunbiaoti;
	}
	/**
	 * 获取：资讯标题
	 */
	public String getZixunbiaoti() {
		return zixunbiaoti;
	}
	/**
	 * 设置：资讯封面
	 */
	public void setZixunfengmian(String zixunfengmian) {
		this.zixunfengmian = zixunfengmian;
	}
	/**
	 * 获取：资讯封面
	 */
	public String getZixunfengmian() {
		return zixunfengmian;
	}
	/**
	 * 设置：资讯类型
	 */
	public void setZixunleixing(String zixunleixing) {
		this.zixunleixing = zixunleixing;
	}
	/**
	 * 获取：资讯类型
	 */
	public String getZixunleixing() {
		return zixunleixing;
	}
	/**
	 * 设置：资讯简介
	 */
	public void setZixunjianjie(String zixunjianjie) {
		this.zixunjianjie = zixunjianjie;
	}
	/**
	 * 获取：资讯简介
	 */
	public String getZixunjianjie() {
		return zixunjianjie;
	}
	/**
	 * 设置：资讯内容
	 */
	public void setZixunneirong(String zixunneirong) {
		this.zixunneirong = zixunneirong;
	}
	/**
	 * 获取：资讯内容
	 */
	public String getZixunneirong() {
		return zixunneirong;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
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
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}

}
