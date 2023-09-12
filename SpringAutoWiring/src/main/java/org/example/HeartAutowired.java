package org.example;

public class HeartAutowired {

    private String name;
    private String idol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdol() {
        return idol;
    }

    public void setIdol(String idol) {
        this.idol = idol;
    }

    public void pump()
    {

        System.out.println("heart is pumping");
    }
}
