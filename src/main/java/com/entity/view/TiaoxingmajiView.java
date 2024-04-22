package com.entity.view;

import com.entity.TiaoxingmajiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 条形码机
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:18
 */
@TableName("tiaoxingmaji")
public class TiaoxingmajiView  extends TiaoxingmajiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiaoxingmajiView(){
	}
 
 	public TiaoxingmajiView(TiaoxingmajiEntity tiaoxingmajiEntity){
 	try {
			BeanUtils.copyProperties(this, tiaoxingmajiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
