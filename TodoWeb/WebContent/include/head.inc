<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <%if(request.getAttribute("goesThroughMainServlet") == null) {%>
    	<meta HTTP-EQUIV="REFRESH" content="0; url=MainServlet">
    <%}%>
    <title><%= pageTitle %></title>

    <!--jquery-->
    <script src="js/lib/jquery-1.4.2.js" type="text/javascript"></script>
    <!-- our script which uses jquery library -->
    <script src="js/script.js" type="text/javascript"></script>
    <!-- our style sheet -->
    <link href="style/style.css" rel="stylesheet">
    
    <!--stylesheet for the template which Dino has founded on the world wide web
    <link rel="stylesheet" href="style/template-style.css" type="text/css">-->
    
    <!--stylesheet from openwebdesign.org -->
    <link rel="stylesheet" href="style/bright/style.css" type="text/css">
    
    <!-- time entry -->
    <link rel="stylesheet" href="js/lib/timeentry/jquery.timeentry.css" type="text/css">
    <script src="js/lib/timeentry/jquery.timeentry.js" type="text/javascript"></script>
    <script src="js/lib/timeentry/jquery.timeentry-sv.js" type="text/javascript"></script>
    <!-- mouse wheel extension to jquery in order to enable mouse wheel to set time -->
    <script src="js/lib/jquery.mousewheel.js" type="text/javascript"></script>
    
    <!-- date entry -->
    <link rel="stylesheet" href="js/lib/dateentry/jquery.dateentry.css" type="text/css">
	<script type="text/javascript" src="js/lib/dateentry/jquery.dateentry.js"></script>
	<script type="text/javascript" src="js/lib/dateentry/jquery.dateentry-sv.js"></script>


    <!-- validate plugin for jquery -->
    <script src="js/lib/jquery.validate.js" type="text/javascript"></script>
</head>