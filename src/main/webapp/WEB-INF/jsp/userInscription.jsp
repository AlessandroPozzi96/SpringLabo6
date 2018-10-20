<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>

<h1>Welcome on inscription user page!</h1>
<form:form id="formUserInscription"
           action="/demo/inscription/form"
           method="post"
           modelAttribute="currentUser">
    <form:label path="name">Name : </form:label>
    <form:input path="name" />
    </br>
    <form:label path="age">Age : </form:label>
    <form:input path="age" />
    </br>
    <form:label path="male">Male</form:label>
    <form:radiobutton path="male" value="true" />
    </br>
    <form:label path="male" >Female</form:label>
    <form:radiobutton path="male" value="false" />
    </br>
    <form:label path="hobby">What is your prefered hobby ?</form:label>
    <form:select path="hobby">
        <form:options items="${hobbies}" itemValue="name" itemLabel="name"/>
    </form:select>
<%--    <form:select path="hobby">
        <form:option value="sport" label="Sport" />
        <form:option value="reading" label="Read some books" />
        <form:option value="tv" label="Watching TV"/>
    </form:select>--%>
    </br>
    <form:button >Register</form:button>
</form:form>
