<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
    <link type="text/css" href="<spring:url value='/css/style.css'/> " rel="stylesheet"/>
</head>
<body>
    <h1>TEMPLATE</h1>
    <div>
        <img src='<spring:url value="/images/localeFr.jpg" />'>
        <img src='<spring:url value="/images/localeEn.png" />'>
    </div>
    <div>
        <tiles:insertAttribute name="main-content" />
    </div>
</body>
</html>