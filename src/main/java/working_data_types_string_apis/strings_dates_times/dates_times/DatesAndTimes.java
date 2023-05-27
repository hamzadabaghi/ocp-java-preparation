package working_data_types_string_apis.strings_dates_times.dates_times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {

        /*------- dates and times relative to a local -------*/
        // LocalDate, LocalTime, LocalDateTime

        LocalDate date = LocalDate.now();
        //System.out.println(date); // your current date

        LocalDate date2 = LocalDate.of(2020, 1, 20);
        //System.out.println(date2); // 2020-01-20 ( yyyy-MM-dd ) is the default format

        LocalTime time = LocalTime.now();
        //System.out.println(time); // your current time

        LocalTime time2 = LocalTime.of(6, 15);
        //System.out.println(time2); // 06:15 ( HH:mm ) is the default format


        LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime); // your current date and time T separates date and time

        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
        //System.out.println(dateTime2); // 2020-01-20T06:15 ( yyyy-MM-ddTHH:mm ) is the default format

        /*------- dates and times relative to a time zone -------*/
        // ZonedDateTime

        for (String zone : ZoneId.getAvailableZoneIds()) {
            //System.out.println(zone); // all available time zones
        }
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        //System.out.println(zonedDateTime); // your current date and time with standard UTC ( no offset )


        /*------- duration and period and instant -------*/

        // duration

        LocalTime start = LocalTime.of(9, 0, 0);
        LocalTime end = LocalTime.of(10, 30, 0);
        //System.out.println(Duration.between(start, end).toMinutes() ); //  90

        // period

        LocalDate startDate = LocalDate.of(2023, 5, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 10);

        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.toTotalMonths());
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        // instant

        Instant instant = Instant.now();
        System.out.println(instant); // 2021-08-18T12:00:00.000Z


        /*------- formatting dates and times -------*/

        LocalDateTime dateTimeVar = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy/MM/dd 'lol' HH:mm:ss");
        System.out.println(dateTimeVar.format(pattern)); // 2021/08/18 15:00:00
    }
}
