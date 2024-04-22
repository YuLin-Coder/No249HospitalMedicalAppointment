package com.entity.view;

import com.entity.ChufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 处方信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("chufangxinxi")
public class ChufangxinxiView  extends ChufangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChufangxinxiView(){
	}
 
 	public ChufangxinxiView(ChufangxinxiEntity chufangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chufangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
