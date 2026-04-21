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

    }
}
