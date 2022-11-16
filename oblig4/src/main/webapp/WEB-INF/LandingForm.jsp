<%@ page language="java" contentType="text/html;" %>
<html>
<head>
<title>Påmelding</title>
</head>
<body>

    <h1>Påmmelding</h1>
    <form id="deltaker form" action="paamelding" method="post">
        <fieldset>
            <legend></legend>
            <p>Fornavn: <input type="text" name="fornavn" /></p>
            <p>Etternavn: <input type="text" name="etternavn" /></p>
            <p>Mobil (8 siffer): <input type="text" name="tlf" /></p>
            <p>Passord: <input type="text" name="passord" /></p>
            <p>Passord repetert <input type="text" name="passordSjekk" /></p>
            <p>Kjønn:</p>
            <input type="radio" id="mann" name="kjonn" value="mann">
            <label for="mann">Mann</label>
            <input type="radio" id="kvinne" name="kjonn" value="kvinne">
            <label for="kvinne">Kvinne</label>
            <p><input type="submit" value="send data" /></p>
        </fieldset>
    </form>

</body>
</html>