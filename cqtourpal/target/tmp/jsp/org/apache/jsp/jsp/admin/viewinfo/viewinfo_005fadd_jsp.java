package org.apache.jsp.jsp.admin.viewinfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewinfo_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>景区管理-景区添加</title>\r\n");
      out.write("<link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("\t\t<ul class=\"breadcrumb\" style=\"margin: 0px;\">\r\n");
      out.write("\t\t\t<li>系统管理</li>\r\n");
      out.write("\t\t\t<li>景区管理</li>\r\n");
      out.write("\t\t\t<li>景区添加</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("<form action=\"viewinfo/add.do\" method=\"post\" enctype=\"multipart/form-data\" class=\"form-horizontal\">\r\n");
      out.write("\t\t<h5 class=\"page-header alert-info\"\r\n");
      out.write("\t\t\tstyle=\"margin: 0px; padding: 10px; margin-bottom: 10px;\">基本信息</h5>\r\n");
      out.write("\t\t<!-- 开始1 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-9\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-xs-3 control-label\">景区名称</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 \">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"viewName\" class=\"form-control\" placeholder=\"请输入景区姓名\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--结束1 -->\r\n");
      out.write("\t\t<!-- 开始1 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-9\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-xs-3 control-label\">景区照片</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9 \">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" name=\"file\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--结束1 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h5 class=\"page-header alert-info\"\r\n");
      out.write("\t\t\tstyle=\"margin: 0px; padding: 10px; margin-bottom: 10px;\">景区详情</h5>\r\n");
      out.write("\t\t<!-- 开始5 -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-9\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-xs-3 control-label\">景区详情</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-9\">\r\n");
      out.write("\t\t\t\t\t\t<textarea rows=\"\" cols=\"\" name=\"viewDesc\" placeholder=\"请输入景区详情\"  class=\"form-control\"></textarea>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--结束5 -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-3 col-xs-offset-4\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-success\" value=\"保存景区\" /> <input\r\n");
      out.write("\t\t\t\t\ttype=\"reset\" class=\"btn btn-danger\" value=\"重置信息\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
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
