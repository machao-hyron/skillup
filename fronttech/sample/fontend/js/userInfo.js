// clearJQuery
$(function(){
    $("#clear_jq").click(function(){
        $("#name").val('');
        $("#boy").prop("checked",false);
        $("#girl").prop("checked",false);
    });
})

// clearJS
function clearJS() {
    document.getElementById("name").value = "";
    let sexlist = document.getElementsByName("sex");
    for( i=0; i<sexlist.length; i++ ) {
        sexlist[i].checked = "";
    }
}

// 再取得
$(function(){
    $("#regain").click(function(){
        $.get(getUserUrl, function(data, status){
            if( data.code == 0 ) {
                alert("获取成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
                $("#userid").text("工号：" + data.userid);
                $("#name").val(data.name);
                $("input[name='sex']").get(data.sex).checked = true;
            } else {
                alert("获取失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
            }
        });
    });
})
