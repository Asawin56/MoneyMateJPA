<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MoneyMaid Home</title>

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/sb-admin.css" rel="stylesheet">
    <link href="resources/css/plugins/morris.css" rel="stylesheet">
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>
<body>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value='/' />">MoneyMaid</a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                <ul class="dropdown-menu message-dropdown">
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>
                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>
                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>
                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-footer">
                        <a href="#">Read All New Messages</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                <ul class="dropdown-menu alert-dropdown">
                    <li>
                        <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#">View All</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Asawin Krongprasert <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="index.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                </li>
                <li>
                    <a href="charts.html"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                </li>
                <li>
                    <a href="<c:url value='/listStocks' />"><i class="fa fa-fw fa-table"></i> Portfolio</a>
                </li>
                <li>
                    <a href="forms.html"><i class="fa fa-fw fa-edit"></i> Forms</a>
                </li>
                <li>
                    <a href="bootstrap-elements.html"><i class="fa fa-fw fa-desktop"></i> Bootstrap Elements</a>
                </li>
                <li>
                    <a href="bootstrap-grid.html"><i class="fa fa-fw fa-wrench"></i> Bootstrap Grid</a>
                </li>
                <li>
                    <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
                    <ul id="demo" class="collapse">
                        <li>
                            <a href="#">Dropdown Item</a>
                        </li>
                        <li>
                            <a href="#">Dropdown Item</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>
    <div id="page-wrapper">
        <div class="container-fluid">
            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Dashboard <small>Portfolios Overview</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i> Dashboard
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-12">
                    <div class="alert alert-info alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        <i class="fa fa-info-circle"></i>
                        <p>This is the homepage!</p>
                        <br />
                        <h2>Glyphicon Icons</h2>
                        <span class="glyphicon glyphicon-envelope"></span>: Email Icon<br><br>
                        <span class="glyphicon glyphicon-phone"></span>: Phone Icon<br><br>
                        <span class="glyphicon glyphicon-music"></span>: Music Icon<br><br>
                        <span class="glyphicon glyphicon-home"></span>: Home Icon <br><br>
                        <span class="glyphicon glyphicon-time"></span>: Time Icon <br><br>
                        <a href="<c:url value='/listStocks' />" class="alert-link">List all stocks.</a>
                        <br />
                        <a href="<c:url value='/newStock' />" class="alert-link">Add New Stock</a>
                    </div>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o fa-fw"></i> Area Chart</h3>
                        </div>
                        <div class="panel-body">
                            <div id="morris-area-chart"></div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->
    </div>
    <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> -->
<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/plugins/morris/raphael.min.js"></script>
<script src="resources/js/plugins/morris/morris.min.js"></script>
<script src="resources/js/plugins/morris/morris-data.js"></script>
</body>
</html>
