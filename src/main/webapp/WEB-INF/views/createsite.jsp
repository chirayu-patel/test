<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create new site</title>
</head>
<body>
<h1> Add new mobile number</h1>
    <sf:form method="POST" modelAttribute="site">
    <table>
    <tr>
    	<td>Site Name : </td>
    	<td> <sf:input type="text" path="siteName"/> </td>    	   
    </tr>
    
    <tr>
    	<td> Country : </td> 
    	<td> <sf:select path="countryCode"> 
    		 	<sf:option value="NONE" label="--- Select ---" />
    		 	<sf:options items="${countries}" />
    		 </sf:select>
    	</td>
    </tr>
     
<!--     <tr> -->
<!--     	<td> State : </td>  -->
<%--     	<td> <sf:select path="stateCode">  --%>
<%--     		 	<sf:option value="NONE" label="--- Select ---" /> --%>
<%--     		 	<sf:options items="${states}" /> --%>
<%--     		 </sf:select> --%>
<!--     	</td> -->
<!--     </tr>  -->

<!--     <tr> -->
<!--     	<td> City : </td>  -->
<%--     	<td> <sf:select path="cityCode">  --%>
<%--     		 	<sf:option value="NONE" label="--- Select ---" /> --%>
<%--     		 	<sf:options items="${cities}" /> --%>
<%--     		 </sf:select> --%>
<!--     	</td> -->
<!--     </tr>  -->

<!--     <tr> -->
<!--     	<td> Area : </td>  -->
<%--     	<td> <sf:select path="areaCode">  --%>
<%--     		 	<sf:option value="NONE" label="--- Select ---" /> --%>
<%--     		 	<sf:options items="${areas}" /> --%>
<%--     		 </sf:select> --%>
<!--     	</td> -->
<!--     </tr>  -->
    
    <tr>
    	<td>IP Address : </td>
    	<td> <sf:input type="text" path="ipAddress"/> </td>    	   
    </tr>    
    
    </table>
    <input type="submit"/>
    </sf:form>

</body>
</html>