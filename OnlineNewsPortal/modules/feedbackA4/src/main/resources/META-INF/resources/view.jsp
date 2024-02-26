<%@ include file="init.jsp" %>


<!--  Using Render URL -->

<portlet:renderURL var="goMain">
  <portlet:param name="jspPage" value="/feedback.jsp"/>
</portlet:renderURL>

<h1> FeedBack</h1>

<a href="<%=goMain%>">Add New Feedback</a>