$().ready(function() {
	$("#myForm").validate({
		rules: {
			first: {
				required: true,
				minlength: 2
			},
			last: {
				required: true,
				minlength: 2
			},
			age: {
				required: true,
				number: true
			}
		},
		messages: {
			first: {
				required: "Please enter your firstname",
				minlength: "Your firstname must consist of at least 2 characters"
			},
			last: {
				required: "Please enter your lastname",
				minlength: "Your lastname must consist of at least 2 characters"
			},
			age: {
				required: "Please enter your age",
				number: "Your age must consist of a number"
			}
		}
	});
});