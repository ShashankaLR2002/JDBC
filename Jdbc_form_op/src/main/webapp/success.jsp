<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Submission Success</title>
    <!-- Add Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="alert alert-success" role="alert">
            <h4 class="alert-heading">Success!</h4>
            <p>Your form has been submitted successfully.</p>
            <hr>
            <p class="mb-0">Thank you for your submission. You will receive a confirmation email shortly.</p>
        </div>
        <!-- Optionally, add a button to navigate back to the form -->
        <a href="form.jsp" class="btn btn-primary">Go Back to Form</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
