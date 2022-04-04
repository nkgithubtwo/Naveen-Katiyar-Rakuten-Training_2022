function save(){
	const element = document.getElementById('firstname');
	console.log(element.value);
	
	const age = document.getElementById('age');
	console.log(age.value);
	
	const elements = document.getElementsByTagName('input');
	console.log(elements);
	
	for(let i = 0 ; i < elements.length; i++){
		if(elements[i].type == "radio" && elements[i].checked)
		{
	       console.log(elements[i].value);
		}
		
	}
	
}