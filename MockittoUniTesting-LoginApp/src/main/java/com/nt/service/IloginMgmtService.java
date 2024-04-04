package com.nt.service;

public interface IloginMgmtService {
    public boolean login(String username,String password);
    public String registerUser(String user,String role);
}
