//////////////////////////////////////////////////
/////       For Loading Datatables    ////////////
//////////////////////////////////////////////////
var new_select, select2_element, select2_new_data_tag = null;

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
        new_select = $('<select></select>');
        $('.focus').html(new_select);
        enableSelectForCol();
    } else {
        $('.focus > input').focus();

        if ($('.focus > select').length == 0 && $('.focus > input').length == 0) {
            $('.focus').html('<input class="editable" style="width:100%;" type="text" value="' + $('.focus').text() + '">');
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
    selectOnClose: false,
    allowClear: true,
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
        $('.select2-found-text').remove();

        if (countNotNulls(data) == 0) {
            if ($('.select2-not-found-text').length == 0) {
                $('.select2-results').append('<div class="p-1 mb-1 select2-not-found-text"><hr class="mt-0 mb-1">' +
                    '<img src="./resources/assets/images/logo.png" alt="Logo" class="img-fluid me-2" width="30px">' +
                    '<span>No Results Found</span>' +
                    '<button class="btn btn-sm btn-primary float-end mb-2" onclick="addNewOptionModal()">Add?</a>' +
                    '</div></div>');
            }

            select2_element = this.$element;
            select2_new_data_tag = tag.text;
        }

        return null;
    },
    matcher: function (params, data) {
        params.term = params.term || '';

        if (data.text.toLowerCase().indexOf(params.term.toLowerCase()) == 0) {
            if ($('.select2-found-text').length == 0) {
                $('.select2-not-found-text').remove();

                $('.select2-results').append('<div class="p-1 mb-1 select2-found-text"><hr class="mt-0 mb-1">' +
                    '<img src="./resources/assets/images/logo.png" alt="Logo" class="img-fluid me-2" width="30px">' +
                    '<div class="float-end">' +
                    '<p class="font-12 mb-0">message 1: this is a ' + data.text + ' person</p>' +
                    '<p class="font-12 mb-0">message 2: this is a nice person</p>' +
                    '</div></div>');
            }

            return data;
        }

        return false;
    },
    escapeMarkup: function (markup) {
        return markup;
    },
};

function addNewOptionModal() {
    $(select2_element).off('select2:close');
    $(select2_element).select2('close');
    $('#name-input').val(select2_new_data_tag);
    $('#addModal').modal('show');
}

function submitAddOption() {
    $('#addModal').modal('hide');

    table.cell($('.focus')).data($('#name-input').val());
    table.keys.enable();
    table.keys.move('right');
}

function dismissAddModal() {
    table.cell($('.focus')).data('');
    table.keys.enable();
    table.keys.move('right');
}


function enableSelectForCol() {
    new_select.select2(select_options).on('select2:open', function () {
        table.keys.disable();
    }).on('select2:close', function () {
        table.cell($(this).parent('td')).data(new_select.children(':selected').text());
        table.keys.enable();
        table.keys.move('right');
    });

    new_select.select2('open');
}

function countNotNulls(data) {
    return data.filter(function (el) {
        return el != null && el != "";
    }).length;
}

//////////////////////////////////////////////////
/////             Date picker         ////////////
//////////////////////////////////////////////////

$('.datepicker').datepicker();
