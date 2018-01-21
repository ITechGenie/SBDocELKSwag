package com.itechgenie.apps.sb.conf;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class MyAPISample {

	Logger log = Logger.getLogger("MyAPISample");
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	@RequestMapping("/redata")
	public Map<String, Object> index() {
		Map<String, Object> resp = new HashMap<String, Object>();
		Map<String, Object> data = new HashMap<String, Object>();
		

		for (int i = 0; i < 10; i++) {
			Map<String, String> indata = new HashMap<String, String>();
			String key = "key" + i;
			String value = "prakash_" + i;
			indata.put("key", value) ;
			indata.put("junk", randomAlphaNumeric(15)) ;
			data.put(key, indata);
			log.log(Level.INFO, key + " - " + value);
		}
		
		resp.put("data", data);
		resp.put("success", true);

		log.log(Level.INFO, "final data: " + resp);

		return resp;
	}


	public static String randomAlphaNumeric(int count) {

		StringBuilder builder = new StringBuilder();

		while (count-- != 0) {

			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());

			builder.append(ALPHA_NUMERIC_STRING.charAt(character));

		}

		return builder.toString();

	}

}