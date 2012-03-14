<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo JQGrid com Vraptor</title>
        <link rel="stylesheet" type="text/css"	href="${pageContext.servletContext.contextPath}/resources/css/themes/primefaces-glass-x/jquery.ui.all.css" />
        <link rel="stylesheet" type="text/css"	href="${pageContext.servletContext.contextPath}/resources/css/ui.jqgrid.css" />
    </head>
    <body>
        <table id="grid-user" ></table>
        <div id="pager-user"></div>
    </body>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/jquery-ui-1.8.17.custom.min.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/jqgrid/i18n/grid.locale-pt-br.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/jqgrid/jquery.jqGrid.min.js"></script>
    <script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/user.js"></script>
</html>
