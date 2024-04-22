package com.entity.view;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 药品信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("yaopinxinxi")
public class YaopinxinxiView  extends YaopinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YaopinxinxiView(){
	}
 
 	public YaopinxinxiView(YaopinxinxiEntity yaopinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yaopinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
