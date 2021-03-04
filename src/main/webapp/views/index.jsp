<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <!-- Pour travailler avec StrutS , on va utiliser les tags struts -->
 <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
 <!-- Pour créer un lien avec struts, on peut utiliser url -->
  <!-- Action qui va me ramener vers produits dans le namespace produits -->
<s:url namespace="/" action="produits"></s:url>
<s:a></s:a>
</body>
</html>