<#import "/spring.ftl" as spring />
<h2 class="hello-title">Register</h2>


<form action="/register" name="registerForm" method="POST">

    <div>
        <label for="person_id">Person id</label>
        <input type="text" name="person_id" id="person_id" placeholder="person_id">

    </div>

    <div>
            <label for="firstname">Firstname</label>
            <input type="text" name="firstname" id="firstname" placeholder="firstname">

    </div>

    <div>
        <label for="lastname">Lastname</label>
        <input type="text" name="lastname" id="lastname" placeholder="lastname">

    </div>

    <div>
        <label for="email">Email</label>
        <@spring.bind "registerForm.email"/>
            <input type="email" name="email" id="email" placeholder="email">

    </div>

    <div>
        <label for="password">Password</label>
        <@spring.bind "registerForm.password"/>
            <input type="password" name="password" id="password" placeholder="password">

    </div>


    <div>
        <label for="Address">Address</label>
        <input type="text" name="Address" id="Address" placeholder="Address">

    </div>

    <div>
        <label for="Afm">Afm</label>
        <input type="text" name="Afm" id="Afm" placeholder="Afm">

    </div>

    <div class="form-check form-check-inline">

        <input class="form-check-input" type="radio" name="type" id="user" value="user">
        <label class="form-check-label" for="type">User</label>
    </div>
    <div class="form-check form-check-inline">

        <input class="form-check-input" type="radio" name="type" id="admin" value="admin">
        <label class="form-check-label" for="type">Admin</label>
    </div>















    <button type="submit">Register</button>
</form>

