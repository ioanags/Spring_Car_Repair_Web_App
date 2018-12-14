<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>User List</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <!-- Custom styles for this template -->

    <link href="/dashboard.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Hello</a>
    <form action="/search" name="searchForm" class="navbar-form navbar-right form-inline" id="search" method="GET">
        <div class="form-group">
            <input class="form-control" id="searchID" name="afm" placeholder="ΑΦΜ" type="text">
            <div class="form-group">
                <input class="form-control" id="searchID" name="email" placeholder="Email" type="text">
            </div>
        </div>
        <button class="btn btn-default" type="submit">Search</button>
    </form>
    <!-- <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search"> -->
    <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">
            <a class="nav-link" href="#">Sign out</a>
        </li>
    </ul>
</nav>

<div class="container-fluid mt-5">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="http://localhost:8081/admin">
                            <span data-feather="home"></span>
                            Home
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="http://localhost:8081/register">
                            <span data-feather="plus-circle"></span>
                            Create user
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="http://localhost:8081/admin">
                            <span data-feather="list"></span>
                            Repair List
                        </a>
                    </li>

                </ul>
            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h1 class="h2">Users List</h1>
                <!-- <div class="btn-toolbar mb-2 mb-md-0">
                     <div class="btn-group mr-2">
                         <button class="btn btn-sm btn-outline-secondary">Share</button>
                         <button class="btn btn-sm btn-outline-secondary">Export</button>
                     </div>
                     <button class="btn btn-sm btn-outline-secondary dropdown-toggle">
                         <span data-feather="calendar"></span>
                         This week
                     </button>
                 </div> -->
            </div>



            <h2></h2>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>FirstName</th>
                        <th>LastName</th>
                        <th>Adress</th>
                        <th>Email</th>
                        <th>Password</th>
                        <th>Plate</th>
                        <th>Car Model</th>
                        <th>Type</th>
                        <th>ΑΦΜ</th>
                        <th>Edit</th>
                        <th>Delete</th>



                    </tr>
                    </thead>
                    <tbody>

                    <#list list as person>
                        <tr>
                        <td>${person.id}</td>
                        <td>${person.firstName}</td>
                        <td>${person.lastName}</td>
                        <td>${person.address}</td>
                        <td>${person.email}</td>
                        <td>${person.password}</td>
                        <td>${person.plate}</td>
                        <td>${person.carModel}</td>
                        <td>${person.type}</td>
                        <td>${person.afm}</td>

                        <td>
                            <button class="btn btn-success" type="submit" name="edit" value="Edit">Edit</button>
                        </td>
                        <td>
                            <button class="btn btn-danger button-delete-confirmation" name="delete" type="submit" value="Delete">Delete</button>
                        </td>
                        </tr>

                    </#list>

                    </tbody>
                </table>
            </div>
        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

<!-- Icons -->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace()
</script>

</body>
</html>