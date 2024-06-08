package org.test;

import org.test.service.DateSorter;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.parse("2004-07-01"), LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"), LocalDate.parse("2032-05-03")
        );

        DateSorter dateSorter = new DateSorter();
        dateSorter.sortDates(dates).forEach(System.out::println);
    }
}