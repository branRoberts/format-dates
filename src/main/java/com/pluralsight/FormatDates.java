package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        String dateFormat = "dd/MM/yyyy";
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        System.out.println(today.format(formatter));
        System.out.println(today);
        System.out.println("===========================================================");

        LocalDate today2 = LocalDate.now();
        String dateFormat2 =  "EEEEE dd, yyyy  hh:mm 'in GMT'";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(dateFormat2);
        System.out.println(today2.format(formatter2));
    }
}
