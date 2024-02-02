package com.lemlem.restaurant;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("eveningMessage")
@Profile("dev")

public class GreetingEveningService implements GreetingsInterface {
	public String getGreetings() {
		return "Greetings from evening times";
	}

}
