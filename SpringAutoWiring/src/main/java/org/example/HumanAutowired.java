package org.example;

// to use @Autowired we need to add some in spring.xml

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HumanAutowired {
    @Autowired
    @Qualifier("human1")
    private HeartAutowired heart;

    HumanAutowired()
    {

    }

    public HumanAutowired(HeartAutowired heart) {
        this.heart = heart;
    }


    public void setHeart(HeartAutowired heart) {
        this.heart = heart;
    }

    public void cheeckAlive()
    {
        if (heart!=null)
        {
            heart.pump();
            System.out.println(heart.getName() + " "+ heart.getIdol());

        }
        else
        {
            System.out.println("dead...");
        }
    }

}
