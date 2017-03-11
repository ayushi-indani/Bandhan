package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DataProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


		String a = request.getParameter("fstatus");
		String b = request.getParameter("mstatus");
		String c = request.getParameter("bro");
		String d = request.getParameter("sis");
                String e = request.getParameter("fvalues");
		String f = request.getParameter("fincome");		
		String g = request.getParameter("av");
		String h = request.getParameter("mt");
		String i = request.getParameter("cno");
                
                String j = request.getParameter("mars");
                String k = request.getParameter("caste");
                String l = request.getParameter("gotra");
                String m = request.getParameter("com");
                String n = request.getParameter("height");
                String o = request.getParameter("btype");
                String p = request.getParameter("disability");
                String q = request.getParameter("state");
                String r = request.getParameter("city");
                String s = request.getParameter("edu");
                String t = request.getParameter("work");
                String u = request.getParameter("income");
         		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:bandhan");
		java.sql.Statement st = con.createStatement();
			
		String qry = "update Register set FStatus='"+a+"'";

		st.executeUpdate(qry);
				
		response.sendRedirect("Thankyou.html");

		con.close();

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
