<nav class="navbar navbar-expand-sm navbar-dark bg-dark" aria-label="Third navbar example">
    <div class="container-fluid">
        <a class="navbar-brand">Hospital</a>

        <%-- Create var for current url--%>
        <%
            String curUrl = request.getRequestURI();
            //TODO: if curUrl = nav-link -> make nav-link class "active"
        %>

        <div class="collapse navbar-collapse" id="navbarsExample03">
            <ul class="navbar-nav me-auto mb-2 mb-sm-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/cab">Cab</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/assignments">Assignments</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">Users</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown03">
                        <li><a class="dropdown-item" href="/patients">Patients</a></li>
                        <li><a class="dropdown-item" href="/doctors">Doctors</a></li>
                    </ul>
                </li>
            </ul>
            <form>
                <%-- LOGOUT button--%>
                <input class="btn btn-light" type="submit" value="logout">
            </form>
        </div>
    </div>
</nav>
