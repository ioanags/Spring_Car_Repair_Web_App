<#import "/spring.ftl" as spring />
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
    <link href="https://cdnjs.cloudflare.com/ajax/libs/smalot-bootstrap-datetimepicker/2.4.4/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <!-- Custom styles for this template -->

    <link href="/dashboard.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="/admin">Hello ${lastname}</a>
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
                    <li class="nav-item">
                        <a class="nav-link active" href="/search/repair">
                            <span data-feather="search"></span>
                            Search Repair
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/admin/my_repairs">
                            <span data-feather="list"></span>
                            My Repairs
                        </a>
                    </li>

                </ul>
            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h1 class="h2"> Search Repairs</h1>

            </div>
            <form action="/search/repair/results" name="searchRepairForm" autocomplete="off" id="searchRepairForm" class="w-50">
                <div class="form-group">
                    <@spring.bind "searchRepairForm.date"/>
                    <label for="searchDate">Date or Date's Range:</label>
                    <input type="datetime-local" class="form-control" name="date" id="date"  placeholder="Enter Date">
                </div>
                <div class="form-group">
                    <@spring.bind "searchRepairForm.afm"/>

                    <label for="afm">Afm:</label>
                    <input type="text" class="form-control" name="afm" id="afm" placeholder="Enter Afm">
                </div>
                <div class="form-group">
                    <@spring.bind "searchRepairForm.plate"/>
                    <label for="searchPlate">Plate</label>
                    <input type="text" class="form-control" name="plate"  id="plate" placeholder="Enter Plate">
                </div>

                <button type="submit" class="btn btn-primary">Search</button>
            </form>



            </div>
        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/smalot-bootstrap-datetimepicker/2.4.4/js/bootstrap-datetimepicker.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

<!-- Icons -->
<#--<script>(function ($) {-->

        <#--var $inputDatepicker = $('#date');-->

        <#--if ($inputDatepicker.length > 0) {-->
            <#--$inputDatepicker.datetimepicker({-->
                <#--format: "dd/MM/yyyy - hh:ii",-->
                <#--autoclose: true,-->
            <#--});-->
        <#--}-->
    <#--})(jQuery);</script>-->
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script>
    feather.replace()
</script>


</body>
</html>
