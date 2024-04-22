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
 * 药品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("yaopinxinxi")
public class YaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YaopinxinxiEntity() {
		
	}
	
	public YaopinxinxiEntity(T t) {
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
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 药品图片
	 */
					
	private String yaopintupian;
	
	/**
	 * 药品简介
	 */
					
	private String yaopinjianjie;
	
	/**
	 * 药品功效
	 */
					
	private String yaopingongxiao;
	
	/**
	 * 服用方式
	 */
					
	private String fuyongfangshi;
	
	/**
	 * 单价
	 */
					
	private Integer danjia;
	
	/**
	 * 生产商
	 */
					
	private String shengchanshang;
	
	
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
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：药品图片
	 */
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
	/**
	 * 设置：药品简介
	 */
	public void setYaopinjianjie(String yaopinjianjie) {
		this.yaopinjianjie = yaopinjianjie;
	}
	/**
	 * 获取：药品简介
	 */
	public String getYaopinjianjie() {
		return yaopinjianjie;
	}
	/**
	 * 设置：药品功效
	 */
	public void setYaopingongxiao(String yaopingongxiao) {
		this.yaopingongxiao = yaopingongxiao;
	}
	/**
	 * 获取：药品功效
	 */
	public String getYaopingongxiao() {
		return yaopingongxiao;
	}
	/**
	 * 设置：服用方式
	 */
	public void setFuyongfangshi(String fuyongfangshi) {
		this.fuyongfangshi = fuyongfangshi;
	}
	/**
	 * 获取：服用方式
	 */
	public String getFuyongfangshi() {
		return fuyongfangshi;
	}
	/**
	 * 设置：单价
	 */
	public void setDanjia(Integer danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public Integer getDanjia() {
		return danjia;
	}
	/**
	 * 设置：生产商
	 */
	public void setShengchanshang(String shengchanshang) {
		this.shengchanshang = shengchanshang;
	}
	/**
	 * 获取：生产商
	 */
	public String getShengchanshang() {
		return shengchanshang;
	}

}
