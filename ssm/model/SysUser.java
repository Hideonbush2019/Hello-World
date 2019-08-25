package com.ssm.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
/*
 * Description : 实体类
 * <br/>Created By : HLF940701@outlook.com
 *  <br/>Created Time : 2019年5月21日 下午：16:30
 * */
@Setter
@Getter
public class SysUser {
	/** 主键ID */
	private Integer id;
	
	/** 用户名 */
	private String userName;
	
	/** 真实姓名 */
	private String realName;
	
	/** 密码 */
	private String password;
	
	/** 性别 */
	private Integer userSex;
	
	/** 出生日期 */
	private Date userBirthday;
	
	/** 删除标记 */
	private Integer delFlag;
	//外部查询字段
	/*开始时间*/
	private Date startUserBirthday;
	/*结束时间*/
	private Date endUserBirthday;
	
}