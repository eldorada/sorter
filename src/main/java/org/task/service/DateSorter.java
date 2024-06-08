package org.task.service;

import java.time.LocalDate;
import java.util.*;

public class DateSorter {

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        List<LocalDate> list = unsortedDates.stream().sorted(Comparator.naturalOrder())
                    .toList();

        List<LocalDate> withR = new ArrayList<>();
        Stack<LocalDate> withoutR = new Stack<>();

        for (LocalDate date : list) {
            if (!date.getMonth().name().contains("R")) {
                withoutR.push(date);
            } else {
                withR.add(date);
            }
        }

        while (!withoutR.isEmpty()) {
            withR.add(withoutR.pop());
        }

        return withR;
    }
}
