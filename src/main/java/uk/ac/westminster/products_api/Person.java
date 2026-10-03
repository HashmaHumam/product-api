package uk.ac.westminster.products_api;

public class Person {
    private String name;
    private String email;

    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
    private String getEmail(){
        return email;
    }
    private void setEmail(String email){
        this.email = email;
    }
}
