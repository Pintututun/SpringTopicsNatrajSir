package com.nt.service;

import com.nt.dao.ILoginDAO;

public final class LoginMgmtServiceImpl implements IloginMgmtService {

	private ILoginDAO loginDAO;
	
	
	public LoginMgmtServiceImpl(ILoginDAO loginDAO) {
		super();
		this.loginDAO = loginDAO;
	}

	@Override
	public boolean login(String username, String password) {
		if(username.equals("")||password.equals(""))
			throw new IllegalArgumentException("Empty credentials");
		
		//Use LoginDAO
		int count=loginDAO.authenticate(username, password);
		if(count==0)
		return false;
		else
			return true;
	}
	public String registerUser(String user,String role) {
		if(!role.equalsIgnoreCase("")&&!role.equalsIgnoreCase("visitor")) {
			loginDAO.addUser(user, role);
		return "User added";
	}
	else {
		return "User Not Added";
	}
}

}
