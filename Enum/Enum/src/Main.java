public class Main {
    public static void main(String[] args) throws Exception {

        Day days = Day.SUNDAY;
        System.out.println(days + "\n");
        Day.values();

        for(Day allDays : Day.values()){
            System.out.println(allDays);
        }
       System.out.println();
       Month months = Month.JUNE;
       System.out.println(months);
    }
}
