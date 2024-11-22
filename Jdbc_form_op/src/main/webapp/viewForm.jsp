<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Form Details</h2>

        <div class="card">
            <div class="card-body">
                <p><strong>ID:</strong> ${form.id}</p>
                <p><strong>Name:</strong> ${form.name}</p>
                <p><strong>Age:</strong> ${form.age}</p>
                <p><strong>Email:</strong> ${form.email}</p>
                <p><strong>Contact:</strong> ${form.contact}</p>
                <p><strong>Password:</strong> ${form.password}</p>
                <p><strong>Address:</strong> ${form.address}</p>
            </div>
        </div>

        <br>
        <a href="form.jsp" class="btn btn-primary">Back to form</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
