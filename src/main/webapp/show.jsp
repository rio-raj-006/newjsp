<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Language</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Make the page at least the height of the viewport */
        }
        .center-content {
            text-align: center;
        }
    </style>
</head>
<body>
<table border="1">
<tr>
<th>Student name</th>
<th>Student rollno</th>
<th>Student email</th>
</tr>
<c:forEach var="temp" items="${st6}">
<tr>
<td>${temp.studentname}</td>
<td>${temp.rollno}</td>
<td>${temp.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>