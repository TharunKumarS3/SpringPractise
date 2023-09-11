package org.example;

public class Student2 {

    private int id;
    MathCheat cheat1; //dependent on MahCheat

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat1(MathCheat cheat1) {
        this.cheat1 = cheat1;
    }

    public void startCheat2()
    {
        cheat1.doCheat();
    }
}
