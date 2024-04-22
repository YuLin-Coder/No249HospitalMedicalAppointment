package com.entity.view;

import com.entity.ShiyongxuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 使用须知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
@TableName("shiyongxuzhi")
public class ShiyongxuzhiView  extends ShiyongxuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyongxuzhiView(){
	}
 
 	public ShiyongxuzhiView(ShiyongxuzhiEntity shiyongxuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, shiyongxuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
