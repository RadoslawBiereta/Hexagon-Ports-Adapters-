package adapter;

import domain.RectangleService;
import java.util.Scanner;

public class ConsoleAdapterImpl implements ConsoleAdapter {
    private final RectangleService rectangleService;
            public ConsoleAdapterImpl(RectangleService rectangleService) {
                this.rectangleService = rectangleService;
            }

   // public ConsoleAdapterImpl(RectangleService rectangleService) {
   // }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość prostokąta: ");
        int length = scanner.nextInt();
        System.out.print("Podaj szerokość prostokąta: ");
        int width = scanner.nextInt();
        int area = rectangleService.calculateRectangleArea(length, width);
        System.out.println("Pole prostokąta wynosi: " + area);
    }
}

