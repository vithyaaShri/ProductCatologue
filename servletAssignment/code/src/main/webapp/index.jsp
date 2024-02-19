<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
input[type=submit]{
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 30%;
  margin-left:550px;
  font-size:16px;

}
input[type=submit]:hover {
  opacity: 0.8;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }

</style>
<body>
<form action="add" method="post">
        <h1 align="center" color="Green">Book Feed Back</h1>
        <p>Your Name:</p>
        <input type="text" name="username"/>
        <br/>
        <p>Book Name:</p>
        <input type="text" name="book"/>
        <p>FeedBack:</p>
        <input type="text" name="feed"/>
        <br/><br/><br/>
        <input type="submit"/>

</form>
</body>
</html>
