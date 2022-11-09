// delete_JQuery
$(function(){
    $("#btn_delete_jq").click(function(){
        $("#name").val('');
        $("#boy").prop("checked",false);
        $("#girl").prop("checked",false);
    });
})

// delete_原始JS
function deleteJS() {
    document.getElementById("name").value = "";
    let sexlist = document.getElementsByName("sex");
    for( i=0; i<sexlist.length; i++ ) {
        sexlist[i].checked = "";
    }
}

// 再取得
$(function(){
    $("#btn_redisp").click(function(){
        $.get(getUserUrl, function(data, status){
            if( data.code == 0 ) {
                $("#userid").text("工号：" + data.userid);
                $("#name").val(data.name);
                $("input[name='sex']").get(data.sex).checked = true;
            }
        });
    });
})

// 在某个元素之后新规元素
function insertAfter(newElement, targentElement) {
    var parent = targentElement.parentNode;
    if (parent.lastChild == targentElement) {
        parent.appendChild(newElement);
    } else {
        parent.insertBefore(newElement, targentElement.nextSibling)
    }
}

// 追加年龄
function add_age() {
    var ageText = document.createElement("p");
    ageText.setAttribute("id","age");
    var text = document.createTextNode("年龄：");
    var target = document.getElementById("sex");
    var ageInput = document.createElement("input");
    ageInput.setAttribute("id", "ageInput");
    ageText.appendChild(text);
    ageText.appendChild(ageInput);
    insertAfter(ageText,target);
}

// 删除年龄_JS
function deleteAge() {
    var age = document.getElementById("age");
    var parent = age.parentNode;
    parent.removeChild(age);
}

// 删除年龄_JQ
$(function(){
    $("#btn_delete_age_jq").click(function(){
        $("#age").remove();
    });
})
