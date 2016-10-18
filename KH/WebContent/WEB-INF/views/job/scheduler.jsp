<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='../resources/js/fullcalendar.css' rel='stylesheet' />
<link href='../resources/js/fullcalendar.print.css' rel='stylesheet' media='print' />
<script src='../resources/js/moment.min.js'></script>
<script src='../resources/js/jquery.min.js'></script>
<script src='../resources/js/jquery-ui.min.js'></script>
<script src='../resources/js/fullcalendar.min.js'></script>
<script src='../resources/js/locale-all.js'></script>
<script>
Date.prototype.yyyymmdd = function()
{
    var yyyy = this.getFullYear().toString();
    var mm = (this.getMonth() + 1).toString();
    var dd = this.getDate().toString();


    return yyyy +'-'+ (mm[1] ? mm : '0'+mm[0]) +'-'+ (dd[1] ? dd : '0'+dd[0]);
}
	$(document).ready(function() {
		$.ajax({
            url:'/KH/jun/job/scheduleList.do',
            type:'post',
            dataType: 'json',
            success: function(args) { 
            setCalendar(args.list);
            },
            error : function(response,txt){
            	//location.href = getContextPath()+"/common/error.do?error="+txt;
            }
        });  

	});
	function setCalendar(data){
		$('#calendar').fullCalendar({
			header: {
				left: 'prev,next today',
				center: 'title',
				right: ''
			},
			locale:'ko',
			navLinks: false, // can click day/week names to navigate views
			editable: false,
			eventLimit: true, // allow "more" link when too many events
			dayClick: function(start,date) {
					str=new Date(start);
				  window.open("/KH/jun/job/writescheduler.do?start="+str.yyyymmdd(),"일정등록","toolbar=no,location=no,menubar=no,scrollbars=no,resizable=yes,width=600,height=700");
			 },
			events: eval(data),
			eventClick:function(calEvent,jsEvent,view){
				 window.open("/KH/jun/job/dtlschedule.do?title="+calEvent.title,"일정수정","toolbar=no,location=no,menubar=no,scrollbars=no,resizable=yes,width=600,height=700");
			}
		});
	}
</script>
<style>

	body {
		margin: 40px 10px;
		padding: 0;
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		font-size: 14px;
	}

	#calendar {
		max-width: 900px;
		margin: 0 auto;
	}

</style>
</head>
<body>

	<div id='calendar'></div>

</body>
</html>
