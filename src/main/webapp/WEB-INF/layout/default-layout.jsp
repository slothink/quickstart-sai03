<%--
  Created by IntelliJ IDEA.
  User: slothink
  Date: 13. 3. 29
  Time: 오후 3:10
  To change this template use File | Settings | File Templates.
--%><%@
    page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %><%@
    taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@
    taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%@
    taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %><!DOCTYPE html>
<html>
<head>
  <!-- this enables responsive features in browser -->
  <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
  <meta content='text/html;charset=utf-8' http-equiv='content-type'>
  <meta content='Flat administration template for Twitter Bootstrap.' name='description'>

  <script type="text/javascript">
    var CONTEXT = "${CONTEXT}";
  </script>
</head>
<body >
<tiles:insertAttribute name="body" />
</body>
</html>
