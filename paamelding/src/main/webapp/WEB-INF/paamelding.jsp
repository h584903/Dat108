<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page language="java" contentType="text/html;"%>
<html lang="no"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="simple.css" rel="stylesheet" type="text/css">
<head>
    <title>Påmelding</title>
</head>
<body>

    <h1>Påmelding</h1>
    
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
    
    <form id="deltakerForm" action="lagreDeltaker" method="post">
        <fieldset>
            
            <label for="fornavn">Fornavn</label>
            <!-- NB! Spring sin (form:input)-tag støtter ikke required alene, 
                 men greit med required="noe"! -->
            <input id="fornavn" name="fornavn" title="..." pattern=".*" placeholder="Fyll inn fornavn" required="required" type="text" value="">
            
            
            <label for="etternavn">Etternavn</label> 
            <input id="etternavn" name="etternavn" title="..." pattern=".*" placeholder="Fyll inn etternavn" required="required" type="text" value="">
            
            
            <label for="mobil">Mobil (8 siffer)</label>  
            <input id="mobil" name="mobil" title="..." pattern=".*" placeholder="Fyll inn telefonnummer" required="required" type="text" value="">
            

            <label for="passord">Passord</label> 
            <input id="passord" name="passord" title="..." pattern=".*" placeholder="Velg et passord" type="password" required="required" value="">
            
            
            <label for="passordRepetert">Passord repetert</label> 
            <input id="passordRepetert" name="passordRepetert" title="..." pattern=".*" placeholder="Gjenta passord" type="password" required="required" value="">
            
            
            <label for="kjonn">Kjønn:</label> 
            <input id="kjonn1" name="kjonn" checked="checked" type="radio" value="mann">mann
            <input id="kjonn2" name="kjonn" type="radio" value="kvinne">kvinne
                 
            <br><br><button type="submit">Meld meg på</button>
        </fieldset>
    </form>

</body>
</html>