package com.eletronica.deltaApi.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {



    public static Date toDate(String string){
        if(string.equals(""))
            return null;
        if(string==null)
            return null;
        if(string.equals("dataSaida"))
            return null;
        Date date= null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(string);
        } catch (ParseException e) {
            System.out.println("123456789 1234567 -------------");
            System.out.println(string);
            System.out.println("MOSTRA");
            e.printStackTrace();
        }
        return date;
    }
    public static  String dateToSring(Date dateString){
        if(dateString==null){
            return "";
        }
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = dateFormat.format(dateString);
        return  strDate;
    }
}
