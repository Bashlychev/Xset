Action()
{

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.5");

	lr_start_transaction("UC06_01_HomePage");
	
	web_url("WebTours", 
		"URL=http://localhost:1080/WebTours/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t16.inf", 
		"Mode=HTTP", 
		LAST);

	web_websocket_send("ID=0", 
		"Buffer={\"messageType\":\"hello\",\"broadcasts\":{},\"use_webpush\":true}", 
		"IsBinary=0", 
		LAST);
	
	//	"PROVERKA #UC06_1"
	
	web_reg_find("Text=A Session ID has been created and loaded into a cookie called MSO",
		LAST);

	web_url("welcome.pl", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/", 
		"Snapshot=t18.inf", 
		"Mode=HTTP", 
		LAST);


	web_url("nav.pl", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t22.inf", 
		"Mode=HTTP", 
		LAST);

	lr_end_transaction("UC06_01_HomePage",LR_AUTO);

	lr_think_time(5);
	

	lr_start_transaction("UC06_02_Registration");
	
	/*Connection ID 0 received buffer WebSocketReceive0*/
	
	//	"PROVERKA #UC06_2"
	
	web_reg_find("Text=Customer Profile",
		LAST);

	web_url("sign up now", 
		"URL=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/home.html", 
		"Snapshot=t24.inf", 
		"Mode=HTTP", 
		LAST);

	lr_end_transaction("UC06_02_Registration",LR_AUTO);

	lr_think_time(5);
	
	lr_start_transaction("UC06_03_DataInput");
	
//	"PROVERKA #UC06_3"
	web_reg_find("Text=Thank you, <b>{Random}</b>, for registering and welcome to the Web Tours family.",
		LAST);

	web_submit_data("login.pl", 
		"Action=http://localhost:1080/cgi-bin/login.pl", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl?username=&password=&getInfo=true", 
		"Snapshot=t27.inf", 
		"Mode=HTTP", 
		ITEMDATA, 
		"Name=username", "Value={Random}", ENDITEM, 
		"Name=password", "Value={Random}", ENDITEM, 
		"Name=passwordConfirm", "Value={Random}", ENDITEM, 
		"Name=firstName", "Value=1", ENDITEM, 
		"Name=lastName", "Value=1", ENDITEM, 
		"Name=address1", "Value=1", ENDITEM, 
		"Name=address2", "Value=1", ENDITEM, 
		"Name=register.x", "Value=61", ENDITEM, 
		"Name=register.y", "Value=2", ENDITEM, 
		LAST);
	
	lr_end_transaction("UC06_03_DataInput",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC06_04_Continue1");
	
	//	"PROVERKA #UC06_4"
	
	web_reg_find("Text=User has returned to the home page.", LAST);

	web_url("button_next.gif_2", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t28.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("login.pl_2", 
		"URL=http://localhost:1080/cgi-bin/login.pl?intro=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"Snapshot=t29.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("nav.pl_2", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=menus", 
		"Snapshot=t30.inf", 
		"Mode=HTTP", 
		LAST);

	lr_end_transaction("UC06_04_Continue1",LR_AUTO);

	lr_think_time(5);
	
	lr_start_transaction("UC06_05_Exit");
	
	//	"PROVERKA #UC06_5"
	
	web_reg_find("Text=The server options can be set via the Admin page",
		LAST);

	web_url("SignOff Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t35.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("home.html_2", 
		"URL=http://localhost:1080/WebTours/home.html", 
		"Resource=0", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t36.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("nav.pl_3", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t37.inf", 
		"Mode=HTTP", 
		LAST);

	lr_end_transaction("UC06_05_Exit",LR_AUTO);
	
	lr_think_time(5);
	
	return 0;
}