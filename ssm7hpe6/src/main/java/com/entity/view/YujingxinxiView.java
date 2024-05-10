package com.entity.view;

import com.entity.YujingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预警信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 00:19:41
 */
@TableName("yujingxinxi")
public class YujingxinxiView  extends YujingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YujingxinxiView(){
	}
 
 	public YujingxinxiView(YujingxinxiEntity yujingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yujingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
