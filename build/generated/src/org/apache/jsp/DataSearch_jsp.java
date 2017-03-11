package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.java.swing.plaf.nimbus.SliderPainter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class DataSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <title>Bandhan</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"bg\">\r\n");
      out.write("            <div id=\"outer\">\r\n");
      out.write("                <div id=\"header\">\r\n");
      out.write("                    <div id=\"logo\">\r\n");
      out.write("                        <h1>\r\n");
      out.write("                            <a href=\"#\">Bandhan</a>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br class=\"clear\" />\r\n");
      out.write("                    <div id=\"nav\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a\thref=\"HomePage.html\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"MyProfile.html\">My Profile</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li   class=\"first active\">\r\n");
      out.write("                                <a href=\"Search.html\">Search</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"Success.html\">Success</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"Help.html\">Help</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li  class=\"last\">\r\n");
      out.write("                                <a href=\"logout.html\">Logout</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <br class=\"clear\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"banner\">\r\n");
      out.write("                    <img src=\"images/mrge1.jpg\" width=\"996px\" height=\"350px\" alt=\"\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"sidebar1\">\r\n");
      out.write("                        <h3> Search Result</h3>\r\n");
      out.write("                        ");



                            Connection con = null;
                            Statement stmt = null;
                            ResultSet rs = null;

                            try {
                                //out.println("First st");
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bandhan", "root", "root");
                                //out.println("DB Connected");
                                String select = request.getParameter("sl");
                                //out.println("Hello");
                                stmt = con.createStatement();
                                //out.println("st created");
                                if (select.equals("ms")) {
                                    //out.println("in if before qry execution");
                                    String sql = "select * from PProfile where MStatus='single'";
                                    rs = stmt.executeQuery(sql);
                                    //out.println("qry executed");

      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("<u>\r\n");
      out.write("                        ");

                            out.println("Search Category: Marital Status :Single");
                        
      out.write("\r\n");
      out.write("  </u>                      <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            int z = 1;
                            while (rs.next() == true) {
                                out.println("Search Result  No.:" + z);
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String b = rs.getString(2);
                            out.println("Caste: " + b);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String c = rs.getString(3);
                            out.println("Gotra: " + c);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String d = rs.getString(4);
                            out.println("Complexion: " + d);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String e = rs.getString(5);
                            out.println("Height: " + e);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String f = rs.getString(6);
                            out.println("BType: " + f);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String g = rs.getString(7);
                            out.println("Disability: " + g);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String h = rs.getString(8);
                            out.println("State: " + h);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String i = rs.getString(9);
                            out.println("City: " + i);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String j = rs.getString(10);
                            out.println("Work: " + j);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String k = rs.getString(11);
                            out.println("Education : " + k);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String l = rs.getString(12);
                            out.println("Income: " + l);
                            out.println("\n");
                            z++;
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            }

                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            } else {
                                out.println("in else");
                            }



                            if (select.equals("ms")) {
                                //out.println("in if before qry execution");
                                String sql = "select * from PProfile where MStatus='divorced'";
                                rs = stmt.executeQuery(sql);
                                            //out.println("qry executed");

      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("<u>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            out.println("Search Category: Marital Status :Divorced");
                        
      out.write("\r\n");
      out.write("  </u>                      <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            int z = 1;
                            while (rs.next() == true) {
                                out.println("Search Result  No.:" + z);
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String b = rs.getString(2);
                            out.println("Caste: " + b);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String c = rs.getString(3);
                            out.println("Gotra: " + c);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String d = rs.getString(4);
                            out.println("Complexion: " + d);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String e = rs.getString(5);
                            out.println("Height: " + e);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String f = rs.getString(6);
                            out.println("BType: " + f);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String g = rs.getString(7);
                            out.println("Disability: " + g);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String h = rs.getString(8);
                            out.println("State: " + h);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String i = rs.getString(9);
                            out.println("City: " + i);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String j = rs.getString(10);
                            out.println("Work: " + j);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String k = rs.getString(11);
                            out.println("Education : " + k);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String l = rs.getString(12);
                            out.println("Income: " + l);
                            out.println("\n");
                            z++;
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            }

                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            } else {
                                out.println("in else");
                            }



                            if (select.equals("ms")) {
                                //out.println("in if before qry execution");
                                String sql = "select * from PProfile where MStatus='widowed'";
                                rs = stmt.executeQuery(sql);
                                            //out.println("qry executed");

      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("<u>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            out.println("Search Category: Marital Status :Widowed");
                        
      out.write("\r\n");
      out.write("  </u>                      <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            int z = 1;
                            while (rs.next() == true) {
                                out.println("Search Result  No.:" + z);
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String b = rs.getString(2);
                            out.println("Caste: " + b);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String c = rs.getString(3);
                            out.println("Gotra: " + c);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String d = rs.getString(4);
                            out.println("Complexion: " + d);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String e = rs.getString(5);
                            out.println("Height: " + e);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String f = rs.getString(6);
                            out.println("BType: " + f);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String g = rs.getString(7);
                            out.println("Disability: " + g);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String h = rs.getString(8);
                            out.println("State: " + h);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String i = rs.getString(9);
                            out.println("City: " + i);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String j = rs.getString(10);
                            out.println("Work: " + j);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String k = rs.getString(11);
                            out.println("Education : " + k);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String l = rs.getString(12);
                            out.println("Income: " + l);
                            out.println("\n");
                            z++;
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            }

                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                    } else {
                        out.println("in else");
                    }   



if (select.equals("ms")) {
                        //out.println("in if before qry execution");
                        String sql = "select * from PProfile where MStatus='divorce in process'";
                        rs = stmt.executeQuery(sql);
                        //out.println("qry executed");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("<u>\r\n");
      out.write("                        ");

                                out.println("Search Category: Marital Status :Divorce in Process");
                        
      out.write("\r\n");
      out.write("  </u>                      <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                                   
                        int z=1;
                        while(rs.next() == true) {
                            out.println("Search Result  No.:"+z);
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String a = rs.getString(1);
                            out.println("MStatus: " + a);
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String b = rs.getString(2);
                            out.println("Caste: " + b);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String c = rs.getString(3);
                            out.println("Gotra: " + c);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String d = rs.getString(4);
                            out.println("Complexion: " + d);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String e = rs.getString(5);
                            out.println("Height: " + e);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String f = rs.getString(6);
                            out.println("BType: " + f);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String g = rs.getString(7);
                            out.println("Disability: " + g);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String h = rs.getString(8);
                            out.println("State: " + h);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String i = rs.getString(9);
                            out.println("City: " + i);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String j = rs.getString(10);
                            out.println("Work: " + j);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String k = rs.getString(11);
                            out.println("Education : " + k);
                            out.println("\n");
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            String l = rs.getString(12);
                            out.println("Income: " + l);
                            out.println("\n");
                            z++;
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                        }
                                    
                        
      out.write("\r\n");
      out.write("                        <br/>\r\n");
      out.write("\r\n");
      out.write("                        ");

                    } else {
                        out.println("in else");
                    }                                                                                                                                                                                                                                                                                                                                                         
                                

                    out.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                        
      out.write("\t\t\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <table >\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Marital Status:</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
out.println(rs.getString(1));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Caste:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(2));

                                
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Gotra:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(3));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Complexion:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(4));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Height:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(5));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Body type:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(6));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Any disability:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(7));
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >State:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("\r\n");
      out.write("                                ");
out.println(rs.getString(8));
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>City:</td>\r\n");
      out.write("                            <td >\r\n");
      out.write("                                ");
out.println(rs.getString(9));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Education:</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
out.println(rs.getString(10));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td  >Working in:</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
out.println(rs.getString(11));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        <tr >\r\n");
      out.write("                            <td>Income:</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                ");
out.println(rs.getString(12));
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"footer\">\r\n");
      out.write("                    <div id=\"footerContent\">\r\n");
      out.write("\r\n");
      out.write("                        &copy; www.Bandhan.com | Design by <span style=\"color:Blue;\">Rupal & Priyanka</span></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"footerSidebar1\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class=\"first\">\r\n");
      out.write("                                <a href=\"HomePage.html\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">About Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Terms of Use</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li >\r\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li >\r\n");
      out.write("                                <a href=\"#\">Contact Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"last\">\r\n");
      out.write("                                <a href=\"#\">SiteMap</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br class=\"clear\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
