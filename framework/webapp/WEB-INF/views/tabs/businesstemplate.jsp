<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Breeze Admin</title>
   
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/mdi/css/materialdesignicons.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/flag-icon-css/css/flag-icon.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/css/vendor.bundle.base.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/font-awesome/css/font-awesome.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/style.css" />"/>
    <link rel="shortcut icon" href="<c:url value="/resources/assets/images/favicon.png" />"/>
   
  </head>
  
  <body>
    

 
  
  <div class="container-scroller">
  
  	<jsp:include page=".././partials/_sidebar.jsp"></jsp:include>
  	<jsp:include page=".././partials/_navbar.jsp"></jsp:include>
  	
  	 <div class="main-panel">
          <div class="content-wrapper pb-0">
   <!-- Below Code should be commented if you dont wnat to show Header ribbon -->
          <jsp:include page=".././partials/_ribbon.jsp"></jsp:include>
                   <!-- YOUR CODE GOES HERE IN ROWS AND COLUMNS with width 4,6,8,12 -->
            <div class="row">
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Line chart</h4>
                    <canvas id="lineChart" style="height: 250px;"></canvas>
                  </div>
                </div>
              </div>
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Bar chart</h4>
                    <canvas id="barChart" style="height: 230px;"></canvas>
                  </div>
                </div>
              </div>
              
			 
            </div>
			</div>
            </div>
            </div>
  	
  	
  	
  	
    <jsp:include page=".././partials/_footer.jsp"></jsp:include> 
  	   
  
   
  
  	
   
 <!-- plugins:js -->
    <script src="<c:url value="/resources/assets/vendors/js/vendor.bundle.base.js"/>"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <script src="<c:url value="/resources/assets/vendors/chart.js/Chart.min.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/flot/jquery.flot.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/flot/jquery.flot.resize.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/flot/jquery.flot.categories.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/flot/jquery.flot.fillbetween.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/flot/jquery.flot.stack.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/flot/jquery.flot.pie.js"/>"></script>
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="<c:url value="/resources/assets/js/off-canvas.js"/>"></script>
    <script src="<c:url value="/resources/assets/js/hoverable-collapse.js"/>"></script>
    <script src="<c:url value="/resources/assets/js/misc.js"/>"></script>
    <!-- endinject -->
    <!-- Custom js for this page -->
    <script src="<c:url value="/resources/assets/js/dashboard.js"/>"></script>
    <!-- End custom js for this page -->
  </body>
</html>