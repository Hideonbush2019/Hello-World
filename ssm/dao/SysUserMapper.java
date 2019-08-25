package com.ssm.dao;

import java.util.List;

import com.ssm.model.SysUser;

/**
 * Description : MyBatis的Xml文件的命名空间接口类
 * <br/>Created By : HLF940701@outlook.com
 * <br/>Creation Time : 2019年5月21日 下午16:30 
 *
 */
public interface SysUserMapper {
	/**
	 * 	获取所有的系统用户
	 * @return
	 */
	public List<SysUser> getAllSysUser();
	
	/**
	 * Description : 根据用户名称获取系统用户
	 * * <br/>Created By : HLF940701@outlook.com
 * <br/>Creation Time : 2019年5月21日 下午16:30
	 * 
	 * @param sysUser
	 * @return
	 */
	public List<SysUser> getSysUserByUserName(SysUser sysUser);
	/*
	 * Description : 根据ID查询系统用户
	 * <br/>Created By : HLF940701@outlook.com
	 * <br/>Creation Time : 2019年5月23日 上午9：:45
	 * 
	 * @param id
	 * @return
	 *
	 * */
	public SysUser getSysUserById(Integer id);
/*
 * 
 * */
	public int delSysUserById(Integer id);
	
	public int editSysUserById(SysUser sysUser);
	
	public int addSysUserById(SysUser sysUser);
	
	
}
