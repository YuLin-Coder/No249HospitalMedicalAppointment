package com.entity.view;

import com.entity.JiankangzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:13:17
 */
@TableName("jiankangzixun")
public class JiankangzixunView  extends JiankangzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangzixunView(){
	}
 
 	public JiankangzixunView(JiankangzixunEntity jiankangzixunEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
