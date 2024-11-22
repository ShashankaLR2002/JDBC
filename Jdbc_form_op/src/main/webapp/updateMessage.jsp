<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form Update Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Form Update Result</h1>
        <div>
            <c:if test="${not empty successMessage}">
                <p class="alert alert-success">${successMessage}</p>
            </c:if>
            <c:if test="${not empty failureMessage}">
                <p class="alert alert-danger">${failureMessage}</p>
            </c:if>
        </div>
        <hr>
        <a href="form.jsp" class="btn btn-primary">Go back to Form Operations</a>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
