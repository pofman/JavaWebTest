/**
 * Created by martinmendez on 4/17/17.
 */
$.ajax({
    url: 'http://localhost:8080/api/events',
    method: 'GET',
    success: function (data){
        $.each(data, function (index, event) {
            $('#events').append($('<li>').append($('<span>').append('Event Name: ' + event.name)))
        })
    }
});
