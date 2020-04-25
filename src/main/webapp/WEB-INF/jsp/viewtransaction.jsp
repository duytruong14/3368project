<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Transaction</title>
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

<h2 align="center">View Transaction</h2>


<div class="filter E">
    Filter By Employee
    <select id="Field">
        <option value="All" selected>All</option>
<c:forEach var = "employee" items = "${Employeelist}">
        <option value="employee">${employee.getEmployeefirstname()}</option>
</c:forEach>
    </select>
</div>
    <div class="filter C">
    Filter By Customer
    <select id="Field2">
        <option value="All" selected>All</option>
        <c:forEach var = "customer" items = "${Customerlist}">
            <option value="customer">${customer.getCustomerfirstname()}</option>
        </c:forEach>
    </select>
</div>
<div class="filter P">
    Filter By Product
    <select id="Field3">
        <option value="All" selected>All</option>
        <c:forEach var = "product" items = "${Productlist}">
            <option value="product">${product.getProductdescription()}</option>
        </c:forEach>
    </select>
</div>





Search for transaction base on receipt number<input type="text" placeholder="Receipt number..." id="mine" onkeyup="Look()" >
<table id="Table">

    <tr>
        <th>Receipt Number</th>
        <th>Customer name</th>
        <th>Employee in charge of the transaction</th>
        <th>Item Bought</th>


    </tr>
    <c:forEach var = "listitem" items = "${Transactionlist}">
        <tr>
            <c:forEach var = "customer" items = "${Customerlist}">
                <c:forEach var = "employee" items = "${Employeelist}">
                    <c:forEach var = "product" items = "${Productlist}">
                <c:if test="${listitem.getCustomerid()==customer.getCustomerid() && listitem.getEmployeeid()==employee.getEmployeeid()&& listitem.getProductid()==product.getProductid()}" >
                    <td id="C" >${listitem.getReceiptnumber()}</td>
                </c:if>
            </c:forEach>
            </c:forEach>
            </c:forEach>

        <c:forEach var = "customer" items = "${Customerlist}">
            <c:if test="${listitem.getCustomerid()==customer.getCustomerid()}">
                <td id="C" >${customer.getCustomerfirstname()}  ${customer.getCustomerlastname()}</td>
            </c:if>
        </c:forEach>


            <c:forEach var = "employee" items = "${Employeelist}">
                <c:if test="${listitem.getEmployeeid()==employee.getEmployeeid()}">
                    <td id="E" >${employee.getEmployeefirstname()} ${employee.getEmployeelastname()}</td>
                </c:if>
            </c:forEach>

            <c:forEach var = "product" items = "${Productlist}">
                <c:if test="${listitem.getProductid()==product.getProductid()}">
                    <td id="P" >${product.getProductdescription()}</td>
                </c:if>
            </c:forEach>
        </tr>
</c:forEach>
</table>
<form action="/">
    <input type="submit" value="Homepage">
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
        for (var i = 1; i < row.length; i++) {cell = row[i].getElementsByTagName("td")[0];
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
