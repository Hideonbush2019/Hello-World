package com.ssm.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.SysUserMapper;
import com.ssm.model.SysUser;
import com.ssm.service.SysUserService;

/**
 * Description : Service的实现类
 * <br/>Created By : HLF940701@outlook.com
 * <br/>Creation Time : 2019年5月21日 下午16:30 
 *
 */
//Service层的注解
@Service
public class SysUserServiceImpl implements SysUserService {

	//自动注入Mapper层
	@Autowired
	private SysUserMapper sysUserMapper;
	
	/**
	 * 	获取所有系统用户信息的实现类
	 */
	@Override
	public List<SysUser> getAllSysUser() {
		return sysUserMapper.getAllSysUser();
	}

	/**
	 * Description : 根据用户名称获取用户信息的实现类
	 *<br/>Created By : HLF940701@outlook.com
     *<br/>Creation Time : 2019年5月21日 下午16:30 
	 * 
	 * @param sysUser
	 * @return
	 */
	@Override
	public List<SysUser> getSysUserByUserName(SysUser sysUser) {
		return sysUserMapper.getSysUserByUserName(sysUser);
	}
/*	
 * Description : 根据ID查询系统用户
 * <br/>Created By : HLF940701@outlook.com
 * <br/>Created By : 2019年5月23日 上午9:45
 * @param id
 * @return
 * */
	@Override
	public SysUser getSysUserById(Integer id) {
		return sysUserMapper.getSysUserById(id);
	}
	
	
	@Override	
	public int addSysUserById(SysUser sysUser) {
		
		return sysUserMapper.addSysUserById(sysUser);
	}

	@Override
	public int delSysUserById(Integer id) {
		// TODO Auto-generated method stub
		return sysUserMapper.delSysUserById(id);
	}

	@Override
	public int editSysUserById(SysUser sysUser) {
		// TODO Auto-generated method stub
		return sysUserMapper.editSysUserById(sysUser);
	}

	
	
	
	
	
}
