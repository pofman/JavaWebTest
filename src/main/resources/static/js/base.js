/**
 * Created by martinmendez on 4/17/17.
 */
function refreshEventList() {
    $('#events').empty();

    $.ajax({
        url: 'http://localhost:8080/api/events',
        method: 'GET',
        success: function (data){
            $.each(data, function (index, event) {
                $('#events').append($('<li>').append($('<span>').append('Event Name: ' + event.name)))
            })
        }
    });
}

$(function() {
    refreshEventList();


    $('#save').click(function(e) {
        e.preventDefault();

        var event = {
            name: $('#name').val(),
            venue: {
                name: $('input[id="venue.name"]').val()
            }};

        $.ajax({
            url:'/api/event',
            method: 'POST',
            contentType: "application/json",
            data: JSON.stringify(event),
            success: function(response) {
                refreshEventList();
            },
            error: function(error){
                alert(error);
            }
        });
    })
})
