
const sidebar = document.querySelector('.sidebar')
const conts = document.querySelector('.conts')
const items = document.querySelector('.item')
const toggle = document.querySelector('.sidebar .toggle')
function sliding(){
	if(sidebar.className ==='sidebar'){
		sidebar.classList.add('open')
		conts.classList.add('open')
	}
	else{
		sidebar.classList.remove('open')
		conts.classList.remove('open')
	}
}