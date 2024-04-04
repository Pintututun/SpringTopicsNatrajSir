package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonalInfo {
 
	@Value("${per.name}")
	private String name;
	@Value("${per.addrs}")
	private String addrs;
	@Value("${per.age}")
	private Integer age;
	
	@Value("5000036")
	private Long pinCode;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;
	
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", addrs=" + addrs + ", age=" + age + ", pinCode=" + pinCode + ", osName="
				+ osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
	}
	
	
}
