<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>

<p>Welcome to our wonderful world!</p>
<form:form id="formMagicKey"
            method="post"
            action="/demo/hello/form"
            modelAttribute="magicKey">
    <form:label path="magicKey">Magic Key</form:label>
    <form:input path="magicKey"></form:input>
    <form:button>Send</form:button>
</form:form>