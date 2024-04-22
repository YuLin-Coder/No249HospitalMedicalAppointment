package com.entity.view;

import com.entity.TijianbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体检报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
@TableName("tijianbaogao")
public class TijianbaogaoView  extends TijianbaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijianbaogaoView(){
	}
 
 	public TijianbaogaoView(TijianbaogaoEntity tijianbaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, tijianbaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
