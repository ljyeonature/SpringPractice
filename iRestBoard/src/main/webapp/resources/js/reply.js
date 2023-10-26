$(function(){
   
   // [댓글추가] 버튼이 눌러졌을 때
   $('#replyConfirm').click(function(){
      var params = $('#replyFrm').serialize();
      
      $.ajax({
         type   : 'post',
         data   : params,
         url      : '/iRestBoard/replies/new',
         success   : function(result){
            //alert(result);
            $('#reply').val('');
            $('#replyer').val('');
            replyList();
         },
         error   : function(err){
            alert('error');
            console.log(err);
         }
      });   
   });
   
   replyList();
   // 댓글목록 출력
   function replyList(){
      $.ajax({
         type   : 'get',
         url      : '/iRestBoard/replies',
         data   : { bno : $('#bno').val() }, // 보내는 데이터 값들을 지정
         dataType : 'json', 				 // 받는 데이터 형식
         success   : function(result){
            //alert(result);
            console.log(result);
            
            var replyList = $('#replyList');
            replyList.empty();
            
            for(row of result){
            	var tr = $('<tr/>');
            	var rno = $('<td />').html(row['rno']);
            	// 나머지 처리
            	var replyer = $('<td />').html(row['replyer']);
            	var reply = $('<td />').html(row['reply']);
            	tr.append(rno);
            	tr.append(replyer);
            	tr.append(reply);
            	
            	// 수정, 삭제 버튼 추가
            	tr.append('<td><button class="modify">수정</button></td>');            	
            	tr.append('<td><button class="delete">삭제</button></td>');            	
            
            	
            	replyList.append(tr);
            }
         },
         error   : function(err){
            alert('error');
            console.log(err);
         }
      });
   }
   
   // [수정] 버튼이 눌렸을 때
   $('#replyList').on('click','.modify', function(){
         var btnText = $(this).text();
         var rno = $(this).parents('tr').children().eq(0).text();
         var replytd = $(this).parents('tr').children().eq(2);
         var replyertd = $(this).parents('tr').children().eq(1);
         if (btnText == '수정') {
         	
         	var replyText = replytd.text();
         	//alert(replyText);
         	replytd.text('');
         	replytd.append('<input type="text" name="reply" value="' + replyText + '">');
         
         	// 작성자도 수정가능하려면?
         	var replyerText = replyertd.text();
         	//alert(replyText);
         	replyertd.text('');
         	replyertd.append('<input type="text" name="replyer" value="' + replyerText + '">');
         	
         	$(this).text('수정하기');
         
         } else if(btnText == '수정하기') {
         
         	var updateReply = replytd.find('input').val();
         	var updateReplyer = replyertd.find('input').val();
         	$.ajax({
         	
         		type:'post',
         		url : '../replies/' + rno,
         		data   : JSON.stringify({ 
         				   rno	: rno,
         				   reply : updateReply, 
         				   replyer : updateReplyer
         				 }),
         		contentType:"application/json",
         		dataType:'text',
         		success : function(result){
         			//alert(result);
         			replytd.text(updateReply);
         			replyertd.text(updateReplyer);
         			$(this).text('수정');
         			
         		},
         		error : function(err){
         			console.log(err)
         		}
         	
         	})
         
         }
         
   })
   
   
   // [삭제] 버튼이 눌렸을 때	
   $('#replyList').on('click','.delete', function(){
         //alert("삭제");
         // 해당 삭제 버튼의 댓글 번호를 출력
         var rno = $(this).parents('tr').children().eq(0).text();
         // var rno = $(this).parentsUntil('td').eq(0).text();
         // console.log(rno)
         
         $.ajax({
         	type : 'delete',
         	url  : '../replies/' + rno,
         	success : function(result){
         	console.log(result);
         		replyList();
         	},
         	error : function(err){
         		alert('error')
         		console.log(err)
         	}
         
         });
   })
   

   $('#ajaxCheck').click(function(){
      $.ajax({
         type   : 'post',
         data   : {temp : 'ok'},
         url      : 'test.do',
         success   : function(result){
            alert(result);
         }
      });
      
   });
   
});