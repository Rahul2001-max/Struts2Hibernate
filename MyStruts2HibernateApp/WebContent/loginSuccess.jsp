<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    text-align: center;
    background-color: #f4f4f4;
}

header {
    background: #333;
    padding: 10px 20px;
    color: white;
    position: fixed;
    width: 100%;
    top: 0;
}

nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
}

nav ul {
    list-style: none;
    display: flex;
}

nav ul li {
    margin: 0 15px;
}

nav ul li a {
    color: white;
    text-decoration: none;
}

.hero {
    height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;
    background: url('banner.jpg') no-repeat center center/cover;
    color: white;
    text-align: center;
}

.hero .btn {
    display: inline-block;
    margin-top: 15px;
    padding: 10px 20px;
    background: #ff5733;
    color: white;
    text-decoration: none;
    border-radius: 5px;
}

section {
    padding: 50px;
    background: white;
    margin: 20px 10px;
    border-radius: 10px;
}

form {
    max-width: 400px;
    margin: auto;
    display: flex;
    flex-direction: column;
}

input, textarea {
    margin: 10px 0;
    padding: 10px;
    width: 100%;
    border: 1px solid #ddd;
    border-radius: 5px;
}

button {
    background: #28a745;
    color: white;
    padding: 10px;
    border: none;
    cursor: pointer;
    border-radius: 5px;
}

.hidden {
    display: none;
}
</style>

<script>function validateForm() {
    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let message = document.getElementById("message").value.trim();
    let successMessage = document.getElementById("success-message");

    if (name === "" || email === "" || message === "") {
        alert("All fields are required.");
        return false;
    }

    if (!email.includes("@")) {
        alert("Please enter a valid email.");
        return false;
    }

    successMessage.classList.remove("hidden");
    return false; // Prevent actual form submission
}
</script>
</head>
<body>

    <header>
        <nav>
            <div class="logo">My Website</div>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="data.jsp">GetuserDetails</a></li>
            </ul>
        </nav>
    </header>

    <section id="home" class="hero">
        <div class="hero-content">
            <h1 style="color:red;">Welcome to My Website</h1>
            <p>Your one-stop destination for amazing content.</p>
            <a href="#about" class="btn">Learn More</a>
        </div>
    </section>

    <section id="about">
        <h2>About Us</h2>
        <p>We provide high-quality services and solutions for your needs.</p>
    </section>

    <section id="contact">
        <h2>Contact Us</h2>
        <form onsubmit="return validateForm()">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="message">Message:</label>
            <textarea id="message" name="message" required></textarea>

            <button type="submit">Submit</button>
        </form>
        <p id="success-message" class="hidden">Thank you! We will get back to you soon.</p>
    </section>

</body>
</html>