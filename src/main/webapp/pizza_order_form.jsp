<%--
  Created by IntelliJ IDEA.
  User: johnmccloskey
  Date: 9/13/21
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java"%>


<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<form method="POST" action="/pizza-order">

    <select name="crust_type">
        <option value="Hand-Tossed">Hand-Tossed</option>
        <option value="ThinCrust">ThinCrust</option>
        <option value="StuffedCrust">StuffedCrust</option>
    </select>

    <br>
    <br>
    <br>

    <select name="sauce_type">
        <option value="marinara">marinara</option>
        <option value="alfredo">alfredo</option>
        <option value="buffalo">buffalo</option>
        <option value="bbq">bbq</option>

    </select>
    <br>
    <br>
    <br>

    <select name="size">
        <option value="small">small</option>
        <option value="medium">medium</option>
        <option value="large">large</option>
        <option value="xtraLarge">xtra large</option>

    </select>
    <br>
    <br>
    <br>

    <label for="Pepperoni">
        Pepperoni <input id="Pepperoni" type="checkbox" name="toppings" value="Pepperoni">
    </label>
    <br>
    <br>
    <br>

    <label for="Sausage">
        Sausage <input id="Sausage" type="checkbox" name="toppings" value="Sausage">
    </label>
    <br>
    <br>
    <br>

    <label for="Mushroom">
        Pineapple <input id="Mushroom" type="checkbox" name="toppings" value="Mushroom">
    </label>
    <br>
    <br>
    <br>

    <label for="Bacon">
        Spinach <input id="Bacon" type="checkbox" name="toppings" value="Bacon">
    </label>
    <br>
    <br>
    <br>

    <label for="Anchovies">
        Anchovies <input id="Anchovies" type="checkbox" name="toppings" value="Anchovies">
    </label>
    <br>
    <br>
    <br>

    <label for="address">
        Address <input id="address" type="text" name="address">
    </label>
    <br>
    <br>
    <br>

    <input type="submit">
</form>

</body>
</html>
