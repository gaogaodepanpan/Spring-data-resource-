<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>Name</th>
            <th>Sex</th>
            <th>Age</th>
        </tr>

        <#list list as user>
            <tr>
                <td>${user.username}</td>
                <td>${user.usersex}</td>
                <td>${user.userage}</td>

            </tr>
        </#list>
    </table>
</body>
</html>