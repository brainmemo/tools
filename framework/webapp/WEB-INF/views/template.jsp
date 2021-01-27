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
   <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.9.3/css/bootstrap-select.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.9.3/js/bootstrap-select.min.js"></script>

    <link rel="stylesheet" href="<c:url value="/resources/assets/jquery-ui-1.12.1/jquery-ui.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/mdi/css/materialdesignicons.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/flag-icon-css/css/flag-icon.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/css/vendor.bundle.base.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/font-awesome/css/font-awesome.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/bootstrap-datepicker/bootstrap-datepicker.min.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/style.css" />"/>
    <link rel="shortcut icon" href="<c:url value="/resources/assets/images/favicon.png" />"/>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.23/datatables.min.css"/>
 
 
	
 	<link rel="stylesheet" href="<c:url value="/resources/assets/vendors/select2/select2.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/assets/vendors/select2-bootstrap-theme/select2-bootstrap.min.css"/>" />
 
   
  </head>
  
  <body>
    

 
  
  <div class="container-scroller">
  
  	<jsp:include page="./partials/_sidebar.jsp"></jsp:include>
  	<jsp:include page="./partials/_navbar.jsp"></jsp:include>
  	
  	 <div class="main-panel">
          <div class="content-wrapper pb-0">
   <!-- Below Code should be commented if you dont wnat to show Header ribbon -->
          <jsp:include page="./partials/_ribbon.jsp"></jsp:include>
                   <!-- YOUR CODE GOES HERE IN ROWS AND COLUMNS with width 4,6,8,12 -->
            <div class="row">
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Line chart
                   <%--  <mytags:dashboard   dashboard_id="abc" table_class="table table-striped "/> --%>
						 <input id="ace">
						 
						 <select id="test" class="form-control select2" style="width: 100%;">
						 	<option>one</option>
						 	<option>two</option>
						 	<option>three</option>
						 	<option>four</option>
						 	<option>five</option>
						 </select>
				
				
						 
						 
                    
                    </h4>
                
                	<select id="abc"  class="form-control select2"  style="width: 100%;" data-live-search="true">
						 	
						 	<option></option>
						 	<option>A</option>
						 	<option>B</option>
						 	<option>c</option>
						 	<option>four</option>
						 	<option>five</option>
						 </select>
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
  	
  	
  	
  	
    <jsp:include page="./partials/_footer.jsp"></jsp:include> 
  	   
  
   
  
  	
   
 <!-- plugins:js -->
  
    <script src="<c:url value="/resources/assets/vendors/js/vendor.bundle.base.js"/>"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.23/datatables.min.js"></script>
    <!-- endinject -->
<script src="<c:url value="/resources/assets/jquery-ui-1.12.1/jquery-ui.min.js"/>"></script>
<script>
var USStates = [
	"Alabama",
	"Alaska",
	"Arizona",
	"Arkansas",
	"California",
	"Colorado",
	"Delaware",
	"Florida",
	"Georgia",
	"Hawaii",
	"Idaho",
	"Illinois",
	"Indiana",
	"Kansas",
	"Kentucky",
	"Louisiana",
	"Maine",
	"Maryland",
	"Massachusetts",
	"Michigan",
	"Minnesota",
	"Mississippi",
	"Missouri",
	"Montana",
	"Nebraska",
	"Nevada",
	"New Hampshire",
	"New Jersey",
	"New Mexico",
	"New York",
	"North Carolina",
	"North Dakota",
	"Washington",
	"West Virginia",
	"Wisconsin",
	"Wyoming",
	"Ohio"
	];

var render=0;
var statuslist = [{'id': '1', 'state': 'Maharasthra'}, {'id': '2', 'state': 'Bihar'}];
$(document).ready(function() {

	
	function add_opt(){
		alert('the value is ' + event);
		/* var value = $(event).parents('div').siblings('.bs-searchbox').find('input').val();
		$(event).parents('div').siblings('.selectpicker').append($("<option></option>").text(value)).val(value);
		$('.selectpicker').selectpicker('refresh'); */
		}
	$("#abc").selectpicker({
		
		style: 'btn-info',
	      size: 4,
		noneResultsText: 'No result found <button class="btn btn-primary" onclick=add_opt()>Add new option</button>'
		}); 
	
	
	
	
	
	$("#test").select2({
		 
		 
			  	allowClear: true,
		        escapeMarkup: function (markup) { return markup; },
		        placeholder: "Search the numbers",
		        language: {
		        	results:function () {
		        		console.log('I am here');
		                 return "<button type='button' class='btn btn-primary'> ADD ? </button> No Results found";
		            },
		            noResults: function () {
		            	console.log('I am here in no results');
		                 return "<button type='button' class='btn btn-primary'> ADD ? </button> No Results found";
		            }
		        }
		});

	$.ui.autocomplete.prototype._renderItem = function (ul, item) {
	    return $("<li></li>")
	        .data("item.autocomplete", item)
	        .append($("<a></a>").html(item.label))
	        .appendTo(ul);
	};

	$("#ace").autocomplete({
	    source: USStates,
	    response: function (event, ui) {
	        // Add the "button" object to the list of suggestions:
	       if (!ui.content.length) {
	        ui.content.push({
	            'label': "<span> No results was found. <input type='button' value='Click ME' /></span> ",
	            'button': true
	        });
	       }
	    },
	    "select": function (event, ui) {
	    	 
	        // If this is the button, don't populate the <input>
	        if (ui.item.button) {
	        	console.log('selection prevented');
	            event.preventDefault();
	        }
	    },
	    
	});
	
	$(document).on("click", ".mybutton", function () {
	    alert('clicked!');
	});
	
	/* if (typeof jQuery != 'undefined') {  
	    // jQuery is loaded => print the version
	    alert(jQuery.fn.jquery);
	} */
	 
	$('#country1').DataTable( {
    	
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
} );
    
    </script>

 	
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
   
    
    <script src="<c:url value="/resources/assets/vendors/select2/select2.min.js"/>"></script>
    <script src="<c:url value="/resources/assets/vendors/typeahead.js/typeahead.bundle.min.js"/>"></script>
   
    <script src="<c:url value="/resources/assets/js/typeahead.js"/>"></script>
    <script src="<c:url value="/resources/assets/js/select2.js"/>"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/js/bootstrap-select.min.js"></script>
  </body>
  
</html>