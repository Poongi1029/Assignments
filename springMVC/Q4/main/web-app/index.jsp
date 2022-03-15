<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register form</title>
</head>

<body>
<div class="container">
    <div class="title">
        REGISTRATION FORM
    </div>
    <form method = "post" action="success" class="form" name="form" id="form">
        <div class="user-details">
            <div class="input-box">
                <span class="details">EMAIL ID</span>
                <input type="text" placeholder="Enter the email id" name="email" required>
            </div>
        </div>
        <div class="user-details">
            <div class="input-box">
                <span class="details">USERNAME</span>
                <input type="text" placeholder="Enter the username" name="username" required>
            </div>

            <div class="input-box">
                <span class="details">PASSWORD</span>
                <input type="password" placeholder="Enter the password" name="password"  required>
            </div>
        </div>
        <div class="button">
            <input type="submit" value="Register Yourself">
        </div>
    </form>

    </div>
</div>
</body>

</html>