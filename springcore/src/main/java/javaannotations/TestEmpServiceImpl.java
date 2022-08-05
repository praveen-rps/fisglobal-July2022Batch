package javaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestEmpServiceImpl {
	
	@Autowired
	public EmpService service;
	
	public void getEmpServieType() {
		service.getServiceType();
	}

}
