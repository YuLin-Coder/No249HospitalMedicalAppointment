package com.entity.view;

import com.entity.ZhenduanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 诊断信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("zhenduanxinxi")
public class ZhenduanxinxiView  extends ZhenduanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhenduanxinxiView(){
	}
 
 	public ZhenduanxinxiView(ZhenduanxinxiEntity zhenduanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhenduanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
