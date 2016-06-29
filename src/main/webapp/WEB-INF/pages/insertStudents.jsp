<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<spring:url value="/resources/css/foundation.min.css"
	var="foundationCss" />
<spring:url value="/resources/js/vendor/jquery.js" var="jqueryJs" />
<spring:url value="/resources/js/foundation.min.js" var="foundationJs" />

<link href="${foundationCss}" rel="stylesheet" />
<script src="${jqueryJs}"></script>
<script src="${foundationJs}"></script>

<title>Insert Students</title>
</head>
<body>
	<spring:url value="/saveStudent" var="userActionUrl" />

	<form:form class="form-horizontal" method="post" 
                modelAttribute="studentForm" action="${userActionUrl}">
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">First Name</label>
					</div>
					<div class="small-9 columns">
						<form:input path="firstName" type="text" id="right-label"
							placeholder="First Name"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Last Name</label>
					</div>
					<div class="small-9 columns">
						<form:input path="lastName" type="text" id="right-label"
							placeholder="Last Name"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Date Of Birth</label>
					</div>
					<div class="small-9 columns">
						<form:input path="dob" type="text" id="right-label"
							placeholder="Date Of Birth"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Email</label>
					</div>
					<div class="small-9 columns">
						<form:input path="email" type="text" id="right-label"
							placeholder="Email"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="small-8">
				<div class="row">
					<div class="small-3 columns">
						<label for="right-label" class="right">Courses</label>
					</div>
					<div class="small-9 columns">
						<%-- <c:forEach var="course" items="${coursesList}">
						<form:checkbox path="courses" id="checkbox1" name="${coursesList}"/><label for="checkbox1">${course.courseName}</label>
                    </c:forEach> --%>
                    
	                     <c:forEach var="course" items="${coursesList}">
						    <span class="checkbox"><form:checkbox path="courses" value="${course.courseName}"/>${course.courseName}</span>
						</c:forEach>
                    
                     <%-- <form:checkboxes path="courses" items="${coursesList}" 
                                 element="label class='checkbox-inline'" />  --%>
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
						<button type="submit" class="btn-lg btn-primary pull-right">Save Student
                             </button>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>