<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Logout</title>
</head>
<body>
    <h1>Logout form</h1>

    <form method="Post" action="Logout">
        <input type="submit" value="Logout"/>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</body>
</html>