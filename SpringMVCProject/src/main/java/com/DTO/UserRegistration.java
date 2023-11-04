package com.DTO;

import com.Annotations.Age;
import jakarta.validation.constraints.NotEmpty;

public class UserRegistration {
    @NotEmpty(message = "* have to fill this")
    private String name;
    private String userName;
    private char[] password;
    private String ursex;

    @Age //created my 1st annoatation
    private Integer age;



    private CommunicationDTO communicationDTO; //nested object //this class has some attributes
    //that will be placed in many pages so we dont need to create many times that attribute
    //instead we can place those attributes in seperate class and we can use it whenever we needed
    //by just invoking its class object

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getUrsex() {
        return ursex;
    }

    public void setUrsex(String ursex) {
        this.ursex = ursex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CommunicationDTO getCommunicationDTO() {
        return communicationDTO;
    }

    public void setCommunicationDTO(CommunicationDTO communicationDTO) {
        this.communicationDTO = communicationDTO;
    }
}
