// JavaScript Document
window.onload = function() {  
    var unameDom=$("uname");  
    unameDom.onblur=function(){  
        var content="name="+unameDom.value;  
        var url="./csdn/UserAction_checkName.action?time="+new Date().getTime();  
          
        var xhr=createXHR();  
        xhr.onreadystatechange=function(){  
            if(xhr.readyState==4){  
                if(xhr.status==200||xhr.status==304){  
                    $("cname").innerHTML=xhr.responseText;  
                }  
            }  
              
        }  
        xhr.open("POST",url,true);  
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");  
        xhr.send(content);  
    }  
}  