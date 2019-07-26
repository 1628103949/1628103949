<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>老牛驴友社区</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="resources/tourpal/css/jquery.mobile-1.3.2.min.css"
	type="text/css" rel="stylesheet">
<link href="resources/tourpal/css/jquery.mobile.tabs.css"
	type="text/css" rel="stylesheet">
<script src="resources/tourpal/js/jquery-1.8.3.min.js"></script>
<script src="resources/tourpal/js/jquery.mobile-1.3.2.min.js"></script>
<script src="resources/tourpal/js/jquery.mobile.tabs.js"></script>
</head>
<body>
<div data-role="page">
		<div data-role="header">
			<a href="<%=basePath %>login.jsp" data-role="button" data-ajax="false">退出登录</a>
			<h1>欢迎来到驴友社区</h1>
		</div>
		<div data-role="content">
			<ul data-role="listview">
				<li><a href="<%=basePath %>user_info.jsp"> <img alt="" src="" class="ui-li-icon">
						个人信息查看
				</a></li>
				<li><a href="<%=basePath %>user_password.jsp"> <img alt="" src="" class="ui-li-icon">
						个人密码修改
				</a></li>
				<li><a href="<%=basePath %>baidu_map.jsp"> <img alt="" src="" class="ui-li-icon">
						百度地图
				</a></li>
				<li><a href="http://tianqi.2345.com/chongqing/57516.htm"> <img alt="" src="" class="ui-li-icon">
						天气预报
				</a></li>
			</ul>
		</div>
		<div data-role="footer" data-position="fixed" align="center">
			<div data-role="navbar">
				<ul>
				<li><a href="<%=basePath%>tourpal/query.do" data-ajax="false">景点介绍</a></li>
					<li><a href="<%=basePath %>user_list.jsp" data-ajax="false"
						class="ui-btn-active">个人信息</a></li>
				</ul>
			</div>

		</div>
	</div>
</body>
</html>