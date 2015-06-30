package org.owasp.appsensor.ui.controller;

import org.owasp.appsensor.core.KeyValuePair;
import org.owasp.appsensor.ui.rest.RestReportingEngineFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigurationController {

	@Autowired
	private RestReportingEngineFacade facade;
	
	@RequestMapping(value="/configuration", method = RequestMethod.GET)
	public String home() {
		return "configuration";
	}
	
	@RequestMapping(value="/api/configuration/server-config", method = RequestMethod.GET)
	@ResponseBody
	public String getServerConfiguration() {
		return facade.getServerConfiguration();
	}

	@RequestMapping(value="/api/configuration/server-config-base64", method = RequestMethod.GET)
	@ResponseBody
	public KeyValuePair getBase64EncodedServerConfiguration() {
		return facade.getBase64EncodedServerConfiguration();
	}
	
}
