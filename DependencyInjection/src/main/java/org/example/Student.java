package org.example;

public class Student {

    private int id;
    MathCheat cheat; //this class is dependent on MathCheat class

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat(MathCheat cheat) {
        this.cheat = cheat;
    }
    public void startCheat()
    {
        cheat.doCheat();
    }
}
