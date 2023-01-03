<%-- 
    Document   : index
    Created on : 16-Feb-2021, 12:47:02 PM
    Author     : Mohammad Tauheed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index Page</title>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <div class="optanon-alert-box-wrapper" role="alertdialog" style="bottom:0px;">
            <div class="optanon-alert-box-bottom-top"></div>
            <div class="optanon-alert-box-bg">
                <div class="optanon-alert-box-logo"></div>

            </div>
        </div>
        <div class="modern" id="optanon">
            <div id="optanon-popup-bg"></div>
        </div>
        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
            </div>

            <div class="caption">
                <div class="container">
                    <div class="row">
                        <div class="carousel-item active">
                            <img src="img/pexels-photo-1181675.jpeg" class="d-block w-100" alt="...">
                            <div class="col-lg-6 col-md-6 col-sm-12">
                                <h3 class="h2-heading white-color mb-xs-10">Cloud | SAP Solution Architecture</h3>
                                <p>Swipe/click for more</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="img/pexels-photo-572056.jpeg" class="d-block w-100" alt="...">
                            <div class="col-lg-6 col-md-6 col-sm-12">
                                <h3 class="h2-heading white-color mb-xs-10">SAP on Cloud | SAP S/4HANA | SAP HANA</h3>
                                <p>Some representative placeholder content for the second slide.</p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="img/automation-software-technology-process-system-business-concept-97939148.jpg" class="d-block w-100" alt="...">
                            <div class="col-lg-6 col-md-6 col-sm-12">
                                <h3 class="h2-heading white-color mb-xs-10">Upgrade | Implementation | Migration</h3>
                                <p></p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="img/pexels-pixabay-373543.jpg" class="d-block w-100" alt="...">
                            <div class="col-lg-6 col-md-6 col-sm-12">
                                <h3 class="h2-heading text-primary mb-xs-10">Digital | Analytics | Automation | IoT</h3>
                                <p></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"  data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"  data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        <hr>

        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/img.jpg" alt="First slide">
                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color text-center mb-xs-10">Artificial Intelligence | Machine Learning</h3>
                        <p></p>
                    </div>
                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/serverjpg.jpg" alt="First slide">
                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color mb-xs-10">Big Data | Blockchain</h3>
                        <p></p>
                    </div>
                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/pexels-prateek-katyal-2740956.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color mb-xs-10">Training | Recruitment | Internship </h3>
                        <p></p>
                    </div>

                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/pexels-markus-spiske-177598.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color mb-xs-10">Program & Project Management | Proposal & Bid management | Architecture Blueprinting | Fit/Gap analysis</h3>
                        <p></p>
                    </div>
                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/pexels-thisisengineering-3862627.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color mb-xs-10">SAP & Legacy Integration | Technical Landscape Design | Presales | Technical Testing | Training</h3>
                        <p></p>
                    </div>

                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/newdown.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color mb-xs-10">Resource Allocation & Management | Financials-Profit-Accruals-Invoicing Management </h3>
                        <p></p>
                    </div>

                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/pexels-pixabay-373543.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h5 class="h2-heading white-color mb-xs-10">Client Facing & Excellent Presentation Skills | Experience working in US, EU, APAC, ME regions </h5>
                        <p></p>
                    </div>

                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/pexels-pixabay-356056.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading white-color mb-xs-10">Outsourcing | Technical Interviewing | Offshore transition </h3>
                        <p></p>
                    </div>

                </div>
            </div>
        </div>
        <hr>
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="img/pexels-thorsten-technoman-338515.jpg" alt="First slide">

                    <div class="col-lg-6 col-md-6 col-sm-12">
                        <h3 class="h2-heading text-secondary mb-xs-10">Experience in industries like healthcare, pharmaceutical, manufacturing, logistics and distribution with designing, building and managing their complex SAP workloads & ECO systems distributed globally. </h3>
                        <p></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="bg-dark">
            <%@include file="footer.jsp"%>
        </div>
    </body>
</html>
