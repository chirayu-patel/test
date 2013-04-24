<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create new site</title>
</head>
<body>
<h1> Add new mobile number</h1>
    <sf:form method="POST" modelAttribute="numbers">
    <table>
    <tr>
    	<td>Mobile number : </td>
    	<td> <sf:input type="text" path="mobileNumber"/> </td>    	   
    </tr>
    
    <tr>
    	<td> Country : </td> 
    	<td> <sf:select path="country" id="country"> 
    			<sf:option value="NONE" label="--- Select ---" />
    		 	<c:forEach var="country" items="${countries}">
					<sf:option value="${country.countryId}" label="${country.countryName}" />					
				</c:forEach>
    		 </sf:select>
    	</td>
    </tr>
     
    <tr>
    	<td> State : </td> 
    	<td> <sf:select path="state" id="state" style="display:none"> 
    		 	<sf:option value="NONE" label="--- Select ---" />
    		 	<sf:options items="${states}" />
    		 </sf:select>
    	</td>
    </tr> 

    
   
    
    </table>
    <input type="submit"/>
    </sf:form>

</body>
</html>