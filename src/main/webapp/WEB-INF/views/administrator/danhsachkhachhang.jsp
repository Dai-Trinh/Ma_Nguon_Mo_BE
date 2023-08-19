<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Admin SkyTour</title>
    <jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/views/administrator/layout/css.jsp"></jsp:include>
    <link rel="shortcut icon" href="${base}/img/images/iconLogoOffStardom.png"/>
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
                <div class="page-header">
                    <h3 class="page-title"> Danh sách hóa đơn SkyTour </h3>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <!-- <li class="breadcrumb-item"><a href="./ThemSanPham.html" class="btn btn-behance">Thêm Tour</a></li> -->
                        </ol>
                    </nav>
                </div>
                <div class="row">
                    <div class="col-12 grid-margin stretch-card">
                        <div class="card">
                            <div class="card-body" style="overflow: auto;">
                                <table class="table table-hover">
                                    <thead>
                                    <tr>
                                        <th>STT</th>
                                        <th>Mã khách hàng</th>
                                        <th>Tên tài khoản</th>
                                        <th>Mật khẩu</th>
                                        <th>Email</th>
                                        <th>Số điện thoại</th>
                                        <th>Status</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${userEntities}" var="userEntities"
                                               varStatus="loop">
                                        <tr>
                                            <th scope="row">${loop.index +1 }</th>
                                            <td>${userEntities.id}</td>
                                            <td>${userEntities.username}</td>
                                            <td>${userEntities.password}</td>
                                            <td>${userEntities.email}</td>
                                            <td>${userEntities.phone}</td>
                                            <td><span
                                                      style="width: 20px; height: 20px;"> <c:choose>
                                                <c:when test="${userEntities.status}">
															<input type="checkbox" checked="checked"
                                                                   readonly="readonly">
                                                </c:when>
                                                <c:otherwise>
                                                    <input type="checkbox" readonly="readonly">
                                                </c:otherwise>
                                            </c:choose>
											</span></td>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
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