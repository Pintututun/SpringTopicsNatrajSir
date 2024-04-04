package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nt.dao.ILoginDAO;
import com.nt.service.IloginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class LoginMgmtServiceTestAnno {
	@InjectMocks
	private LoginMgmtServiceImpl loginService;
	@Mock
	private ILoginDAO loginDAOMock;
	
	//@Spy
	//private ILoginDAO loginDAOSpy;
	
	public LoginMgmtServiceTestAnno() {
		MockitoAnnotations.openMocks(this);
	}
	//Test methods
	@Test
	public void testLoginWithValidCredentials() {
		//Provide Stub(Temporary Functionalities) for DAO's authenticate method
		//Mockito.when(loginDAOMock.authenticate("Raja", "Rani")).thenReturn(1);
		BDDMockito.given(loginDAOMock.authenticate("Raja","Rani")).willReturn(1);
		//Unit Testing
		assertTrue(loginService.login("Raja","Rani"));
	}
	
	//Test methods
		@Test
		public void testLoginWithInValidCredentials() {
			//Provide Stub(Temporary Functionalities) for DAO's authenticate method
			Mockito.when(loginDAOMock.authenticate("Raja", "Rani1")).thenReturn(0);
			//Unit Testing
			assertFalse(loginService.login("Raja","Rani1"));
		}
		
		//Test methods
		@Test
		public void testLoginWithNoCredentials() {
			//Provide Stub(Temporary Functionalities) for DAO's authenticate method
			//Unit Testing
			assertThrows(IllegalArgumentException.class,()->{loginService.login("","");});
		}
		
		  @Test
		  public void testRegisterWithSpy() { 
			  ILoginDAO loginDAOSpy=Mockito.spy(ILoginDAO.class); 
			  IloginMgmtService loginService=new LoginMgmtServiceImpl(loginDAOSpy); 
			  loginService.registerUser("Raja","Admin");
			  loginService.registerUser("Suresh","Visitor");
		      loginService.registerUser("jani","");
		  
		  Mockito.verify(loginDAOSpy,Mockito.times(1)).addUser("Raja","Admin");
		  Mockito.verify(loginDAOSpy,Mockito.times(0)).addUser("suresh","visitor");
		  Mockito.verify(loginDAOSpy,Mockito.never()).addUser("Jani","");
		  
		  }
		 
}
