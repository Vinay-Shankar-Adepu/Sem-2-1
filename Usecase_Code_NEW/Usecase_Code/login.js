//Display user details{
    //var a = document.getElementById('un');
    //a.innerHTML =  ${Fname};
    var dispArray = new Array();
    dispArray = JSON.parse(localStorage.getItem('UserList'));

    document.getElementById('un').innerHTML.value = dispArray[0].Fname;

    /*console.log(localStorage.getItem('Fname'));
    document.getElementById("un").innerHTML = localStorage.getItem("Fname");*/

/*for(i=0;i<user.length;i++) {
        user[i] = 
    }*/

    


        