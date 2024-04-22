package com.entity.view;

import com.entity.JiancejieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 检测结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("jiancejieguo")
public class JiancejieguoView  extends JiancejieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiancejieguoView(){
	}
 
 	public JiancejieguoView(JiancejieguoEntity jiancejieguoEntity){
 	try {
			BeanUtils.copyProperties(this, jiancejieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
