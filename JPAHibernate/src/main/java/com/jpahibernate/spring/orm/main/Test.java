package com.jpahibernate.spring.orm.main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test
{

    public static void main(String[] args)
    {
        Date date = new GregorianCalendar(2019, Calendar.APRIL, 01).getTime();
        System.out.println(getStartOfDay(date));
    }

    public static Date getStartOfDay(Date date)
    {

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);

        calendar.set(year, month, day, 0, 0, 0);
        return calendar.getTime();

    }

}
