package com.entity.view;

import com.entity.ZuozhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 坐诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("zuozhenxinxi")
public class ZuozhenxinxiView  extends ZuozhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuozhenxinxiView(){
	}
 
 	public ZuozhenxinxiView(ZuozhenxinxiEntity zuozhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuozhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
