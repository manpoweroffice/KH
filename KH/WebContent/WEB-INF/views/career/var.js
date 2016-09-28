var stock_table = document.getElementById('stock_table');
var stock_thead = document.getElementById('stock_thead');
var stock_tbody = document.getElementById('stock_tbody');
var stock_tr = null;
var stock_td = null;
var stock_x = 0;
var stock_y = 0;
var msg = document.getElementById('msg');
 
function add_row() 
{
    // 행 제목 추가
    stock_tr = document.createElement('tr');
    stock_tbody.appendChild(stock_tr);
    stock_td = document.createElement('td');
    stock_tr.appendChild(stock_td);
    add_input('opty_subj[]');
    stock_y++;
 
    // 열의 갯수에 따라 추가된 행의 열 추가
    var stock_thead_td = stock_thead.getElementsByTagName('td');
    for (i=0; i<stock_thead_td.length-1; i++)
    {
        stock_td = document.createElement('td');
        stock_tr.appendChild(stock_td);
        add_input('opt['+stock_y+'][]');
    }
}
 
function add_col() 
{
    // 열 제목 추가
    var stock_thead_tr = stock_thead.getElementsByTagName('tr');
    stock_td = document.createElement('td');
    stock_thead_tr[0].appendChild(stock_td);
    add_input('optx_subj[]');
 
    var stock_tbody_tr = stock_tbody.getElementsByTagName('tr');
    for (i=0; i<stock_tbody_tr.length; i++) {
        stock_td = document.createElement('td');
        stock_tbody_tr[i].appendChild(stock_td);
        add_input('opt['+i+'][]');
    }
}
 
function add_input(name)
{
    var inp = document.createElement('input');
    inp.setAttribute('type', 'text');
    inp.setAttribute('size', '10');
    inp.setAttribute('name', name);
    stock_td.appendChild(inp);
}
 
function del_row()
{
    var stock_tbody_tr = stock_tbody.getElementsByTagName('tr');
    if (stock_tbody_tr.length > 1) {
        stock_tbody.deleteRow(stock_tbody_tr.length-1);
        stock_y--;
    }
}
 
function del_col()
{
    var stock_thead_tr = stock_thead.getElementsByTagName('tr');
    var stock_thead_td = stock_thead.getElementsByTagName('td');
    if (stock_thead_td.length > 2) {
        stock_thead_tr[0].deleteCell(stock_thead_td.length-1);
 
        var stock_tbody_tr = stock_tbody.getElementsByTagName('tr');
        for (i=0; i<stock_tbody_tr.length; i++) {
            var tr_td = stock_tbody_tr[i].getElementsByTagName('td');
            stock_tbody_tr[i].deleteCell(tr_td.length-1);
        }
    }
}



/*$(document).ready(function() {
	var listSize = 0;
    $(function() {
        $('#btn-add-row').click(function() {
        	listSize++
            $('#mytable > tbody:last').append('<tr><input type="hidden" name="count">'
            		+ '<td><input type="text" name="kidName'+listSize+'"></td>'
            		+ '<td><input type="text" name="kinderName'+listSize+'"></td>'
            		+ '<td><input type="button" onClick="SchulCheck('+listSize+')" value="유치원검색"></td></tr>');
        });
        $('#btn-delete-row').click(function() {
        	if ($("input[name=count]").length >= 1)
        		listSize--
            $('#mytable > tbody:last > tr:last').remove();
        });
    });
});

function SchulCheck(listSize){
	
	url="/FORKI/content/join/factor/user/SchulCheck.do?num="+listSize;
	
	window.open(url,"post","toolbar=no ,width=500 ,height=300,directories=no,status=yes,scrollbars=yes,menubar=no");
}
*/