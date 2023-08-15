<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!-- import JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- import thư viện spring-form -->
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Admin SkyTour</title>
    <jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/views/administrator/layout/css.jsp"></jsp:include>
    <link rel="shortcut icon" href="${base}/img/images/iconLogoOffStardom.png"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
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
                <div class="row" style="text-align: center; margin: 100px 0px;">
                    <div class="col-6 col-sm-6 col-md-6 col-lg-3">
                        <div class="counter-wrap">
                            <div class="counter">
                                <p class=""  style="font-size: 50px;font-weight: bold;"><c:out value="${systemPlanEntities.numberTrip}"/></p>
                            </div>
                            <p class="caption">Chuyến đi</p>
                        </div>
                    </div>
                    <div class="col-6 col-sm-6 col-md-6 col-lg-3">
                        <div class="counter-wrap">
                            <div class="counter">
                                <p class="" data-number="8492" style="font-size: 50px;font-weight: bold;"><c:out value="${systemPlanEntities.numberGuest}"/></p>
                            </div>
                            <p class="caption">Lượt khách</p>
                        </div>
                    </div>
                    <div class="col-6 col-sm-6 col-md-6 col-lg-3">
                        <div class="counter-wrap">
                            <div class="counter">
                                <p class="" data-number="100" style="font-size: 50px;font-weight: bold;"><c:out value="${systemPlanEntities.numberGuide}"/></p>
                            </div>
                            <p class="caption">Hướng dẫn viên chuyên nghiệp </p>
                            <button type="button" class="btn btn-behance" data-toggle="collapse" data-target="#demo"
                                    style="background: #1c7430">Sửa
                            </button>
                            <div class="wrapper-people collapse" id="demo">
                                <form action="" method="post">
                                    <label for="people">Nhập số hướng dẫn viên</label><br>
                                    <input type="number" name="people" id="people" style="margin: 10px;"><br>
                                    <button type="submit" class="btn-dark">Cập nhật</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-6 col-sm-6 col-md-6 col-lg-3">
                        <div class="counter-wrap">
                            <div class="counter">
                                <p class="" data-number="100" style="font-size: 50px;font-weight: bold;"><c:out value="${systemPlanEntities.numberTour}"/></p>
                            </div>
                            <p class="caption">Số tour có sẵn </p>
                            <%--                <button type="button" class="btn btn-behance" data-toggle="collapse" data-target="#demo2">Sửa</button>--%>
                            <%--                <div class="wrapper-people collapse" id="demo2" >--%>
                            <%--                  <form action="" method="post">--%>
                            <%--                    <label for="trip">Nhập số tour có sẵn</label><br>--%>
                            <%--                    <input type="number" name="trip" id="trip" style="margin: 10px;"><br>--%>
                            <%--                    <button type="submit" class="btn-dark">Cập nhật</button>--%>
                            <%--                  </form>--%>
                            <%--                </div>--%>
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
        <%--          <!-- partial:partials/_footer.html -->--%>
        <%--          <jsp:include page="/WEB-INF/views/administrator/layout/footer.jsp"></jsp:include>--%>
        <%--          <!-- partial -->--%>
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