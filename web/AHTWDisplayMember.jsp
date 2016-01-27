<%-- 
    Document   : AHTWDisplayMember
    Created on : Jan 27, 2016, 4:38:45 PM
    Author     : taylor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Member</title>
        <script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
        <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css"></link>
        <link type="text/css" rel="stylesheet" href="/styles/styles.css"></link>
    </head>
    <body>
        <jsp:include page="TWAHBanner.jsp" />
        <div class="ui container">
            <div class="ui segment">
                <div class="ui one column left aligned grid">
                    <div class="column">
                        <h2>Here is the information you entered:</h2>
                        <h4>Name: ${param.fullName}</h4>
                        <h4>Email: ${param.email}</h4>
                        <h4>Phone: ${param.phone}</h4>
                        <h4>IT Program: ${param.program}</h4>
                        <h4>Year Level: ${param.year}</h4>
                        <p>To register another member, click on the back button in your browser of the return button shown below.</p>
                        <a class="ui orange button" href="AHTWRegister.jsp">Return</a>
                    </div>
                </div>
            </div>
            <jsp:include page="TWAHFooter.jsp" />
        </div>
        
    </body>
</html>
