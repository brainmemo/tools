<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://yettolaunch.com/tlds" prefix="mytags"%>

<div id="sidenav">
    <div class="row mb-3">
        <div class="col-3">
            <img src="<c:url value="/resources/assets/images/logo.png" />" alt="Logo" class="img-fluid ms-4"/>
        </div>
        <div class="col-9 ps-4">
            <p class="text-danger fw-bold mb-0">The</p>
            <p class="mb-0 fw-bold">Big M</p>
        </div>
    </div>

    <a href="./template">
        <i class="fa fa-home side-icon me-3"></i>
        Templates
    </a>

    <div class="dropdown">
        <a class="dropdown-btn active">
            <i class="fa fa-location-arrow side-icon me-3"></i>
            Tabs
        </a>
        <div class="dropdown-container">
            <a href="./pages">
                <i class="fa fa-envelope side-icon me-2"></i>
               Pages
            </a>
            <a href="./tabs">
                <i class="fa fa-shopping-basket side-icon me-2"></i>
               Tab
            </a>

            <a href="./tablayout">
                <i class="fa fa-video side-icon me-2"></i>
               Tab Layout
            </a>

            <a href="./menu">
                <i class="fa fa-user side-icon me-2"></i>
                Menu
            </a>
        </div>
    </div>
  
  <div class="dropdown">
        <a class="dropdown-btn active">
            <i class="fa fa-location-arrow side-icon me-3"></i>
            Dashboards
        </a>
        <div class="dropdown-container">
    
  
    <a href="./dbentry">
        <i class="fa fa-user-friends side-icon me-3"></i>
        		Data Entry
        </a>
        <a href="./dbreport">
        <i class="fa fa-user-friends side-icon me-3"></i>
        		Reports
        </a>
    </div>
    </div>
     
    
    <a href="#" class="ms-4 ps-0">Sign Out</a>
</div>
