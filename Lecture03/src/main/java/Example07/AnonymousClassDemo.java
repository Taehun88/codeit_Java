package Example07;

public  class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("Executing custom task");
            }
            @Override
            public void start() {
                System.out.println("Starting custom task");
            }
        };

        customTask.execute();
        customTask.start();
    }
}
