<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <form action="/loginprocess" method="get" modelAttribute="login">
       username: <input type="text" name="name" id="name"> <br>
        password: <input type="password" name="password" id="password"> <br>
        <input type="submit" value="submit">
    </form>
</body>
</html>