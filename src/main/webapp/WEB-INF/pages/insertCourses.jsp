<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<spring:url value="/resources/css/foundation.min.css" var="foundationCss" />
	<spring:url value="/resources/js/vendor/jquery.js" var="jqueryJs" />
	<spring:url value="/resources/js/foundation.min.js" var="foundationJs" />
	
	<link href="${foundationCss}" rel="stylesheet" />
    <script src="${jqueryJs}"></script>
    <script src="${foundationJs}"></script>
    
    <title>Insert Courses</title>
</head>
<body>
<spring:url value="/saveCourse" var="userActionUrl" />

	<form:form class="form-horizontal" method="post" 
                modelAttribute="courseForm" action="${userActionUrl}">
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Course Name</label>
					</div>
					<div class="small-9 columns">
						<form:input path="courseName" type="text" id="right-label"
							placeholder="Course Name"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Course Start Date</label>
					</div>
					<div class="small-9 columns">
						<form:input path="startDate" type="text" id="right-label"
							placeholder="Course Start Date"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Course Description</label>
					</div>
					<div class="small-9 columns">
						<form:input path="description" type="text" id="right-label"
							placeholder="Course Description"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Course Hours</label>
					</div>
					<div class="small-9 columns">
						<form:input path="noOfHours" type="text" id="right-label"
							placeholder="Course Hours"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Course Credits</label>
					</div>
					<div class="small-9 columns">
						<form:input path="noOfCredits" type="text" id="right-label"
							placeholder="Course Credits"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right"></label>
					</div>
					<div class="small-9 columns">
						<button type="submit" class="btn-lg btn-primary pull-right">Save Course
                             </button>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>