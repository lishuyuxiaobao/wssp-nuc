jQuery(document).ready(function($) {
	$("#open-sb").on('click', function() {
	        if ($("#sidebar").offset().left == -200) {
		        $("#sidebar").css('left', '0');
				$(".menu-button").css('background', 'url(../img/leftarrow.png) no-repeat center/cover');

			} else {
				$("#sidebar").css('left', '-200px');
				$(".menu-button").css('background', 'url(../img/rightarrow.png) no-repeat center/cover');

			}
		});
        $(document).on('click', function() {
			if ($("#sidebar").offset().left == 0) {
				$("#sidebar").css('left', '-200px');
				$(".menu-button").css('background', 'url(../img/rightarrow.png) no-repeat center/cover');

			}
		});
		$("#sidebar").on('click', function() {
				$("#sidebar").css('left', '0');
			}); 
	});