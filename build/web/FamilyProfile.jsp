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
                        <form action="PFSubmitted.jsp" method="post">
                             <table >
                            
                            <tr >
                                <td  >Father status:</td>
                                <td ><select name="fstatus">
                                        <option value="business">business
                                        <option value="professional">professional
                                        <option value="retired">retired
                                        <option value="passed away">passed away
                                    </select></td>
                            </tr>

                            <tr >
                                <td >Mother status:</td>
                                <td ><select name="mstatus">
                                        <option value="business">housewife
                                        <option value="professional">professional
                                        <option value="retired">retired
                                        <option value="passed away">passed away
                                    </select></td>
                            </tr>

                            <tr >
                                <td >No.of brothers :</td>
                                <td ><select name="bro">
                                        <option value="1">1
                                        <option value="2">2
                                        <option value="3">3
                                        <option value="4">4
                                    </select>
                            </tr>


                            <tr >
                                <td >No.of sisters :</td>
                                <td ><select name="sis">
                                        <option value="1">1
                                        <option value="2">2
                                        <option value="3">3
                                        <option value="4">4
                                    </select>
                            </tr>

                            <tr >
                                <td >Family values :</td>
                                <td ><select name="fvalues">

                                        <option value="traditional">traditional
                                        <option value="moderate">moderate
                                    </select></td></tr>

                            <tr >
                                <td >Fathers Income:</td>
                                <td >
                                    <input type="text" name="fincome"/>
                                </td>
                            </tr>

                            <tr >
                                <td >Affluence values :</td>
                                <td ><select name="av">
                                        <option value="lower level">lower level
                                        <option value="upper level">upper level
                                    </select></td></tr>

                            <tr >
                                <td >Mother Tongue:</td>
                                <td >
                                    <input type="text" name="mt"/>
                                </td>
                            </tr>


                            <tr >
                                <td >Contact No.:</td>
                                <td >
                                    <input type="text" name="cno"/>
                                </td>
                            </tr>
                            
                            <tr >
                                <tr><td><input type="submit" value="Submit"/></td><tr>
                            </tr>
                            
                            </table>
                        </form>
                       
                            



                        
                        

                    </div>

                    <div id="sidebar1" >
                        <h4>Personal Information</h4>
                        
                            <%
                                out.println("Data Entries Submitted Successfully");
                                out.println();
                                out.println("Please Fill the Family Profile Form");


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
