<%@ include file="init.jsp" %>

<p>
  <b><liferay-ui:message key="newsportalfeedback.caption"/></b>
</p>
<!--  Using action URL  -->

<portlet:actionURL name="feedback" var="feedbackactionURL" />


<form method="post" action="<%=feedbackactionURL%>">

Feedback Subject(Required): <input type="text" name='<portlet:namespace/>myfeedback'/>
  

  <input type="submit"/>
</form>
<br><br>

<!--  Using Render URL -->

<portlet:renderURL var="gotofeedback">
  <portlet:param name="jspPage" value="/view.jsp"/>
</portlet:renderURL>
<a href="<%=gotofeedback%>">Feedback</a>