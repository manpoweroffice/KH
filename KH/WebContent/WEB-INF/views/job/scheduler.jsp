<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='../resources/js/fullcalendar.css' rel='stylesheet' />
<link href='../resources/js/fullcalendar.print.css' rel='stylesheet' media='print' />
<script src='../resources/js/moment.min.js'></script>
<script src='../resources/js/jquery.min.js'></script>
<script src='../resources/js/fullcalendar.min.js'></script>
<script src='../resources/js/locale-all.js'></script>
<script>

	$(document).ready(function() {
		
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
			selectable:true,
			selectHelper:true,
			select: function(start){
				window.open("/KH/jun/job/writescheduler.do","일정등록","toolbar=no,location=no,menubar=no,scrollbars=no,resizable=no,width=600,height=700");
			calendar.fullCalendar('unselect');
			},
			events:function(star,end,callback){
				$.ajax({
					
				});
			}
		});
		
	});

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
