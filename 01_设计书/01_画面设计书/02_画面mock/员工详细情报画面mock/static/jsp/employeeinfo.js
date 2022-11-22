/**
 * 
 */
 $(document).ready(function() {
		$("input").attr("hidden","hidden");
        $("textarea").attr("hidden","hidden");
        $("text").attr("hidden","hidden");
// 变量定义与赋值		 
		let nameinput= $("#nameinput").val();
     	let sexinput=$("#sexinput").val();
     	let kougoinput=$("#kougoinput").val();
	    let bumeninput=$("#bumeninput").val();
    	let bornyearinput=$("#bornyearinput").val();
     	let bornmouthinput=$("#bornmouthinput").val();
     	let borndayinput=$("#borndayinput").val();
     	let schoolinput=$("#schoolinput").val();
     	let leaveschoolyearinput=$("#leaveschoolyearinput").val();
     	let leaveschoolmouthinput=$("#leaveschoolmouthinput").val();
     	let leaveschooldayinput=$("#leaveschooldayinput").val();
    	let workyearinput=$("#workyearinput").val();
    	let workmouthinput=$("#workmouthinput").val();
    	let workdayinput=$("#workdayinput").val();
    	let koumokuininput=$("#koumokuininput").val();
    	let leaveworkyearinput=$("#leaveworkyearinput").val();
    	let leaveworkmouthinput=$("#leaveworkmouthinput").val();
    	let leaveworkdayinput=$("#leaveworkdayinput").val();
    	
    	
    	let kaishanameinput1=$("#kaishanametext1").val();
    	let shokumuinput1=$("#shokumutext1").val();
    	let worktimeinputfromyear1=$("#worktimetextfromyear1").val();
    	let worktimeinputfrommouth1=$("#worktimetextfrommouth1").val();
    	let worktimeinputtoyear1=$("#worktimetexttoyear1").val();
    	let worktimeinputtomouth1=$("#worktimetexttomouth1").val();
    	let koumokuinfotextarea1=$("#koumokutext1").text();
    	
    	let kaishanameinput2=$("#kaishanametext2").val();
    	let shokumuinput2=$("#shokumutext2").val();
    	let worktimeinputfromyear2=$("#worktimetextfromyear2").val();
    	let worktimeinputfrommouth2=$("#worktimetextfrommouth2").val();
    	let worktimeinputtoyear2=$("#worktimetexttoyear2").val();
    	let worktimeinputtomouth2=$("#worktimetexttomouth2").val();
    	let koumokuinfotextarea2=$("#koumokutext2").text();
    	
    	let kaishanameinput3=$("#kaishanametext3").val();
    	let shokumuinput3=$("#shokumutext3").val();
    	let worktimeinputfromyear3=$("#worktimetextfromyear3").val();
    	let worktimeinputfrommouth3=$("#worktimetextfrommouth3").val();
    	let worktimeinputtoyear3=$("#worktimetexttoyear3").val();
    	let worktimeinputtomouth3=$("#worktimetexttomouth3").val();
    	let koumokuinfotextarea3=$("#koumokutext3").text();
    	
    	let kaishanameinput4=$("#kaishanametext4").val();
    	let shokumuinput4=$("#shokumutext4").val();
    	let worktimeinputfromyear4=$("#worktimetextfromyear4").val();
    	let worktimeinputfrommouth4=$("#worktimetextfrommouth4").val();
    	let worktimeinputtoyear4=$("#worktimetexttoyear4").val();
    	let worktimeinputtomouth4=$("#worktimetexttomouth4").val();
    	let koumokuinfotextarea4=$("#koumokutext4").text();
    		
//    	工作状态初始化
		let workstatus=1;
//		skillvalue初始化与赋值    	
    	let VUEskillvalue=3;
		let Javaskillvalue=3;
		let Angularskillvalue=3;
		let Androidskillvalue=3;
		let JSPskillvalue=3;
		let Thymeleafskillvalue=3;
		let SqlServerskillvalue=3;
		let Jqueryskillvalue=3;
		let Reactskillvalue=3;
		let HTMLskillvalue=3;
		
		let CSSskillvalue=3;
		let tenNetskillvalue=3;
		let IOSskillvalue=3;
		let Mysqlskillvalue=3;
		let Oracleskillvalue=3;
		let Cupupskillvalue=3;
		let CXskillvalue=3;
		let Springskillvalue=3;    	

//   界面初始参数设置  	
	   	$("#nametext").text(nameinput);
	   	$("#sextext").text(sexinput);
	   	$("#kougotext").text(kougoinput);
	   	$("#bumentext").text(bumeninput);
   		$("#bornyeartext").text(bornyearinput);
   		$("#bornmouthtext").text(bornmouthinput);
   		$("#borndaytext").text(borndayinput);
  	 	$("#schooltext").text(schoolinput);
	   	$("#leaveschoolyeartext").text(leaveschoolyearinput);
	   	$("#leaveschoolmouthtext").text(leaveschoolmouthinput);
	 	$("#leaveschooldaytext").text(leaveschooldayinput);
	   	$("#workyeartext").text(workyearinput);
	   	$("#workmouthtext").text(workmouthinput);
	   	$("#workdaytext").text(workdayinput);
	   	$("#koumokuintext").text(koumokuininput);
	   	$("#leaveworkyeartext").text(leaveworkyearinput);
   		$("#leaveworkmouthtext").text(leaveworkmouthinput);
   		$("#leaveworkdaytext").text(leaveworkdayinput);
   		
   		$("#kaishanametext1").text(kaishanameinput1);
	   	$("#shokumutext1").text(shokumuinput1);
    	$("#worktimetextfromyear1").text(worktimeinputfromyear1);
     	$("#worktimetextfrommouth1").text(worktimeinputfrommouth1);
    	$("#worktimetexttoyear1").text(worktimeinputtoyear1);
    	$("#worktimetexttomouth1").text(worktimeinputtomouth1);
    	$("#koumokuinfotext1").text(koumokuinfotextarea1);
   		
   		$("#kaishanametext2").text(kaishanameinput2);
    	$("#shokumutext2").text(shokumuinput2);
    	$("#worktimetextfromyear2").text(worktimeinputfromyear2);
    	$("#worktimetextfrommouth2").text(worktimeinputfrommouth2);
    	$("#worktimetexttoyear2").text(worktimeinputtoyear2);
    	$("#worktimetexttomouth2").text(worktimeinputtomouth2);
    	$("#koumokuinfotext2").text(koumokuinfotextarea2);
   		
   		$("#kaishanametext3").text(kaishanameinput3);
    	$("#shokumutext3").text(shokumuinput3);
    	$("#worktimetextfromyear3").text(worktimeinputfromyear3);
    	$("#worktimetextfrommouth3").text(worktimeinputfrommouth3);
    	$("#worktimetexttoyear3").text(worktimeinputtoyear3);
    	$("#worktimetexttomouth3").text(worktimeinputtomouth3);
    	$("#koumokuinfotext3").text(koumokuinfotextarea3);
   		
   		$("#kaishanametext4").text(kaishanameinput4);
    	$("#shokumutext4").text(shokumuinput4);
    	$("#worktimetextfromyear4").text(worktimeinputfromyear4);
    	$("#worktimetextfrommouth4").text(worktimeinputfrommouth4);
    	$("#worktimetexttoyear4").text(worktimeinputtoyear4);
    	$("#worktimetexttomouth4").text(worktimeinputtomouth4);
    	$("#koumokuinfotext4").text(koumokuinfotextarea4);
		
		
// 	初始化显示
		 
		 $("#nameinput").attr("hidden","hidden");
		 $("#sexinput").attr("hidden","hidden");
		 $("#kougoinput").attr("hidden","hidden");
		 $("#bumeninput").attr("hidden","hidden");
		 $("#bornyearinput").attr("hidden","hidden");
		 $("#bornmouthinput").attr("hidden","hidden");
		 $("#borndayinput").attr("hidden","hidden");
		 $("#schoolinput").attr("hidden","hidden");
		 $("#leaveschoolyearinput").attr("hidden","hidden");
		 $("#leaveschoolmouthinput").attr("hidden","hidden");
		 $("#leaveschooldayinput").attr("hidden","hidden");
		 $("#workyearinput").attr("hidden","hidden");
		 $("#workmouthinput").attr("hidden","hidden");
		 $("#workdayinput").attr("hidden","hidden");
		 $("#koumokuininput").attr("hidden","hidden");
		 $("#leaveworkyearinput").attr("hidden","hidden");
		 $("#leaveworkmouthinput").attr("hidden","hidden");
		 $("#leaveworkdayinput").attr("hidden","hidden");
		 if(workstatus==1){
         	$("#workstatus1").attr("hidden","hidden");
         	$("#workstatus2").attr("hidden","hidden");
         	$("#workstatus3").removeAttr("hidden","hidden");
         	$("#workstatus4").attr("hidden","hidden");
         	$("#koumokuin1").removeAttr("hidden","hidden");
         	$("#koumokuin2").removeAttr("hidden","hidden");
         	$("#koumokuout1").attr("hidden","hidden");
         	$("#koumokuout2").attr("hidden","hidden");
         	$("#koumokuintext").removeAttr("hidden","hidden");
         }else{
         	$("#workstatus1").attr("hidden","hidden");
         	$("#workstatus2").attr("hidden","hidden");
         	$("#workstatus3").attr("hidden","hidden");
         	$("#workstatus4").removeAttr("hidden","hidden");
         	$("#koumokuin1").attr("hidden","hidden");
         	$("#koumokuin2").attr("hidden","hidden");
         	$("#koumokuout1").removeAttr("hidden","hidden");
         	$("#koumokuout2").removeAttr("hidden","hidden");
         	$("#leaveworkyeartext").removeAttr("hidden","hidden");
    		$("#leaveworkmouthtext").removeAttr("hidden","hidden"); 
    		$("#leaveworkdaytext").removeAttr("hidden","hidden");
         }
		 $("#nametext").removeAttr("hidden","hidden");
		 $("#sextext").removeAttr("hidden","hidden");
		 $("#kougotext").removeAttr("hidden","hidden");
		 $("#bumentext").removeAttr("hidden","hidden");
		 $("#bornyeartext").removeAttr("hidden","hidden");
		 $("#bornmouthtext").removeAttr("hidden","hidden");
		 $("#borndaytext").removeAttr("hidden","hidden");
		 $("#schooltext").removeAttr("hidden","hidden");
		 $("#leaveschoolyeartext").removeAttr("hidden","hidden");
		 $("#leaveschoolmouthtext").removeAttr("hidden","hidden"); 
		 $("#leaveschooldaytext").removeAttr("hidden","hidden");
		 $("#workyeartext").removeAttr("hidden","hidden");
		 $("#workmouthtext").removeAttr("hidden","hidden"); 
		 $("#workdaytext").removeAttr("hidden","hidden");
	        
//	skillshow
		 switch(CXskillvalue){
	 		case 5:{$('#CXskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#CXskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#CXskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#CXskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#CXskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(VUEskillvalue){
	 		case 5:{$('#VUEskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#VUEskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#VUEskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#VUEskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#VUEskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Javaskillvalue){
	 		case 5:{$('#Javaskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Javaskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Javaskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Javaskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Javaskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Angularskillvalue){
	 		case 5:{$('#Angularskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Angularskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Angularskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Angularskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Angularskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Androidskillvalue){
	 		case 5:{$('#Androidskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Androidskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Androidskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Androidskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Androidskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(JSPskillvalue){
	 		case 5:{$('#JSPskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#JSPskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#JSPskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#JSPskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#JSPskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Thymeleafskillvalue){
	 		case 5:{$('#Thymeleafskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Thymeleafskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Thymeleafskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Thymeleafskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Thymeleafskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(SqlServerskillvalue){
	 		case 5:{$('#SqlServerskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#SqlServerskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#SqlServerskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#SqlServerskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#SqlServerskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Jqueryskillvalue){
	 		case 5:{$('#Jqueryskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Jqueryskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Jqueryskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Jqueryskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Jqueryskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Reactskillvalue){
	 		case 5:{$('#Reactskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Reactskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Reactskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Reactskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Reactskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(HTMLskillvalue){
	 		case 5:{$('#HTMLskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#HTMLskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#HTMLskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#HTMLskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#HTMLskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(CSSskillvalue){
	 		case 5:{$('#CSSskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#CSSskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#CSSskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#CSSskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#CSSskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(tenNetskillvalue){
	 		case 5:{$('#tenNetskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#tenNetskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#tenNetskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#tenNetskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#tenNetskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(IOSskillvalue){
	 		case 5:{$('#IOSskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#IOSskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#IOSskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#IOSskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#IOSskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Mysqlskillvalue){
	 		case 5:{$('#Mysqlskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Mysqlskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Mysqlskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Mysqlskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Mysqlskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Oracleskillvalue){
	 		case 5:{$('#Oracleskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Oracleskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Oracleskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Oracleskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Oracleskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Cupupskillvalue){
	 		case 5:{$('#Cupupskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Cupupskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Cupupskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Cupupskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Cupupskill').attr("src","../static/png/skille.png");	break;}
		}
		switch(Springskillvalue){
	 		case 5:{$('#Springskill').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Springskill').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Springskill').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Springskill').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Springskill').attr("src","../static/png/skille.png");	break;}
		}
		 	
						 
//  skill初始化显示		 
		switch(CXskillvalue){
	 		case 5:{$('#CXskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#CXskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#CXskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#CXskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#CXskill2').attr("src","../static/png/skille.png");	break;}
 		}
		switch(VUEskillvalue){
	 		case 5:{$('#VUEskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#VUEskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#VUEskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#VUEskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#VUEskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Javaskillvalue){
	 		case 5:{$('#Javaskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Javaskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Javaskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Javaskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Javaskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Angularskillvalue){
	 		case 5:{$('#Angularskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Angularskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Angularskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Angularskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Angularskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Androidskillvalue){
	 		case 5:{$('#Androidskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Androidskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Androidskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Androidskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Androidskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(JSPskillvalue){
	 		case 5:{$('#JSPskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#JSPskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#JSPskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#JSPskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#JSPskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Thymeleafskillvalue){
	 		case 5:{$('#Thymeleafskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Thymeleafskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Thymeleafskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Thymeleafskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Thymeleafskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(SqlServerskillvalue){
	 		case 5:{$('#SqlServerskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#SqlServerskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#SqlServerskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#SqlServerskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#SqlServerskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Jqueryskillvalue){
	 		case 5:{$('#Jqueryskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Jqueryskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Jqueryskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Jqueryskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Jqueryskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Reactskillvalue){
	 		case 5:{$('#Reactskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Reactskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Reactskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Reactskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Reactskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(HTMLskillvalue){
	 		case 5:{$('#HTMLskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#HTMLskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#HTMLskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#HTMLskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#HTMLskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(CSSskillvalue){
	 		case 5:{$('#CSSskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#CSSskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#CSSskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#CSSskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#CSSskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(tenNetskillvalue){
	 		case 5:{$('#tenNetskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#tenNetskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#tenNetskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#tenNetskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#tenNetskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(IOSskillvalue){
	 		case 5:{$('#IOSskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#IOSskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#IOSskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#IOSskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#IOSskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Mysqlskillvalue){
	 		case 5:{$('#Mysqlskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Mysqlskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Mysqlskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Mysqlskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Mysqlskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Oracleskillvalue){
	 		case 5:{$('#Oracleskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Oracleskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Oracleskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Oracleskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Oracleskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Cupupskillvalue){
	 		case 5:{$('#Cupupskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Cupupskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Cupupskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Cupupskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Cupupskill2').attr("src","../static/png/skille.png");	break;}
		}
		switch(Springskillvalue){
	 		case 5:{$('#Springskill2').attr("src","../static/png/skilla.png");	break;}
	 		case 4:{$('#Springskill2').attr("src","../static/png/skillb.png");	break;}
	 		case 3:{$('#Springskill2').attr("src","../static/png/skillc.png");	break;}
	 		case 2:{$('#Springskill2').attr("src","../static/png/skilld.png");	break;}
	 		case 1:{$('#Springskill2').attr("src","../static/png/skille.png");	break;}
		}
		 
// 	保存图片变换	
        $("#saveimgbutton").mouseover(function() {
            $("#saveimgbutton").attr("src","../static/png/saveon.png");
         
        });
        $("#saveimgbutton").mouseleave(function() {
            $("#saveimgbutton").attr("src","../static/png/save.png");
        });    
//  保存click操作      
        $("#saveimgbutton").click(function() {
//     获取input输入参数    	
			nameinput= $("#nameinput").val();
     		sexinput=$("#sexinput").val();
     		kougoinput=$("#kougoinput").val();
	  	    bumeninput=$("#bumeninput").val();
    		bornyearinput=$("#bornyearinput").val();
     		bornmouthinput=$("#bornmouthinput").val();
     		borndayinput=$("#borndayinput").val();
     		schoolinput=$("#schoolinput").val();
     		leaveschoolyearinput=$("#leaveschoolyearinput").val();
     	 	leaveschoolmouthinput=$("#leaveschoolmouthinput").val();
    	 	leaveschooldayinput=$("#leaveschooldayinput").val();
    		workyearinput=$("#workyearinput").val();
    		workmouthinput=$("#workmouthinput").val();
    		workdayinput=$("#workdayinput").val();
    		koumokuininput=$("#koumokuininput").val();
    		leaveworkyearinput=$("#leaveworkyearinput").val();
    		leaveworkmouthinput=$("#leaveworkmouthinput").val();
    		leaveworkdayinput=$("#leaveworkdayinput").val();
    		
    		kaishanameinput1=$("#kaishanameinput1").val();
        	shokumuinput1=$("#shokumuinput1").val();
        	worktimeinputfromyear1=$("#worktimetinputfromyear1").val();
        	worktimeinputfrommouth1=$("#worktimeinputfrommouth1").val();
        	worktimeinputtoyear1=$("#worktimeinputtoyear1").val();
        	worktimeinputtomouth1=$("#worktimeinputtomouth1").val();
        	koumokuinfotextarea1=$("#koumokuinfotextarea1").val();
        	
        	kaishanameinput2=$("#kaishanameinput2").val();
        	shokumuinput2=$("#shokumuinput2").val();
        	worktimeinputfromyear2=$("#worktimeinputfromyear2").val();
        	worktimeinputfrommouth2=$("#worktimeinputfrommouth2").val();
        	worktimeinputtoyear2=$("#worktimeinputtoyear2").val();
        	worktimeinputtomouth2=$("#worktimeinputtomouth2").val();
        	koumokuinfotextarea2=$("#koumokuinfotextarea2").val();
        	
        	kaishanameinput3=$("#kaishanameinput3").val();
        	shokumuinput3=$("#shokumuinput3").val();
        	worktimeinputfromyear3=$("#worktimeinputfromyear3").val();
        	worktimeinputfrommouth3=$("#worktimeinputfrommouth3").val();
        	worktimeinputtoyear3=$("#worktimeinputtoyear3").val();
        	worktimeinputtomouth3=$("#worktimeinputtomouth3").val();
        	koumokuinfotextarea3=$("#koumokuinfotextarea3").val();
        	
        	kaishanameinput4=$("#kaishanameinput4").val();
        	shokumuinput4=$("#shokumuinput4").val();
        	worktimeinputfromyear4=$("#worktimeinputfromyear4").val();
        	worktimeinputfrommouth4=$("#worktimeinputfrommouth4").val();
        	worktimeinputtoyear4=$("#worktimeinputtoyear4").val();
        	worktimeinputtomouth4=$("#worktimeinputtomouth4").val();
        	koumokuinfotextarea4=$("#koumokuinfotextarea4").val();
        	
//     设置text参数    	
            $("#nametext").text(nameinput);
 	   		$("#sextext").text(sexinput);
 	   		$("#kougotext").text(kougoinput);
 	   		$("#bumentext").text(bumeninput);
	   		$("#bornyeartext").text(bornyearinput);
	   		$("#bornmouthtext").text(bornmouthinput);
	   		$("#borndaytext").text(borndayinput);
	  	 	$("#schooltext").text(schoolinput);
 	   		$("#leaveschoolyeartext").text(leaveschoolyearinput);
 	   		$("#leaveschoolmouthtext").text(leaveschoolmouthinput);
 	 	  	$("#leaveschooldaytext").text(leaveschooldayinput);
 	   		$("#workyeartext").text(workyearinput);
 	   		$("#workmouthtext").text(workmouthinput);
 	   		$("#workdaytext").text(workdayinput);
 	   		$("#koumokuintext").text(koumokuininput);
 	   		$("#leaveworkyeartext").text(leaveworkyearinput);
	   		$("#leaveworkmouthtext").text(leaveworkmouthinput);
	   		$("#leaveworkdaytext").text(leaveworkdayinput);
// 		在职状态 	   	
            if(workstatus==1){
            	$("#workstatus1").attr("hidden","hidden");
            	$("#workstatus2").attr("hidden","hidden");
            	$("#workstatus3").removeAttr("hidden","hidden");
            	$("#workstatus4").attr("hidden","hidden");
            	$("#koumokuin1").removeAttr("hidden","hidden");
            	$("#koumokuin2").removeAttr("hidden","hidden");
            	$("#koumokuout1").attr("hidden","hidden");
            	$("#koumokuout2").attr("hidden","hidden");
            }else if(workstatus==2){
            	$("#workstatus1").attr("hidden","hidden");
            	$("#workstatus2").attr("hidden","hidden");
            	$("#workstatus3").attr("hidden","hidden");
            	$("#workstatus4").removeAttr("hidden","hidden");
            	$("#koumokuin1").attr("hidden","hidden");
            	$("#koumokuin2").attr("hidden","hidden");
            	$("#koumokuout1").removeAttr("hidden","hidden");
            	$("#koumokuout2").removeAttr("hidden","hidden");
            }else{}

	        
	        
	        
//  	skill图片保存 skill>>skillshow
			switch(CXskillvalue){
		 		case 5:{$('#CXskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#CXskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#CXskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#CXskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#CXskill2').attr("src","../static/png/skille.png");	break;}
	 		}
			switch(VUEskillvalue){
		 		case 5:{$('#VUEskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#VUEskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#VUEskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#VUEskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#VUEskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Javaskillvalue){
		 		case 5:{$('#Javaskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Javaskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Javaskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Javaskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Javaskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Angularskillvalue){
		 		case 5:{$('#Angularskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Angularskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Angularskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Angularskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Angularskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Androidskillvalue){
		 		case 5:{$('#Androidskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Androidskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Androidskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Androidskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Androidskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(JSPskillvalue){
		 		case 5:{$('#JSPskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#JSPskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#JSPskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#JSPskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#JSPskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Thymeleafskillvalue){
		 		case 5:{$('#Thymeleafskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Thymeleafskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Thymeleafskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Thymeleafskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Thymeleafskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(SqlServerskillvalue){
		 		case 5:{$('#SqlServerskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#SqlServerskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#SqlServerskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#SqlServerskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#SqlServerskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Jqueryskillvalue){
		 		case 5:{$('#Jqueryskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Jqueryskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Jqueryskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Jqueryskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Jqueryskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Reactskillvalue){
		 		case 5:{$('#Reactskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Reactskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Reactskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Reactskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Reactskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(HTMLskillvalue){
		 		case 5:{$('#HTMLskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#HTMLskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#HTMLskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#HTMLskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#HTMLskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(CSSskillvalue){
		 		case 5:{$('#CSSskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#CSSskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#CSSskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#CSSskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#CSSskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(tenNetskillvalue){
		 		case 5:{$('#tenNetskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#tenNetskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#tenNetskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#tenNetskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#tenNetskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(IOSskillvalue){
		 		case 5:{$('#IOSskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#IOSskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#IOSskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#IOSskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#IOSskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Mysqlskillvalue){
		 		case 5:{$('#Mysqlskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Mysqlskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Mysqlskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Mysqlskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Mysqlskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Oracleskillvalue){
		 		case 5:{$('#Oracleskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Oracleskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Oracleskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Oracleskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Oracleskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Cupupskillvalue){
		 		case 5:{$('#Cupupskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Cupupskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Cupupskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Cupupskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Cupupskill2').attr("src","../static/png/skille.png");	break;}
			}
			switch(Springskillvalue){
		 		case 5:{$('#Springskill2').attr("src","../static/png/skilla.png");	break;}
		 		case 4:{$('#Springskill2').attr("src","../static/png/skillb.png");	break;}
		 		case 3:{$('#Springskill2').attr("src","../static/png/skillc.png");	break;}
		 		case 2:{$('#Springskill2').attr("src","../static/png/skilld.png");	break;}
		 		case 1:{$('#Springskill2').attr("src","../static/png/skille.png");	break;}
			}
//		工作履历保存			 
		$("#kaishanametext1").text(kaishanameinput1);
    	$("#shokumutext1").text(shokumuinput1);
    	$("#worktimetextfromyear1").text(worktimeinputfromyear1);
    	$("#worktimetextfrommouth1").text(worktimeinputfrommouth1);
    	$("#worktimetexttoyear1").text(worktimeinputtoyear1);
    	$("#worktimetexttomouth1").text(worktimeinputtomouth1);
    	$("#koumokuinfotext1").text(koumokuinfotextarea1);
   		
   		$("#kaishanametext2").text(kaishanameinput2);
    	$("#shokumutext2").text(shokumuinput2);
    	$("#worktimetextfromyear2").text(worktimeinputfromyear2);
    	$("#worktimetextfrommouth2").text(worktimeinputfrommouth2);
    	$("#worktimetexttoyear2").text(worktimeinputtoyear2);
    	$("#worktimetexttomouth2").text(worktimeinputtomouth2);
    	$("#koumokuinfotext2").text(koumokuinfotextarea2);
   		
   		$("#kaishanametext3").text(kaishanameinput3);
    	$("#shokumutext3").text(shokumuinput3);
    	$("#worktimetextfromyear3").text(worktimeinputfromyear3);
    	$("#worktimetextfrommouth3").text(worktimeinputfrommouth3);
    	$("#worktimetexttoyear3").text(worktimeinputtoyear3);
    	$("#worktimetexttomouth3").text(worktimeinputtomouth3);
    	$("#koumokuinfotext3").text(koumokuinfotextarea3);
   		
   		$("#kaishanametext4").text(kaishanameinput4);
    	$("#shokumutext4").text(shokumuinput4);
    	$("#worktimetextfromyear4").text(worktimeinputfromyear4);
    	$("#worktimetextfrommouth4").text(worktimeinputfrommouth4);
    	$("#worktimetexttoyear4").text(worktimeinputtoyear4);
    	$("#worktimetexttomouth4").text(worktimeinputtomouth4);
    	$("#koumokuinfotext4").text(koumokuinfotextarea4);
		
			
//	    input隐藏   
	  		$("input").attr("hidden","hidden");
	        $("textarea").attr("hidden","hidden");
	        $("#editimgbutton").removeAttr("hidden","hidden");
	        $("#saveimgbutton").attr("hidden","hidden");
//	    text显示       
	        $("text").removeAttr("hidden","hidden");
//		skill图片展示 skill>>skillshow         
            $(".skillshow").removeAttr("hidden","hidden");
            $(".skill").attr("hidden","hidden");
//  	top变换           
      		$("#employeetoptext").text("员工详细情报-保存成功");
            
        });
//   编辑图片变化    
        $("#editimgbutton").mouseover(function() {
            $("#editimgbutton").attr("src","../static/png/editon.png");
         
        });
        $("#editimgbutton").mouseleave(function() {
            $("#editimgbutton").attr("src","../static/png/edit.png");
         
        });
//   编辑click操作  
        $("#editimgbutton").click(function() {
//  	input清空     
			$("input").attr("value","");
			
//      input导入text参数     
			nameinput= $("#nametext").text();
         	sexinput=$("#sextext").text();
         	kougoinput=$("#kougotext").text();
  	     	bumeninput=$("#bumentext").text();
        	bornyearinput=$("#bornyeartext").text();
         	bornmouthinput=$("#bornmouthtext").text();
         	borndayinput=$("#borndaytext").text();
         	schoolinput=$("#schooltext").text();
         	leaveschoolyearinput=$("#leaveschoolyeartext").text();
         	leaveschoolmouthinput=$("#leaveschoolmouthtext").text();
         	leaveschooldayinput=$("#leaveschooldaytext").text();
        	workyearinput=$("#workyeartext").text();
        	workmouthinput=$("#workmouthtext").text();
        	workdayinput=$("#workdaytext").text();
        	koumokuininput=$("#koumokuintext").text();
        	leaveworkyearinput=$("#leaveworkyeartext").text();
        	leaveworkmouthinput=$("#leaveworkmouthtext").text();
        	leaveworkdayinput=$("#leaveworkdaytext").text();
        	
        	

            $("#nameinput").attr("value",nameinput);
 	   		$("#sexinput").attr("value",sexinput);
 	   		$("#kougoinput").attr("value",kougoinput);
 	   		$("#bumeninput").attr("value",bumeninput);
	   		$("#bornyearinput").attr("value",bornyearinput);
	   		$("#bornmouthinput").attr("value",bornmouthinput);
	   		$("#borndayinput").attr("value",borndayinput);
	  	 	$("#schoolinput").attr("value",schoolinput);
 	   		$("#leaveschoolyearinput").attr("value",leaveschoolyearinput);
 	   		$("#leaveschoolmouthinput").attr("value",leaveschoolmouthinput);
 	 	  	$("#leaveschooldayinput").attr("value",leaveschooldayinput);
 	   		$("#workyearinput").attr("value",workyearinput);
 	   		$("#workmouthinput").attr("value",workmouthinput);
 	   		$("#workdayinput").attr("value",workdayinput);
 	   		$("#koumokuininput").attr("value",koumokuininput);
 	   		$("#leaveworkyearinput").attr("value",leaveworkyearinput);
	   		$("#leaveworkmouthinput").attr("value",leaveworkmouthinput);
	   		$("#leaveworkdayinput").attr("value",leaveworkdayinput);
//	   	input显示        	
            $("input").removeAttr("hidden","hidden");
            $("textarea").removeAttr("hidden","hidden");

//  	textarea清空
            $("textarea").text("");
//      图片变化             
            $("#editimgbutton").attr("hidden","hidden");
            $("#saveimgbutton").removeAttr("hidden","hidden");
//      在职选择徒添显示            
            $("#workstatus1").removeAttr("hidden","hidden");
        	$("#workstatus2").removeAttr("hidden","hidden");
        	$("#workstatus3").attr("hidden","hidden");
        	$("#workstatus4").attr("hidden","hidden");
        	$("#koumokuin1").attr("hidden","hidden");
         	$("#koumokuin2").attr("hidden","hidden");
         	$("#koumokuout1").attr("hidden","hidden");
         	$("#koumokuout2").attr("hidden","hidden");
//      text隐藏             
            $("text").attr("hidden","hidden");
//		skill图片展示 skillshow>>skill           
            $(".skillshow").attr("hidden","hidden");
            $(".skill").removeAttr("hidden","hidden");
            
//		top变换          
            $("#employeetoptext").text("员工详细情报-编辑中");
            $("#employeetoptext").removeAttr("hidden","hidden");
           
        });
// 工作状态图片变换        
        $("#workstatus1").mouseover(function() {
            $("#workstatus1").attr("src","../static/png/working.png");
         
        });
        $("#workstatus1").mouseleave(function() {
            $("#workstatus1").attr("src","../static/png/workunchoose.png");
         
        });  
        
        $("#workstatus2").mouseover(function() {
            $("#workstatus2").attr("src","../static/png/workout.png");
         
        });
        $("#workstatus2").mouseleave(function() {
            $("#workstatus2").attr("src","../static/png/workoutunchoose.png");
         
        }); 
// 工作状态 在职中click       
        $("#workstatus1").click(function() {
        	workstatus=1;
            $("#workstatus1").attr("hidden","hidden");
            $("#workstatus4").attr("hidden","hidden");
            $("#workstatus3").removeAttr("hidden","hidden");
            $("#workstatus2").removeAttr("hidden","hidden");
            $("#workstatus2").attr("src","../static/png/workoutunchoose.png");
            $("#koumokuin1").removeAttr("hidden","hidden");
         	$("#koumokuin2").removeAttr("hidden","hidden");
         	$("#koumokuout1").attr("hidden","hidden");
         	$("#koumokuout2").attr("hidden","hidden");
        });
// 工作状态 已离职click           
        $("#workstatus2").click(function() {
        	workstatus=2;
        	$("#workstatus2").attr("hidden","hidden");
            $("#workstatus4").removeAttr("hidden","hidden");
            $("#workstatus3").attr("hidden","hidden");
            $("#workstatus1").removeAttr("hidden","hidden");
            $("#workstatus1").attr("src","../static/png/workunchoose.png");
            $("#koumokuin1").attr("hidden","hidden");
         	$("#koumokuin2").attr("hidden","hidden");
         	$("#koumokuout1").removeAttr("hidden","hidden");
         	$("#koumokuout2").removeAttr("hidden","hidden");
        });
        
// VUEskill图片变换        
		
        $('#VUEskill').mouseover(function(){
        	$('#VUEskill').attr("hidden","hidden");	
        	$('#VUEskillup').removeAttr("hidden","hidden");	
        	$('#VUEskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#VUEskill').mouseleave(function(){
        	$('#VUEskill').removeAttr("hidden","hidden");	
        	$('#VUEskillup').attr("hidden","hidden");	
        	$('#VUEskilldown').attr("hidden","hidden");	
        
        
        });
        $('#VUEskill').mouseleave(function(){
        	$('#VUEskill').removeAttr("hidden","hidden");	
        	$('#VUEskillup').attr("hidden","hidden");	
        	$('#VUEskilldown').attr("hidden","hidden");	
        
        
        });
        $('#VUEskillup').click(function(){
        	if(VUEskillvalue<5){
        		VUEskillvalue=VUEskillvalue+1;
        	}else{
        		VUEskillvalue=5;
        	}
        	switch(VUEskillvalue){
        		case 5:{$('#VUEskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#VUEskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#VUEskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#VUEskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#VUEskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#VUEskilldown').click(function(){
        	if(VUEskillvalue>1){
        		VUEskillvalue=VUEskillvalue-1;
        	}else{
        		VUEskillvalue=1;
        	}
        	switch(VUEskillvalue){
        		case 5:{$('#VUEskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#VUEskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#VUEskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#VUEskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#VUEskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        
// Javaskill图片变换   
	
        $('#Javaskill').mouseover(function(){
        	$('#Javaskill').attr("hidden","hidden");	
        	$('#Javaskillup').removeAttr("hidden","hidden");	
        	$('#Javaskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Javaskill').mouseleave(function(){
        	$('#Javaskill').removeAttr("hidden","hidden");	
        	$('#Javaskillup').attr("hidden","hidden");	
        	$('#Javaskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Javaskill').mouseleave(function(){
        	$('#Javaskill').removeAttr("hidden","hidden");	
        	$('#Javaskillup').attr("hidden","hidden");	
        	$('#Javaskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Javaskillup').click(function(){
        	if(Javaskillvalue<5){
        		Javaskillvalue=Javaskillvalue+1;
        	}else{
        		Javaskillvalue=5;
        	}
        	switch(Javaskillvalue){
        		case 5:{$('#Javaskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Javaskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Javaskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Javaskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Javaskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Javaskilldown').click(function(){
        	if(Javaskillvalue>1){
        		Javaskillvalue=Javaskillvalue-1;
        	}else{
        		Javaskillvalue=1;
        	}
        	switch(Javaskillvalue){
        		case 5:{$('#Javaskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Javaskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Javaskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Javaskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Javaskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Angularskill图片变换   
		
        $('#Angularskill').mouseover(function(){
        	$('#Angularskill').attr("hidden","hidden");	
        	$('#Angularskillup').removeAttr("hidden","hidden");	
        	$('#Angularskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Angularskill').mouseleave(function(){
        	$('#Angularskill').removeAttr("hidden","hidden");	
        	$('#Angularskillup').attr("hidden","hidden");	
        	$('#Angularskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Angularskill').mouseleave(function(){
        	$('#Angularskill').removeAttr("hidden","hidden");	
        	$('#Angularskillup').attr("hidden","hidden");	
        	$('#Angularskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Angularskillup').click(function(){
        	if(Angularskillvalue<5){
        		Angularskillvalue=Angularskillvalue+1;
        	}else{
        		Angularskillvalue=5;
        	}
        	switch(Angularskillvalue){
        		case 5:{$('#Angularskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Angularskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Angularskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Angularskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Angularskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Angularskilldown').click(function(){
        	if(Angularskillvalue>1){
        		Angularskillvalue=Angularskillvalue-1;
        	}else{
        		Angularskillvalue=1;
        	}
        	switch(Angularskillvalue){
        		case 5:{$('#Angularskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Angularskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Angularskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Angularskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Angularskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Androidskill图片变换   
		
        $('#Androidskill').mouseover(function(){
        	$('#Androidskill').attr("hidden","hidden");	
        	$('#Androidskillup').removeAttr("hidden","hidden");	
        	$('#Androidskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Androidskill').mouseleave(function(){
        	$('#Androidskill').removeAttr("hidden","hidden");	
        	$('#Androidskillup').attr("hidden","hidden");	
        	$('#Androidskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Androidskill').mouseleave(function(){
        	$('#Androidskill').removeAttr("hidden","hidden");	
        	$('#Androidskillup').attr("hidden","hidden");	
        	$('#Androidskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Androidskillup').click(function(){
        	if(Androidskillvalue<5){
        		Androidskillvalue=Androidskillvalue+1;
        	}else{
        		Androidskillvalue=5;
        	}
        	switch(Androidskillvalue){
        		case 5:{$('#Androidskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Androidskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Androidskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Androidskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Androidskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Androidskilldown').click(function(){
        	if(Androidskillvalue>1){
        		Androidskillvalue=Androidskillvalue-1;
        	}else{
        		Androidskillvalue=1;
        	}
        	switch(Androidskillvalue){
        		case 5:{$('#Androidskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Androidskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Androidskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Androidskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Androidskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// JSPskill图片变换   
		
        $('#JSPskill').mouseover(function(){
        	$('#JSPskill').attr("hidden","hidden");	
        	$('#JSPskillup').removeAttr("hidden","hidden");	
        	$('#JSPskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#JSPskill').mouseleave(function(){
        	$('#JSPskill').removeAttr("hidden","hidden");	
        	$('#JSPskillup').attr("hidden","hidden");	
        	$('#JSPskilldown').attr("hidden","hidden");	
        
        
        });
        $('#JSPskill').mouseleave(function(){
        	$('#JSPskill').removeAttr("hidden","hidden");	
        	$('#JSPskillup').attr("hidden","hidden");	
        	$('#JSPskilldown').attr("hidden","hidden");	
        
        
        });
        $('#JSPskillup').click(function(){
        	if(JSPskillvalue<5){
        		JSPskillvalue=JSPskillvalue+1;
        	}else{
        		JSPskillvalue=5;
        	}
        	switch(JSPskillvalue){
        		case 5:{$('#JSPskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#JSPskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#JSPskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#JSPskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#JSPskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#JSPskilldown').click(function(){
        	if(JSPskillvalue>1){
        		JSPskillvalue=JSPskillvalue-1;
        	}else{
        		JSPskillvalue=1;
        	}
        	switch(JSPskillvalue){
        		case 5:{$('#JSPskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#JSPskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#JSPskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#JSPskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#JSPskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Thymeleafskill图片变换   
		
        $('#Thymeleafskill').mouseover(function(){
        	$('#Thymeleafskill').attr("hidden","hidden");	
        	$('#Thymeleafskillup').removeAttr("hidden","hidden");	
        	$('#Thymeleafskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Thymeleafskill').mouseleave(function(){
        	$('#Thymeleafskill').removeAttr("hidden","hidden");	
        	$('#Thymeleafskillup').attr("hidden","hidden");	
        	$('#Thymeleafskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Thymeleafskill').mouseleave(function(){
        	$('#Thymeleafskill').removeAttr("hidden","hidden");	
        	$('#Thymeleafskillup').attr("hidden","hidden");	
        	$('#Thymeleafskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Thymeleafskillup').click(function(){
        	if(Thymeleafskillvalue<5){
        		Thymeleafskillvalue=Thymeleafskillvalue+1;
        	}else{
        		Thymeleafskillvalue=5;
        	}
        	switch(Thymeleafskillvalue){
        		case 5:{$('#Thymeleafskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Thymeleafskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Thymeleafskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Thymeleafskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Thymeleafskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Thymeleafskilldown').click(function(){
        	if(Thymeleafskillvalue>1){
        		Thymeleafskillvalue=Thymeleafskillvalue-1;
        	}else{
        		Thymeleafskillvalue=1;
        	}
        	switch(Thymeleafskillvalue){
        		case 5:{$('#Thymeleafskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Thymeleafskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Thymeleafskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Thymeleafskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Thymeleafskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// SqlServerskill图片变换   
		
        $('#SqlServerskill').mouseover(function(){
        	$('#SqlServerskill').attr("hidden","hidden");	
        	$('#SqlServerskillup').removeAttr("hidden","hidden");	
        	$('#SqlServerskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#SqlServerskill').mouseleave(function(){
        	$('#SqlServerskill').removeAttr("hidden","hidden");	
        	$('#SqlServerskillup').attr("hidden","hidden");	
        	$('#SqlServerskilldown').attr("hidden","hidden");	
        
        
        });
        $('#SqlServerskill').mouseleave(function(){
        	$('#SqlServerskill').removeAttr("hidden","hidden");	
        	$('#SqlServerskillup').attr("hidden","hidden");	
        	$('#SqlServerskilldown').attr("hidden","hidden");	
        
        
        });
        $('#SqlServerskillup').click(function(){
        	if(SqlServerskillvalue<5){
        		SqlServerskillvalue=SqlServerskillvalue+1;
        	}else{
        		SqlServerskillvalue=5;
        	}
        	switch(SqlServerskillvalue){
        		case 5:{$('#SqlServerskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#SqlServerskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#SqlServerskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#SqlServerskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#SqlServerskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#SqlServerskilldown').click(function(){
        	if(SqlServerskillvalue>1){
        		SqlServerskillvalue=SqlServerskillvalue-1;
        	}else{
        		SqlServerskillvalue=1;
        	}
        	switch(SqlServerskillvalue){
        		case 5:{$('#SqlServerskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#SqlServerskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#SqlServerskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#SqlServerskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#SqlServerskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Jqueryskill图片变换   
		
        $('#Jqueryskill').mouseover(function(){
        	$('#Jqueryskill').attr("hidden","hidden");	
        	$('#Jqueryskillup').removeAttr("hidden","hidden");	
        	$('#Jqueryskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Jqueryskill').mouseleave(function(){
        	$('#Jqueryskill').removeAttr("hidden","hidden");	
        	$('#Jqueryskillup').attr("hidden","hidden");	
        	$('#Jqueryskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Jqueryskill').mouseleave(function(){
        	$('#Jqueryskill').removeAttr("hidden","hidden");	
        	$('#Jqueryskillup').attr("hidden","hidden");	
        	$('#Jqueryskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Jqueryskillup').click(function(){
        	if(Jqueryskillvalue<5){
        		Jqueryskillvalue=Jqueryskillvalue+1;
        	}else{
        		Jqueryskillvalue=5;
        	}
        	switch(Jqueryskillvalue){
        		case 5:{$('#Jqueryskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Jqueryskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Jqueryskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Jqueryskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Jqueryskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Jqueryskilldown').click(function(){
        	if(Jqueryskillvalue>1){
        		Jqueryskillvalue=Jqueryskillvalue-1;
        	}else{
        		Jqueryskillvalue=1;
        	}
        	switch(Jqueryskillvalue){
        		case 5:{$('#Jqueryskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Jqueryskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Jqueryskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Jqueryskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Jqueryskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Reactskill图片变换   
		
        $('#Reactskill').mouseover(function(){
        	$('#Reactskill').attr("hidden","hidden");	
        	$('#Reactskillup').removeAttr("hidden","hidden");	
        	$('#Reactskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Reactskill').mouseleave(function(){
        	$('#Reactskill').removeAttr("hidden","hidden");	
        	$('#Reactskillup').attr("hidden","hidden");	
        	$('#Reactskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Reactskill').mouseleave(function(){
        	$('#Reactskill').removeAttr("hidden","hidden");	
        	$('#Reactskillup').attr("hidden","hidden");	
        	$('#Reactskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Reactskillup').click(function(){
        	if(Reactskillvalue<5){
        		Reactskillvalue=Reactskillvalue+1;
        	}else{
        		Reactskillvalue=5;
        	}
        	switch(Reactskillvalue){
        		case 5:{$('#Reactskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Reactskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Reactskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Reactskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Reactskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Reactskilldown').click(function(){
        	if(Reactskillvalue>1){
        		Reactskillvalue=Reactskillvalue-1;
        	}else{
        		Reactskillvalue=1;
        	}
        	switch(Reactskillvalue){
        		case 5:{$('#Reactskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Reactskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Reactskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Reactskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Reactskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// HTMLskill图片变换   
		
        $('#HTMLskill').mouseover(function(){
        	$('#HTMLskill').attr("hidden","hidden");	
        	$('#HTMLskillup').removeAttr("hidden","hidden");	
        	$('#HTMLskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#HTMLskill').mouseleave(function(){
        	$('#HTMLskill').removeAttr("hidden","hidden");	
        	$('#HTMLskillup').attr("hidden","hidden");	
        	$('#HTMLskilldown').attr("hidden","hidden");	
        
        
        });
        $('#HTMLskill').mouseleave(function(){
        	$('#HTMLskill').removeAttr("hidden","hidden");	
        	$('#HTMLskillup').attr("hidden","hidden");	
        	$('#HTMLskilldown').attr("hidden","hidden");	
        
        
        });
        $('#HTMLskillup').click(function(){
        	if(HTMLskillvalue<5){
        		HTMLskillvalue=HTMLskillvalue+1;
        	}else{
        		HTMLskillvalue=5;
        	}
        	switch(HTMLskillvalue){
        		case 5:{$('#HTMLskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#HTMLskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#HTMLskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#HTMLskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#HTMLskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#HTMLskilldown').click(function(){
        	if(HTMLskillvalue>1){
        		HTMLskillvalue=HTMLskillvalue-1;
        	}else{
        		HTMLskillvalue=1;
        	}
        	switch(HTMLskillvalue){
        		case 5:{$('#HTMLskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#HTMLskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#HTMLskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#HTMLskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#HTMLskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// CSSskill图片变换   
		
        $('#CSSskill').mouseover(function(){
        	$('#CSSskill').attr("hidden","hidden");	
        	$('#CSSskillup').removeAttr("hidden","hidden");	
        	$('#CSSskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#CSSskill').mouseleave(function(){
        	$('#CSSskill').removeAttr("hidden","hidden");	
        	$('#CSSskillup').attr("hidden","hidden");	
        	$('#CSSskilldown').attr("hidden","hidden");	
        
        
        });
        $('#CSSskill').mouseleave(function(){
        	$('#CSSskill').removeAttr("hidden","hidden");	
        	$('#CSSskillup').attr("hidden","hidden");	
        	$('#CSSskilldown').attr("hidden","hidden");	
        
        
        });
        $('#CSSskillup').click(function(){
        	if(CSSskillvalue<5){
        		CSSskillvalue=CSSskillvalue+1;
        	}else{
        		CSSskillvalue=5;
        	}
        	switch(CSSskillvalue){
        		case 5:{$('#CSSskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#CSSskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#CSSskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#CSSskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#CSSskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#CSSskilldown').click(function(){
        	if(CSSskillvalue>1){
        		CSSskillvalue=CSSskillvalue-1;
        	}else{
        		CSSskillvalue=1;
        	}
        	switch(CSSskillvalue){
        		case 5:{$('#CSSskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#CSSskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#CSSskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#CSSskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#CSSskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
 // tenNetskill图片变换   
		
        $('#tenNetskill').mouseover(function(){
        	$('#tenNetskill').attr("hidden","hidden");	
        	$('#tenNetskillup').removeAttr("hidden","hidden");	
        	$('#tenNetskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#tenNetskill').mouseleave(function(){
        	$('#tenNetskill').removeAttr("hidden","hidden");	
        	$('#tenNetskillup').attr("hidden","hidden");	
        	$('#tenNetskilldown').attr("hidden","hidden");	
        
        
        });
        $('#tenNetskill').mouseleave(function(){
        	$('#tenNetskill').removeAttr("hidden","hidden");	
        	$('#tenNetskillup').attr("hidden","hidden");	
        	$('#tenNetskilldown').attr("hidden","hidden");	
        
        
        });
        $('#tenNetskillup').click(function(){
        	if(tenNetskillvalue<5){
        		tenNetskillvalue=tenNetskillvalue+1;
        	}else{
        		tenNetskillvalue=5;
        	}
        	switch(tenNetskillvalue){
        		case 5:{$('#tenNetskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#tenNetskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#tenNetskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#tenNetskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#tenNetskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#tenNetskilldown').click(function(){
        	if(tenNetskillvalue>1){
        		tenNetskillvalue=tenNetskillvalue-1;
        	}else{
        		tenNetskillvalue=1;
        	}
        	switch(tenNetskillvalue){
        		case 5:{$('#tenNetskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#tenNetskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#tenNetskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#tenNetskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#tenNetskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// IOSskill图片变换   
		
        $('#IOSskill').mouseover(function(){
        	$('#IOSskill').attr("hidden","hidden");	
        	$('#IOSskillup').removeAttr("hidden","hidden");	
        	$('#IOSskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#IOSskill').mouseleave(function(){
        	$('#IOSskill').removeAttr("hidden","hidden");	
        	$('#IOSskillup').attr("hidden","hidden");	
        	$('#IOSskilldown').attr("hidden","hidden");	
        
        
        });
        $('#IOSskill').mouseleave(function(){
        	$('#IOSskill').removeAttr("hidden","hidden");	
        	$('#IOSskillup').attr("hidden","hidden");	
        	$('#IOSskilldown').attr("hidden","hidden");	
        
        
        });
        $('#IOSskillup').click(function(){
        	if(IOSskillvalue<5){
        		IOSskillvalue=IOSskillvalue+1;
        	}else{
        		IOSskillvalue=5;
        	}
        	switch(IOSskillvalue){
        		case 5:{$('#IOSskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#IOSskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#IOSskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#IOSskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#IOSskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#IOSskilldown').click(function(){
        	if(IOSskillvalue>1){
        		IOSskillvalue=IOSskillvalue-1;
        	}else{
        		IOSskillvalue=1;
        	}
        	switch(IOSskillvalue){
        		case 5:{$('#IOSskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#IOSskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#IOSskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#IOSskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#IOSskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
     // Mysqlskill图片变换   
		
        $('#Mysqlskill').mouseover(function(){
        	$('#Mysqlskill').attr("hidden","hidden");	
        	$('#Mysqlskillup').removeAttr("hidden","hidden");	
        	$('#Mysqlskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Mysqlskill').mouseleave(function(){
        	$('#Mysqlskill').removeAttr("hidden","hidden");	
        	$('#Mysqlskillup').attr("hidden","hidden");	
        	$('#Mysqlskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Mysqlskill').mouseleave(function(){
        	$('#Mysqlskill').removeAttr("hidden","hidden");	
        	$('#Mysqlskillup').attr("hidden","hidden");	
        	$('#Mysqlskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Mysqlskillup').click(function(){
        	if(Mysqlskillvalue<5){
        		Mysqlskillvalue=Mysqlskillvalue+1;
        	}else{
        		Mysqlskillvalue=5;
        	}
        	switch(Mysqlskillvalue){
        		case 5:{$('#Mysqlskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Mysqlskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Mysqlskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Mysqlskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Mysqlskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Mysqlskilldown').click(function(){
        	if(Mysqlskillvalue>1){
        		Mysqlskillvalue=Mysqlskillvalue-1;
        	}else{
        		Mysqlskillvalue=1;
        	}
        	switch(Mysqlskillvalue){
        		case 5:{$('#Mysqlskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Mysqlskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Mysqlskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Mysqlskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Mysqlskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Oracleskill图片变换   
		
        $('#Oracleskill').mouseover(function(){
        	$('#Oracleskill').attr("hidden","hidden");	
        	$('#Oracleskillup').removeAttr("hidden","hidden");	
        	$('#Oracleskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Oracleskill').mouseleave(function(){
        	$('#Oracleskill').removeAttr("hidden","hidden");	
        	$('#Oracleskillup').attr("hidden","hidden");	
        	$('#Oracleskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Oracleskill').mouseleave(function(){
        	$('#Oracleskill').removeAttr("hidden","hidden");	
        	$('#Oracleskillup').attr("hidden","hidden");	
        	$('#Oracleskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Oracleskillup').click(function(){
        	if(Oracleskillvalue<5){
        		Oracleskillvalue=Oracleskillvalue+1;
        	}else{
        		Oracleskillvalue=5;
        	}
        	switch(Oracleskillvalue){
        		case 5:{$('#Oracleskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Oracleskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Oracleskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Oracleskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Oracleskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Oracleskilldown').click(function(){
        	if(Oracleskillvalue>1){
        		Oracleskillvalue=Oracleskillvalue-1;
        	}else{
        		Oracleskillvalue=1;
        	}
        	switch(Oracleskillvalue){
        		case 5:{$('#Oracleskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Oracleskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Oracleskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Oracleskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Oracleskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Cupupskill图片变换   
		
        $('#Cupupskill').mouseover(function(){
        	$('#Cupupskill').attr("hidden","hidden");	
        	$('#Cupupskillup').removeAttr("hidden","hidden");	
        	$('#Cupupskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Cupupskill').mouseleave(function(){
        	$('#Cupupskill').removeAttr("hidden","hidden");	
        	$('#Cupupskillup').attr("hidden","hidden");	
        	$('#Cupupskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Cupupskill').mouseleave(function(){
        	$('#Cupupskill').removeAttr("hidden","hidden");	
        	$('#Cupupskillup').attr("hidden","hidden");	
        	$('#Cupupskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Cupupskillup').click(function(){
        	if(Cupupskillvalue<5){
        		Cupupskillvalue=Cupupskillvalue+1;
        	}else{
        		Cupupskillvalue=5;
        	}
        	switch(Cupupskillvalue){
        		case 5:{$('#Cupupskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Cupupskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Cupupskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Cupupskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Cupupskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Cupupskilldown').click(function(){
        	if(Cupupskillvalue>1){
        		Cupupskillvalue=Cupupskillvalue-1;
        	}else{
        		Cupupskillvalue=1;
        	}
        	switch(Cupupskillvalue){
        		case 5:{$('#Cupupskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Cupupskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Cupupskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Cupupskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Cupupskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// CXskill图片变换   
		
        $('#CXskill').mouseover(function(){
        	$('#CXskill').attr("hidden","hidden");	
        	$('#CXskillup').removeAttr("hidden","hidden");	
        	$('#CXskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#CXskill').mouseleave(function(){
        	$('#CXskill').removeAttr("hidden","hidden");	
        	$('#CXskillup').attr("hidden","hidden");	
        	$('#CXskilldown').attr("hidden","hidden");	
        
        
        });
        $('#CXskill').mouseleave(function(){
        	$('#CXskill').removeAttr("hidden","hidden");	
        	$('#CXskillup').attr("hidden","hidden");	
        	$('#CXskilldown').attr("hidden","hidden");	
        
        
        });
        $('#CXskillup').click(function(){
        	if(CXskillvalue<5){
        		CXskillvalue=CXskillvalue+1;
        	}else{
        		CXskillvalue=5;
        	}
        	switch(CXskillvalue){
        		case 5:{$('#CXskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#CXskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#CXskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#CXskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#CXskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#CXskilldown').click(function(){
        	if(CXskillvalue>1){
        		CXskillvalue=CXskillvalue-1;
        	}else{
        		CXskillvalue=1;
        	}
        	switch(CXskillvalue){
        		case 5:{$('#CXskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#CXskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#CXskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#CXskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#CXskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
        
// Springskill图片变换   

        $('#Springskill').mouseover(function(){
        	$('#Springskill').attr("hidden","hidden");	
        	$('#Springskillup').removeAttr("hidden","hidden");	
        	$('#Springskilldown').removeAttr("hidden","hidden");	
        
        
        });
        $('#Springskill').mouseleave(function(){
        	$('#Springskill').removeAttr("hidden","hidden");	
        	$('#Springskillup').attr("hidden","hidden");	
        	$('#Springskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Springskill').mouseleave(function(){
        	$('#Springskill').removeAttr("hidden","hidden");	
        	$('#Springskillup').attr("hidden","hidden");	
        	$('#Springskilldown').attr("hidden","hidden");	
        
        
        });
        $('#Springskillup').click(function(){
        	if(Springskillvalue<5){
        		Springskillvalue=Springskillvalue+1;
        	}else{
        		Springskillvalue=5;
        	}
        	switch(Springskillvalue){
        		case 5:{$('#Springskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Springskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Springskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Springskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Springskill').attr("src","../static/png/skille.png");	break;}
        	}
        });
        $('#Springskilldown').click(function(){
        	if(Springskillvalue>1){
        		Springskillvalue=Springskillvalue-1;
        	}else{
        		Springskillvalue=1;
        	}
        	switch(Springskillvalue){
        		case 5:{$('#Springskill').attr("src","../static/png/skilla.png");	break;}
        		case 4:{$('#Springskill').attr("src","../static/png/skillb.png");	break;}
        		case 3:{$('#Springskill').attr("src","../static/png/skillc.png");	break;}
        		case 2:{$('#Springskill').attr("src","../static/png/skilld.png");	break;}
        		case 1:{$('#Springskill').attr("src","../static/png/skille.png");	break;}
        	}
        });        
//  out退出方法        
        $('#out').click(function(){
        	if(confirm("确认关闭系统？")){window.close();}
        });
        
//  outimg变换        
        $('#out').mouseover(function(){
        	$('#out').attr("src","../static/png/outon.png");
        });
        $('#out').mouseleave(function(){
   	    	$('#out').attr("src","../static/png/out.png");
        });
//  userinfoimg变换        
        $('#userinfo').mouseover(function(){
        	$('#userinfo').attr("src","../static/png/userinfoon.png");
        });
        $('#userinfo').mouseleave(function(){
        	$('#userinfo').attr("src","../static/png/userinfo.png");
        });
//  setimg变换        
        $('#set').mouseover(function(){
        	$('#set').attr("src","../static/png/seton.png");
        });
        $('#set').mouseleave(function(){
        	$('#set').attr("src","../static/png/set.png");
        });        
// tittle显示        
        $("#employeetoptext").removeAttr("hidden","hidden");
	}); 