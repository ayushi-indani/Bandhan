<%@ page import="java.sql.*"%>

    <%
                    
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
         	
                Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bandhan", "root", "root");             
                
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con = DriverManager.getConnection("jdbc:odbc:bandhan");
                
                
		java.sql.Statement st = con.createStatement();
			
		String qry = "insert into PProfile values ('"+j+"','"+k+"','"+l+"','"+m+"','"+n+"','"+o+"','"+p+"','"+q+"','"+r+"','"+s+"','"+t+"','"+u+"')";

		st.executeUpdate(qry);
				
		response.sendRedirect("FamilyProfile.jsp");

		con.close();
%>
    
