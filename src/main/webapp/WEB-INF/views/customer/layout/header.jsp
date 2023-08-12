<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- import JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="hero">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-lg-7">
				<div class="intro-wrap">
					<h1 class="mb-5">
						<span class="d-block">Cùng nhau trải nghiệm </span> những chuyến
						đi <span class="typed-words"></span>
					</h1>

					<div class="row">
						<div class="col-12">
							<form class="form">
								<div class="row mb-2">
									<div class="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-4">
										<!-- <input type="text" class="form-control" name="daterange"> -->
										<select name="" id="province"
											class="form-control custom-select">
											<option value="">Điểm xuất phát</option>
											<option value="All">Tất cả</option>
											<option value="HaNoi">Hà Nội</option>
											<option value="DaNang">Đà Nẵng</option>
											<option value="HoChiMinh">Hồ Chí Minh</option>
										</select>
									</div>
									<div class="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-6">
										<!-- <input type="text" class="form-control" name="daterange"> -->
										<input type="text" id="search-tour"
											class="form-control form-control-plaintext"
											placeholder="Tìm tour du lịch..." style="padding-left: 10px;">
									</div>
									<div
										class="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-2 wrapper-filter">
										<a href="#demo" data-toggle="collapse" class="filter"
											style="display: block;"> <i class="fa-solid fa-sliders"></i>
										</a>
										<div class="wrapper-category-list collapse container-list"
											id="demo">
											<table
												class="table table-list-category table-dark table-hover">
												<tbody>
													<tr>
														<td><span class="clickable" data-value="1"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Vịnh Hạ
																Long</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i>Du lịch Hà Nội</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Hải Phòng</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
													<tr>
														<td><span class="clickable" data-value="2"><i
																style="padding-right: 10px;"
																class="fa-solid fa-mountain-sun"></i> Du lịch Phú Quốc</span></td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
								</div>
								<div class="row align-items-center">
									<div class="col-sm-12 col-md-6 mb-3 mb-lg-0 col-lg-4">
										<input type="submit" class="btn btn-primary btn-block"
											value="Tìm kiếm tour">
									</div>
									<div class="col-lg-8">
										<label class="control control--checkbox mt-3"> <span
											class="caption">Lưu tìm kiếm</span> <input type="checkbox"
											checked="checked" />
											<div class="control__indicator"></div>
										</label>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-5">
				<div class="slides">
					<img src="${base}/img/hero-slider-1.jpg" alt="Image"
						class="img-fluid active"> <img
						src="${base}/img/hero-slider-2.jpg" alt="Image" class="img-fluid">
					<img src="${base}/img/hero-slider-3.jpg" alt="Image"
						class="img-fluid"> <img src="${base}/img/hero-slider-4.jpg"
						alt="Image" class="img-fluid"> <img
						src="${base}/img/hero-slider-5.jpg" alt="Image" class="img-fluid">
				</div>
			</div>
		</div>
	</div>
</div>
