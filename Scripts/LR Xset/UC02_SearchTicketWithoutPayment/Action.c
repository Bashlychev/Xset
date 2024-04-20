Action()
{

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.5");
	
	lr_start_transaction("UC02_01_HomePage");

	web_url("WebTours", 
		"URL=http://localhost:1080/WebTours/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTTP", 
		LAST);

	web_websocket_send("ID=0", 
		"Buffer={\"messageType\":\"hello\",\"broadcasts\":{},\"use_webpush\":true}", 
		"IsBinary=0", 
		LAST);

	
		//	"PROVERKA UC02_1"
	
	web_reg_find("Text=Welcome to the Web Tours site.",LAST);
	
	web_custom_request("home.html", 
		"URL=http://localhost:1080/WebTours/home.html", 
		"Method=GET", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t6.inf", 
		"Mode=HTTP", 
		LAST);
	
	web_url("welcome.pl", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/", 
		"Snapshot=t3.inf", 
		"Mode=HTTP", 
		LAST);


/*Correlation comment - Do not change!  Original value='138808.621952207HVDQQziptQVzzzzHtciDQpiVAQf' Name ='userSession' Type ='Manual'*/
	web_reg_save_param_ex(
		"ParamName=userSession",
		"LB=name=\"userSession\" value=\"",
		"RB=\"",
		SEARCH_FILTERS,
		"Scope=Body",
		LAST);

	web_url("nav.pl", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t7.inf", 
		"Mode=HTTP", 
		LAST);

	/*Connection ID 0 received buffer WebSocketReceive0*/


	lr_end_transaction("UC02_01_HomePage",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC02_02_Login");
	
	//	"PROVERKA UC02_2"
	
	web_reg_find("Fail=Found",
		"Search=Body",
		"Text=User password was not correct",
		LAST);

	web_submit_data("login.pl",
		"Action=http://localhost:1080/cgi-bin/login.pl",
		"Method=POST",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/nav.pl?in=home",
		"Snapshot=t9.inf",
		"Mode=HTTP",
		ITEMDATA,
		"Name=userSession", "Value={userSession}", ENDITEM,
		"Name=username", "Value={username}", ENDITEM,
		"Name=password", "Value={password}", ENDITEM,
		"Name=login.x", "Value=45", ENDITEM,
		"Name=login.y", "Value=10", ENDITEM,
		"Name=JSFormSubmit", "Value=off", ENDITEM,
		LAST);
	
	web_url("login.pl_2", 
		"URL=http://localhost:1080/cgi-bin/login.pl?intro=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t10.inf", 
		"Mode=HTTP", 
		LAST);
//
//	web_url("nav.pl_2", 
//		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
//		"Resource=0", 
//		"RecContentType=text/html", 
//		"Referer=http://localhost:1080/cgi-bin/login.pl", 
//		"Snapshot=t11.inf", 
//		"Mode=HTTP", 
//		LAST);

	lr_end_transaction("UC02_02_Login",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC02_03_FindFlight");
	
//	"Proverka UC02_3"
	
	web_reg_find("Text=User has returned to the search page",LAST);

	web_url("Search Flights Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t16.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("nav.pl_3", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"Snapshot=t17.inf", 
		"Mode=HTTP", 
		LAST);


	web_url("reservations.pl", 
		"URL=http://localhost:1080/cgi-bin/reservations.pl?page=welcome", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=search", 
		"Snapshot=t19.inf", 
		"Mode=HTTP", 
		LAST);
	
	lr_end_transaction("UC02_03_FindFlight",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC02_04_FindFlight_ChooseDate");
	
/*Correlation comment - Do not change!  Original value='000;0;04/21/2024' Name ='outboundFlight' Type ='Manual'*/
	web_reg_save_param_ex(
		"ParamName=outboundFlight",
		"LB=name=\"outboundFlight\" value=\"",
		"RB=\" checked",
		SEARCH_FILTERS,
		"Scope=Body",
		LAST);
		
	//	"PROVERKA UC02_04"
	web_reg_find("Text=Flight departing from <B>{depart}</B> to <B>{arrive}</B> on <B>{departDate}</B>", LAST);	

	web_submit_data("reservations.pl_2", 
		"Action=http://localhost:1080/cgi-bin/reservations.pl", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/reservations.pl?page=welcome", 
		"Snapshot=t22.inf", 
		"Mode=HTTP", 
		ITEMDATA, 
		"Name=advanceDiscount", "Value=0", ENDITEM, 
		"Name=depart", "Value={depart}", ENDITEM, 
		"Name=departDate", "Value={departDate}", ENDITEM, 
		"Name=arrive", "Value={arrive}", ENDITEM, 
		"Name=returnDate", "Value={returnDate}", ENDITEM, 
		"Name=numPassengers", "Value=1", ENDITEM, 
		"Name=seatPref", "Value={seatPref}", ENDITEM, 
		"Name=seatType", "Value={seatType}", ENDITEM, 
		"Name=findFlights.x", "Value=36", ENDITEM, 
		"Name=findFlights.y", "Value=5", ENDITEM, 
		"Name=.cgifields", "Value=roundtrip", ENDITEM, 
		"Name=.cgifields", "Value=seatType", ENDITEM, 
		"Name=.cgifields", "Value=seatPref", ENDITEM, 
		LAST);

	lr_end_transaction("UC02_04_FindFlight_ChooseDate",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC02_05_ChooseTIme");
	
	//	"PROVERKA UC02_05"
	
	web_reg_find("Text=Payment Details",LAST);

	web_submit_data("reservations.pl_3",
		"Action=http://localhost:1080/cgi-bin/reservations.pl",
		"Method=POST",
		"RecContentType=text/html",
		"Referer=http://localhost:1080/cgi-bin/reservations.pl",
		"Snapshot=t23.inf",
		"Mode=HTTP",
		ITEMDATA,
		"Name=outboundFlight", "Value={outboundFlight}", ENDITEM,
		"Name=numPassengers", "Value=1", ENDITEM,
		"Name=advanceDiscount", "Value=0", ENDITEM,
		"Name=seatType", "Value={seatType}", ENDITEM,
		"Name=seatPref", "Value={seatPref}", ENDITEM,
		"Name=reserveFlights.x", "Value=51", ENDITEM,
		"Name=reserveFlights.y", "Value=10", ENDITEM,
		LAST);
	
	lr_end_transaction("UC02_05_ChooseTIme",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC02_06_Exit");
	
	//	"PROVERKA #UC02_6"
	
	web_reg_find("Text=The server options can be set via the Admin page",
		LAST);

	web_url("SignOff Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=flights", 
		"Snapshot=t24.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("nav.pl_4", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?in=home", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t26.inf", 
		"Mode=HTTP", 
		LAST);
	
	lr_end_transaction("UC02_06_Exit",LR_AUTO);
	
	lr_think_time(5);


	return 0;
}