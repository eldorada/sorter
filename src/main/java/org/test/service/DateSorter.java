package org.test.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DateSorter {

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> list = unsortedDates.stream().sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

        int i = 0;
        int j = 0;
        while (i < list.size() - j) {
            if (!list.get(i).getMonth().name().contains("R")) {
                LocalDate l = list.get(i);
                for (int k = i; k < list.size() - j - 1; k++) {
                    list.set(k, list.get(k+1));
                }
                list.set(list.size() - j - 1, l);
                j++;
            } else {
                i++;
            }
        }

       return list;
    }
}
