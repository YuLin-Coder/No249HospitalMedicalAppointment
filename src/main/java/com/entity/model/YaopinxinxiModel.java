package com.entity.model;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public class YaopinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
