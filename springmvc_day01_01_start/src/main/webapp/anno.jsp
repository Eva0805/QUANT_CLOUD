<%--
  Created by IntelliJ IDEA.
  User: 31089
  Date: 18/12/2020
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <!--常用的注解-->
    <a href="anno/RequestParam?username=Haha">RequestParam</a>

    </br>

    <form action="anno/testRequestBody" method="post">
        用户姓名: <input type="text" name="uname" /><br/>
        用户年龄: <input type="text" name="age" /><br/>
        <input type="submit" name="提交" />
    </form>

    <a href="anno/testPathVariable/10">testPathVariable</a>
    </br>
    <a href="anno/testRequestHeader">testRequestHeader</a>
    </br>
    <a href="anno/testCookieValue">testCookieValue</a>
    </br>
    <form action="anno/testModelAttribute" method="post">
        用户姓名: <input type="text" name="uname" /><br/>
        用户年龄: <input type="text" name="age" /><br/>
        <input type="submit" name="提交" />
    </form>
    </br>
    <a href="anno/testSessionAttributes">c</a>

</body>
</html>
