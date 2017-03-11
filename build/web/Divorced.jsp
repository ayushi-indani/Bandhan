<%@page import="com.sun.java.swing.plaf.nimbus.SliderPainter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>

        <title>Bandhan</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <div id="bg">
            <div id="outer">
                <div id="header">
                    <div id="logo">
                        <h1>
                            <a href="#">Bandhan</a>
                        </h1>
                    </div>
                    <br class="clear" />
                    <div id="nav">
                        <ul>
                            <li>
                                <a	href="HomePage.html">Home</a>
                            </li>
                            <li>
                                <a href="MyProfile.html">My Profile</a>
                            </li>
                            <li   class="first active">
                                <a href="Search.html">Search</a>
                            </li>
                            <li>
                                <a href="Success.html">Success</a>
                            </li>
                            <li>
                                <a href="Help.html">Help</a>
                            </li>
                            <li  class="last">
                                <a href="logout.html">Logout</a>
                            </li>
                        </ul>
                        <br class="clear" />
                    </div>
                </div>
                <div id="banner">
                    <img src="images/mrge1.jpg" width="996px" height="350px" alt="" />
                </div>
                <div id="main">


                    <div id="sidebar1">
                        <h3> Search Result</h3>
                        <%


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
                                    String sql = "select * from PProfile where MStatus='divorced'";
                                    rs = stmt.executeQuery(sql);
                                    //out.println("qry executed");
%>
                        <br/>



<u>
                        <%
                            out.println("Search Category: Marital Status :Divorced");
                        %>
</u>                        
                        <br/>

                        <%

                            int z = 1;
                            while (rs.next() == true) {
                                out.println("Search Result  No.:" + z);
                        %>
                        <br/>


                        <br/>

                        <%

                            String b = rs.getString(2);
                            out.println("Caste: " + b);
                            out.println("\n");
                        %>
                        <br/>

                        <%

                            String c = rs.getString(3);
                            out.println("Gotra: " + c);
                            out.println("\n");
                        %>
                        <br/>

                        <%

                            String d = rs.getString(4);
                            out.println("Complexion: " + d);
                            out.println("\n");
                        %>
                        <br/>

                        <%

                            String e = rs.getString(5);
                            out.println("Height: " + e);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String f = rs.getString(6);
                            out.println("BType: " + f);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String g = rs.getString(7);
                            out.println("Disability: " + g);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String h = rs.getString(8);
                            out.println("State: " + h);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String i = rs.getString(9);
                            out.println("City: " + i);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String j = rs.getString(10);
                            out.println("Work: " + j);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String k = rs.getString(11);
                            out.println("Education : " + k);
                            out.println("\n");
                        %>
                        <br/>

                        <%
                            String l = rs.getString(12);
                            out.println("Income: " + l);
                            out.println("\n");
                            z++;
                        %>
                        <br/>
                        <br/>

                        <%
                            }

                        %>
                        <br/>

                        <%
                            } else {
                                out.println("in else");
                            }



              
                        
                                                                                                                                                                                                                                                                                                                                                       
                                

                    out.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                        %>			
                    </div>
                    






                </div>





                <div id="footer">
                    <div id="footerContent">

                        &copy; www.Bandhan.com | Design by <span style="color:Blue;">Rupal & Priyanka</span></a>


                    </div>
                    <div id="footerSidebar1">
                        <ul>
                            <li class="first">
                                <a href="HomePage.html">Home</a>
                            </li>
                            <li>
                                <a href="#">About Us</a>
                            </li>
                            <li>
                                <a href="#">Terms of Use</a>
                            </li>
                            <li >
                                <a href="#">Privacy Policy</a>
                            </li>

                            <li >
                                <a href="#">Contact Us</a>
                            </li>

                            <li class="last">
                                <a href="#">SiteMap</a>
                            </li>
                        </ul>
                    </div>
                    <br class="clear" />
                </div>
            </div>

        </div>
    </body>
</html>
