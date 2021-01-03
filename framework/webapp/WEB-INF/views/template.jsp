<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Breeze Admin</title>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.6.4.min.js" />"></script>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/mdi/css/materialdesignicons.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/flag-icon-css/css/flag-icon.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/css/vendor.bundle.base.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/font-awesome/css/font-awesome.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/style.css" />"/>
    <link rel="shortcut icon" href="<c:url value="/resources/assets/images/favicon.png" />"/>
 <%@ include file="../resources/partials/_navbar.html" %>
 
</head>
<body>


   <%@ include file="../resources/partials/_sidebar.html" %>

 
  
 	
 
 
 	<!-- inject:js -->
    <script src="<c:url value="/resources/assets/js/off-canvas.js"/>"></script>
    <script src="<c:url value="/resources/assets/js/hoverable-collapse.js"/>"></script>
    <script src="<c:url value="/resources/assets/js/misc.js"/>"></script>
    <!-- endinject -->
  <script src="<c:url value="/resources/assets/js/dashboard.js"/>"></script>
</body>
</html>