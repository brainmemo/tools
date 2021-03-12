<nav class="navbar navbar-expand-lg navbar-dark bg-dark text-light can_have_sidenav">
    <div class="container-fluid navbar-nav">
        <div class="row w-100">
            <div class="col-5 col-lg-4 ps-4 pe-4">
                <button class="btn btn-nav" onclick="toggle_sidenav()">
                    <i class="fa fa-bars"></i>
                </button>

                <button class="btn btn-nav ms-4 ms-md-4 mobile-nav-2">
                    <i class="fa fa-bell"></i>
                    <span class="badge bg-warning position-absolute nav-badge">4</span>
                </button>

                <button class="btn btn-nav ms-4 d-none d-lg-inline-block">
                    <i class="fa fa-envelope"></i>
                    <span class="badge bg-info position-absolute nav-badge">2</span>
                </button>


            </div>
            <div class="col-lg-4 ps-4 pe-4 d-none d-lg-block">
                <div class="input-group nav-search d-none d-lg-inline-flex">
                    <input type="text" class="form-control search-input" placeholder="Search...">
                    <span>
                            <i class="fa fa-search pe-3 ps-2 pt-2 text-white"></i>
                        </span>
                </div>
            </div>
            <div class="col-3 col-lg-4 ps-4 pe-4 d-flex justify-content-end">
                <li class="nav-item dropdown d-none d-lg-inline-block">
                    <a class="nav-link dropdown-toggle p-0" href="#" id="navbarDropdown" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        <button class="btn btn-nav me-2">
                            <i class="fa fa-globe"></i>
                        </button>
                        English
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown d-inline-block ms-4 mobile-nav-3">
                    <a class="nav-link dropdown-toggle p-0" href="#" id="navbarDropdown" role="button"
                       data-bs-toggle="dropdown" aria-expanded="false">
                        <img src="./assets/images/avatar.png" class="me-lg-2 profile-img" width="40">
                        <span class="d-none d-lg-inline-block">Henry Klein</span>
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>

                <a href="#" class="d-lg-none float-end mobile-nav-4">
                    <img src="./assets/images/logo.png" width="40" class="ms-3">
                </a>
            </div>
        </div>
    </div>
</nav>
