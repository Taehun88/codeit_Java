package AnonymousExample;

public class AnonymousClassExample {
    public static void main(String[] args){
        EventListener listener = new EventListener() {
            @Override
            public void onEvent(String event) {
                System.out.println(event);
            }
        };
        simulate("USER_LOGIN", listener);
    }

    public static void simulate(String event, EventListener listener){
        listener.onEvent(event);
    }
}
