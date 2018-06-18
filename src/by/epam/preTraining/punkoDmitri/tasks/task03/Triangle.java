package by.epam.preTraining.punkoDmitri.tasks.task03;

public class Triangle {
    public static boolean isPointsFormATriangle(int firstPointX, int firstPointY, int secondPointX, int secondPointY,
                                                int thirdPointX, int thirdPointY) {

        double firstSide = calcDistanceBetweenPoints(firstPointX, firstPointY, secondPointX, secondPointY);
        double secondSide = calcDistanceBetweenPoints(secondPointX, secondPointY, thirdPointX, thirdPointY);
        double thirdSide = calcDistanceBetweenPoints(thirdPointX, thirdPointY, firstPointX, firstPointY);

        return ((firstSide + secondSide) > thirdSide) && ((firstSide + thirdSide) > secondSide) &&
                ((secondSide + thirdSide) > firstSide);
    }

    public boolean isATriangleRectangular(int firstPointX, int firstPointY, int secondPointX, int secondPointY,
                                          int thirdPointX, int thirdPointY) {

        double firstSide = calcDistanceBetweenPoints(firstPointX, firstPointY, secondPointX, secondPointY);
        double secondSide = calcDistanceBetweenPoints(secondPointX, secondPointY, thirdPointX, thirdPointY);
        double thirdSide = calcDistanceBetweenPoints(thirdPointX, thirdPointY, firstPointX, firstPointY);

        return ((Math.pow(firstSide, 2) + Math.pow(secondSide, 2)) == Math.pow(thirdSide, 2)) ||
                ((Math.pow(firstSide, 2) + Math.pow(thirdSide, 2)) == Math.pow(secondSide, 2)) ||
                ((Math.pow(secondSide, 2) + Math.pow(thirdSide, 2)) == Math.pow(firstSide, 2));
    }

    public static double calcDistanceBetweenPoints(int firstPointX, int firstPointY,
                                                   int secondPointX, int secondPointY) {

        return Math.pow(Math.pow(secondPointX - firstPointX, 2) + Math.pow(secondPointY - firstPointY, 2), 1. / 2);
    }

}
