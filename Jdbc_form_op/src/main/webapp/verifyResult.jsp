<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Verification Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Password and Email Verification Result</h2>

        <div>
            <c:if test="${not empty successMessage}">
                <p class="alert alert-success" id="successMessage">
                    ${successMessage}
                </p>
            </c:if>

            <c:if test="${not empty failureMessage}">
                <p class="alert alert-danger" id="errorMessage">
                    ${failureMessage}
                </p>
            </c:if>
        </div>

        <br>
        <a href="form.jsp" class="btn btn-primary">Back to Form</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
