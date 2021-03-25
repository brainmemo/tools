$('#jstree_div').jstree({
    "core": {
        "animation": 0,
        "check_callback": true,
        "themes": {"stripes": true},
        'data': [
            'Simple root node',
            {
                'text': 'Root node 2',
                'state': {
                    'opened': true,
                    'selected': true
                },
                'children': [
                    {'text': 'Child 1'},
                    'Child 2'
                ]
            }
        ]
    },
    "search": {
        "case_insensitive": true,
    },
    "plugins": [
        "contextmenu", "dnd", "search",
        "state", "types", "wholerow"
    ]
});

$('#jstree_search').keyup(function () {
    $('#jstree_div').jstree(true).show_all();
    $('#jstree_div').jstree('search', $(this).val());
});
