public class SwitchExamples {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the week!");
                break;
            case "Friday":
                System.out.println("Almost weekend!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's weekend!");
                break;
            default:
                System.out.println("Midweek days are for productivity!");
                break;
        }
    }
}
