package generic;

import java.time.*;

public class _Time_ {
    public static void main(String[] args) {
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
        LocalDate date = LocalDate.of(2004, Month.MAY, 13);
        Period period = Period.ofDays(21);
//        System.out.println(date.getDayOfWeek());
        System.out.println(period);
        System.out.println(date);
        System.out.println(date.plusDays(123));
        System.out.println(date.minusDays(123));
        System.out.println();

        Duration duration = Duration.ofDays(21);
        System.out.println(duration);
    }
}
