$('.form-control').on('keyup', function () {
    let x = $(this).val().toLowerCase();

    $('#stable tbody tr').filter(function () {
        $(this).toggle(
            $(this).find('td:eq(0)').text().toLowerCase().includes(x) || $(this).find('td:eq(3)').text().includes(x)

        );
    });
});