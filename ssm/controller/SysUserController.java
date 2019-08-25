package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.model.SysUser;
import com.ssm.service.SysUserService;
/**
 * Description : Controller层的类
 * <br/>Created By : HLF940701@outlook.com
 * <br/>Creation Time : 2019年5月21日 下午9:49:13 
 *
 */
//Controller层的注解
@Controller
public class SysUserController {

	//自动注入Service层
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * Description : 获取所有用户信息
	 * <br/>Created By : xiaok0928@hotmail.com 
	 * <br/>Creation Time : 2019年5月21日 下午9:49:36 
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	// 请求的URI地址
	@RequestMapping("/getAllSysUser")
	public ModelAndView getAllSysUser(HttpServletRequest request, HttpServletResponse response) {
		//声明ModelAndView
		ModelAndView mv = new ModelAndView();
		//调用Service层的实现, 获取所有用户的Service方法
		List<SysUser> sysUsers = sysUserService.getAllSysUser();
		//将查询出的结果放入ModelAndView中
		mv.addObject("users", sysUsers);
		//设置返回的视图名称
		mv.setViewName("SysUser");
		return mv;
	}
	
	//请求的URI地址
	@RequestMapping("/getSysUserByUserName")
	public ModelAndView getSysUserByUserName(HttpServletRequest request, HttpServletResponse response, SysUser sysUser) {
		//声明ModelAndView
		ModelAndView mv = new ModelAndView();
		//调用Service层的方法实现, 根据用户名称查询该用户的信息
		List<SysUser> sysUsers = sysUserService.getSysUserByUserName(sysUser);
		//将查询出的结果放入ModelAndView中
		mv.addObject("users", sysUsers);
		//设置返回的视图名称
		mv.setViewName("SysUser");
		//返回ModelAndView, 由视图解析器进行解析
		return mv;
	}
/*
 * Description : 根据ID查询系统用户详细信息
 * <br/>Created By : HLF940701@outlook.com
 * <br/>Created By : 2019年5月23日 上午09：45
 * 
 * @param request
 * @param response
 * @param id
 * @return
 * */
@RequestMapping("/getSysUserById")
 
public ModelAndView getSysUserById(HttpServletRequest request,HttpServletResponse response, int id) {
	ModelAndView mv = new ModelAndView();
	SysUser user = sysUserService.getSysUserById(id);
	mv.addObject("user",user);
	mv.setViewName("SysUserDetail");
	return mv;
}
@RequestMapping("/addSysUserById")
public ModelAndView addSysUserById(HttpServletRequest request, HttpServletResponse response, SysUser sysUser) {
	ModelAndView mv = new ModelAndView();
	int count = sysUserService.addSysUserById(sysUser);
	String msg = count > 0 ? "添加成功" : "添加失败";
	mv.addObject("msg", msg);
	mv.setViewName("addSysUser");
	return mv;	
}
@RequestMapping("/delSysUserById")
public ModelAndView delSysUserById(HttpServletRequest request, HttpServletResponse response, int id) {
	ModelAndView mv = new ModelAndView();
	int count = sysUserService.delSysUserById(id);
	String msg = count > 0 ?"删除成功" : "删除失败";
	mv.addObject("msg",msg);
	mv.setViewName("redirect:/getAllSysUser");
	return mv;	   /*   返回               链接*/


}
@RequestMapping("/editSysUserById")
public ModelAndView editSysUserById(HttpServletRequest request, HttpServletResponse response,SysUser sysUser) {
	ModelAndView mv = new ModelAndView();
	int count = sysUserService.editSysUserById(sysUser);
	String msg = count > 0 ?"修改成功" : "修改失败";
	mv.addObject("user",msg);
	mv.setViewName("editSysUser");
	return mv;	


}
}










