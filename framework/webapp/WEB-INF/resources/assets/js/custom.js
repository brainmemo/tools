//include html parts
function includeHtml() {
    let includes = $('[data-include]');
    $.each(includes, function () {
        let include_element = $(this);

        $.ajax({
            url: $(include_element).data('include'),
            type: 'GET',
            crossDomain: true,
            success: function (res) {
                $(include_element).html(res);
            },
            error: function (res) {
                alert('Load some includes failed');
                console.log(res);
            }
        });
    });
}

includeHtml();

// for handle side nav to be shown or not
function toggle_sidenav() {
    if ($('#sidenav').css('left') == '-250px') {
        $('#sidenav').css('left', '0');
        $('.can_have_sidenav').css('margin-left', '250px');
    } else {
        $('#sidenav').css('left', '-250px');
        $('.can_have_sidenav').css('margin-left', '0');
    }
}

//highlight current page in sienav
$.when(includeHtml()).then(function () {
    setTimeout(function () {
        $('div').find('#sidenav').find('a').each(function () {
            if ($(this).prop('href').split('?')[0] == window.location.href.split('?')[0].split('#')[0]) {
                $(this).addClass('this-page');
            }
        });
    }, 1);
});


//handle sidenav dropdowns
$('div').on('click', '.dropdown-btn', function () {
    this.classList.toggle("active");
    var dropdownContent = this.nextElementSibling;
    if (dropdownContent.style.display === "none") {
        dropdownContent.style.display = "block";
    } else {
        dropdownContent.style.display = "none";
    }
});


// handles theme color scheme
function setCookie(name, value, days) {
    var expires = "";
    if (days) {
        var date = new Date();
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        expires = "; expires=" + date.toUTCString();
    }
    document.cookie = name + "=" + (value || "") + expires + "; path=/";
}

function getCookie(name) {
    var nameEQ = name + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') c = c.substring(1, c.length);
        if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length, c.length);
    }
    return null;
}

function changeColorScheme(color) {
    $('#theme-css-file').remove();

    if (color == 'default')
        return;

    $('head').append('<link rel="stylesheet" href="./resources/assets/css/themes/' + color + '.css" type="text/css" id="theme-css-file" />');
}

$('.btn-change-theme').click(function () {
    setCookie('theme-color-schemas', $(this).data('scheme'), 30);
    changeColorScheme($(this).data('scheme'));
});

changeColorScheme(getCookie('theme-color-schemas'));
