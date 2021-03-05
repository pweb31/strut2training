<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>
<div>
	 <s:form action="save" method="post">
	 	<s:textfield label="REF" name="produit.reference"></s:textfield>
	 	<s:textfield label="Designation" name="produit.designation"></s:textfield>
	 	<s:textfield label="Prix" name="produit.prix"></s:textfield>
	 	<s:textfield label="Quantite" name="produit.quantite"></s:textfield>
	 	<s:checkbox label="Promo" name="produit.promo"></s:checkbox>
	 <!--  	<s:textfield name="editMode"></s:textfield> permet de voir une valeur du model  -->
	 	<s:hidden name="editMode"></s:hidden>
 		<s:submit value="Save"></s:submit>
	 </s:form>
</div>
<div>
	<table class="table1">
	 <tr>
	 	<th>REF</th>
	 	<th>DES</th>
	 	<th>PRIX</th>
	 	<th>QUANTITE</th>
	 	<th>PROMO</th>
	 </tr>
	 <s:iterator value="produits">
		 <tr>
		 	<td><s:property value="reference"/></td>
		 	<td><s:property value="designation"/></td>
		 	<td><s:property value="prix"/></td>
		 	<td><s:property value="quantite"/></td>
		 	<td><s:property value="promo"/></td>
		 	<s:url namespace="/" action="delete" var="lien1">
		 		<s:param name="ref">
		 			<s:property value="reference"/>
		 		</s:param>
		 	</s:url>
		 	<s:url namespace="/" action="edit" var="lien2">
		 		<s:param name="ref">
		 			<s:property value="reference"/>
		 		</s:param>
		 	</s:url>
		 	<td><s:a href="%{lien1}">Suppr</s:a></td>
		 	<td><s:a href="%{lien2}">Edit</s:a></td>
		 </tr>
	 </s:iterator>
	</table>
</div>
</body>
</html>