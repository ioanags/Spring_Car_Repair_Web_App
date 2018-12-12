<#import "/spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
      <!-- Custom styles for this template -->
    <link href="../static/dashboard.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Hello</a>
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
                            <span data-feather="plus-circle"></span>
                            Home
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="http://localhost:8081/">
                            <span data-feather="plus-circle"></span>
                            Create user
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="edit"></span>
                            Edit user
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="search"></span>
                            Search
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="#">
                            <span data-feather="plus-circle"></span>
                            Delete
                        </a>
                    </li>

                </ul>
            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
                <h1 class="h2">Create User</h1>

            </div>




            <div class="container">
                <form action="/register" name="registerForm" method="POST">
                    <div class="form-group w-50">
                        <@spring.bind "registerForm.firstName"/>
                        <label for="first-name"><strong>First Name:</strong></label>
                        <input  name="firstName" type="text" class="form-control" id="first-name" placeholder="Enter Your Name">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "registerForm.lastName"/>
                        <label for="last-name"><strong>Last Name:</strong></label>
                        <input name="lastName" type="text" class="form-control" id="last-name" placeholder="Enter Your Last Name">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "registerForm.email"/>
                        <label for="email"><strong>Email:</strong></label>
                        <input name="email" type="email" class="form-control" id="email" placeholder="Enter Your Email">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "registerForm.password"/>
                        <label for="password"><strong>Password:</strong></label>
                        <input name="password" type="password" class="form-control" id="password" placeholder="Enter Your Password">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>

                    <div class="form-group w-50">
                        <@spring.bind "registerForm.Address"/>
                        <label for="address"><strong>Address:</strong></label>
                        <input name="Address" type="text" class="form-control" id="address" placeholder="Address">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "registerForm.afm"/>
                        <label for="afm"><strong>ΑΦΜ:</strong></label>
                        <input name="Afm" type="text" class="form-control" id="afm" placeholder="ΑΦΜ">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-group w-50">
                        <@spring.bind "registerForm.plate"/>
                        <label for="plate"><strong>Plate:</strong></label>
                        <input name="plate" type="text" class="form-control" id="plate" placeholder="Enter Your Plate">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-group w-50">

                        <label for="carModel"><strong>Car Model:</strong></label>
                        <input name="carModel" type="text" class="form-control" id="carModel" placeholder="Enter Your Car Model">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                    </div>
                    <div class="form-check form-check-inline">
                        <@spring.bind "registerForm.type"/>
                        <input class="form-check-input" type="radio" name="type" id="user" value="User">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                        <label class="form-check-label" for="user">User</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <@spring.bind "registerForm.type"/>
                        <input class="form-check-input" type="radio" name="type" id="user" value="Admin">
                        <#list spring.status.errorMessages as error>
                            <span>${error}</span>
                        </#list>
                        <label class="form-check-label" for="user">Admin</label>
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
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


</body>
</html>
