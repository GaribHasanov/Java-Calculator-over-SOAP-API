package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
     @WebMethod
     public int add (int a,int b) {
         return a+b;
     }@WebMethod
     public int substract(int a,int b){
         return a-b;
     }@WebMethod    
     public int multiply (int a ,int b) {
         return a*b;
     }@WebMethod
     public int devide (int a , int b) {
         return a/b;
     }
}
