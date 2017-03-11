<%@ page import="java.sql.*"%>

<%
		
		String unm = request.getParameter("unm");
		String pwd = request.getParameter("pass");
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bandhan", "root", "root");
                
                //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con = DriverManager.getConnection("jdbc:odbc:bandhan");
                
		java.sql.Statement st = con.createStatement();
	
		if((unm.equals("Ayush123"))&&(pwd.equals("ash")))
		{
			response.sendRedirect("#");
			return;
		}
		String q = "select * from Register where UName='"+unm+"' and Pass='"+pwd+"'";
		ResultSet rs = st.executeQuery(q);
		if(!rs.next())
		{
			response.sendRedirect("invalid.jsp");
			
			return;
			
		}
		
		response.sendRedirect("MyProfile.html");
		
		
		con.close();
%>