package Lab1;

import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.round;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Ball("blue", 2));
        basket.add(new Ball("green", 3));
        basket.add(new Ball("white", 5));
        basket.add(new Ball("black", 7));
        basket.add(new Ball("blue", 11));
        System.out.println("Blue Balls: " + basket.countOf("blue"));
        System.out.println("Total weight: " + round(basket.sumWeight() * 100) / 100.0);

        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }

    public static int fCount(Basket basket,String color){
        int res = basket.countOf(color);
        return res;
    }

    public static double fWeight(Basket basket) {
        double res = basket.sumWeight();
        return res;
    }
}

class Ball
{
    public String color = "";
    public double weight = 0;
    public Ball (String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }
}

class Basket
{
    public ArrayList<Ball> balls= new ArrayList<Ball>();
    public Basket()
    {

    }
    public void add(Ball ball)
    {
        balls.add(ball);
    }
    public int countOf(String color)
    {
        int count = 0;
        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).color == color) {
                count++;
            }
        }
        return count;
    }
    public double sumWeight()
    {
        double sumWeight = 0;
        for (int i = 0; i < balls.size(); i++) {
            sumWeight += balls.get(i).weight;
        }
        return sumWeight;
    }
}