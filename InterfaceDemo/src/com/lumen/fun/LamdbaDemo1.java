package com.lumen.fun;

public class LamdbaDemo1 {
	
	
	Checker checker = (username,city)->{
		if(username.equals("yash")&& city.equals("chittorgarh"))
			return true;
		else
			return false;
	};
}
