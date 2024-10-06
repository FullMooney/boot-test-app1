package com.dev.ict.fwk.common.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.dev.fwk.common.client.RestClient;

@Component
public class Smp26RestClient extends RestClient {

	public Smp26RestClient(@Qualifier("smp26RestTemplate") RestTemplate smp26RestTemplate) {
		super(smp26RestTemplate);
	}

}
