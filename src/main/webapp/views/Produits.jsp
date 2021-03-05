<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produits</title>
</head>
<body>
 <s:form action="save" method="post">
 	<s:textfield label="REF" name="reference"></s:textfield>
 	<s:textfield label="Designation" name="designation"></s:textfield>
 	<s:textfield label="Prix" name="prix"></s:textfield>
 	<s:textfield label="Quantite" name="quantite"></s:textfield>
 	<s:checkbox label="Promo" name="promo"></s:checkbox>
 	<s:submit value="Save"></s:submit>
 </s:form>
</body>
</html>