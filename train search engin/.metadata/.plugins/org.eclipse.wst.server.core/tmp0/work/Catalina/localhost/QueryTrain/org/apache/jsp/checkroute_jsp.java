/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M13
 * Generated at: 2018-12-06 05:57:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbconnect.DAO_Implement;

public final class checkroute_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dbconnect.DAO_Implement");
    _jspx_imports_classes.add("java.sql.ResultSet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Traveling Train</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"Container\">\r\n");
      out.write("\t\t<div id=\"header_\">\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home Page</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"checktrains.jsp\">Check Trains</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"checktrainsvia.jsp\"> Check via</a>\r\n");
      out.write("\t\t\t\t<li><a href=\"checkroute.jsp\">Check Route</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\">Log In</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h2\r\n");
      out.write("\t\t\tstyle=\"color: #CCFF66; margin-left: 250px; font-family: monospace; font-weight: bold; font-size: 30px;\">VIEW ROUTE</h2>\r\n");
      out.write("\t\t");

			DAO_Implement dao = new DAO_Implement();
			String source = "", dest = "";
		
      out.write("\r\n");
      out.write("\t\t<form action=\"\">\r\n");
      out.write("\t\t\t<table style=\"margin-left: 50px;\" cellspacing=\"15\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-size: 30px; font-weight: bold; color: blue; font-family: monospace;\"\r\n");
      out.write("\t\t\t\t\t\t\tcolspan=\"2\">CHECK ROUTE</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: #734633; font-weight: bold; font-size: 20px; color: #FFCC00; font-family: monospace;\">SOURCE</td>\r\n");
      out.write("\t\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: #734633; font-weight: bold; font-size: 20px; color: #FFCC00; font-family: monospace;\">DESTINATION</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"source\" name=\"source\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 200px; height: 25px; border-radius: 10px; font-size: 20px; font-weight: bold;\"\r\n");
      out.write("\t\t\t\t\t\trequired=\"\"></input></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" id=\"destination\" name=\"destination\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 200px; height: 25px; border-radius: 10px; font-size: 20px; font-weight: bold;\"\r\n");
      out.write("\t\t\t\t\t\trequired=\"\"></input></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" id=\"submit\" name=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"SUBMIT\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"float: right; font-weight: bold; color: white; background: #82ab01; height: 30px; width: 100px; border-radius: 10px;\"></input></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");

			if (request.getParameter("source") != null && request.getParameter("destination") != null) {
				source = request.getParameter("source");
				dest = request.getParameter("destination");

				String sql = "SELECT via FROM viaroute WHERE source = '"
						+ source + "' AND destination = '" + dest + "'";
				System.out.println(sql);
				ResultSet res = dao.getData(sql);
				if (res.next()) {
		
      out.write("\r\n");
      out.write("\t\t<table style=\"margin: auto; margin-top: 50px;\" cellspacing=\"10\"\r\n");
      out.write("\t\t\tid=\"cusback_new\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\tstyle=\"font-weight: bold; font-size: 25px; color: #CCFF66; font-family: monospace;\">SOURCE\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\tstyle=\"font-weight: bold; font-size: 25px; font-family: monospace; color: #CCFF66;\">VIA</td>\r\n");
      out.write("\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\tstyle=\"font-weight: bold; font-size: 25px; font-family: monospace; color: #CCFF66;\">DESTINATION</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				do {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size: 18px; color: #FFCC00; font-weight: bold; font-family: monospace;\">");
      out.print(source);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size: 18px; color: #FFCC00; font-weight: bold; font-family: monospace;\">");
      out.print(res.getString("via"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td\r\n");
      out.write("\t\t\t\t\tstyle=\"font-size: 18px; color: #FFCC00; font-weight: bold; font-family: monospace;\">");
      out.print(dest);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				} while (res.next());
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");

			} 
			}
					else{
						
      out.write("\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tstyle=\"color: #FFCC00; font-family: inherit; font-size: 25px; font-weight: bold; text-align: center; margin-top: 100px; margin-left: 30px; font-family: monospace; font-weight: bold;\">\r\n");
      out.write("\t\t\tNo Trains Available</div>\r\n");
      out.write("\t\t");

					}
		
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer1_\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t<div id=\"footer2_\">\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tThis template is under the Creative Commons Attribution 2.5\r\n");
      out.write("\t\t\t\t\tLicense.<br /> <br /> <span> <font color=\"white\">Copyright\r\n");
      out.write("\t\t\t\t\t\t\t2018-2019 Train Search Engine</font>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
