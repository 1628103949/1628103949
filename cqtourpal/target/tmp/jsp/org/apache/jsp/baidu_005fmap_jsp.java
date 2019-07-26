package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class baidu_005fmap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("<title>老牛驴友社区</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"resources/tourpal/css/jquery.mobile-1.3.2.min.css\"\r\n");
      out.write("\ttype=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/tourpal/css/jquery.mobile.tabs.css\"\r\n");
      out.write("\ttype=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"resources/tourpal/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script src=\"resources/tourpal/js/jquery.mobile-1.3.2.min.js\"></script>\r\n");
      out.write("<script src=\"resources/tourpal/js/jquery.mobile.tabs.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div data-role=\"page\">\r\n");
      out.write("\t\t<div data-role=\"header\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(basePath );
      out.write("user_list.jsp\" data-role=\"button\" data-ajax=\"false\">返回上一级</a>\r\n");
      out.write("\t\t\t<h1>查看地图</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"content\" style=\"width: 100%;height:420px\" id=\"baiduMap\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"footer\" data-position=\"fixed\" align=\"center\">\r\n");
      out.write("\t\t\t<div data-role=\"navbar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("tourpal/query.do\" data-ajax=\"false\"  >景点介绍</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("user_list.jsp\" data-ajax=\"false\"  class=\"ui-btn-active\">个人信息</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=1.2\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function initialize() {\r\n");
      out.write("\tvar mp = new BMap.Map('baiduMap');\r\n");
      out.write("\tmp.addControl(new BMap.NavigationControl());\r\n");
      out.write("\tmp.addControl(new BMap.ScaleControl());\r\n");
      out.write("\tmp.addControl(new BMap.OverviewMapControl());\r\n");
      out.write("\tmp.addControl(new BMap.MapTypeControl());\r\n");
      out.write("\tmp.setCurrentCity(\"重庆\"); // 仅当设置城市信息时，MapTypeControl的切换功能才能可用\r\n");
      out.write("\r\n");
      out.write("\tvar point = new BMap.Point(106.404, 29.915);\r\n");
      out.write("\tmp.centerAndZoom(point, 15);\r\n");
      out.write("\r\n");
      out.write("\tvar marker = new BMap.Marker(point); // 创建标注  \r\n");
      out.write("\tmp.addOverlay(marker); // 将标注添加到地图中\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function loadScript() {\r\n");
      out.write("\tvar script = document.createElement(\"script\");\r\n");
      out.write("\tscript.src = \"http://api.map.baidu.com/api?v=1.2&callback=initialize\";\r\n");
      out.write("\tdocument.body.appendChild(script);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("window.onload = loadScript;\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
