//Creating Array to store user data

var userlist = new Array();
userlist = JSON.parse(localStorage.getItem('UserList'));




//Registering user details
function register() {

    //Checking the details filled or not
    var fname = document.getElementById('fname').value;
    var lname = document.getElementById('lname').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;
    var password = document.getElementById('password').value;

    if((fname, lname, email, mobile, password) == "") {
        alert('All the details must be filled out');
        return false;
    }
    
    else {
        this.fname = document.getElementById('fname').value;
        this.lname = document.getElementById('lname').value;
        this.email = document.getElementById('email').value;
        this.mobile = document.getElementById('mobile').value;
        this.password = document.getElementById('password').value;


        userlist = [{
            'Fname': this.fname,
            'Lname': this.lname,
            'Email': this.email,
            'Mobile': this.mobile,
            'Password': this.password
        }];
        localStorage.setItem('UserList', JSON.stringify(userlist));
        

        alert('You have successfully registered.');
        window.location.href = 'login.html';
    }
}


//User login Function.
function login() {

    //Getting values from login page
    var user = new Array();
    user  = JSON.parse(localStorage.getItem('UserList'));
    var useremail = user[0].Email;
    var userpassword = user[0].Password;

    
    var a = document.getElementById('email').value;
    var b = document.getElementById('password').value;

    if(a == "" && b == "") {
        alert('User Email and Password must be filled');
        return false;
    }

    else {
        //console.log(user[0].Email);

        if(a  == useremail && b == userpassword) {
            //dispUserData();
            window.location.href = "target.html";
        }
        else {
            alert('Invalid Credentials: Email and Password do not match :(');
        }
    }
    
}


//Contact us method
function contactus() {
    var contactfname = document.getElementById('contactus-fname').value;
    var contactmobile = document.getElementById('contactus-mobile').value;
    var contactquery = document.getElementById('contactus-query').value;

    if((contactfname, contactmobile, contactquery) == "") {
        alert('Please fill out the details before submitting.');
        return false;
    }
    else {
        localStorage.setItem('ContactFname',contactfname);
        localStorage.setItem('ContactMobile',contactmobile);
        localStorage.setItem('ContactQuery',contactquery);
        alert('Your query is submitted successfully.');
        window.location.href = 'index.html';
    }
}

//User feedback
function feedback() {

    var userFeedback = new Array();
    
    userFeedback = [document.getElementById('fdbk').value];

    if(userFeedback == "") {
        alert('Please provide your feedback before submitting.');
    }
    else {
        localStorage.setItem('Feedback',userFeedback);
        alert('You have successfully submitted the feedback...Thank you:)');
    }
    
}



function logout() {
    alert('You have successfully logged out.');
    window.location.href = 'index.html';
}




















/*<script>document.write(localStorage.getItem('Fname'));</script>*/

/*function register(FirstName, LastName, Email, Mobile, Password) {
    this.userFirstName = FirstName;
    this.userLastName = LastName;
    this.userEmail = Email;
    this.userMobile = Mobile;
    this.userPassword = Password;

}*/

//Dom Elements

//const { clear } = require("console");

//form
//Input Tags
/*const Register = document.getElementById('register');
const userFirstName = document.getElementById('fname');
const userLastName = document.getElementById('lname');
const userEmail = document.getElementById('email');
const userMobile = document.getElementById('mobile');
const userPassword = document.getElementById('password');*/