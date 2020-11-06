package com.mani.spring_ioc_xml_configuration;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
