package com.app.anurag;

import java.time.LocalDate;

public class DateCalculator {

    public static void main(String[] args) {

        LocalDate lmp = LocalDate.of(2024, 2, 24);
        System.out.println("Lat period LMP -------------- "  +lmp);

        LocalDate asPerSonography = LocalDate.of(2024, 2, 25);

        System.out.println("Lat period LMP as Per the Sonography -------------- "  +asPerSonography);
        System.out.println("Delivery Date -------------- "  );

        System.out.println("40 week later : "+ asPerSonography.plusWeeks(40));

        System.out.println(" 36 week later : "+ asPerSonography.plusWeeks(36));

    }
}
