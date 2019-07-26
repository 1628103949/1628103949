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
<title>首页</title>
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
			<a href="<%=basePath %>user_list.jsp" data-role="button" data-ajax="false">返回上一级</a>
			<h1>查看地图</h1>
		</div>
		<div data-role="content" style="width: 100%;height:420px" id="baiduMap">
			
			
		</div>
		<div data-role="footer" data-position="fixed" align="center">
			<div data-role="navbar">
				<ul>
					<li><a href="<%=basePath %>tourpal/query.do" data-ajax="false"  >景点介绍</a></li>
					<li><a href="<%=basePath %>user_list.jsp" data-ajax="false"  class="ui-btn-active">个人信息</a></li>
				</ul>
			</div>
		</div>
	</div>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.2"></script>
<script type="text/javascript">
function initialize() {
	var mp = new BMap.Map('baiduMap');
	mp.addControl(new BMap.NavigationControl());
	mp.addControl(new BMap.ScaleControl());
	mp.addControl(new BMap.OverviewMapControl());
	mp.addControl(new BMap.MapTypeControl());
	mp.setCurrentCity("重庆"); // 仅当设置城市信息时，MapTypeControl的切换功能才能可用

	var point = new BMap.Point(106.404, 29.915);
	mp.centerAndZoom(point, 15);

	var marker = new BMap.Marker(point); // 创建标注  
	mp.addOverlay(marker); // 将标注添加到地图中

}

function loadScript() {
	var script = document.createElement("script");
	script.src = "http://api.map.baidu.com/api?v=1.2&callback=initialize";
	document.body.appendChild(script);
}

window.onload = loadScript;

</script>
</body>
</html>