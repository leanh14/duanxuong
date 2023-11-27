<!doctype html>
<html lang="en">
<head>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Document</title>
</head>
<body class="container">
<%--<form action="/khach-hang/search" method="get">--%>
<%--    <input name="keyword">--%>
<%--    <button type="submit">Tim Kiem</button>--%>
<%--</form>--%>
<%--@elvariable id="tang" type=""--%>
<form:form modelAttribute="tang" action="/tang/add" method="post">
    <div class="mb-3">
        <label class="form-label">Mã Tầng</label>
        <form:input path="ma" class="form-control"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Tên Tầng</label>
        <form:input path="tenTang" class="form-control"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Số Phòng</label>
        <form:input path="soPhong" class="form-control"/>
    </div>
    <button class="btn btn-primary">Add</button>
</form:form>
<h1 style="align-content: center">Danh sách tầng</h1>
<table class="table">
    <thead>
    <th>#</th>
    <th>ID</th>
    <th>Mã Tầng</th>
    <th>Tên Tầng</th>
    <th>Số Phòng</th>
    <th>Action</th>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="t" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${t.id}</td>
            <td>${t.ma}</td>
            <td>${t.tenTang}</td>
            <td>${t.soPhong}</td>
            <td>
                <a href="/tang/detail/${t.id}" class="btn btn-primary">Detail</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<c:forEach begin="1" end="${totalPage}" varStatus="o">
    <a href="/tang/hien-thi?num=${o.index-1}">${o.index-1}</a>
</c:forEach>
</body>
</html>