package com.mycompany.studentlotterysystem;

public class Student {
    
    private String firstName;
    private String lastName;
    private String address;
    private String sessionId;
    
    public Student(String first, String last, String address, String sessionId){
        this.firstName = first;
        this.lastName = last;
        this.address = address;     
        this.sessionId = sessionId;
    }
    
    public Student(String first, String last, String address){
        firstName = first;
        lastName = last;
        this.address = address;     
    }

    public String toString(){

        return sessionId;

    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getSessionID() {
        return sessionId;
    }
}
