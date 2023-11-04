package com.formatter;

import com.DTO.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

//implements formatter to deal with phone numbers //converting string object to Phone object
//to work Formatter we need to tell to spring that we used formatter
//so you configure this formatters also by implemting the  WebMvcConfigurer
public class PhoneNumberFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String text, Locale locale) throws ParseException {
        //this method is called when the register button is clicked
        //text -> text entered into textbox by user

        //logic to convert and split the phone number
        //extract countrycode and phoneNumber
        Phone phone = new Phone();
        String[] result = text.split("-");
        //verifying the format of input 91-6381654139
        int index=text.indexOf('-');
        if(index==-1 )
        {
         phone.setCountryCode("91");
         phone.setUserPhone(result[0]);

        }
        else {
            if(text.charAt(0)=='-')
            {
                phone.setCountryCode("91");
                phone.setUserPhone(text.substring(1));
            }
            else {
                phone.setCountryCode(result[0]);
                phone.setUserPhone(result[1]);
            }
        }
        return phone;
    }

    @Override
    public String print(Phone object, Locale locale) {
        //it is used to data binding like loading default values to the fied
        return null;
    }
}
