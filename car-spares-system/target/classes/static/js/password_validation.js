  function checkPassword() {
  var password = document.getElementById("password").value;
  var confirmPassword = document.getElementById("confirmPassword").value;
  var message = document.getElementById("message");
    if (password == confirmPassword) {
      message.textContent = "Passwords Match";
      message.style.backgroundColor = "green";
    } else {
      message.textContent = "Passwords don't Match";
      message.style.backgroundColor = "red";
    }
}