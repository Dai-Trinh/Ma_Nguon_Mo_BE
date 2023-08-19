<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- import JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- import thư viện spring-form -->
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin SkyTour</title>
<jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>
<jsp:include page="/WEB-INF/views/administrator/layout/css.jsp"></jsp:include>
<link rel="shortcut icon"
	href="${base}/img/images/iconLogoOffStardom.png" />
</head>
<body>
	<div class="container-scroller">
		<jsp:include page="/WEB-INF/views/administrator/layout/header.jsp"></jsp:include>

		<div class="container-fluid page-body-wrapper">
			<!-- partial:../../partials/_sidebar.html -->
			<jsp:include page="/WEB-INF/views/administrator/layout/sidebar.jsp"></jsp:include>
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row">
						<div class="col-12 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Thêm danh mục tour</h4>
									<p class="card-description">SkyTour</p>
									<%--@elvariable id="categorytour" type="java"--%>
									<sf:form class="forms-sample" modelAttribute="categorytour"
										action="${base}/admin/addcategorytour/saveOrUpdate"
										method="post" enctype="multipart/form-data">
										<div class="form-group">
											<label for="id">Mã id cửa hàng</label>
											<sf:input path="id" type="text" class="form-control"
													  name="id" id="id" readonly="true"></sf:input>
										</div>
										<div class="form-group">
											<label for="name">Tên danh mục</label>
											<sf:input path="categoryTourName" type="text" class="form-control"
												name="name" id="name" placeholder="Tên danh mục"></sf:input>
										</div>
										<div class="form-group">
											<label for="numberGuest">Số lượng khách ghé thăm</label>
											<sf:input path="categoryTourNumberGuest" type="number"
												class="form-control" name="" id="numberGuest"
												placeholder="Số lượng khách ghé thăm"></sf:input>
										</div>
										<div class="form-group">
											<label for="categoryTourAvatarRq">Ảnh</label><br> <img
												src="${base }/upload/${categorytour.categoryTourAvatar}" alt=""
												style="width: 70px; height: 70px;"><br>
												 <input type="file" name="categoryTourAvatarRq" id="categoryTourAvatarRq">
										</div>
										<div class="form-group">
											<sf:checkbox path="categoryTourIsLove" name="categoryTourIsLove" id="categoryTourIsLove"
												style="height: 20px; width: 20px; margin: 15px 10px;" />
											<label for="categoryTourIsLove" style="margin-top: 20px;">Yêu
												thích</label>
										</div>
										<div class="form-group">
											<button type="submit" class="btn btn-gradient-primary me-2">Thêm</button>
											<a href="${base}/admin/categorytour" class="btn btn-light">Thoát</a>
										</div>
									</sf:form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->
				<jsp:include page="/WEB-INF/views/administrator/layout/footer.jsp"></jsp:include>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<jsp:include page="/WEB-INF/views/administrator/layout/js.jsp"></jsp:include>
</body>
<!-- background: linear-gradient(to right, #84d9d2, #07cdae); xanh lá nhạt-->
<!-- background: linear-gradient(to right, #ffbf96, #fe7096); đỏ hồng-->
<!-- background: linear-gradient(to right, #f6e384, #ffd500); vàng-->
<!--  background: linear-gradient(to right, #90caf9, #047edf 99%); xanh dương-->
<!-- background: linear-gradient(to right, #da8cff, #9a55ff); tím -->
<!-- background: linear-gradient(to right, #e7ebf0, #868e96); xám -->
<!-- background: linear-gradient(89deg, #5e7188, #3e4b5b);  dark -->
<!-- background: linear-gradient(to bottom, #f4f4f4, #e4e4e9); trắng -->
</html>