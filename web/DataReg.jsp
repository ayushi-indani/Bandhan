<%@ page import="java.sql.*"%>


<%

		String a = request.getParameter("uname");
		String b = request.getParameter("unm");
		String c = request.getParameter("pass");
		String d = request.getParameter("gen");
                String e = request.getParameter("day");
		String f = request.getParameter("month");		
		String g = request.getParameter("year");
		String h = request.getParameter("religion");
		String i = request.getParameter("country");
		
		String date = e+"/"+f+"/"+g;
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con = DriverManager.getConnection("jdbc:odbc:bandhan");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bandhan", "root", "root");
		java.sql.Statement st = con.createStatement();
		
		String test = "Select * from Register where UName='"+b+"'";
		ResultSet rs = st.executeQuery(test);
		if(rs.next())
		{
				response.sendRedirect("alregistered.jsp");
				return;
		}
			
		String qry = "insert into Register values ('"+a+"','"+b+"','"+c+"','"+d+"','"+date+"','"+h+"','"+i+"')";

		st.executeUpdate(qry);
				
		response.sendRedirect("Login_1.html");

		con.close();
%>