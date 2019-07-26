package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
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
      out.write("login.jsp\" data-role=\"button\" data-ajax=\"false\">退出登录</a>\r\n");
      out.write("\t\t\t<h1>欢迎来到驴友社区</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"content\">\r\n");
      out.write("\t\t\t<ul data-role=\"listview\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("user_info.jsp\"> <img alt=\"\" src=\"\" class=\"ui-li-icon\">\r\n");
      out.write("\t\t\t\t\t\t个人信息查看\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("user_password.jsp\"> <img alt=\"\" src=\"\" class=\"ui-li-icon\">\r\n");
      out.write("\t\t\t\t\t\t个人密码修改\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("baidu_map.jsp\"> <img alt=\"\" src=\"\" class=\"ui-li-icon\">\r\n");
      out.write("\t\t\t\t\t\t百度地图\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://tianqi.2345.com/chongqing/57516.htm\"> <img alt=\"\" src=\"\" class=\"ui-li-icon\">\r\n");
      out.write("\t\t\t\t\t\t天气预报\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"footer\" data-position=\"fixed\" align=\"center\">\r\n");
      out.write("\t\t\t<div data-role=\"navbar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("tourpal/query.do\" data-ajax=\"false\">景点介绍</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("user_list.jsp\" data-ajax=\"false\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"ui-btn-active\">个人信息</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
