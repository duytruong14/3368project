<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Project</title>
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

<h2 align="center">Duy Shop Records</h2>

<table>
    <tr>
        <th>Manage Inventory:</th>
        <th>Manage Clients:</th>
        <th>Manage Employees:</th>
        <th>Manage transactions:</th>
    </tr>


    <tr>

        <td><form action="viewinventory"> <input type="submit" value="View Product"></form></td>
        <td><form action="viewcustomer"> <input type="submit" value="View Customer"></form></td>
        <td><form action="viewemployee"> <input type="submit" value="View Employees"></form></td>
        <td><form action="viewtransaction"> <input type="submit" value="View Transaction"></form></td>
    </tr>

</table>



</body>
</html>
