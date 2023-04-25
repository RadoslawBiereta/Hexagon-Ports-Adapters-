package adapter;

import application.RectangleServiceImpl;

public class Application {
    public static void main(String[] args) {
        domain.RectangleService rectangleService = new RectangleServiceImpl();
        ConsoleAdapter consoleAdapter = new ConsoleAdapterImpl(rectangleService);
        consoleAdapter.run();
    }
}

