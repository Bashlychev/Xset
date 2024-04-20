Action()
{

	web_set_sockets_option("SSL_VERSION", "AUTO");

	web_add_auto_header("Accept-Language", 
		"en-US,en;q=0.5");
	
	lr_start_transaction("UC05_01_HomePage");

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

	web_url("welcome.pl", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/WebTours/", 
		"Snapshot=t3.inf", 
		"Mode=HTTP", 
		LAST);
	
	//	"PROVERKA UC05_1"
		
	web_reg_find("Text=Welcome to the Web Tours site.",LAST);
	
	web_url("home.html", 
		"URL=http://localhost:1080/WebTours/home.html", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=true", 
		"Snapshot=t48.inf", 
		"Mode=HTTP", 
		LAST);

/*Correlation comment - Do not change!  Original value='138808.643418388HVDQQzQpfQfiDDDDtciDQpiVHfHf' Name ='userSession' Type ='Manual'*/
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

	lr_end_transaction("UC05_01_HomePage",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC05_02_Login");

	/*Connection ID 0 received buffer WebSocketReceive0*/

	//	"PROVERKA UC05_2"
	
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
		"Name=login.y", "Value=11", ENDITEM,
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

	web_url("nav.pl_2", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/login.pl", 
		"Snapshot=t11.inf", 
		"Mode=HTTP", 
		LAST);
	
	lr_end_transaction("UC05_02_Login",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC05_03_Iteniraly");
	
	//	"Proverka #UC05_3"
	
	web_reg_find("Text=User wants the intineraries.  Since user has already logged on",LAST);
	
	web_reg_find("Text=Invoice sent to:", "SaveCount=Tickets_Count", LAST);
	
	web_reg_save_param_attrib(
		"ParamName=flightID",
		"TagName=input",
		"Extract=value",
		"Name=flightID",
		"Type=hidden",
		"NotFound=WARNING",
		SEARCH_FILTERS,
		"IgnoreRedirections=No",
		"RequestUrl=*/itinerary.pl*",
		LAST);
	
	web_reg_save_param_regexp(
		"ParamName=BeforeIdTicket",
		"RegExp=name=\"flightID\"\\ value=\"(.*?)-",
		"Ordinal=all",
		"NotFound=WARNING",
		SEARCH_FILTERS,
		"Scope=Body",
		"IgnoreRedirections=No",
		"RequestUrl=*/itinerary.pl*",
		LAST);

	web_url("Itinerary Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=home", 
		"Snapshot=t16.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("itinerary.pl", 
		"URL=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"Snapshot=t17.inf", 
		"Mode=HTTP", 
		LAST);
	
	lr_end_transaction("UC05_03_Iteniraly",LR_AUTO);
	
	lr_think_time(5);

Tickets = atoi(lr_eval_string("{Tickets_Count}"));
if (Tickets != 0){	
	
	lr_start_transaction("UC05_04_CancelChecked");
	
	web_reg_save_param_regexp(
		"ParamName=AfterIdTicket",
		"RegExp=name=\"flightID\"\\ value=\"(.*?)-",
		"Ordinal=all",
		"NotFound=WARNING",
		SEARCH_FILTERS,
		"Scope=Body",
		"IgnoreRedirections=No",
		"RequestUrl=*/itinerary.pl*",
		LAST);

	web_url("nav.pl_3", 
		"URL=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?page=itinerary", 
		"Snapshot=t19.inf", 
		"Mode=HTTP", 
		LAST);
	
	web_submit_data("itinerary.pl_2", 
		"Action=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/itinerary.pl", 
		"Snapshot=t23.inf", 
		"Mode=HTTP", 
		ITEMDATA, 
		"Name=1", "Value=on", ENDITEM, 
		"Name=flightID", "Value=0-7-OO", ENDITEM, 
		"Name=removeFlights.x", "Value=79", ENDITEM, 
		"Name=removeFlights.y", "Value=3", ENDITEM, 
		"Name=.cgifields", "Value=1", ENDITEM, 
		LAST);

BeforeIdTicket_1 = atoi(lr_eval_string("{BeforeIdTicket_1}"));
AfterIdTicket_1 = atoi(lr_eval_string("{AfterIdTicket_1}"));
	
if(BeforeIdTicket_1 == AfterIdTicket_1){

	lr_error_message("Error: %s", "Ticket not deleted");	
	
} else if(BeforeIdTicket_1 != AfterIdTicket_1){

	lr_output_message( "Ticket was deleted #%s", lr_eval_string("{BeforeIdTicket_1}"));

}	
	
	lr_end_transaction("UC05_04_CancelChecked",LR_AUTO);

	lr_think_time(5);

	lr_start_transaction("UC05_05_Exit");

	web_url("SignOff Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t24.inf", 
		"Mode=HTTP", 
		LAST);
	
	web_url("home.html_2", 
		"URL=http://localhost:1080/WebTours/home.html", 
		"Resource=0", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t25.inf", 
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
	
	lr_end_transaction("UC05_05_Exit",LR_AUTO);
	
	lr_think_time(5);

}

else

{
	lr_start_transaction("UC05_05_Exit");	
	
	web_url("SignOff Button", 
		"URL=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=http://localhost:1080/cgi-bin/nav.pl?page=menu&in=itinerary", 
		"Snapshot=t24.inf", 
		"Mode=HTTP", 
		LAST);

	web_url("home.html_2", 
		"URL=http://localhost:1080/WebTours/home.html", 
		"Resource=0", 
		"Referer=http://localhost:1080/cgi-bin/welcome.pl?signOff=1", 
		"Snapshot=t25.inf", 
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
	
	lr_end_transaction("UC05_05_Exit",LR_AUTO);
	
	lr_think_time(5);

	return 0;
}
}