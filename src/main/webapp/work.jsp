<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Work</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<!-- Fonts-->
		<link rel="stylesheet" type="text/css" href="assets/fonts/fontawesome/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="assets/fonts/pe-icon/pe-icon.css">
		<!-- Vendors-->
		<link rel="stylesheet" type="text/css" href="assets/vendors/bootstrap/grid.css">
		<link rel="stylesheet" type="text/css" href="assets/vendors/magnific-popup/magnific-popup.min.css">
		<link rel="stylesheet" type="text/css" href="assets/vendors/swiper/swiper.css">
		<!-- App & fonts-->
		<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700|Open+Sans:400,700">
		<link rel="stylesheet" type="text/css" id="app-stylesheet" href="assets/css/main.css"><!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		<![endif]-->
	</head>
	
	<body>
		<div class="page-wrap" id="root">
			
			<!-- header -->
			<header class="header header--fixed">
				<div class="header__inner">
					<div class="header__logo"><a href="index.jsp"><img src="assets/img/gsitm.jpg" alt="" style="width: 122px;"/></a></div>
					<div class="navbar-toggle" id="fs-button">
						<div class="navbar-icon"><span></span></div>
					</div>
				</div>
				
				<!-- fullscreenmenu__module -->
				<div class="fullscreenmenu__module" trigger="#fs-button">
					
					<!-- overlay-menu -->
					<nav class="overlay-menu">
						
						<!--  -->
						<ul class="wil-menu-list">
							<li class="current-menu-item"><a href="index.jsp">Home</a>
							</li>
							<li><a href="blog.jsp">소개</a>
							</li>
							<li><a href="work.jsp">예약</a>
							</li>
							<li><a href="about.jsp">My Page</a>
							</li>
							<li><a href="contact.jsp">Contact</a>
							</li>
						</ul><!--  -->
						
					</nav><!-- End / overlay-menu -->
					
				</div><!-- End / fullscreenmenu__module -->
				
			</header><!-- End / header -->
			
			<!-- Content-->
			<div class="wil-content">
				
				<!-- Section -->
				<section class="awe-section">
					<div class="container">
						
						<!-- page-title -->
						<div class="page-title pb-40">
							<h2 class="page-title__title">근무지 선택</h2>
							<p class="page-title__text">회의실 및 교육실 예약 전 해당 근무지를 먼저 선택해주세요.</p>
							<div class="page-title__divider"></div>
						</div><!-- End / page-title -->
						
					</div>
				</section>
				<!-- End / Section -->
				
				
				<!-- Section -->
				<section class="awe-section bg-gray">
					<div class="container">
						<div class="grid-css grid-css--masonry" data-col-lg="3" data-col-md="2" data-col-sm="2" data-col-xs="1" data-gap="30">
							<div class="grid__inner">
								<div class="grid-sizer"></div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-slide-bottom -->
													<div class="hoverbox ef-slide-bottom light">
														
														<!-- hb_front -->
														<div class="hb_front"><!--<img src="https://images.pexels.com/photos/807034/pexels-photo-807034.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>-->
																				<img src="assets/img/works/samhwan.jpg"/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">삼환빌딩</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-slide-bottom -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-move-top -->
													<div class="hoverbox ef-move-top light">
														
														<!-- hb_front -->
														<div class="hb_front"><!--<img src="https://images.pexels.com/photos/609687/pexels-photo-609687.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>-->
																					<img src="assets/img/works/gsnam.jpg" />
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">GS 강남타워</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-move-top -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-slide-right -->
													<div class="hoverbox ef-slide-right light">
														
														<!-- hb_front -->
														<div class="hb_front"><!--<img src="https://images.pexels.com/photos/754949/pexels-photo-754949.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>-->
																				<img src="assets/img/works/gsseo.jpg"/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">GS 강서 N타워</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-slide-right -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-slide-left -->
													<div class="hoverbox ef-slide-left light">
														
														<!-- hb_front -->
														<div class="hb_front"><img src="https://images.pexels.com/photos/794578/pexels-photo-794578.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">How to Master Microcopy</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-slide-left -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-zoom-in -->
													<div class="hoverbox ef-zoom-in light">
														
														<!-- hb_front -->
														<div class="hb_front"><img src="https://images.pexels.com/photos/159333/pexels-photo-159333.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">7 UI Choices That Damage UX</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-zoom-in -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-slide-top -->
													<div class="hoverbox ef-slide-top light">
														
														<!-- hb_front -->
														<div class="hb_front"><img src="https://images.pexels.com/photos/290386/pexels-photo-290386.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">3 Essential Design Trends</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-slide-top -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="blog-detail.jsp">
													
													<!-- hoverbox ef-push-top -->
													<div class="hoverbox ef-push-top light">
														
														<!-- hb_front -->
														<div class="hb_front"><img src="https://images.pexels.com/photos/792906/pexels-photo-792906.jpeg?w=1260&amp;h=750&amp;auto=compress&amp;cs=tinysrgb" alt=""/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">The Myth of Ugly Design</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-push-top -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
								<div class="grid-item">
									<div class="grid-item__inner">
										<div class="grid-item__content-wrapper">
											
											<!-- work -->
											<div class="work"><a href="work-detail.jsp">
													
													<!-- hoverbox ef-push-bottom -->
													<div class="hoverbox ef-push-bottom light">
														
														<!-- hb_front -->
														<div class="hb_front"><img src="https://images.pexels.com/photos/789140/pexels-photo-789140.jpeg?h=350&amp;auto=compress&amp;cs=tinysrgb" alt=""/>
														</div><!-- End / hb_front -->
														
														
														<!-- hb_back -->
														<div class="hb_back">
															<h2 class="work__title">Free PSD Files</h2><span class="work__text">View detail</span>
														</div><!-- End / hb_back -->
														
													</div><!-- End / hoverbox ef-push-bottom -->
													</a>
											</div><!-- End / work -->
											
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="awe-text-center mt-50">
							<a class="md-btn md-btn--outline-primary " href="#">more work
							</a>
						</div>
					</div>
				</section>
				<!-- End / Section -->
				
			</div>
			<!-- End / Content-->
			
			<!-- footer -->
			<div class="footer">
				<div class="container">
					<div class="row">
						<div class="col-md-6 col-lg-6 ">
							<p class="footer__coppy">2018 &copy; Copyright <a href="http://awe7.com/">Awe7</a>. All rights Reserved.</p>
						</div>
						<div class="col-md-6 col-lg-6 ">
							<div class="footer__social">
								
								<!-- social-icon -->
								<a class="social-icon" href="#"><i class="social-icon__icon fa fa-facebook"></i>
								</a><!-- End / social-icon -->
								
								
								<!-- social-icon -->
								<a class="social-icon" href="#"><i class="social-icon__icon fa fa-twitter"></i>
								</a><!-- End / social-icon -->
								
								
								<!-- social-icon -->
								<a class="social-icon" href="#"><i class="social-icon__icon fa fa-linkedin"></i>
								</a><!-- End / social-icon -->
								
								
								<!-- social-icon -->
								<a class="social-icon" href="#"><i class="social-icon__icon fa fa-behance"></i>
								</a><!-- End / social-icon -->
								
								
								<!-- social-icon -->
								<a class="social-icon" href="#"><i class="social-icon__icon fa fa-vimeo"></i>
								</a><!-- End / social-icon -->
								
							</div>
						</div>
					</div>
				</div>
			</div><!-- End / footer -->
			
		</div>
		<!-- Vendors-->
		<script type="text/javascript" src="assets/vendors/jquery/jquery.min.js"></script>
		<script type="text/javascript" src="assets/vendors/imagesloaded/imagesloaded.pkgd.js"></script>
		<script type="text/javascript" src="assets/vendors/isotope-layout/isotope.pkgd.js"></script>
		<script type="text/javascript" src="assets/vendors/jquery-one-page/jquery.nav.min.js"></script>
		<script type="text/javascript" src="assets/vendors/jquery.easing/jquery.easing.min.js"></script>
		<script type="text/javascript" src="assets/vendors/jquery.matchHeight/jquery.matchHeight.min.js"></script>
		<script type="text/javascript" src="assets/vendors/magnific-popup/jquery.magnific-popup.min.js"></script>
		<script type="text/javascript" src="assets/vendors/masonry-layout/masonry.pkgd.js"></script>
		<script type="text/javascript" src="assets/vendors/jquery.waypoints/jquery.waypoints.min.js"></script>
		<script type="text/javascript" src="assets/vendors/swiper/swiper.jquery.js"></script>
		<script type="text/javascript" src="assets/vendors/menu/menu.js"></script>
		<script type="text/javascript" src="assets/vendors/typed/typed.min.js"></script>
		<!-- App-->
		<script type="text/javascript" src="assets/js/main.js"></script>
	</body>
</html>