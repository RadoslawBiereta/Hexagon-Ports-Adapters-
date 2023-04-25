package application;

import domain.RectangleService;

public class RectangleServiceImpl implements domain.RectangleService {
    @Override
    public int calculateRectangleArea(int length, int width) {
        return length * width;
    }
}

