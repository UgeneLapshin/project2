/**
 * Created by apple on 19.04.15.
 */
$(document).ready(function () {
    $("#addAccount").click(function () {
        $.ajax(
            {
                url: "/account/create",
                type: "POST",
                data: {
                    firstName: $("input[name='firstName']").val(),
                    lastName: $("input[name='lastName']").val(),
                    email: $("input[name='email']").val(),
                    password: $("input[name='password']").val()
                },
                success: function (data) {
                    window.location = "/account";
                }
            })
    })

});