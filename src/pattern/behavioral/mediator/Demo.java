package pattern.behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, Alice!");
    }
}
