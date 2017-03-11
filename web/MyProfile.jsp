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
                    <%
                    
                    String unm=request.getParameter("unm");
                    out.println(""+unm);


%>
                    <div id="content">


                        <h4>Family Information</h4>
                        <form action="FamilyProfile.jsp" method="post">
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
                             <tr><td><input type="submit" value="Submit"/></td><tr>



                        </table>
                        </form>

                    </div>

                    <div id="sidebar1" >
                        <h4>Mandatory Information</h4>
                        <form action="PersonalProfile.jsp" method="post">
                            <table >
                            <tr>
                                <td>Marital Status:</td>
                                <td><select name="mars">
                                        <option value="single">single</option>
                                        <option value="divorced">divorced></option>
                                        <option value="widowed">widowed</option>
                                        <option value="divorce in process">divorce in process</option>
                                    </select></td>
                            </tr>

                            <tr >
                                <td  >Caste:</td>
                                <td >
                                    <input type="text" name="caste"/>
                                </td>
                            </tr>

                            <tr >
                                <td  >Gotra:</td>
                                <td ><select name="gotra">

                                        <option value="Vachha">vachha
                                        <option value="Balisetla">balisetla
                                        <option value="Mithunakula">Mithunakula
                                        <option value=" Marichi"> Marichi
                                        <option value="Akshintala">Akshintala
                                        <option value=" Agastya"> Agastya
                                        <option value=" Angirasa"> Angirasa
                                        <option value="Atri">Atri
                                        <option value=" Bhrigu">Bhrigu
                                        <option value=" Dhananjaya">Dhananjaya
                                        <option value=" Kashyapa">Kashyapa
                                        <option value=" Nageshwara">Nageshwara
                                        <option value=" Parasara">Parasara
                                        <option value="Vashista">Vashista
                                        <option value="Harinama">Harinama
                                        <option value="Vishvamitra">Vishvamitra
                                        <option value=" Siwal">Siwal
                                        <option value=" Vishnu">Vishnu
                                        <option value="Meena">Meena
                                        <option value=" Bharadwaj">Bharadwaj
                                        <option value=" Haritasya">Haritasya
                                        <option value=" Kaundinya">Kaundinya
                                        <option value=" Kutsas">Kutsas
                                        <option value=" Upreti">Upreti
                                        <option value=" Garg">Garg
                                        <option value=" gangahar">gangahar
                                        <option value=" Jamadagni">Jamadagni
                                        <option value=" Upamanyu">Upamanyu
                                        <option value=" Bilvanga">Bilvanga
                                        <option value="Mudinolla">Mudinolla
                                        <option value=" karupanasamy"> karupanasamy
                                        <option value=" Madhuschandasa">Matrdhuschandasa
                                        <option value=" Yadav">Yadav 
                                        <option value=" Shandilya">Shandilya 
                                    </select>
                                </td>
                            </tr>

                            <tr >
                                <td  >Complexion:</td>
                                <td >
                                    fair<input type="radio" name="com"/> very fair<input type="radio" name="com"/> dark<input type="radio" name="com"/>
                                </td>
                            </tr>

                            <tr >
                                <td  >Height:</td>
                                <td >
                                    <input type="text" name="height"/>
                                </td>
                            </tr>

                            <tr >
                                <td  >Body type:</td>
                                <td ><select name="btype">
                                        <option value="slim">slim
                                        <option value="average">average
                                        <option value="fat">fat
                                    </select></td>
                            </tr>

                            <tr >
                                <td  >Any disability:</td>
                                <td ><select name="disability">


                                        <option value="none">none
                                        <option value="mental">mental
                                        <option value="physical">physical
                                    </select></td>
                            </tr>

                            <tr >
                                <td  >State:</td>
                                <td >

                                    <input type="text" name="state"></td>
                            </tr>

                            <tr>
                                <td>City:</td>
                                <td ><input type="text" name="city"></td>
                            </tr>

                            <tr>
                                <td>Education:</td>
                                <td><select name="edu">
                                        <option value="graduate">graduate
                                        <option value="masters">masters
                                        <option value="phd">phd
                                    </select></td>
                            </tr>

                            <tr >
                                <td  >Working in:</td>
                                <td><select name="work">

                                        <option value="business">business
                                        <option value="private job">private job
                                        <option value="government job">government job
                                            </td>
                                            </tr>

                                        <tr >
                                            <td>Income:</td>
                                            <td><input type="text" name="income"></td>
                                        </tr>
                                        <tr><td><input type="submit" value="Submit"/></td><tr>

                                            </table>
                            </form>
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
