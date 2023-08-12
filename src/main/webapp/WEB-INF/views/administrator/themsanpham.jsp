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
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="${base}/summernote-0.8.18-dist/summernote-bs4.min.css">


</head>
<body>
	<div class="container-scroller">
		<jsp:include page="/WEB-INF/views/administrator/layout/header.jsp"></jsp:include>

		<div class="container-fluid page-body-wrapper">
			<!-- partial:../../partials/_sidebar.html -->
			<jsp:include page="/WEB-INF/views/administrator/layout/sidebar.jsp"></jsp:include>
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper content-wrapper__product">
					<div class="content-wrapper__product__body">
						<div class="product__body__nav">
							<a href="../../index.html">Trang chủ</a> <span><i
								class="mdi mdi-chevron-right"></i></span> <a
								href="../../pages/ui-features/SanPham.html">Danh sách tour</a> <span><i
								class="mdi mdi-chevron-right"></i></span> <a
								href="../../pages/ui-features/ThemSanPham.html">Thêm</a>

						</div>
						<div class="product__body__title">
							<p>Thông Tin Tour</p>
						</div>
						<div class="product__body__table">
							<%--@elvariable id="productTour" type="java"--%>
							<sf:form modelAttribute="productTour"
								action="${base }/admin/addproducttour/saveOrUpdate"
								method="post" enctype="multipart/form-data">
								<table class="tableAdd table table-borderless">
									<tr>
										<td>Avatar:</td>
										<td style="height: 200px;"><img
											src="${base }/upload/${productTour.productTourAvatar}" alt=""
											style="width: 70px; height: 70px;"><br> <input
											type='file' name='productTourAvatarRq' id="productTourAvatarRq"
											style="margin-top: 40px; height: 56px;"><br></td>
									</tr>
									<tr>
									<tr>
										<td>Hình ảnh:</td>
										<td style="height: 200px;"><c:forEach
												items="${productTour.productTourImageEntitySet }"
												var="productTourImages">
												<img alt="" style="width: 70px; height: 70px;"
													src="${base }/upload/${productTourImages.path}">
											</c:forEach><br> <input type="file" id="productTourImageEntitySetRq"
											name="productTourImageEntitySetRq" multiple="multiple"
											style="margin-top: 40px; height: 56px;"><br></td>
									</tr>
									<tr>
										<td>Danh Mục:</td>
										<td><sf:select path="categoryTourEntity.id" type="text"
												name="category" id="category">
												<sf:options items="${categorytour }" itemValue="id"
													itemLabel="categoryTourName" />
											</sf:select></td>
										<!-- 										<td><input type="text" name="categoryId" id="categoryId"></td>
 -->
									<tr>
										<td>Mã tour:</td>
										<td><sf:input path="productTourCode" type="text" name="productTourCode"
												id="productTourCode"></sf:input></td>
									</tr>
									<tr>
										<td>Tên tour:</td>
										<td><sf:input path="productTourName" type="text" name="productTourName"
												id="productTourName"></sf:input></td>
									</tr>
									<tr>
										<td>Tên tour chi tiết:</td>
										<td><sf:input path="productTourNameDetail" type="text"
												name="productTourNameDetail" id="productTourNameDetail"></sf:input></td>
									</tr>
									<tr>
										<td>Thời gian:</td>
										<td><sf:input path="productTourTime" type="text" name="productTourTime"
												id="productTourTime" placeholder="(3 ngày 2 đêm, 5 ngày 4 đêm, ...)"></sf:input></td>
									</tr>
									<tr>
										<td>Thời gian khởi hành:</td>
										<td><sf:select path="productTourTimeStart" name="productTourTimeStart"
												id="productTourTimeStart">
												<sf:option value="2">Thứ hai</sf:option>
												<sf:option value="3">Thứ ba</sf:option>
												<sf:option value="4">Thứ tư</sf:option>
												<sf:option value="5">Thứ năm</sf:option>
												<sf:option value="6">Thứ sáu</sf:option>
												<sf:option value="7">Thứ bảy</sf:option>
												<sf:option value="8">Chủ Nhật</sf:option>
												<sf:option value="9">Mọi ngày trong tuần</sf:option>
											</sf:select></td>
									</tr>
									<tr>
										<td>Phương tiện:</td>
										<td><sf:select path="productTourVehicle" name="productTourVehicle" id="productTourVehicle">
												<sf:option value="1">Ô tô con</sf:option>
												<sf:option value="2">Ô tô điện</sf:option>
												<sf:option value="3">Xe khách</sf:option>
												<sf:option value="4">Xe bus</sf:option>
												<sf:option value="5">Xe máy</sf:option>
												<sf:option value="6">Máy bay</sf:option>
												<sf:option value="7">Du thuyền</sf:option>
											</sf:select></td>
									</tr>
									<tr>
										<td>Địa điểm khởi hành:</td>
										<td><sf:input path="productTourAddressStart" type="text"
												name="productTourAddressStart" id="productTourAddressStart" placeholder="( Từ Hà Nội, Đà Nẵng, Tp. HCM...)"></sf:input></td>
									</tr>
									<tr>
										<td>Giá:</td>
										<td><sf:input path="productTourPrice" type="text" name="productTourPrice"
												id="productTourPrice"></sf:input></td>
									</tr>
									<tr>
										<td>Giá trước khuyến mãi:</td>
										<td><sf:input path="productTourPriceSale" type="text"
												name="productTourPriceSale" id="productTourPriceSale"></sf:input></td>
									</tr>
									<tr>
										<td>Đánh giá:</td>
										<td><sf:input path="productTourAssess" type="text" name="productTourAssess"
												id="productTourAssess" value="5" readonly="true"></sf:input></td>
									</tr>
									<tr>
										<td>Điểm nhấn tour:</td>
										<td><sf:textarea path="productTourHighlightTour"
												name="productTourHighlightTour" id="productTourHighlightTour" autocomplete="off"
												class="summernote" cols="100" rows="2"></sf:textarea></td>
									</tr>
									<tr>
										<td>Lịch trình tour:</td>
										<td><a href="${base }/admin/adddaytour"
											class="btn btn-behance" style="background: #ccc;">Thêm
												lịch trình tour</a></td>
									</tr>
									<tr>
										<td>Dịch vụ tour:</td>
										<td><sf:textarea path="productTourServiceTour" name="productTourServiceTour"
												id="productTourServiceTour" autocomplete="off" class="summernote"
												cols="100" rows="2"></sf:textarea></td>
									</tr>
									<tr>
										<td>Tác vụ:</td>
										<td><sf:checkbox path="productTourIsHot" name="productTourIsHot" id="productTourIsHot"
												style="height: 20px; width: 20px; margin: 0px 10px;" /> <label
											for="productTourIsHot"> Nổi bật</label><br></td>
									</tr>
									<tr>
										<td></td>
										<td><sf:checkbox path="productTourIsSale" name="productTourIsSale" id="productTourIsSale"
												style="height: 20px; width: 20px; margin: 0px 10px;" /> <label
											for="productTourIsSale">Giảm giá</label><br></td>
									</tr>
									<tr>
										<td></td>
										<td><button type="submit" class="btn btn-behance"
												style="margin-top: 0px; margin-right: 20px !important; width: 150px !important; background: #5b99c0;">Thêm</button>
											<a href="${base }/admin/producttour"
											style="text-decoration: none; color: black;"
											class="btn btn-danger">Thoát</a></td>
									</tr>
								</table>
							</sf:form>
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


	<!-- Jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
	<jsp:include page="/WEB-INF/views/administrator/layout/js.jsp"></jsp:include>


	<!-- summernote-->
	<script src="${base}/summernote-0.8.18-dist/summernote-bs4.min.js"></script>
	<!-- internal javascript -->
	<script type="text/javascript">
		$(document).ready(function() {
			$('#productTourHighlightTour').summernote({
				placeholder : 'Mô tả chi tiết',
				width : 500,
				height : 100, // set editor height
				minHeight : null, // set minimum height of editor
				maxHeight : null
			// set maximum height of editor				             
			});
		});
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#productTourServiceTour').summernote({
				placeholder : 'Mô tả chi tiết',
				width : 500,
				height : 100, // set editor height
				minHeight : null, // set minimum height of editor
				maxHeight : null
			// set maximum height of editor				             
			});
		});
	</script>
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