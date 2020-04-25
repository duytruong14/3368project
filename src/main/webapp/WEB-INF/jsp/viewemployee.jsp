<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employees</title>
    <style>
        h1{
            font-family: "Times New Roman";

        }
        h2{
            font-family: Arial;
        }
        table {
            font-family: Bahnschrift , sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td {
            border: 1px solid #0A0A2A;
            text-align: left;
            padding: 8px;

        }
        th {
            border: 3px solid #190714;
            text-align: center;
            padding: 8px;

        }

        tr:nth-child(even) {
            background-color: #F8E0EC;
        }
    </style>
</head>
<body style="background:#FBF8EF">

<h2 align="center">View Employee</h2>
Search for employee<input type="text" placeholder="employee first name..." id="mine" onkeyup="Look()" >
<table id="Table">
    <tr>
        <th>First Name</th>
        <th>Last name</th>
        <th>Delete</th>

    </tr>
    <c:forEach var = "listitem" items = "${Employeelist}">


        <tr>
            <td>${listitem.getEmployeefirstname()}</td>
            <td>${listitem.getEmployeelastname()}</td>
            <td><a href="/deleteemployee/${listitem.getEmployeeid()}"><img src="../../img/delete2.png" style="width:50px;height:50px;" ></a></td>
        </tr>
    </c:forEach>
</table>
<form action="/">
    <input type="submit" value="Homepage">
</form>
<h2>Add new employee</h2>
<br>
<form method="post" action="/addemployee">
    <input type="hidden" name="employeeid" value="">
    First name:
    <input type="text" name="first">
    <br>
    Last name:
    <input type="text" name="last" >
    <br>
    <input type="submit" value="Add new employee">
</form>
<script>
    function Look() {
        var input, input2;
        input = document.getElementById("mine");
        input2 = input.value.toUpperCase();
        var table;
        table = document.getElementById("Table");
        var row;
        row = table.getElementsByTagName("tr");
        var cell, textValue;
        for (var i = 0; i < row.length; i++) {cell = row[i].getElementsByTagName("td")[0];
            if (cell) {
                textValue = cell.textContent ;
                if (textValue.toUpperCase().indexOf(input2) > -1) {
                    row[i].style.display = "";
                }
                else {
                    row[i].style.display = "none";
                }}}}
</script>
</body>
</html>
