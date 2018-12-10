
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello from index!</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">Hello ${list}</h2>


<table class="datatable">
    <tr>
        <th>Make</th>
        <th>Model</th>
    </tr>
    <#list list.firstName as person>
        <tr>
        <td>${person}</td>
        </tr>
    </#list>
</table>









<script src="/js/main.js"></script>
</body>
</html>