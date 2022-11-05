const getUserUrl = "http://127.0.0.1:3001/getUser";
const updateUrl = "http://127.0.0.1:3001/update";
const updateage = "http://127.0.0.1:3001/updateage";

$(document).ready(function(){

    $.get(getUserUrl, function(data, status){
        if( data.code == 0 ) {
            alert("获取成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
            $("#userid").text(data.userid);
            $("#name").val(data.name);
            $("input[name='sex']").get(data.sex).checked = true;
        } else {
            alert("获取失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
        }
    });

    // JQuery
    $("#btn2").click(function(){
        let name = $("#name").val();
        let sex = $("input:radio[name='sex']:checked").val();
        let data = {name: name, sex: Number(sex)};
        $.ajax({
            type: 'POST',
            url: updateUrl,
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function(data, status){
                if( data.code == 0 ) {
                    alert("更新成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
                } else {
                    alert("更新失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
                }
            }
        })
    });
    /*JQuery实现清除*/
    $("#btn4").click(function (){
        $("#userid").text('');
        $("#name").val('');
        if ($("input[name='sex']").get(0).checked){
            $("#girl").prop("checked",'checked');
        }else {
            $("#boy").prop("checked",'checked');
        }

    });
    /*再取得*/
    $("#btn5").click(function () {
        console.log("再取得")
        $.get(getUserUrl, function(data, status){
            if( data.code == 0 ) {
                alert("获取成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex);
                $("#userid").text(data.userid);
                $("#name").val(data.name);
                $("input[name='sex']").get(data.sex).checked = true;
            } else {
                alert("获取失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
            }
        });
    });
    /*追加*/
    $("#btn6").click(function () {
        $("#p_age").removeAttr("style",'')
    });

    /*添加年龄*/
    $('input[name="age"]').on('change',function () {
        const age = $(this).val()
        if (age > 0){
            let name = $("#name").val();
            let sex = $("input:radio[name='sex']:checked").val();
            let data = {name: name, sex: Number(sex),age:Number(age)};
            $.ajax({
                type: 'POST',
                url: updateage,
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function(data, status){
                    if( data.code == 0 ) {
                        alert("更新成功 !\nuserid: " + data.userid + "\nname: " + data.name + "\nsex: " + data.sex + "\nage: " + data.age);
                    } else {
                        alert("更新失败 !\ncode: " + data.code + "\nmsg: " + data.msg);
                    }
                }
            })
        }
    });

    /*删除年龄*/
    $("#btn8").click(function () {
        $("#p_age").css("display",'none')
    });
});

// 原始JS
const xhr = new XMLHttpRequest();
function updateJQ() {
    let name = document.getElementById("name").value;
    let sexlist = document.getElementsByName("sex");
    let sex = 0;
    for( i=0; i<sexlist.length; i++ ) {
        if( sexlist[i].checked ) {
            sex = i;
            break;
        }
    }
    let data = {name: name, sex: sex};

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


/*JS实现清除*/
function clearJS() {
    document.getElementById("name").value = '';
    document.getElementById("userid").innerText = '';
}

/*JS实现删除年龄*/
function deleteJS() {
    document.getElementById("p_age").style["display"] = 'none';
}

/*JS实现追加年龄*/
function addage() {
    document.getElementById("p_age").removeAttribute("style")
}

function showalert() {
    alert("我是凑数的，不用管我")
}

