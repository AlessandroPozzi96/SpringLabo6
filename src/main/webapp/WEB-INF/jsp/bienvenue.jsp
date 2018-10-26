<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>

<h1>Bienvenue utilisateur !</h1>
<h2>Pas encore de compte ? Inscrivez vous !</h2>

<form:form id="formUtilisateur"
           method="post"
           action="/demo/bienvenue/form"
           modelAttribute="utilisateur">

    <form:label path="username">Username : </form:label>
    <form:input path="username"></form:input>

    <form:label path="password">Password : </form:label>
    <form:input type="password" path="password"></form:input>

    <form:button>Register</form:button>
</form:form>