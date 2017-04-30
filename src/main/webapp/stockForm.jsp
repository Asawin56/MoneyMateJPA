<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Stock Form</title>

	<jsp:include page="headCSS.jsp" />

</head>
<body>
	<div id="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<jsp:include page="brand.jsp" />
			<jsp:include page="menuTop.jsp" />
			<jsp:include page="menuSide.jsp" />
		</nav>
		<div id="page-wrapper">
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							Add New Stock
						</h1>
						<ol class="breadcrumb">
							<li class="active">
								<i class="fa fa-dashboard"></i> <a href="<c:url value='/' />">Dashboard</a>
							</li>
							<li class="active">
								<i class="fa fa-table"></i> Add New Stock
							</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<div class="row">
					<div class="col-lg-12">
						<h2>Stock Form</h2>
						<br/>
						<br/>
						<a href="<c:url value='/listStocks' />" class="btn btn-primary" role="button" >List all stocks.</a>

						<a href="<c:url value='/' />" class="btn btn-primary" role="button" >Home</a>
						<br />
					</div>
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->
	<jsp:include page="bodyJS.jsp" />
</body>
</html>