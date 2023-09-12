package org.example;

//autowiring in xml
public class Human {

    private Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
    public void cheeckAlive()
    {
        if (heart!=null)
        {
            heart.pump();
        }
        else
        {
            System.out.println("dead...");
        }
    }
}
