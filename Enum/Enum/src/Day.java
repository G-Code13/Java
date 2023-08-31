public enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static void workingDays(Day days){
        switch(days){
            case SUNDAY:
                System.out.println("Today is not a working day");
                break;
            case SATURDAY:
                System.out.println("Today is not a working day");
                break;
            default:
                System.out.println("Today is a working day");
        }
    }
}
