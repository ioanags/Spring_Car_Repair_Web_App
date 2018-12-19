<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Admin Home Page</title>

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
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Hello ${lastname}</a>
        <div class="navbar-right">
        <form action="/search" name="searchForm" class="navbar-form  form-inline " id="search">

            <div class="form-group">
                <label class="text-light h5" for="searchID"><strong>Search User: &nbsp; </strong></label>
                <input class="form-control" id="searchID" name="afm" placeholder="ΑΦΜ" type="text">
            </div>
              <div class="form-group">
                    <input class="form-control" id="searchID" name="email" placeholder="Email" type="text">
                </div>

            <button class="btn btn-primary mr-5" type="submit">Search</button>

            <a class="nav-link btn btn-outline-light" href="/logout">Sign out</a>
        </form>

        </div>



</nav>

<div class="container-fluid mt-5">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="/admin">
                            <span data-feather="home"></span>
                            Home
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/admin/register">
                            <span data-feather="plus-circle"></span>
                            Create user
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/admin/repair_create">
                            <span data-feather="plus-circle"></span>
                            Add Repair
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/admin/users">
                            <span data-feather="list"></span>
                            Users List
                        </a>
                    </li>

                </ul>
            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h1 class="h2"> Recent Repairs</h1>

            </div>



            <h2>10 First Repairs</h2>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Date</th>
                        <th>Kind</th>
                        <th>Cost</th>
                        <th>Status</th>
                        <th>Name</th>
                        <th>Plate</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list list as repair>
                    <tr>
                            <td>${repair.id}</td>
                            <td>${repair.date}</td>
                            <td>${repair.kind}</td>
                            <td>${repair.cost}</td>
                            <td>${repair.status}</td>
                            <td>${repair.person.getFirstName()} ${repair.person.getLastName()}</td>
                            <td>${repair.person.getPlate()}</td>
                        <td>
                            <a class="btn btn-success" href="/admin/edit_repair/${repair.id}" name="edit" >Edit</a>
                        </td>
                        <td>
                        <form action="/admin/delete_repair" name="deleteForm" method="GET">
                    <input type="hidden" name="id" value="${repair.id}" />
                    <button class="btn btn-danger button-delete-confirmation" type="submit" name="action" value="Delete">Delete</button>
                        </form>
                        </td>
                        </tr>

                    </#list>
                    </tbody>
                </table>
                <a class="nav-link active" href="admin/repair_create">
                    <span data-feather="plus-circle"></span>
                   Add Repair
                </a>
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
