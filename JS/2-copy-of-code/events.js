function validateMandatoryFields() {
    const username = document.getElementById("username").value.trim();
    const password = document.getElementById("password").value.trim();
    const confirmPassword = document.getElementById("confirmPassword").value.trim();

    if (!username || !password || !confirmPassword) {
        alert("All fields are mandatory.");
        return false;
    }
    return true;
}


function validateUsername() {
    const username = document.getElementById("username").value;
    const usernameRegex = /^[a-zA-Z]{5,10}$/;
    const hasUppercase = /[A-Z]/.test(username);
    const hasLowercase = /[a-z]/.test(username);

    if (!usernameRegex.test(username) || !hasUppercase || !hasLowercase) {
        alert("Username must be 5-10 alphabetic characters, containing at least one uppercase and one lowercase letter.");
        return false;
    }
    return true;
}
function validatePassword() {
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;
    const passwordRegex = /^(?=.[a-z])(?=.[A-Z])(?=.\d)(?=.[\W_]).{5,10}$/;

    if (!passwordRegex.test(password)) {
        alert("Password must be 5-10 characters long and include uppercase, lowercase, numbers, and special characters.");
        return false;
    }
    function validatePassword() {
        const password = document.getElementById("password").value;
        const confirmPassword = document.getElementById("confirmPassword").value;
        const passwordRegex = /^(?=.[a-z])(?=.[A-Z])(?=.\d)(?=.[\W_]).{5,10}$/;
    
        if (!passwordRegex.test(password)) {
            alert("Password must be 5-10 characters long and include uppercase, lowercase, numbers, and special characters.");
            return false;
        }
    }
}