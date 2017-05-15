function areYouSure()
{
	if(!(confirm('Are you sure you want to delete this item'))) return false;
}


function addTax(){
	
	console.log("##$$");
	
	var name = document.getElementById("name").value;
	var price = document.getElementById("price").value;
	
	var dates = document.getElementById("dates").value;
	var datef = document.getElementById("datef").value;
	
	
	var price = {
		 	name:name,
	        price:price,
	        
	    };
}
		
		


function addRoom()
{
	console.log("##");
	var name = document.getElementById("nameroom").value;
	var price = document.getElementById("price").value;
	
	console.log(name+" ^^ "+price);
	
	//AddPriceServlet
	
	var url = "http://localhost:7080/BasicHotelApp/AddPriceServlet";
	
	
	 var room = {
			 	name:name,
		        price:price
		    };

	 
	 var body = JSON.stringify(room);
	 console.log("$$"+body);
	 makePostReq(url, false, body);

	

}


function makePostReq(url, asincron, body) {

    var xmlHttpRequest = new XMLHttpRequest();

    xmlHttpRequest.open("post", url, asincron);
    xmlHttpRequest.setRequestHeader("Content-type", "application/json");
    xmlHttpRequest.send(body);


    var response = xmlHttpRequest.responseText;
    var realResp = JSON.parse(response);

    return realResp;
}