<%--
subject    : 
author     : 남동길
date       : 2018. 6. 14.
description :
 
  [이름]   [수정일]     [내용]
  ----------------------------------------------------------
  김동범			2018-06-21	datatable mobile
--%> 
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>관리자 PAGE :: 자재 관리</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <!-- DataTable CSS -->
    <link href="/dist/css/dataTables.bootstrap.css" rel="stylesheet">
	<!-- tabletools -->
	<link href="/dist/css/dataTables.tableTools.css" rel="stylesheet" />
	<!-- DataTables JavaScript -->
	
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="/dist/js/jquery.dataTables.js"></script>
    <script src="/dist/js/dataTables.bootstrap.js"></script>
    <script src="/dist/js/dataTables.responsive.js"></script>
	<script src="/dist/js/responsive.bootstrap.js"></script>
	<!-- tabletools -->
	<script src="/dist/js/dataTables.tableTools.js"></script>
  
<!-- Bootstrap Core CSS -->
<link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="../vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
	
		<!-- Datatables Mobile CSS -->	
		<link href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.min.css" rel="stylesheet">
		<link href="https://cdn.datatables.net/rowreorder/1.2.4/css/rowReorder.dataTables.min.css" rel="stylesheet">
		<link href="https://cdn.datatables.net/responsive/2.2.2/css/responsive.dataTables.min.css" rel="stylesheet">
		
		
		<!-- Datatables Mobile JS -->
		<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
		<script src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
		<script src="https://cdn.datatables.net/rowreorder/1.2.4/js/dataTables.rowReorder.min.js"></script>
		<script src="https://cdn.datatables.net/responsive/2.2.2/js/dataTables.responsive.min.js"></script>
	
	
    <script>
    	$(document).ready(function($){
				$(document).ready(function() {
					var table = $('#dataTables-itemList').DataTable( {
				        rowReorder: {
				            selector: 'td:nth-child(2)'
				        },
				        responsive: true,
				        paging : true,
								ordering: false,
								bAutoWidth: false,
								bPaginate : false,
								bFilter : false,
								bInfo : false,
								dom: 'Bfrtip'
				    } );
				});
    	});
				</script>
</head>
<body>
	<div id="wrapper">
		<c:if test="${'S_MGR' eq sessionID.role}">
			<jsp:include page="/WEB-INF/views/admin/common/headerAndLeft.jsp"></jsp:include>
		</c:if>
		<c:if test="${'E_MGR' eq sessionID.role}">
			<jsp:include page="/WEB-INF/views/eAdmin/common/headerAndLeft.jsp"></jsp:include>
		</c:if>
		<c:if test="${'M_MGR' eq sessionID.role}">
			<jsp:include page="/WEB-INF/views/mAdmin/common/headerAndLeft.jsp"></jsp:include>
		</c:if>
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">자재 관리</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>

			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">자재 리스트</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
						<div class="table-responsive-lg">
							<table class="table table-bordered table-striped table-hover display nowrap" style="width:100%"
							id="dataTables-itemList" data-order='[[ 0, "desc" ],[ 2, "asc" ]]' data-page-length='10'>
								<thead>
								<tr>
									<th class="text-center" width="15%">근무지 이름</th> 
									<th class="text-center" width="15%">자재 사진</th>
									<th class="text-center" width="15%">자재 종류</th>
									<th class="text-center" width="15%">자재 이름</th>
									<th class="text-center" width="15%">자재 가격</th>
									<th class="text-center" width="15%">자재 단위</th>
								</tr>
								</thead>
								<tbody>
							<c:forEach var="item" items="${itemList}">
									<tr>
										<td class="text-center">${item.workName }</td>
										<td class="text-center">
											<c:if test="${item.itemImg eq null }">
												<img src="/assets/img/nono.png" class="img-responsive img-thumbnail" width="150px" />
											</c:if>
											<c:if test="${item.itemImg ne null }">
												<img src=<c:url value="/getByteItemImage/${item.itemSeq}"/> class="img-responsive img-thumbnail" width="150px" />
											</c:if>
										</td>
										<td class="text-center">${item.itemType}</td>
										<td class="text-center"><a style="text-decoration:none;" href="/showItemDetailForAdmin.do?itemSeq=${item.itemSeq}&workSeq=${item.workSeq}">${item.itemName}</a></td>
										<td class="text-center">${item.itemPrice}</td>
										<td class="text-center">${item.itemUnit}</td>
									</tr>
							</c:forEach>
							</tbody>
							</table>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->

			</div>
			<!-- /.row -->
		</div>
		<!-- /#page-wrapper -->
		<div class="row">
		<div class="col-lg-12 text-right">
			<a href="/newItemForAdminForm.do" class="btn btn-primary">자재 추가</a>
			</div>
		</div>
</div>
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="../vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Flot Charts JavaScript -->
	<script src="../vendor/flot/excanvas.min.js"></script>
	<script src="../vendor/flot/jquery.flot.js"></script>
	<script src="../vendor/flot/jquery.flot.pie.js"></script>
	<script src="../vendor/flot/jquery.flot.resize.js"></script>
	<script src="../vendor/flot/jquery.flot.time.js"></script>
	<script src="../vendor/flot-tooltip/jquery.flot.tooltip.min.js"></script>
	<script src="../data/flot-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>
