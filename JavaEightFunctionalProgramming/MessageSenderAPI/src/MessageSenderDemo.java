/**
 * Created by jhanward on 7/28/2017.
 */
public class MessageSenderDemo {
    public static void main(String[] args) {
        MessageService.send("whatsapp",(String s) -> {
            System.out.printf("Type of messaging : %s", s);
        });
    }
}
