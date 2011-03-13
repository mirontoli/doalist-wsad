/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

(function($) {
    $(document).ready(function() {
        $('input.timeInput').timeEntry({ //thanks to http://keith-wood.name/timeEntry.html
            beforeShow: customRangeTime,
            spinnerImage: 'img/spinnerText.png',
            spinnerSize: [30, 20, 8],
            spinnerBigSize: [60, 40, 16]
        });
        $('.dateInput').dateEntry({beforeShow: customRange}); 
       
        $(':reset').click(function() { //see page 46 in jQuery cookbook
            return confirm('Do you really want to clear all fields?');
        });
        $('#btnRemove').click(function() {
            return confirm('Do you really want to remove this/these todos?');
        });
        $('btnCancel').click(function() {
            window.location.href='app';
        });
        
        $('#newTodoForm, #loginForm').validate();
        
        $('#registerForm').validate({//http://docs.jquery.com/Plugins/Validation
            rules: {
                password: {
                    required: true,
                    minlength: 5
                },
                confirmPassword: {
                    equalTo: "#password"
                },
                confirmEmail: {
                    equalTo: "#email"
                }
            }
        });
        $("#username").focus();
        $("#todolist tr:odd").addClass("odd");
        $('#todolist input[type=checkbox]').change(function() {
        	if($('#todolist input[type=checkbox]:checked').length != 0) {
        		$('#btnRemove, #btnUnmark').removeAttr("disabled");
        	}
        	else {
        		$('#btnRemove, #btnUnmark').attr("disabled", "disabled");
        	}
        });
        $('#todolist #btnUnmark').click(function() {
        	$('#btnRemove').attr("disabled", "disabled");
        });
    });
})(jQuery);
function customRange(input) { 
    return {minDate: (input.id == 'dTo' ? 
        $('#dFrom').dateEntry('getDate') : null),  
        maxDate: (input.id == 'dFrom' ? 
        $('#dTo').dateEntry('getDate') : null)}; 
}
function customRangeTime(input) {
	if(document.getElementById("dFrom").value == document.getElementById("dTo").value) {
		return {minTime: (input.id == 'tTo' ? 
        $('#tFrom').timeEntry('getTime') : null), 
        maxTime: (input.id == 'tFrom' ? 
        $('#tTo').timeEntry('getTime') : null)}; 
	}
}