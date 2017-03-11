<%@ page import="java.sql.*"%>


<%
                
		String a = request.getParameter("fstatus");
		String b = request.getParameter("mstatus");
		String c = request.getParameter("bro");
		String d = request.getParameter("sis");
                String e = request.getParameter("fvalues");
		String f = request.getParameter("fincome");		
		String g = request.getParameter("av");
		String h = request.getParameter("mt");
		String i = request.getParameter("cno");
                
                         		
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con = DriverManager.getConnection("jdbc:odbc:bandhan");
                
                Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bandhan", "root", "root");
                
		java.sql.Statement st = con.createStatement();
			
		String qry = "insert into FProfile values ('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"')";

		st.executeUpdate(qry);
				
		//response.sendRedirect("Thankyou.html");

		con.close();
%>
<%@ page import="java.sql.*"%>


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
                            <li  class="first active">
                                <a href="MyProfile.html">My Profile</a>
                            </li>
                            <li>
                                <a href="Search.html">Search</a>
                            </li>
                            <li>
                                <a href="Success.html">Success</a>
                            </li>
                            <li>
                                <a href="Help.html">Help</a>
                            </li>
                            <li  class="last">
                                <a href="logout.jsp">Logout</a>
                            </li>
                        </ul>
                        <br class="clear" />
                    </div>
                </div>
                <div id="banner">
                    <img src="images/mrge.jpg" 	width="996px" height="350px" alt="" />
                </div>
                <div id="main">
                    <h3>My Profile</h3>
                    <div id="content">


                        <h4>Family Information</h4>
                        <%
                                out.println("Data Entries Submitted Successfully");
                                out.println("\n");
                                out.println("Thankyou For Submitting Your Family Details");


%>
                       
                    </div>

                    <div id="sidebar1" >
                        <h4>Personal Information</h4>
                        
                            <%
                                out.println("Data Entries Submitted Successfully");
                                out.println("\n");
                                out.println("Thankyou For Submitting Your Personal Details");


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
                                                        <a 								href="HomePage.html">Home</a>
                                                    </li>
                                                    <li>
                                                        <a 								href="#">About Us</a>
                                                    </li>
                                                    <li>
                                                        <a 								href="#">Terms of Use</a>
                                                    </li>
                                                    <li >
                                                        <a 								href="#">Privacy Policy</a>
                                                    </li>

                                                    <li >
                                                        <a 								href="#">Contact Us</a>
                                                    </li>

                                                    <li class="last">
                                                        <a 								href="#">SiteMap</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <br class="clear" />
                                        </div>
                                        </div>

                                        </div>
                                        </body>
                                        </html>
