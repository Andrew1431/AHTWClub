<%-- 
    Document   : index
    Created on : Jan 27, 2016, 3:16:31 PM
    Author     : taylor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AHTW Club Sauce</title>
        <script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
        <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css"></link>
        <link type="text/css" rel="stylesheet" href="styles/styles.css"></link>

    </head>
    <body>
        <jsp:include page="TWAHBanner.jsp" />
        <div class="ui container">
            <div class="ui segment">
                <h1>Java Web Technologies: Section 1</h1>
                <h4>Pair Programming Team:</h4>
                
                <div class="ui two column center aligned grid">
                    <div class="column">
                        <div class="ui stacked inverted orange segment">
                            <h3>Taylor Watson, certified Driver</h3>
                        </div>
                    </div>
                    <div class="column">
                        <div class="ui stacked inverted orange segment">
                            <h3>Andrew Hartwig, experienced Passenger</h3>
                        </div>
                    </div>
                </div>
                
                <h2>The date is currently <%= new java.util.Date() %></h2>
            </div>
            <jsp:include page="TWAHFooter.jsp" />
        </div>
        
    </body>
</html>
