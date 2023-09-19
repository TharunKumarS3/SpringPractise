package org.example;

import org.springframework.stereotype.Component;

//@Component //without this also we can create object
public class College {

    private  Principal princi;// injecting values in java annotaton

    //using constructor injection
//    public College(Principal princi) {
//        this.princi = princi;
//    }

    //using setter injection

    public void setPrinci(Principal princi) {
        this.princi = princi;
    }

    public  void disp()
    {
        princi.dojob();
        System.out.println("SIUUUUUUU");
    }



}
