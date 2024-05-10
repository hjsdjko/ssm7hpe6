package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课程表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 00:19:41
 */
@TableName("kechengbiao")
public class KechengbiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengbiaoEntity() {
		
	}
	
	public KechengbiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 课程一
	 */
					
	private String kechengyi;
	
	/**
	 * 课程二
	 */
					
	private String kechenger;
	
	/**
	 * 课程三
	 */
					
	private String kechengsan;
	
	/**
	 * 课程四
	 */
					
	private String kechengsi;
	
	/**
	 * 课程五
	 */
					
	private String kechengwu;
	
	/**
	 * 课程六
	 */
					
	private String kechengliu;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：课程一
	 */
	public void setKechengyi(String kechengyi) {
		this.kechengyi = kechengyi;
	}
	/**
	 * 获取：课程一
	 */
	public String getKechengyi() {
		return kechengyi;
	}
	/**
	 * 设置：课程二
	 */
	public void setKechenger(String kechenger) {
		this.kechenger = kechenger;
	}
	/**
	 * 获取：课程二
	 */
	public String getKechenger() {
		return kechenger;
	}
	/**
	 * 设置：课程三
	 */
	public void setKechengsan(String kechengsan) {
		this.kechengsan = kechengsan;
	}
	/**
	 * 获取：课程三
	 */
	public String getKechengsan() {
		return kechengsan;
	}
	/**
	 * 设置：课程四
	 */
	public void setKechengsi(String kechengsi) {
		this.kechengsi = kechengsi;
	}
	/**
	 * 获取：课程四
	 */
	public String getKechengsi() {
		return kechengsi;
	}
	/**
	 * 设置：课程五
	 */
	public void setKechengwu(String kechengwu) {
		this.kechengwu = kechengwu;
	}
	/**
	 * 获取：课程五
	 */
	public String getKechengwu() {
		return kechengwu;
	}
	/**
	 * 设置：课程六
	 */
	public void setKechengliu(String kechengliu) {
		this.kechengliu = kechengliu;
	}
	/**
	 * 获取：课程六
	 */
	public String getKechengliu() {
		return kechengliu;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
