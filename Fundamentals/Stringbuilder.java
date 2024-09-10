public class Stringbuilder {

    public static void main(String[] args) {
        String location = "Hyderabad";
        int flightNumber = 169;
        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on Flight #");
        sb.append(flightNumber);
        String time="9.00";
        int pos=sb.indexOf(" on");
        sb.insert(pos," at ");
        sb.insert(pos+4,time);
        String message=sb.toString();
        System.out.println(message);
    }
}
