const getUserUrl = "http://127.0.0.1:3001/getUser";
const updateUrl = "http://127.0.0.1:3001/update";

$(document).ready(function() {
    $.get(getUserUrl, function (data, status) {
        if (data.code == 0) {
            alert("获取成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
            $("#userid").text("工号：" + data.userid);
            $("#name").val(data.name);
            $("input[name='sex']").get(data.sex).checked = true;
        } else {
            alert("获取失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
        }
    });

    // JQuery
    $("#btn2").click(function () {
        let name = $("#name").val();
        let sex = $("input:radio[name='sex']:checked").val();
        let age = $("#age").val();
        let data = {name: name, sex: Number(sex), age:age};
        $.ajax({
            type: 'POST',
            url: updateUrl,
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function (data, status) {
                if (data.code == 0) {
                    alert("更新成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
                } else {
                    alert("更新失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
                }
            }
        })
    });
    $("#btn4").click(function () {
        $("#name").val('');
        $("#age").val('');
    });

    $("#btn5").click(function () {
        $.get(getUserUrl, function (data, status) {
            if (data.code == 0) {
                alert("data again成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
                $("#userid").text("工号：" + data.userid);
                $("#name").val(data.name);
                $("input[name='sex']").get(data.sex).checked = true;
            } else {
                alert("data again 失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
            }
        })
    });

    $("#btn6").click(function () {
        $("#age_text").removeAttr("style", '')
    });

    $('input[name="age"]').on('change', function () {
        const age = $(this).val()
        let name = $("#name").val();
        let sex = $("input:radio[name='sex']:checked").val();
        let data = {name: name, sex: Number(sex), age: Number(age)};
        $.ajax({
            type: 'POST',
            url: updateUrl,
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function (data, status) {
                if (data.code == 0) {
                    alert("更新成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex + "\nage: " + data.age);
                } else {
                    alert("更新失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
                }
            }
        })
    });

    $("#btn7").click(function () {
        $("#age_text").css("display",'none')
    });
});


// 原始JS
const xhr = new XMLHttpRequest();
function updateJQ() {
    let name = document.getElementById("name").value;
    let sexlist = document.getElementsByName("sex");
    let sex = 0;
    let age = document.getElementById("age").value;
    for( i=0; i<sexlist.length; i++ ) {
        if( sexlist[i].checked ) {
            sex = i;
            break;
        }
    }
    let data = {name: name, sex: sex, age:age};

    xhr.open("Post", updateUrl);
    xhr.setRequestHeader('content-type', 'application/json');
    xhr.send(JSON.stringify(data));
    xhr.onreadystatechange = function() {
        if( xhr.readyState == 4 ) {
            let res = JSON.parse(this.responseText);
            if( res.code == 0 ) {
                alert("更新成功 !\nuserid: " + res.userid + "\nname: " + res.name + "\nsex: " + res.sex);
            } else {
                let res = JSON.parse(this.responseText);
                alert("更新失败 !\ncode: " + res.code + "\nmsg: " + res.msg);
            }
        }
    }
}
function clearJS(){
    document.getElementById("name").value='';
    document.getElementById("age").value='';
};

function addJS() {
    document.getElementById("age_text").removeAttribute("style")
};

function delJS() {
    document.getElementById("age_text").style["display"] = 'none';
}