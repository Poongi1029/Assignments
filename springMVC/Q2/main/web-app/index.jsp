<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Simple Interest Calculator</title>
</head>


<body>
	<div class="container">
		<div class="title">Simple Interest Calculator</div>
		<form method="GET" action="simpleinterest" class="form" name="SI"
			id="form">
			<div class="user-details">
				<div class="input-box">
					<span class="details">Principal Amount</span> <input type="text"
						placeholder="Enter the principal amount" name="principal" required>
				</div>

				<div class="input-box">
					<span class="details">Rate of Interest</span> <input type="text"
						placeholder="Enter the rate of interest" name="rate" required>
				</div>

				<div class="input-box">
					<span class="details">Time Period</span> <input type="text"
						placeholder="Enter the time period" name="time" required>
				</div>
			</div>
			<div class="button">
				<input type="submit" value="Calculate Simple Interest">
			</div>
		</form>

	</div>
</body>

</html>
