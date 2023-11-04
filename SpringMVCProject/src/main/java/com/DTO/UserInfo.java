package com.DTO;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class UserInfo {

    @NotBlank(message =" *can not be empty") //api validation
    //@Min(value = 3,message = " *name length should be atleast 3")
    @Size(min=3,max = 15,message = "*size should be min 3 and max 15")
    private String urname;

    @NotBlank(message =" *can not be empty") //api validation
    //@Min(value = 3,message = " *name length should be atleast 3")
    @Size(min=3,max = 15,message = "*size should be min 3 and max 15")
    private String crname;
    @AssertTrue(message = "*have to agree the condition")
    private boolean agree;

    private String result;

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }



    public String getUrname() {
        return urname;
    }

    public void setUrname(String urname) {
        this.urname = urname;
    }

    public String getCrname() {
        return crname;
    }

    public void setCrname(String crname) {
        this.crname = crname;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "urname='" + urname + '\'' +
                ", crname='" + crname + '\'' +
                '}';
    }
}
