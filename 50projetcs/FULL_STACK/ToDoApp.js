const form = document.getElementById("add-form")
const field = document.getElementById("form-field")
// form.addEventListener("submit", (event)=>{
//     event.preventDefault()
    
// })
form.addEventListener("submit", (event)=> {
    event.preventDefault()
    let data = field.value;
    // console.log(data);
    createItem(data)

})
/*
function createItem(data){
    let li_item = document.createElement('li')
    let ul_list = document.getElementById("add-item");
    let grocery_data = document.createTextNode(data);
    grocery_data+= `<button>Delete</button>`;
    li_item.appendChild(grocery_data);
    ul_list.appendChild(li_item); 
}
*/

function createItem(data){
    let element = `<li>${data} <button onClick='deleteItem(this)'>Delete</button></li>`
    let ul_list = document.getElementById("add-item")
    ul_list.insertAdjacentElement("Beforeend", element)
    field.value = ""
    field.focus()
}

function deleteItem(element){

}
