import java.util.HashMap;
import java.util.Map;

public class Ticket {
    public static void main(String[] args) {
        HashMap<String,String> ticket =  new HashMap<>();
        ticket.put("Mumbai", "Indore");
        ticket.put("Indore", "Hyderabad");
        ticket.put("Hyderabad", "Warangle");
        ticket.put("Delhi", "Mumbai");
        journey(ticket);
    }
    public static void journey(HashMap<String,String> ticket){
        HashMap<String,String> reverseTicket =  new HashMap<>();
        String source = null;
        for (Map.Entry<String,String> map : ticket.entrySet()) {
            reverseTicket.put(map.getValue(),map.getKey());
        }
        for (Map.Entry<String,String> map : ticket.entrySet()) {
            if(!reverseTicket.containsKey(map.getKey())){
                source = map.getKey();
                break;
            }
        }
        for (int i = 0; i < ticket.size()+1; i++) {
            System.out.print(source+"=>");
            if(i <ticket.size()){
                source = ticket.get(source);
            }
        }
    }
}
