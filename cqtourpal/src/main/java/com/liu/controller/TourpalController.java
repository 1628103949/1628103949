package com.liu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.po.UserInfo;
import com.liu.po.ViewInfo;
import com.liu.service.UserInfoService;
import com.liu.service.ViewInfoService;

@Controller
@RequestMapping("/tourpal/")
public class TourpalController {

	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userService;

	@Resource(name = "viewInfoServiceImpl")
	private ViewInfoService viewService;

	/**
	 * 用户注册
	 * 
	 * @param userInfo
	 * @param model
	 * @return
	 */
	@RequestMapping("reg.do")
	public String reg(UserInfo userInfo, Model model) {

		if (userInfo != null) {
			userInfo.setUserType("普通用户");
		}

		boolean mark = userService.add(userInfo);
		if (mark) {
			// model.addAttribute("info", "用户注册成功，请登录");
			return "login";
		} else {
			// model.addAttribute("info", "用户注册失败，请重新输入");
			return "reg";
		}
	}

	@RequestMapping("login.do")
	public String login(String userNumber, String userPw, Model model,
			HttpSession session) {

		if (userNumber != null && !userNumber.equals("")) {

			UserInfo user = userService.getUser(userNumber);

			if (user != null && user.getUserPw().equals(userPw)) {
				session.setAttribute("userinfo", user);

				return query(model);
			} else {
				model.addAttribute("info", "账号或密码错误");
			}

		} else {
			model.addAttribute("info", "账号密码不能为空");
		}

		return "login";
	}

	/**
	 * 查询所有的景区
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping("query.do")
	public String query(Model model) {
		List<ViewInfo> list = viewService.getList(null);
		model.addAttribute("list", list);
		return "index";
	}

	/**
	 * 根据编号查询景区信息
	 * 
	 * @param viewId
	 * @param model
	 * @return
	 */
	@RequestMapping("queryInfo.do")
	public String queryInfo(Integer viewId, Model model) {

		ViewInfo viewInfo = viewService.getInfo(viewId);

		model.addAttribute("viewinfo", viewInfo);

		return "view_info";
	}

	/**
	 * 修改密码
	 * @param user
	 * @param passWord
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("updatePw.do")
	public String updatePw(UserInfo user, String passWord, Model model,
			HttpSession session) {

		UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");

		if (passWord != null && userInfo != null
				&& passWord.equals(userInfo.getUserPw())) {
			
			boolean mark = userService.update(user);
			if(mark){
				model.addAttribute("info", "密码修改成功，请重新登录");
				return "login";
			}
		}else{
			model.addAttribute("info", "原密码输入不正确!");
		}

		return "user_password";
	}

	public void setUserService(UserInfoService userService) {
		this.userService = userService;
	}

	public void setViewService(ViewInfoService viewService) {
		this.viewService = viewService;
	}

}
