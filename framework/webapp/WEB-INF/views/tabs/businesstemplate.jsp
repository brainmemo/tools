<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://yettolaunch.com/tlds" prefix="mytags"%>

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
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.23/datatables.min.css"/>
 

   
  </head>
  
  <body>
    

 
  
  <div class="container-scroller">
  
  	<%-- <jsp:include page=".././partials/_sidebar.jsp"></jsp:include> --%>
  	<%-- <jsp:include page=".././partials/_navbar.jsp"></jsp:include>
  	 --%>
  	 <div class="main-panel">
          <div class="content-wrapper pb-0">
   <!-- Below Code should be commented if you dont wnat to show Header ribbon -->
 <%--          <jsp:include page=".././partials/_ribbon.jsp"></jsp:include>
  --%>                  <!-- YOUR CODE GOES HERE IN ROWS AND COLUMNS with width 4,6,8,12 -->
            <div class="row">
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Line chart
                    <mytags:dashboard   dashboard_id="abc" table_class="table table-striped "/> 
						 <select class="selectpicker" data-live-search="true">
						  <option data-tokens="ketchup mustard">Hot Dog, Fries and a Soda</option>
						  <option data-tokens="mustard">Burger, Shake and a Smile</option>
						  <option data-tokens="frosting">Sugar, Spice and all things nice</option>
						</select>
                    
                    </h4>
                    <canvas id="lineChart" style="height: 250px;"></canvas>
                  </div>
                </div>
              </div>
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Bar chart  </h4>
                    <div>
                    	<table id="country1" class="table table-responsive-lg ">
                    	<thead>
                    	<tr>
                    			<th>Sno</th>
                    			<th>Country</th>
                    			<th>State</th>
                    			<th>Capital</th>
                    			<th>Comments</th>
                    			<th>Comments_1</th>
                    	</tr>
                    	</thead>
                    	<tbody>
                    	<tr>
                    		<td>1</td>
                    		<td>India</td>
                    		<td>Maharasthra</td>
                    		<td>Mumbai</td>
                    		<td>Financial Capital</td>
                    		<td></td>
                    	</tr>
                    	<tr>
                    		<td>2</td>
                    		<td>India</td>
                    		<td>Bihar</td>
                    		<td>Patna</td>
                    		<td>Golghar</td>
                    		<td></td>
                    	</tr>
                    	<tr>
                    		<td>1</td>
                    		<td>India</td>
                    		<td>Maharasthra</td>
                    		<td>Mumbai</td>
                    		<td>Financial Capital</td>
                    		<td></td>
                    	</tr>
                    	
                    	</tbody>
                    	</table>
                    </div>
                   
                    <canvas id="barChart" style="height: 230px;">
                    
                    </canvas>
                  </div>
                </div>
              </div>
              
			 
            </div>
			</div>
            </div>
            </div>
  	
  	
  	
  	
    <%-- <jsp:include page=".././partials/_footer.jsp"></jsp:include> 
  	 --%>   
  
   
  
  	
   
 <!-- plugins:js -->
    <script src="<c:url value="/resources/assets/vendors/js/vendor.bundle.base.js"/>"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.23/datatables.min.js"></script>
    <!-- endinject -->

<script>
var render=0;
var statuslist = [{'id': '1', 'state': 'Maharasthra'}, {'id': '2', 'state': 'Bihar'}];
$(document).ready(function() {
    var table=$('#country1').DataTable( {
    	
        "columnDefs": [
           
        	
            {"targets": [ 0], 
            	"visible": true,
            	"width": "20%",
            	 
            },
          
            {
            	"targets": 2, 
            	"visible": true ,
            	"width": "20%",
            	"render": function(data, type, row, meta){
                    var $select = $('<select/>', { 'class': 'ctrl-status' });
                    $.each(statuslist, function (Value, Text) {
                       var $opt = $('<option/>', { 'value': Text.id, 'text': Text.state });
                      
                       if (Text.state === row[2]){
                    	   console.log('Full [0] ' + row[2] + ' State '+ Text.state);
                    	   $opt.attr("selected", "selected");
                       }
                       $select.append($opt);
                    });
                    return $select.prop("outerHTML");
                 }

            }
        ]
    } );

    $('.dataTable').on('focus', 'tbody td', function() {

    	  //get textContent of the TD
    	  console.log('TD cell textContent : ', this.textContent)

    	  //get the value of the TD using the API 
    	  console.log('value by API : ', table.cell({ row: this.parentNode.rowIndex, column : this.cellIndex }).data());
    });
} );
    
    </script>
<mytags:dashEnd dashboard_id="abc"/>
 	
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