var express = require("express");
var app = express();
var mysql = require("mysql");
var host = "localhost";
var user = "root";
var password = "";
var database = "asm01";
var connection = mysql.createConnection({
	host: host,
	user: user,
	password: password,
	database: database
});
connection.connect(function(err){
	if (err) throw err;
	console.log("connected!");
});
var sql = "SELECT * FROM sinhvien";
connection.query(sql,function(err,result){
	console.log(result);
});
app.get("/getmenu",function(req,res){
	connection.query(sql,function(err,result){
		res.send(result);
	});
});
app.listen(3000);