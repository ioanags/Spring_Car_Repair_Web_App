<#import "/spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>User Registration</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <link href="/dashboard.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Hello</a>
    <div class="navbar-right">
        <form action="/search" name="searchForm" class="navbar-form  form-inline " id="search">

            <div class="form-group">
                <input class="form-control" id="searchID" name="afm" placeholder="ΑΦΜ" type="text">
            </div>
            <div class="form-group">
                <input class="form-control" id="searchID" name="email" placeholder="Email" type="text">
            </div>

            <button class="btn btn-primary mr-5" type="submit">Search</button>

            <a class="nav-link btn btn-outline-light" href="#">Sign out</a>
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
                <h1 class="h2">Add a Repair</h1>

            </div>




            <div class="container">
                <form action="/admin/repair_create" name="repairForm" method="POST">
                    <div class="form-group w-50">
                        <label for="date"><strong>Date</strong></label>
                        <input  name="date" type="date" class="form-control" id="date" placeholder="yyyy-mm-dd">
                    </div>
                    <div class="form-group w-50">
                        <label for="kind"><strong>Kind</strong></label>
                        <input name="kind" type="text" class="form-control" id="kind" placeholder="Enter kind">
                    </div>
                    <div class="form-group w-50">
                            <label for="cost"><strong>Cost</strong></label>
                            <input name="cost" type="text" class="form-control" id="cost" placeholder="Enter cost">
                    </div>
                    <div class="form-group w-50">
                        <label for="status"><strong>Status</strong></label>
                        <input name="status" type="text" class="form-control" id="status" placeholder="Enter status">
                    </div>

                    <div class="form-group w-50">
                        <label for="description"><strong>Description</strong></label>
                        <input name="description" type="text" class="form-control" id="description" placeholder="description">
                    </div>
                    <div class="form-group w-50">
                        <label for="person_id"><strong>Person id</strong></label>
                        <input name="person_id" type="text" class="form-control" id="person_id" placeholder="person_id">
                    </div>

                    <button type="submit" class="btn btn-primary clearfix">Add</button>
                </form>
            </div>
        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace()
</script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


</body>
</html>
