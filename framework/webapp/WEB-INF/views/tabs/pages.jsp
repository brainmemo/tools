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

    <link rel="stylesheet" href="./resources/assets/css/lib/bootstrap.min.css">
    <link rel="stylesheet" href="./resources/assets/css/lib/fontawesome.min.css">
    <link rel="stylesheet" href="./resources/assets/css/lib/select2.min.css">
    <link rel="stylesheet" href="./resources/assets/css/lib/data-tables.min.css">
    <link rel="stylesheet" href="./resources/assets/css/lib/bootstrap-datepicker.min.css">
    <link rel="stylesheet" href="./resources/assets/css/custom.css">
    <link rel="stylesheet" href="./resources/assets/css/pages/features.css">
</head>
<body>

<jsp:include page=".././partials/navbar.jsp"></jsp:include>
<jsp:include page=".././partials/sidenav.jsp"></jsp:include>

<div id="content" class="can_have_sidenav">
   <!--  <div class="p-5"> -->
      <!--   <div class="row mb-3">
            <div class="col-lg-4">
                <h3>
                    Hi, Welcome back!
                </h3>
            </div>
            <div class="col-lg-5 mb-2">
                Your web analytics dashboard template
            </div>
            <div class="col-lg-3 d-flex justify-content-end">
                <a href="" class="btn btn-info ms-1 text-white">
                    Add User
                </a>
            </div>
        </div> -->
        
        
    <div class="row mb-3">
   
  <div class="col-lg-12">
        <div class="card">
            <div class="card-body p-4">
               
				 <h5 class="mb-3">Pages</h5>
				 
				 
             
             <select class="form-select" aria-label="Default select example" style="width: 150px;">
				  <option value="1">Add</option>
				  <option value="2">Edit</option>
				  <option value="3">Delete</option>
				</select>
                <table class="display dataTable-table">
                    <thead>
                    <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td></td>
                        <td></td>
                        <td></td>
                      	<td></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
</div>
</div>
    <!--     <div class="card mt-4">
            <div class="card-body p-4">
                <h5 class="mb-3">Business Survay</h5>

                <select class="select2-input">
                    <option value="">-- Select --</option>
                    <option value="1">USA</option>
                    <option value="2">China</option>
                    <option value="3">India</option>
                </select>
            </div>
        </div>

         <div class="card mt-4">
            <div class="card-body p-4">
                <h5>Change color scheme</h5>

                <div class="btn-group" role="group" aria-label="Basic example">
                    <button type="button" class="btn btn-lg btn-primary btn-change-theme" data-scheme="default">
                        Default
                    </button>
                    <button type="button" class="btn btn-lg btn-danger btn-change-theme" data-scheme="light">
                        Light
                    </button>
                    <button type="button" class="btn btn-lg btn-dark btn-change-theme" data-scheme="dark">
                        Dark
                    </button>
                    <button type="button" class="btn btn-lg btn-secondary btn-change-theme" data-scheme="grey">
                        Grey
                    </button>
                </div>
            </div>
        </div>
   </div> -->
</div>
 <form action="">
<div class="modal" id="addModal" tabindex="-1" data-bs-backdrop="static" data-bs-keyboard="false">
   
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Modal title</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label for="name-input" class="mb-2">Name</label>
                    <input type="text" placeholder="Name" id="name-input" class="form-control">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" onclick="dismissAddModal()">
                    Close
                </button>
                <button type="button" class="btn btn-primary" onclick="submitAddOption()">Save changes</button>
            </div>
        </div>
      
    </div>
</div>
  </form>
<jsp:include page=".././partials/floating-menu.jsp"></jsp:include>
<jsp:include page=".././partials/footer.jsp"></jsp:include>


<script src="./resources/assets/js/lib/bootstrap.bundle.min.js"></script>
<script src="./resources/assets/js/lib/jquery.min.js"></script>
<script src="./resources/assets/js/lib/select2.min.js"></script>
<script src="./resources/assets/js/lib/data-tables.min.js"></script>
<script src="./resources/assets/js/lib/key-table.min.js"></script>

<script src="./resources/assets/js/lib/bootstrap-datepicker.min.js"></script>
<script src="./resources/assets/js/custom.js"></script>
<script src="./resources/assets/js/pages/pages.js"></script>

</body>
</html>
