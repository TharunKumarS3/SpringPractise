package com.Service;

import org.springframework.stereotype.Service;

@Service
public class FlamesServiceImpl implements  FlamesService{
    public final String flames="FLAMES";

    @Override
    public String calculateLove(String urname, String crname) {
        int totalCount=(urname+crname).toCharArray().length;
        int flameCount=flames.toCharArray().length;

        int result=totalCount %  flameCount;
        char res=flames.charAt(result);
        String finalAns=whatBetweenUs(res);
        return finalAns;
    }

    @Override
    public String whatBetweenUs(char ch) {


        if(ch=='F')
        {
            return FlamesMeaning.F_CHAR_MEANING;
        }
        else if(ch=='L')
        {
            return FlamesMeaning.L_CHAR_MEANING;
        }
        else if(ch=='A')
        {
            return FlamesMeaning.A_CHAR_MEANING;
        }
        else if(ch=='M')
        {
            return FlamesMeaning.M_CHAR_MEANING;

        }
        else if(ch=='E')
        {
            return FlamesMeaning.E_CHAR_MEANING;

        }
        else
        {
            return FlamesMeaning.S_CHAR_MEANING;
        }


    }
}
