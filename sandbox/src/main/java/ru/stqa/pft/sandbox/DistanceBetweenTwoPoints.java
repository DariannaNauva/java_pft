package ru.stqa.pft.sandbox;

public class DistanceBetweenTwoPoints {

  public static void main (String [] args){

    Point p1 = new Point(6.0, 3.0);

    Point p2 = new Point(4.0, 2.0);

    double dist = p1.Distance(p2);

    System.out.println("The distance between two points is equal to " + dist);
  }
}
