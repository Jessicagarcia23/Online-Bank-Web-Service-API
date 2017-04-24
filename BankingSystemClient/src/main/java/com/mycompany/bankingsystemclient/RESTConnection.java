/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingsystemclient;

import com.mycompany.bankingsystemclient.models.Customer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author Admin
 */
public class RESTConnection {
    
    public static Customer signIn(String email,String password){
        String path="http://localhost:8080/BankingSystemOfficial/api/Customer";
        Client client =Client.create();
        WebResource target= client.resource(path);
        ClientResponse response = target.queryParam("email",email)
                .queryParam("password", password)
                .accept("application/json")
                .get(ClientResponse.class);
       String entity = response.getEntity(String.class);
        if(response.getStatus()==200){
                JSONObject json = new JSONObject(entity);
                Customer c = new Customer(
                json.getInt("customerNo"), json.getString("fullname"),json.getString("address"),json.getString("email"),json.getString("password"));
                return c;
        }else if (response.getStatus()== 204){
            return null;
                
        }
        else{
            return null;
                }
    }
    
    /* POST REQUEST METHOD 
    */
    
    public static boolean sendPostRequest(Object object, String apiPath){
        Client client = Client. create();
        WebResource target = client.resource(apiPath);
        
        String param = new JSONObject(object).toString();
        /*Check parameters */
        System.out.println("Post Param:" + param);
        
        ClientResponse response = target.accept("application/json")
                .type("application/json")
                .post(ClientResponse.class,param);
        
        if (response.getStatus() == 204){
            return true;
            
        }else{
            return false;
            
        }
    }
    
    
    public static boolean sendPutRegister(Object object,String apiPath,Integer id){
    Client client = Client.create();
    WebResource target = client.resource(apiPath +"/!" +id);
            
            
    String param = new JSONObject(object).toString();
    ClientResponse response = target.accept("application/json")
            .type("application/json")
            .put(ClientResponse.class, param);
            
            if (response.getStatus()== 204){
                return true;
             
            }else{
                return false;
               
            }
        }  
}