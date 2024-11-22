<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form Search Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Form Search Result</h1>

        <h2 class="text-center">
            ${successMessage != null ? successMessage : failureMessage}
        </h2>

        <c:if test="${not empty name && not empty email}">
            <div class="card mt-4">
                <div class="card-body">
                    
                </div>
            </div>
        </c:if>

        <br>
        <a href="form.jsp" class="btn btn-primary">Go Back to Form</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
