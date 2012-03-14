$(function(){
    $("#grid-user").jqGrid({
        url : "/demogrid/user/load-grid",
        datatype : "json",
        colNames : [ 'Código', 'Nome', 'E-mail', 'Idade', 'Nascimento' ],
        colModel : [ {
            name : 'id',
            index : 'id',
            width : 80,
            align : 'center'
        },
        {
            name : 'nome',
            index : 'nome',
            width : 200
        },
        {
            name : 'email',
            index : 'email',
            width : 150
        },
        {
            name : 'idade',
            index : 'idade',
            width : 50
        },
        {
            name : 'nascimento',
            index : 'nascimento',
            width : 80
        }
        ],
        rowNum : 10,
        pager : '#pager-user',
        height : 220,
        viewrecords : true,
        sortorder : "desc",
        caption : "Lista de Usuários",
        jsonReader : {
            root: "rows",
            page: "page",
            total: "total",
            records: "records",
            cell: "",
            id: "0"
        }
    });
});