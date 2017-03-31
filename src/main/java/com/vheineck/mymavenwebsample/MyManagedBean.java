/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vheineck.mymavenwebsample;

import com.vheineck.MyString;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author vheineck
 */
@ManagedBean(name = "controller")
@SessionScoped
public class MyManagedBean {

    private String str; 
    private String result;
    
    /**
     * Creates a new instance of MyManagedBean
     */
    public MyManagedBean() {
    }
    
    @PostConstruct
    public void init()
    {
        
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String str) {
        this.result = str;
    }
    
    public void showInfo() {
    
        String message = "first name: " + getStr();
        System.out.println(message);
        
        result = message;
        
        
    }
    
    public void toUpper() {
    
        String message = MyString.toUpper(str);
        System.out.println(message);
        
        result = message;
        
    }
    
}
