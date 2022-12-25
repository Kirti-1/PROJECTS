const panels = document.querySelectorAll('.panel');
// will select all the panels class and put that into the node list.

panels.forEach((panel) => {
   // adding event listener to each of these so whenever we click on them something happens.
   panel.addEventListener('click', () =>{
       // remove all the active classes before adding new active class
       removeActiveClasses();
       panel.classList.add('active');
      })
})
function removeActiveClasses(){
    panels.forEach( (panel) => {
        panel.classList.remove('active');
    })
}