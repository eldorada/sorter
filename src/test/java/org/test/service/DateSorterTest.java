package org.test.service;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateSorterTest {

    @Test
    public void testSortDates() {
        List<LocalDate> datesExpected = List.of(
                LocalDate.parse("2005-01-02"), LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-03"), LocalDate.parse("2004-07-01")
        );

        List<LocalDate> dates = List.of(
                LocalDate.parse("2004-07-01"), LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"), LocalDate.parse("2032-05-03")
        );

        DateSorter dateSorter = new DateSorter();
        Assert.assertEquals(datesExpected, dateSorter.sortDates(dates));
    }

    @Test
    public void testNullDates() {
        List<LocalDate> datesExpected = new ArrayList<>();

        List<LocalDate> dates = new ArrayList<>();

        DateSorter dateSorter = new DateSorter();
        Assert.assertEquals(datesExpected, dateSorter.sortDates(dates));
    }

}
