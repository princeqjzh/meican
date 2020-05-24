// JavaScript Document
function $(id){  
    return document.getElementByIdx_x(id);  
}  
function createXHR(){  
    var xhr;  
    var aVersion=["MSXML2.XMLHttp.5.0","MSXML2.XMLHttp.4.0","MSXML2.XMLHttp.3.0","MSXML2.XMLHttp","Microsoft.XMLHttp"];  
    try{  
          
        xhr=new XMLHttpRequest();  
    }catch(ex){  
        for(var i=0;i<aVersion.length;i++){  
            try{  
                xmlHttpRequest=new ActiveXObject(aVersion[i]);  
                return xmlHttpRequest;  
            }catch(exx){  
                continue;  
            }  
        }  
    }  
    return xhr;  
      
}  