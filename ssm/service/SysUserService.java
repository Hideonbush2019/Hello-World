package com.ssm.service;

import java.util.List;

import com.ssm.model.SysUser;

public interface SysUserService {
 /*
  * Description:Service的接口类
  *<br/>Created By : HLF940701@outlook.com
  *<br/>Created Time :2019年5月21日 下午16:30
  * */
	public List<SysUser> getAllSysUser();
 /*
  * Description : 获取所有系统用户
  * *<br/>Created By : HLF940701@outlook.com
  *<br/>Created Time :2019年5月21日 下午16:30 
  * @return
  * */
    public List<SysUser> getSysUserByUserName (SysUser sysUser);

/*
 * Description : 根据用户名称查询该用户的信息
  * *<br/>Created By : HLF940701@outlook.com
  *<br/>Created Time :2019年5月21日 下午16:30 
  *
  *@param sysUser
  *@return
  */
	public SysUser getSysUserById(Integer id);
	/*
	 * Description : 根据ID查询系统用户
	 * <br/>Created By : HLF940701@outlook.com
	 * <br/>Creation Time : 2019年5月23日 上午9：:45
	 * 
	 * @param id
	 * @return
	 * */
	public int addSysUserById(SysUser sysUser);
	 public int delSysUserById(Integer id);
	public int editSysUserById(SysUser sysUser);
}