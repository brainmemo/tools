<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://yettolaunch.com/tlds" prefix="mytags"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Finance Dashboard</title>
    <meta name="description"
          content="Some tags are vital for SEO. Others have little or no impact on rankings. Here's every type of meta tag you need to know about.The purpose of a meta description is to reflect the essence of a page, but with more details and context."/>
    <meta property="og:title" content="The Rock"/>
    <meta property="og:type" content="video.movie"/>
    <meta property="og:url" content="https://www.imdb.com/title/tt0117500/"/>
    <meta property="og:image" content="https://ia.media-imdb.com/images/rock.jpg"/>

    <link rel="stylesheet" href="<c:url value="/resources/assets/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/fontawesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/custom.css"/>"/>
</head>
<body>

 
 <jsp:include page=".././partials/navbar.jsp"></jsp:include>
<jsp:include page=".././partials/sidenav.jsp"></jsp:include>
<div id="content" class="can_have_sidenav">
    <div class="p-5">
        <h3>Empty Page</h3>
    </div>
</div>

 
 
 
<jsp:include page=".././partials/footer.jsp"></jsp:include>

<script src="<c:url value="/resources/assets/js/bootstrap.bundle.min.js"/>"></script>
<script src="<c:url value="/resources/assets/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/assets/js/custom.js"/>"></script>
</body>
</html>
