<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
    		<form class="well form-horizontal" action="putInfomation" method="post"  id="contact_form">
			<fieldset>
				<legend>Profile</legend>
				<div class="form-group">
				  <label class="col-md-4 control-label">Name</label>  
				  <div class="col-md-4 inputGroupContainer">
				  <div class="input-group">
				  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  <input name="name" placeholder="Your name" class="form-control"  type="text">
				    </div>
				  </div>
				</div>

		       	<div class="form-group">
				  <label class="col-md-4 control-label">Age</label>  
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  <input name="age" placeholder="Your age" class="form-control" type="text">
				    </div>
				  </div>
				</div>
				<div class="form-group">
				  <label class="col-md-4 control-label">Favorite</label>  
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				        <span class="input-group-addon"><i class="glyphicon glyphicon-heart"></i></span>
				  <input name="favorite" placeholder="Favorite" class="form-control" type="text">
				    </div>
				  </div>
				</div>
				<div class="form-group">
				  <label class="col-md-4 control-label">Work</label>  
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
				  <input name="work" placeholder="Work" class="form-control" type="text">
				    </div>
				  </div>
				</div>
				<div class="form-group">
				  <label class="col-md-4 control-label">Archivements</label>
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
				        	<textarea class="form-control" name="archivements" placeholder="Archivements"></textarea>
				  </div>
				  </div>
				</div>
				<div class="form-group">
				  <label class="col-md-4 control-label">Research</label>
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
				        	<textarea class="form-control" name="research" placeholder="Research"></textarea>
				  </div>
				  </div>
				</div>
				<div class="form-group">
				  <label class="col-md-4 control-label"></label>
				  <div class="col-md-4">
				    <button type="submit" class="btn btn-warning" >Send <span class="glyphicon glyphicon-send"></span></button>
				  </div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>