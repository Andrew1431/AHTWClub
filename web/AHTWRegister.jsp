<%-- 
    Document   : AHTWRegister
    Created on : Jan 27, 2016, 4:31:39 PM
    Author     : taylor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <script src="https://code.jquery.com/jquery-2.2.0.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
        <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css"></link>
        <link type="text/css" rel="stylesheet" href="/styles/styles.css"></link>
    </head>
    <body>
        <jsp:include page="TWAHBanner.jsp" />
        <div class="ui container">
            <div class='ui centered grid'>
                <div class='six wide column'>
                    <div class='ui orange segment'>
                        <form class='ui form' method='GET' action='AHTWRegister'>
                            <div class='field'>
                                <label>Full Name</label>
                                <input type='text' name='fullName' placeholder='Full Name' />
                            </div>
                            <div class='field'>
                                <label>Email</label>
                                <input type='text' name='email' placeholder='john@example.com' />
                            </div>
                            <div class='field'>
                                <label>Phone Number</label>
                                <input type='text' name='phone' placeholder='(905) 123-4567' />
                            </div>
                            <div class='field'>
                                <label>IT Program</label>
                                <select name='program' class='ui dropdown program'>
                                    <option value='CAD'>CAD</option>
                                    <option value='CP'>CP</option>
                                    <option value='CPA'>CPA</option>
                                    <option value='ITID'>ITID</option>
                                    <option value='ITSS'>ITSS</option>
                                    <option value='MSD'>MSD</option>
                                    <option value='Others'>Others</option>
                                </select>
                            </div>
                            <div class='field'>
                                <label>Year Level</label>
                                <select name='year' class='ui dropdown year'>
                                    <option value='1'>Year 1</option>
                                    <option value='2'>Year 2</option>
                                    <option value='3'>Year 3</option>
                                    <option value='4'>Year 4</option>
                                </select>
                            </div>
                            <script>
                                $('.ui.dropdown.program').dropdown();
                                $('.ui.dropdown.year').dropdown();
                            </script>
                            <button type='submit' class='fluid ui orange button'>Register Now!</button>
                            <button type='reset' class='fluid ui inverted orange button'>Reset</button>
                        </form>
                    </div>
                </div>
            </div>
            <jsp:include page="TWAHFooter.jsp" />
        </div>
        
    </body>
</html>
