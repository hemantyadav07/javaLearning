public class switchExample {
    public static void main(String[] args) {
        String day = "";
        switch (day) {
            case "monday":
                System.out.println("It's Monday");
                break;
            case "tuesday":
                System.out.println("It's Tuesday");
                break;
            case "wednesday":
                System.out.println("It's Wednesday");
                break;
            case "thursday":
                System.out.println("It's Thursday");
                break;
            case "friday":
                System.out.println("It's Friday");
                break;
            case "saturday":
                System.out.println("It's Saturday");
                break;
            case "sunday":
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
