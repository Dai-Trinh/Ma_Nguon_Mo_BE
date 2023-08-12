<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- import JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="author" content="Untree.co">
<link rel="shortcut icon" href="favicon.png">
<meta name="description" content="" />
<meta name="keywords" content="bootstrap, bootstrap4" />
<!-- import file jsp -->
<jsp:include page="/WEB-INF/views/common/variables.jsp"></jsp:include>

<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@400;700&family=Source+Serif+Pro:wght@400;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
	integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
	<jsp:include page="/WEB-INF/views/customer/layout/css.jsp"></jsp:include>

<title>Sky Tour</title>
</head>

<body>

	<div id="myContainer">
		<jsp:include page="/WEB-INF/views/customer/layout/navigation.jsp"></jsp:include>

		<jsp:include page="/WEB-INF/views/customer/layout/header.jsp"></jsp:include>

		<div class="untree_co-section" style="padding-top: 0px;">
			<div class="container">
				<div class="row">
					<div class="col-lg-5">
						<h2 class="title-tour-sale-main section-title mb-4 aos-init"
							style="font-weight: bold; font-size: 45px !important;"
							data-aos="fade-right" data-aos-duration="1200">Tours hot giá
							sốc</h2>
						<p class="content-tour-sale-main aos-init" data-aos="fade-up"
							data-aos-duration="1000">Cập nhật hàng ngày các tour được hỗ
							trợ với mức giá hấp dẫn</p>
						<div
							class="owl-single dots-absolute owl-carousel owl-theme owl-bs main-carousel">
							<div class="item wrapper-img-tourhot img-fluid rounded-20">
								<img src="images/slider-1.jpg" alt="ảnh Sky"
									class="img-fluid rounded-20">
								<div class="wrapper-img-background">
									<h3 class="text-center">TOUR QUẢNG BÌNH</h3>
									<p class="tour-sale-p1">3 NGÀY 2 ĐÊM</p>
									<p class="tour-sale-p2">QUẢNG BÌNH – ĐỘNG PHONG NHA – ĐỘNG
										THIÊN ĐƯỜNG – SUỐI NƯỚC MỌOC – SÔNG CHÀY – HANG TỐI – CỒN CÁT
										QUANG PHÚ</p>
									<p class="tour-sale-p3">
										Khởi hành: Các ngày trong tuần <span class="tour-sale-span1">
											2,390,000 đ</span><span class="tour-sale-span2">2,590,000 đ</span>
									</p>
									<a href="chitiet.html" class="btn-detail-tour-sale btn">Xem
										chi tiết</a>
								</div>
							</div>
							<div class="item wrapper-img-tourhot img-fluid rounded-20">
								<img src="images/slider-2.jpg" alt="ảnh Sky"
									class="img-fluid rounded-20">
								<div class="wrapper-img-background">
									<h3 class="text-center">TOUR QUẢNG BÌNH</h3>
									<p class="tour-sale-p1">3 NGÀY 2 ĐÊM</p>
									<p class="tour-sale-p2">QUẢNG BÌNH – ĐỘNG PHONG NHA – ĐỘNG
										THIÊN ĐƯỜNG – SUỐI NƯỚC MỌOC – SÔNG CHÀY – HANG TỐI – CỒN CÁT
										QUANG PHÚ</p>
									<p class="tour-sale-p3">
										Khởi hành: Các ngày trong tuần <span class="tour-sale-span1">
											2,390,000 đ</span><span class="tour-sale-span2">2,590,000 đ</span>
									</p>
									<a href="chitiet.html" class="btn-detail-tour-sale btn">Xem
										chi tiết</a>
								</div>
							</div>

							<div class="item wrapper-img-tourhot img-fluid rounded-20">
								<img src="images/slider-3.jpg" alt="ảnh Sky"
									class="img-fluid rounded-20">
								<div class="wrapper-img-background">
									<h3 class="text-center">TOUR QUẢNG BÌNH</h3>
									<p class="tour-sale-p1">3 NGÀY 2 ĐÊM</p>
									<p class="tour-sale-p2">QUẢNG BÌNH – ĐỘNG PHONG NHA – ĐỘNG
										THIÊN ĐƯỜNG – SUỐI NƯỚC MỌOC – SÔNG CHÀY – HANG TỐI – CỒN CÁT
										QUANG PHÚ</p>
									<p class="tour-sale-p3">
										Khởi hành: Các ngày trong tuần <span class="tour-sale-span1">
											2,390,000 đ</span><span class="tour-sale-span2">2,590,000 đ</span>
									</p>
									<a href="chitiet.html" class="btn-detail-tour-sale btn">Xem
										chi tiết</a>
								</div>
							</div>
							<div class="item wrapper-img-tourhot img-fluid rounded-20">
								<img src="images/slider-4.jpg" alt="ảnh Sky"
									class="img-fluid rounded-20">
								<div class="wrapper-img-background">
									<h3 class="text-center">TOUR QUẢNG BÌNH</h3>
									<p class="tour-sale-p1">3 NGÀY 2 ĐÊM</p>
									<p class="tour-sale-p2">QUẢNG BÌNH – ĐỘNG PHONG NHA – ĐỘNG
										THIÊN ĐƯỜNG – SUỐI NƯỚC MỌOC – SÔNG CHÀY – HANG TỐI – CỒN CÁT
										QUANG PHÚ</p>
									<p class="tour-sale-p3">
										Khởi hành: Các ngày trong tuần <span class="tour-sale-span1">
											2,390,000 đ</span><span class="tour-sale-span2">2,590,000 đ</span>
									</p>
									<a href="chitiet.html" class="btn-detail-tour-sale btn">Xem
										chi tiết</a>
								</div>
							</div>
							<div class="item wrapper-img-tourhot img-fluid rounded-20">
								<img src="images/slider-5.jpg" alt="ảnh Sky"
									class="img-fluid rounded-20">
								<div class="wrapper-img-background">
									<h3 class="text-center">TOUR QUẢNG BÌNH</h3>
									<p class="tour-sale-p1">3 NGÀY 2 ĐÊM</p>
									<p class="tour-sale-p2">QUẢNG BÌNH – ĐỘNG PHONG NHA – ĐỘNG
										THIÊN ĐƯỜNG – SUỐI NƯỚC MỌOC – SÔNG CHÀY – HANG TỐI – CỒN CÁT
										QUANG PHÚ</p>
									<p class="tour-sale-p3">
										Khởi hành: Các ngày trong tuần <span class="tour-sale-span1">
											2,390,000 đ</span><span class="tour-sale-span2">2,590,000 đ</span>
									</p>
									<a href="chitiet.html" class="btn-detail-tour-sale btn">Xem
										chi tiết</a>
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-7 pl-lg-5 ml-auto" style="margin-top: 135px;">
						<div
							class="owl-carousel owl-carousel owl-3-slider second-carousel">
							<div class="item item-tour-sale">
								<a class="media-thumb" href="chitiet.html">
									<div class="media-text media-text-tour-sale">
										<h3>3,450,000 đ</h3>
										<span class="location">4,450,000 đ</span>
										<p style="margin-top: 16px;">ĐÀ NẴNG – NGŨ HÀNH SƠN – HỘI
											AN – BÀ NÀ HILLS - CÙ LAO CHÀM</p>
										<p>4 ngày 3 đêm</p>
										<p>Khởi hành: Các ngày trong tuần</p>
										<p class="text-center"
											style="color: #ada9a9; font-size: 20px !important;">
											(Click xem chi tiết)</p>
									</div> <img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
								</a>
								<div class="tour-name-sale">
									<h5 class="text-center">Tour</h5>
									<p class="text-center">QUY NHƠN – PHÚ YÊN</p>
								</div>
							</div>
							<div class="item item-tour-sale">
								<a class="media-thumb" href="chitiet.html">
									<div class="media-text media-text-tour-sale">
										<h3>3,450,000 đ</h3>
										<span class="location">4,450,000 đ</span>
										<p style="margin-top: 16px;">ĐÀ NẴNG – NGŨ HÀNH SƠN – HỘI
											AN – BÀ NÀ HILLS - CÙ LAO CHÀM</p>
										<p>4 ngày 3 đêm</p>
										<p>Khởi hành: Các ngày trong tuần</p>
										<p class="text-center"
											style="color: #ada9a9; font-size: 20px !important;">
											(Click xem chi tiết)</p>
									</div> <img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
								</a>
								<div class="tour-name-sale">
									<h5 class="text-center">Tour</h5>
									<p class="text-center">QUY NHƠN – PHÚ YÊN</p>
								</div>
							</div>
							<div class="item item-tour-sale">
								<a class="media-thumb" href="chitiet.html">
									<div class="media-text media-text-tour-sale">
										<h3>3,450,000 đ</h3>
										<span class="location">4,450,000 đ</span>
										<p style="margin-top: 16px;">ĐÀ NẴNG – NGŨ HÀNH SƠN – HỘI
											AN – BÀ NÀ HILLS - CÙ LAO CHÀM</p>
										<p>4 ngày 3 đêm</p>
										<p>Khởi hành: Các ngày trong tuần</p>
										<p class="text-center"
											style="color: #ada9a9; font-size: 20px !important;">
											(Click xem chi tiết)</p>
									</div> <img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
								</a>
								<div class="tour-name-sale">
									<h5 class="text-center">Tour</h5>
									<p class="text-center">QUY NHƠN – PHÚ YÊN</p>
								</div>
							</div>
							<div class="item item-tour-sale">
								<a class="media-thumb" href="chitiet.html">
									<div class="media-text media-text-tour-sale">
										<h3>3,450,000 đ</h3>
										<span class="location">4,450,000 đ</span>
										<p style="margin-top: 16px;">ĐÀ NẴNG – NGŨ HÀNH SƠN – HỘI
											AN – BÀ NÀ HILLS - CÙ LAO CHÀM</p>
										<p>4 ngày 3 đêm</p>
										<p>Khởi hành: Các ngày trong tuần</p>
										<p class="text-center"
											style="color: #ada9a9; font-size: 20px !important;">
											(Click xem chi tiết)</p>
									</div> <img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
								</a>
								<div class="tour-name-sale">
									<h5 class="text-center">Tour</h5>
									<p class="text-center">QUY NHƠN – PHÚ YÊN</p>
								</div>
							</div>
							<div class="item item-tour-sale">
								<a class="media-thumb" href="chitiet.html">
									<div class="media-text media-text-tour-sale">
										<h3>3,450,000 đ</h3>
										<span class="location">4,450,000 đ</span>
										<p style="margin-top: 16px;">ĐÀ NẴNG – NGŨ HÀNH SƠN – HỘI
											AN – BÀ NÀ HILLS - CÙ LAO CHÀM</p>
										<p>4 ngày 3 đêm</p>
										<p>Khởi hành: Các ngày trong tuần</p>
										<p class="text-center"
											style="color: #ada9a9; font-size: 20px !important;">
											(Click xem chi tiết)</p>
									</div> <img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
								</a>
								<div class="tour-name-sale">
									<h5 class="text-center">Tour</h5>
									<p class="text-center">QUY NHƠN – PHÚ YÊN</p>
								</div>
							</div>
							<div class="item item-tour-sale">
								<a class="media-thumb" href="chitiet.html">
									<div class="media-text media-text-tour-sale">
										<h3>3,450,000 đ</h3>
										<span class="location">4,450,000 đ</span>
										<p style="margin-top: 16px;">ĐÀ NẴNG – NGŨ HÀNH SƠN – HỘI
											AN – BÀ NÀ HILLS - CÙ LAO CHÀM</p>
										<p>4 ngày 3 đêm</p>
										<p>Khởi hành: Các ngày trong tuần</p>
										<p class="text-center"
											style="color: #ada9a9; font-size: 20px !important;">
											(Click xem chi tiết)</p>
									</div> <img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
								</a>
								<div class="tour-name-sale">
									<h5 class="text-center">Tour</h5>
									<p class="text-center">QUY NHƠN – PHÚ YÊN
										cccccccccccccccccccccccccc</p>
								</div>
							</div>

						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="untree_co-section">
			<div class="container">
				<div class="row mb-5 justify-content-center">
					<div class="col-lg-6 text-center">
						<h2
							class="section-title text-center mb-3 aos-init title-tour-summer-main"
							style="font-size: 45px !important; font-weight: bold;"
							data-aos="fade-left" data-aos-duration="1000">Tours du lịch
							hè 2023</h2>
						<p class="aos-init content-tour-summer-main" data-aos="fade-up"
							data-aos-duration="1000">Thật tuyệt vời khi giao quyền sắp
							xếp tour du lịch và kết hợp nghỉ ngơi trong thời gian gần 1 tháng
							cho SkyTour. Đặc biệt nhận được sự gần gũi, thân thiện, cảm giác
							như tình cảm gia đình ( VÔ GIÁ ). Hy vọng sẽ sớm gặp lại…</p>
					</div>
				</div>
				<div class="row align-items-stretch aos-init list-tour-summer-main"
					data-aos="fade-right" data-aos-duration="1200">
					<div
						class="col-6 col-sm-6 col-lg-4 feature-1-wrap d-md-flex flex-md-column order-lg-1">
						<div class="item item-search">
							<div class="media-thumb">
								<div class="media-text">
									<h3>
										<i class="fa-solid fa-money-bill"></i> Vé giá 300k / 1 người
									</h3>
									<p class="location">
										<i class="fa-solid fa-location-dot"></i> Thái Bình - Lăng Bác
										- Quốc Tử Giám - Làng Nghề Gốm Bát Tràng
									</p>
									<a href="#" class="btn btn-success btn-tour-item"
										style="margin-top: 30px;">Click để xem chi tiết</a>
								</div>
								<img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
							</div>
						</div>

						<div class="item item-search">
							<div class="media-thumb">
								<div class="media-text">
									<h3>
										<i class="fa-solid fa-money-bill"></i> Vé giá 300k / 1 người
									</h3>
									<p class="location">
										<i class="fa-solid fa-location-dot"></i> Thái Bình - Lăng Bác
										- Quốc Tử Giám - Làng Nghề Gốm Bát Tràng
									</p>
									<a href="#" class="btn btn-success btn-tour-item"
										style="margin-top: 30px;">Click để xem chi tiết</a>
								</div>
								<img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
							</div>
						</div>
					</div>

					<div
						class="col-6 col-sm-6 col-lg-4 feature-1-wrap d-md-flex flex-md-column order-lg-1">
						<div class="item item-search">
							<div class="media-thumb">
								<div class="media-text">
									<h3>
										<i class="fa-solid fa-money-bill"></i> Vé giá 300k / 1 người
									</h3>
									<p class="location">
										<i class="fa-solid fa-location-dot"></i> Thái Bình - Lăng Bác
										- Quốc Tử Giám - Làng Nghề Gốm Bát Tràng
									</p>
									<a href="#" class="btn btn-success btn-tour-item"
										style="margin-top: 30px;">Click để xem chi tiết</a>
								</div>
								<img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
							</div>
						</div>

						<div class="item item-search">
							<div class="media-thumb">
								<div class="media-text">
									<h3>
										<i class="fa-solid fa-money-bill"></i> Vé giá 300k / 1 người
									</h3>
									<p class="location">
										<i class="fa-solid fa-location-dot"></i> Thái Bình - Lăng Bác
										- Quốc Tử Giám - Làng Nghề Gốm Bát Tràng
									</p>
									<a href="#" class="btn btn-success btn-tour-item"
										style="margin-top: 30px;">Click để xem chi tiết</a>
								</div>
								<img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
							</div>
						</div>
					</div>
					<div
						class="col-6 col-sm-6 col-lg-4 feature-1-wrap d-md-flex flex-md-column order-lg-1">
						<div class="item item-search">
							<div class="media-thumb">
								<div class="media-text">
									<h3>
										<i class="fa-solid fa-money-bill"></i> Vé giá 300k / 1 người
									</h3>
									<p class="location">
										<i class="fa-solid fa-location-dot"></i> Thái Bình - Lăng Bác
										- Quốc Tử Giám - Làng Nghề Gốm Bát Tràng
									</p>
									<a href="#" class="btn btn-success btn-tour-item"
										style="margin-top: 30px;">Click để xem chi tiết</a>
								</div>
								<img src="images/hero-slider-1.jpg" alt="Image"
									class="img-tour-item">
							</div>
						</div>

						<div class="item item-search">
							<div class="media-thumb">
								<div class="media-text">
									<h3>
										<i class="fa-solid fa-money-bill"></i> Vé giá 300k / 1 người
									</h3>
									<p class="location">
										<i class="fa-solid fa-location-dot"></i> Thái Bình - Lăng Bác
										- Quốc Tử Giám - Làng Nghề Gốm Bát Tràng
									</p>
									<a href="#" class="btn btn-success btn-tour-item"
										style="margin-top: 30px;">Click để xem chi tiết</a>
								</div>
								<img src="images/hero-slider-1.jpg" alt="Image"
									class="img-fluid">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="untree_co-section count-numbers py-5">
			<div class="container">
				<div class="row" style="text-align: center;">
					<div class="col-6 col-sm-6 col-md-6 col-lg-3">
						<div class="counter-wrap">
							<div class="counter">
								<span class="" data-number="7313">0</span>
							</div>
							<span class="caption">Chuyến đi</span>
						</div>
					</div>
					<div class="col-6 col-sm-6 col-md-6 col-lg-3">
						<div class="counter-wrap">
							<div class="counter">
								<span class="" data-number="8492">0</span>
							</div>
							<span class="caption">Lượt khách</span>
						</div>
					</div>
					<div class="col-6 col-sm-6 col-md-6 col-lg-3">
						<div class="counter-wrap">
							<div class="counter">
								<span class="" data-number="100">0</span>
							</div>
							<span class="caption">Hướng dẫn viên chuyên nghiệp </span>
						</div>
					</div>
					<div class="col-6 col-sm-6 col-md-6 col-lg-3">
						<div class="counter-wrap">
							<div class="counter">
								<span class="" data-number="120">0</span>
							</div>
							<span class="caption">Tour có sẵn</span>
						</div>
					</div>
				</div>
			</div>
		</div>



		<div class="untree_co-section">
			<div class="container">
				<div class="row text-center justify-content-center mb-5">
					<div class="col-lg-7">
						<h2 class="section-title text-center mb-3"
							style="font-size: 45px !important; font-weight: bold;"
							data-aos="fade-left" data-aos-duration="1200">Điểm đến yêu
							thích</h2>
					</div>
				</div>

				<div class="owl-carousel owl-3-slider">

					<div class="item" data-aos="fade-up" data-aos-duration="1000">
						<a class="media-thumb" href="danhmuc.html">
							<div class="media-text">
								<h3>Lăng Bắc</h3>
								<span class="location">Hà Nội</span>
							</div> <img src="images/hero-slider-1.jpg" alt="Image"
							class="img-fluid">
						</a>
					</div>

					<div class="item" data-aos="fade-up" data-aos-duration="1000">
						<a class="media-thumb" href="danhmuc.html">
							<div class="media-text">
								<h3>Ba Vì</h3>
								<span class="location">Hà Nội</span>
							</div> <img src="images/hero-slider-2.jpg" alt="Image"
							class="img-fluid">
						</a>
					</div>

					<div class="item" data-aos="fade-up" data-aos-duration="1000">
						<a class="media-thumb" href="danhmuc.html">
							<div class="media-text">
								<h3>Phố cổ Hội An</h3>
								<span class="location">Quảng Nam</span>
							</div> <img src="images/hero-slider-3.jpg" alt="Image"
							class="img-fluid">
						</a>
					</div>


					<div class="item" data-aos="fade-up" data-aos-duration="1000">
						<a class="media-thumb" href="danhmuc.html">
							<div class="media-text">
								<h3>Chùa Bái Đính</h3>
								<span class="location">Ninh Bình</span>
							</div> <img src="images/hero-slider-4.jpg" alt="Image"
							class="img-fluid">
						</a>
					</div>

					<div class="item" data-aos="fade-up" data-aos-duration="1000">
						<a class="media-thumb" href="danhmuc.html">
							<div class="media-text">
								<h3>Vịnh Hạ Long</h3>
								<span class="location">Quảng Ninh</span>
							</div> <img src="images/hero-slider-5.jpg" alt="Image"
							class="img-fluid">
						</a>
					</div>

					<div class="item" data-aos="fade-up" data-aos-duration="1200">
						<a class="media-thumb" href="danhmuc.html">
							<div class="media-text">
								<h3>Phú Quốc</h3>
								<span class="location">Kiên Giang</span>
							</div> <img src="images/hero-slider-2.jpg" alt="Image"
							class="img-fluid">
						</a>
					</div>

				</div>

			</div>
		</div>

		<div class="untree_co-section">
			<div class="container">
				<div class="row justify-content-center text-center mb-5">
					<div class="col-lg-6">
						<h2 class="section-title text-center mb-3"
							style="font-weight: bold; font-size: 45px !important;"
							data-aos="fade-right" data-aos-duration="1000">Ưu đãi đặc
							biệt &amp; Giảm giá</h2>
						<p>Các tour đến tham qun du lịch Hà Nội, Nha Trang, Phú Quốc
							cho mùa hè này</p>
					</div>
				</div>
				<div class="row" data-aos="fade-right" data-aos-duration="1200">
					<div class="col-6 col-sm-6 col-md-6 col-lg-3 mb-4 mb-lg-0">
						<div class="media-1">
							<a href="#" class="d-block mb-3"><img
								src="images/hero-slider-1.jpg" alt="Image" class="img-fluid"></a>
							<span class="d-flex align-items-center loc mb-2"> <span
								class="icon-room mr-3"></span> <span>Hà Nội</span>
							</span>
							<div class="d-flex align-items-center">
								<div>
									<h3>
										<a href="#">Lăng Bác</a>
									</h3>
									<div class="price ml-auto">
										<span>-20%</span>
									</div>
								</div>

							</div>

						</div>
					</div>
					<div class="col-6 col-sm-6 col-md-6 col-lg-3 mb-4 mb-lg-0">
						<div class="media-1">
							<a href="#" class="d-block mb-3"><img
								src="images/hero-slider-2.jpg" alt="Image" class="img-fluid"></a>
							<span class="d-flex align-items-center loc mb-2"> <span
								class="icon-room mr-3"></span> <span>Hà Nội</span>
							</span>
							<div class="d-flex align-items-center">
								<div>
									<h3>
										<a href="#">Hồ Gươm</a>
									</h3>
									<div class="price ml-auto">
										<span>-10%</span>
									</div>
								</div>

							</div>

						</div>
					</div>
					<div class="col-6 col-sm-6 col-md-6 col-lg-3 mb-4 mb-lg-0">
						<div class="media-1">
							<a href="#" class="d-block mb-3"><img
								src="images/hero-slider-3.jpg" alt="Image" class="img-fluid"></a>
							<span class="d-flex align-items-center loc mb-2"> <span
								class="icon-room mr-3"></span> <span>Quảng Nam</span>
							</span>
							<div class="d-flex align-items-center">
								<div>
									<h3>
										<a href="#">Phố cổ Hội An</a>
									</h3>
									<div class="price ml-auto">
										<span>-30%</span>
									</div>
								</div>

							</div>

						</div>
					</div>
					<div class="col-6 col-sm-6 col-md-6 col-lg-3 mb-4 mb-lg-0">
						<div class="media-1">
							<a href="#" class="d-block mb-3"><img
								src="images/hero-slider-4.jpg" alt="Image" class="img-fluid"></a>

							<span class="d-flex align-items-center loc mb-2"> <span
								class="icon-room mr-3"></span> <span>Kiên Giang</span>
							</span>

							<div class="d-flex align-items-center">
								<div>
									<h3>
										<a href="#">Phú Quốc</a>
									</h3>
									<div class="price ml-auto">
										<span>giảm 100k cho mỗi vé</span>
									</div>
								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="untree_co-section testimonial-section mt-5">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-7 text-center">
						<h2 class="section-title text-center mb-5">Phản hồi</h2>

						<div class="owl-single owl-carousel no-nav">
							<div class="testimonial mx-auto">
								<figure class="img-wrap">
									<img src="images/person_2.jpg" alt="Image" class="img-fluid">
								</figure>
								<h3 class="name">Nguyễn Quỳnh Anh</h3>
								<blockquote>
									<p>&ldquo;Tôi đã tham gia một chuyến du lịch ở Việt Nam
										cùng với đoàn của công ty du lịch ABC. Tôi rất hài lòng với
										dịch vụ tour vì các hướng dẫn viên rất chuyên nghiệp và thân
										thiện. Họ đã giúp tôi và đoàn của tôi khám phá những địa điểm
										đẹp và thú vị nhất của Việt Nam.&rdquo;</p>
								</blockquote>
							</div>

							<div class="testimonial mx-auto">
								<figure class="img-wrap">
									<img src="images/person_3.jpg" alt="Image" class="img-fluid">
								</figure>
								<h3 class="name">Nguyễn Quốc Anh</h3>
								<blockquote>
									<p>&ldquo;Tôi cảm thấy rất an tâm vì họ đã giải đáp cho tôi
										mọi thắc mắc và đưa ra những lời khuyên hữu ích. Không chỉ
										vậy, các hoạt động và trải nghiệm cũng rất thú vị và đáng nhớ.
										Tôi sẽ chắc chắn giới thiệu dịch vụ cho bạn bè và người thân
										của mình nếu họ muốn thăm Việt Nam.&rdquo;</p>
								</blockquote>
							</div>

							<div class="testimonial mx-auto">
								<figure class="img-wrap">
									<img src="images/person_4.jpg" alt="Image" class="img-fluid">
								</figure>
								<h3 class="name">Nguyễn Quỳnh Anh</h3>
								<blockquote>
									<p>&ldquo;Là một hướng dẫn viên, tôi sẽ luôn sẵn sàng giúp
										các bạn trả lời mọi thắc mắc và đưa ra những lời khuyên hữu
										ích để chuyến du lịch của các bạn trở nên thật tuyệt
										vời.&rdquo;</p>
								</blockquote>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>

		<div class="untree_co-section">
			<div class="container">
				<div class="row justify-content-between align-items-center">

					<div class="col-lg-6">
						<figure class="img-play-video">
							<a id="play-video" class="video-play-button"
								href="https://www.youtube.com/watch?v=Au6LqK1UH8g" data-fancybox>
								<span></span>
							</a>
							<img src="images/hero-slider-2.jpg" alt="Image"
								class="img-fluid rounded-20">
						</figure>
					</div>

					<div class="col-lg-5">
						<h2 class="section-title text-left mb-4"
							style="font-weight: bold; font-size: 40px !important;"
							data-aos="fade-right" data-aos-duration="1000">Hành trình
							cùng SkyTour</h2>
						<p data-aos="fade-up" data-aos-duration="1200">Du lịch Việt
							Nam là một hành trình thú vị và đầy khám phá. Với những nét đẹp
							tự nhiên hùng vĩ, văn hóa đa dạng và những trải nghiệm độc đáo,
							Việt Nam đã trở thành một điểm đến hấp dẫn cho các du khách từ
							khắp nơi trên thế giới. Để có một chuyến du lịch tuyệt vời, các
							hướng dẫn viên chuyên nghiệp sẽ giúp bạn khám phá và tìm hiểu tất
							cả những điều thú vị mà đất nước Việt Nam mang lại.</p>

						<p data-aos="fade-up" data-aos-duration="1200" class="mb-4">Ngoài
							ra, các hướng dẫn viên của SkyTour còn giúp bạn giải đáp các thắc
							mắc và đưa ra những lời khuyên hữu ích về an toàn và các quy định
							địa phương. Họ cũng sẽ giúp bạn đàm phán với các nhà cung cấp
							dịch vụ và giải quyết các vấn đề nếu có.</p>

						<ul data-aos="fade-up" data-aos-duration="1200"
							class="list-unstyled two-col clearfix">
							<li>Hoạt động giải trí ngoài trời</li>
							<li>Hãng hàng không</li>
							<li>Cho thuê ô tô</li>
							<li>Du thuyền</li>
							<li>Khách sạn</li>
							<li>Đường sắt</li>
							<li>Travel Insurance</li>
							<li>Gói du lịch</li>
							<li>Bảo hiểm</li>
							<li>Sách hướng dẫn</li>
						</ul>

						<p data-aos="fade-up" data-aos-duration="1200">
							<a href="#" class="btn btn-primary">Bắt đầu</a>
						</p>


					</div>
				</div>
			</div>
		</div>


		<!-- lienhengay -->
		<jsp:include page="/WEB-INF/views/customer/layout/contact.jsp"></jsp:include>
		<!-- /lienhengay -->
		
		<jsp:include page="/WEB-INF/views/customer/layout/footer.jsp"></jsp:include>
		<div id="overlayer"></div>
		<div class="loader">
			<div class="spinner-border" role="status">
				<span class="sr-only">Loading...</span>
			</div>
		</div>
	</div>

	<jsp:include page="/WEB-INF/views/customer/layout/js.jsp"></jsp:include>

</body>

</html>