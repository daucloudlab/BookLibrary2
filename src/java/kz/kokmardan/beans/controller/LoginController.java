package kz.kokmardan.beans.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class LoginController {

    public LoginController() {
    }
    
    public String login(){
        return "books" ;
    }
}
