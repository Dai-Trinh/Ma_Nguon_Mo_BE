<!-- sử dụng tiếng việt -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- import JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script src="${base}/js/jquery-3.4.1.min.js"></script>
<script src="${base}/js/popper.min.js"></script>
<script src="${base}/js/bootstrap.min.js"></script>
<script src="${base}/js/owl.carousel.min.js"></script>
<script src="${base}/js/jquery.animateNumber.min.js"></script>
<script src="${base}/js/jquery.waypoints.min.js"></script>
<script src="${base}/js/jquery.fancybox.min.js"></script>
<script src="${base}/js/aos.js"></script>
<script src="${base}/js/moment.min.js"></script>
<script src="${base}/js/daterangepicker.js"></script>

<script src="${base}/js/typed.js"></script>
<script>
		$(function () {
			var slides = $('.slides'),
				images = slides.find('img');

			images.each(function (i) {
				$(this).attr('data-id', i + 1);
			})

			var typed = new Typed('.typed-words', {
				strings: [" Hà Nội.", " Vịnh Hạ Long.", " Ninh Bình.", " SaPa.", " Đông Tây Bắc."],
				typeSpeed: 80,
				backSpeed: 80,
				backDelay: 4000,
				startDelay: 1000,
				loop: true,
				showCursor: true,
				preStringTyped: (arrayPos, self) => {
					arrayPos++;
					console.log(arrayPos);
					$('.slides img').removeClass('active');
					$('.slides img[data-id="' + arrayPos + '"]').addClass('active');
				}

			});
		})
		// lấy giá trị list tour sang input
		var container = document.querySelector('.container-list');
		var myInput = document.querySelector('#search-tour');

		container.addEventListener('click', function (event) {
			if (event.target.classList.contains('clickable')) {
				var value = event.target.textContent;
				myInput.value = value;
			}
		});
		// lấy giá trị list tour sang input

		// đóng collaspe
		var containerCha = document.querySelector('#myContainer');
		var collapses = document.querySelectorAll('.collapse');

		containerCha.addEventListener('click', function(event) {
  		collapses.forEach(function(collapse) {
    	if (event.target != collapse && !collapse.contains(event.target)) {
     		 collapse.classList.remove('show');
    	}
 		 });
		});
		// đóng collaspe

	</script>

<script src="${base}/js/custom.js"></script>
<script>
		const box = document.querySelector('.title-tour-sale-main');
		const boxTwo = document.querySelector('.content-tour-sale-main');
		const boxThree = document.querySelector('.title-tour-summer-main');
		const boxFour = document.querySelector('.content-tour-summer-main');
		const boxFive = document.querySelector('.list-tour-summer-main');

		window.addEventListener('scroll', () => {
			const boxTop = box.getBoundingClientRect().top;
			const boxTwoTop = boxTwo.getBoundingClientRect().top;
			const boxThreeTop = boxThree.getBoundingClientRect().top;
			const boxFourTop = boxFour.getBoundingClientRect().top;
			const boxFiveTop = boxFour.getBoundingClientRect().top;
			// const boxBottom = box.getBoundingClientRect().bottom;

			if (boxTop < window.innerHeight - 100) {
				box.classList.add('aos-animate');
			} else {
				box.classList.remove('aos-animate');
			}
			if (boxTwoTop < window.innerHeight - 80) {
				boxTwo.classList.add('aos-animate');
			} else {
				boxTwo.classList.remove('aos-animate');
			}
			if (boxThreeTop < window.innerHeight - 100) {
				boxThree.classList.add('aos-animate');
			} else {
				boxThree.classList.remove('aos-animate');
			}
			if (boxFourTop < window.innerHeight - 100) {
				boxFour.classList.add('aos-animate');
			} else {
				boxFour.classList.remove('aos-animate');
			}
			if (boxFiveTop < window.innerHeight - 100) {
				boxFive.classList.add('aos-animate');
			} else {
				boxFive.classList.remove('aos-animate');
			}
		});
	</script>