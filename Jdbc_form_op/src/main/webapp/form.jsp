<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Data Base Management System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Data Base Management System</h1>

        <h2>Submit Form</h2>
        <form action="form" method="POST">
            <input type="hidden" name="action" value="save" class="form-control mb-3">
            <div class="mb-3">
                <label for="name" class="form-label">Name:</label>
                <input type="text" name="name" id="name" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="age" class="form-label">Age:</label>
                <input type="number" name="age" id="age" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email:</label>
                <input type="email" name="email" id="email" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="contact" class="form-label">Contact:</label>
                <input type="text" name="contact" id="contact" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password:</label>
                <input type="password" name="password" id="password" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="address" class="form-label">Address:</label>
                <input type="text" name="address" id="address" class="form-control" required>
            </div>
            <input type="submit" value="Submit" class="btn btn-primary">
            
        </form>

       

        <h2>View Form Data by ID</h2>
        <form action="form" method="POST">
            <input type="hidden" name="action" value="view" class="form-control mb-3">
            <div class="mb-3">
                <label for="id" class="form-label">Enter ID to view data:</label>
                <input type="number" name="id" id="id" class="form-control" required>
            </div>
            <input type="submit" value="View" class="btn btn-secondary">
        </form>

        <hr>

        <h2>Search Form Data by Contact Number</h2>
        <form action="form" method="POST">
            <input type="hidden" name="action" value="searchByContact" class="form-control mb-3">
            <div class="mb-3">
                <label for="contactSearch" class="form-label">Enter Contact Number to view Name and Email:</label>
                <input type="text" name="contact" id="contactSearch" class="form-control" required>
            </div>
            <input type="submit" value="Search" class="btn btn-info">
        </form>

        <hr>

        <h2>Verify Email and Password</h2>
        <form action="form" method="POST">
             <input type="hidden" name="action" value="verifyPassword">
    
    <div class="mb-3">
        <label for="verifyEmail" class="form-label">Enter Email:</label>
        <input type="email" name="email" id="verifyEmail" class="form-control" required>
    </div>
    <div class="mb-3">
        <label for="verifyPassword" class="form-label">Enter Password:</label>
        <input type="password" name="password" id="verifyPassword" class="form-control" required>
    </div>
    <input type="submit" value="Verify" class="btn btn-success">
        </form>

        <hr>

        <h2>Delete Form Data by ID</h2>
        <form action="form" method="POST">
            <input type="hidden" name="action" value="delete" class="form-control mb-3">
            <div class="mb-3">
                <label for="deleteId" class="form-label">Enter ID to delete data:</label>
                <input type="number" name="id" id="deleteId" class="form-control" required>
            </div>
            <input type="submit" value="Delete" class="btn btn-danger">
        </form>

        <hr>

        <h2>Update Form Data by Email</h2>
        <form action="form" method="POST">
            <input type="hidden" name="action" value="update" class="form-control mb-3">
            <div class="mb-3">
                <label for="updateEmail" class="form-label">Enter Email to Update Data:</label>
                <input type="email" name="email" id="updateEmail" class="form-control" required>
            </div>
            <div class="mb-3">
                <label for="updateName" class="form-label">Updated Name:</label>
                <input type="text" name="name" id="updateName" class="form-control">
            </div>
            <div class="mb-3">
                <label for="updateAge" class="form-label">Updated Age:</label>
                <input type="number" name="age" id="updateAge" class="form-control">
            </div>
            <div class="mb-3">
                <label for="updateContact" class="form-label">Updated Contact:</label>
                <input type="text" name="contact" id="updateContact" class="form-control">
            </div>
            <div class="mb-3">
                <label for="updatePassword" class="form-label">Updated Password:</label>
                <input type="password" name="password" id="updatePassword" class="form-control">
            </div>
            <div class="mb-3">
                <label for="updateAddress" class="form-label">Updated Address:</label>
                <input type="text" name="address" id="updateAddress" class="form-control">
            </div>
            <input type="submit" value="Update" class="btn btn-warning">
        </form>

        <hr>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
