package com.entity.vo;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
public class KeshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 科室地址
	 */
	
	private String keshidizhi;
				
	
	/**
	 * 设置：科室地址
	 */
	 
	public void setKeshidizhi(String keshidizhi) {
		this.keshidizhi = keshidizhi;
	}
	
	/**
	 * 获取：科室地址
	 */
	public String getKeshidizhi() {
		return keshidizhi;
	}
			
}
