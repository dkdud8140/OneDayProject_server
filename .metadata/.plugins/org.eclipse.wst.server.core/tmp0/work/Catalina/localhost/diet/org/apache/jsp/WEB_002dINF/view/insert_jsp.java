/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-05-11 06:32:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style>\r\n");
      out.write("body { width : 1200px; position : absolute; left : 50%; transform : translateX(-50%);}\r\n");
      out.write("p { text-align: center;}\r\n");
      out.write("input {\twidth : 80px;\r\n");
      out.write("\t\tborder : 0.5px solid #cccccc}\r\n");
      out.write("a { text-decoration-line : none;\r\n");
      out.write("\tcolor : #20B2AA\t;}\r\n");
      out.write("a:hover { color : #DB7093 ;}\r\n");
      out.write("button:hover{background-color: #FFB6C1 ;\r\n");
      out.write("\t\t\tcolor: white;}\r\n");
      out.write("h1, h2, h3, h4, h5, h6 {text-align: center;}\r\n");
      out.write("form { position : relative; left : 50%; transform : translateX(-50%); }\r\n");
      out.write("table{ position : relative; left : 50%; transform : translateX(-50%);}\r\n");
      out.write("button {background-color: \t#AFEEEE;\r\n");
      out.write("\t   border: none;\r\n");
      out.write("\t   padding : 5px 5px;\r\n");
      out.write("\t   text-align: center;\r\n");
      out.write("\t   cursor: pointer;}\r\n");
      out.write("table {\r\n");
      out.write("\tborder-top : 1px solid #cccccc;\r\n");
      out.write("\tborder-collapse: collapse;}\r\n");
      out.write("th,td {\tpadding : 15px 15px; \r\n");
      out.write("\tborder-top : 1px solid #cccccc;}\r\n");
      out.write("thead {\r\n");
      out.write("\tbackground-color: \t#E0FFFF; }\r\n");
      out.write("body { font-family : \"Noto Sans CJK KR Light\", \"돋움\", dotum, arial,\"굴림\", gulim}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<title>식사 기록하기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h3>식사 기록하기</h3>\r\n");
      out.write("\t<form method = \"POST\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr><th>날짜입력</th><td><input name = \"year\" style=\"width : 100px\">년 <input name = \"month\" style=\"width : 100px\">월 <input name = \"day\" style=\"width : 100px\">일 </td></tr>\r\n");
      out.write("\t\t\t<tr><th>식품코드</th><td><input name = \"code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CODE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td></tr>\r\n");
      out.write("\t\t\t<tr><th>섭취량</th><td><input name = \"eat\"></td></tr>\r\n");
      out.write("\t\t\t<tr><th></th><td><button>입력</button></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<a href = \"/diet\"><b>◁◁첫화면으로 돌아가기</b></a>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
