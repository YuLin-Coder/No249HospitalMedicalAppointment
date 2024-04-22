package com.entity.view;

import com.entity.HesuanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 核酸预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("hesuanyuyue")
public class HesuanyuyueView  extends HesuanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HesuanyuyueView(){
	}
 
 	public HesuanyuyueView(HesuanyuyueEntity hesuanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, hesuanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
