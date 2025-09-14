package com.app.anurag;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Locale;
import java.util.Set;

public class LocalDateAndTime {

    public static void main(String[] args) {

        System.out.println("LocalDate -------------- "  );

        System.out.println("Delivery Date -------------- "  );

        System.out.println(LocalDate.of(2024, 02, 25).plus(40, ChronoUnit.WEEKS));
        System.out.println("LocalDate = " +LocalDate.now() );
        System.out.println("LocalDate.of = " + LocalDate.of(2015, 2, 20));
        System.out.println("LocalDate.Parse = " + LocalDate.parse("2015-02-20"));
        System.out.println("90 = " + LocalDate.now().plusDays(90));
        System.out.println("previousMonthSameDay = " + LocalDate.now().minusMonths(1));
        System.out.println("sunday = " + LocalDate.parse("2024-08-21").getDayOfWeek());
        System.out.println("twelve = " + LocalDate.parse("2024-05-19").getDayOfMonth());
        System.out.println("leapYear = " + LocalDate.now().isLeapYear());
        System.out.println("notBefore = " + LocalDate.parse("2024-05-19").isBefore(LocalDate.parse("2024-05-18")));
        System.out.println("isAfter = " + LocalDate.parse("2024-05-19").isAfter(LocalDate.parse("2024-05-18")));
        System.out.println("beginningOfDay = " + LocalDate.parse("2024-05-19").atStartOfDay());
        System.out.println("firstDayOfMonth = " + LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println(" -------------- "  );
        System.out.println("LocalTime -------------- "  );
        System.out.println(" -------------- "  );

        System.out.println("LocalTime = " + LocalTime.now());
        System.out.println("sixThirty = " + LocalTime.parse("06:30"));
        System.out.println("sevenThirty = " + LocalTime.parse("06:30").plusHours(1));
        System.out.println("six = " +  LocalTime.parse("06:30").getHour());
        System.out.println("isBefore = " + LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30")));
        System.out.println("maxTime = " + LocalTime.MAX);

        System.out.println(" -------------- ");
        System.out.println("LocalDateTime -------------- "  );

        System.out.println("LocalDateTime = " + LocalDateTime.now());
        System.out.println("LocalDateTime = " + LocalDateTime.of(2015, Month.FEBRUARY, 20, 6, 30));
        System.out.println("LocalDateTime = " + LocalDateTime.parse("2015-02-20T06:30:00"));
        LocalDateTime localDateTime =  LocalDateTime.now();
        System.out.println("tomorrow = " +  localDateTime.plusDays(1));
        System.out.println("minusTwoHour = " + localDateTime.minusHours(2));
        System.out.println("currentMonth = " + localDateTime.getMonth());


        System.out.println(" -------------- "  );
        System.out.println("ZonedDateTime -------------- "  );
        System.out.println(" -------------- "  );

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("ZonedDateTime-of = " +  ZonedDateTime.of(localDateTime, zoneId));
        System.out.println("ZonedDateTime-parse = " + ZonedDateTime.parse("2024-05-17T10:15:30+01:00[Europe/Paris]"));
        ZoneOffset offset = ZoneOffset.of("+02:00");
        System.out.println("offSetByTwo = " + OffsetDateTime.of(localDateTime, offset));
        System.out.print("allZoneIds = " );
        allZoneIds.forEach(System.out::print);

        System.out.println(" -------------- "  );
        System.out.println("Period -------------- "  );
        System.out.println(" -------------- "  );
        LocalDate initialDate = LocalDate.parse("2024-05-17");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("initialDate  " + LocalDate.parse("2024-05-17"));
        System.out.println("finalDate  " + initialDate.plus(Period.ofDays(5)));

        System.out.println("Five  " + Period.between(initialDate, finalDate).getDays());
        System.out.println("Five  " + ChronoUnit.DAYS.between(initialDate, finalDate));

        System.out.println(" -------------- "  );
        System.out.println("Duration -------------- "  );
        System.out.println(" -------------- "  );
        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        System.out.println("finalTime = " + initialTime.plus(Duration.ofSeconds(30)));
        System.out.println("thirty = " + Duration.between(initialTime, finalTime).getSeconds());
        System.out.println("thirty = " + ChronoUnit.SECONDS.between(initialTime, finalTime));

        System.out.println(" -------------- "  );
        System.out.println("Date and Time Formatting -------------- "  );
        System.out.println(" -------------- "  );
        //LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
        localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("LocalDateTime -yyyy/MM/dd = " + localDateTime);
        localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));
        System.out.println("LocalDateTime -FormatStyle.MEDIUM).withLocale(Locale.UK) = " + localDateTime);
        System.out.println("DateTimeFormatter. = " + ChronoUnit.SECONDS.between(initialTime, finalTime));


    }

}
