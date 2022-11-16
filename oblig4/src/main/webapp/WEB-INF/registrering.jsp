<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page language="java" contentType="text/html;"%>
<html lang="no"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="simple.css" rel="stylesheet" type="text/css">
<head>
    <title>Påmelding</title>
</head>
<body>

    <h1>Påmelding</h1>
    
    <p style="color:red;">${redirectMessage}</p>
    
    <form:form action="lagreDeltaker" method="post" modelAttribute="deltaker">
        <fieldset>
        <form:label path="fornavn">Fornavn</form:label>
        <form:input path="fornavn"/>
        <form:errors path="fornavn"></form:errors>
        
        <form:label path="etternavn">Etternavn</form:label>
        <form:input path="etternavn"/>
        <form:errors path="etternavn"></form:errors>
        
        <form:label path="tlf">Mobil(8 siffer)</form:label>
        <form:input path="tlf"/>
        <form:errors path="tlf"></form:errors>
        
        <form:label path="passord">Passord</form:label>
        <form:password path="passord"/>
        <form:errors path="passord"></form:errors>
        
        <form:label path="validerings_passord">Passord Igjen</form:label>
        <form:password path="validerings_passord"/>
        <form:errors path="validerings_passord"></form:errors>
        
        <form:label path="kjonn">Kjønn</form:label>
        <form:radiobutton path="kjonn" value="Male"/>mann
        <form:radiobutton path="kjonn" value="Female"/>kvinne
        <br>
        <input type="submit" value="Meld meg på"/>
        
        </fieldset>
    </form:form>

</body>
</html>