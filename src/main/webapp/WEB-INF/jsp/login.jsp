<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>
<h1>Login</h1>

<form:form id="formLogin"
           method="post"
           action="/demo/login"
           modelAttribute="utilisateurEntity">

    <form:label path="username">Username : </form:label>
    <form:input path="username"></form:input>

    <form:label path="password">Password : </form:label>
    <form:input type="password" path="password"></form:input>

    <form:button>Log in</form:button>
</form:form>