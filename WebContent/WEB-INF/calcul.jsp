<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Calculatrice</title>
</head>
<body>
	<p>${ (empty nbr1 && empty nbr2) ? "both empty": "false both empty" }
		${ (empty nbr1 && !empty nbr2) ?  "only nbr2 empty": "false only nbr2 empty" }
		${ (!empty nbr1 && empty nbr2) ?  "only nbr1 empty": "false only nbr1 empty" }
		${ (!empty nbr1 && !empty nbr2) ? "false both empty" : "both empty"  }
	</p>

	<form method="post" action="calcul">
		<input name="nbr1" type="number" size=5 autofocus> <select
			name="operateur" size="1">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="x">×</option>
			<option value="/">÷</option>
		</select> <input name="nbr2" type="number" size=3 autofocus> <input
			type="submit" value="Calcul" />
	</form>


</body>
</html>