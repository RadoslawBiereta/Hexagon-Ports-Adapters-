import adapter.ConsoleAdapterImpl;
import adapter.FormAdapter;
import application.RectangleServiceImpl;
import domain.ConsolePort;

public class Application {
    public static void main(String[] args) {
        domain.RectangleService rectangleService = new RectangleServiceImpl();
        ConsolePort consolePort = new ConsoleAdapterImpl(rectangleService);
        consolePort.run();
        FormAdapter formAdapter = new FormAdapter(rectangleService);
        formAdapter.runForm();

    }
}
