//////////////////////////////////////////////////
/////       For Loading Datatables    ////////////
//////////////////////////////////////////////////

var table = $('.dataTable-table').DataTable({
    responsive: true,
    keys: true,
    ordering: false,
    scrollY: "25vh",
    paging: false,
    scrollCollapse: true,
}).on('key-focus', function (e, datatable, cell, originalEvent) {
    if ((table.rows().count() - 1) == cell.index().row) {
        table.row.add([table.rows().count() + 1, "", "", "", "", ""]).draw();
    }

    if (cell.index().column == 0) {
        table.keys.move('right');
        return;
    }

    if (cell.index().column == 1 || cell.index().column == 2) {
        let select_id = 'select_' + cell.index().column.toString() + cell.index().row.toString();
        $('.focus').html('<select id="' + select_id + '"></select>');
        enable_select_for_col(select_id);
    } else {
        $('.focus > input').focus();

        if ($('.focus > select').length == 0 && $('.focus > input').length == 0) {
            $('.focus').html('<input class="editable" type="text" value="' + $('.focus').text() + '">');
            $('.editable').focus();
        }
    }
});

$('.dataTable-table').on('keypress', '.editable', function (event) {
    if (event.keyCode == 13) {
        let value = $(this).val();
        $('.focus').html(value);
        table.cell($('.focus')).data(value)
        table.keys.move('right');
    }
}).on('blur', '.editable', function () {
    let cell = $(this).parent('td');
    let value = $(this).val();
    $(cell).html(value);
    table.cell(cell).data(value)
});

//////////////////////////////////////////////////
/////       For Loading select 2    //////////////
//////////////////////////////////////////////////
$('.select2-input').select2({
    width: '100%',
    placeholder: 'Select or Add',
    tags: true,
});

var select_options = {
    width: '100%',
    placeholder: 'Select or Add',
    tags: true,
    data: [
        {
            id: 0,
            text: 'Japan'
        },
        {
            id: 1,
            text: 'Australia'
        },
        {
            id: 2,
            text: 'Russia'
        },
        {
            id: 3,
            text: 'Canada'
        },
        {
            id: 4,
            text: 'Georgia'
        }
    ],
    insertTag: function (data, tag) {
        if (data.length == 0) {
            $('.select2-found-text').remove();

            if ($('.select2-not-found-text').length == 0) {
                $('.select2-results').append('<div class="p-1 mb-1 select2-not-found-text"><hr class="mt-0 mb-1">' +
                    '<img src="./assets/images/logo.png" alt="Logo" class="img-fluid me-2" width="30px">' +
                    '<span>No Results Found</span>' +
                    '<button class="btn btn-sm btn-primary float-end mb-2" onclick="close_select2()">Add?</a>' +
                    '</div></div>');
            }
        }

        select2_element = this.$element;
        select2_new_data_tag = tag.text;

        data.push(tag);
    },
    matcher: function (params, data) {
        let result = $.fn.select2.defaults.defaults.matcher(params, data);

        if (params.term != null && result != null && $('.select2-found-text').length == 0) {
            $('.select2-not-found-text').remove();

            $('.select2-results').append('<div class="p-1 mb-1 select2-found-text"><hr class="mt-0 mb-1">' +
                '<img src="./assets/images/logo.png" alt="Logo" class="img-fluid me-2" width="30px">' +
                '<div class="float-end">' +
                '<p class="font-12 mb-0">message 1: this is a ' + data.text + ' person</p>' +
                '<p class="font-12 mb-0">message 2: this is a nice person</p>' +
                '</div></div>');
        }

        return result;
    },
    escapeMarkup: function (markup) {
        return markup;
    },
};

function close_select2() {
    let newOption = new Option(select2_new_data_tag, select2_new_data_tag, false, true);
    select2_element.append(newOption).trigger('change');
    select2_element.select2('close');
}


function enable_select_for_col(select_id) {
    let select_element = $("#" + select_id);
    let selected_option = '';

    select_element.select2(select_options).on('select2:open', function () {
        table.cell($(this).parent('td')).focus();
        table.keys.disable();
        selected_option = select_element.children(':selected').text();
    }).on('select2:close', function () {
        table.cell(select_element.parent('td')).data(selected_option);
        table.keys.enable();
        table.keys.move('right');
    });

    select_element.select2('open');
}


//////////////////////////////////////////////////
/////             Date picker         ////////////
//////////////////////////////////////////////////

$('.datepicker').datepicker();
