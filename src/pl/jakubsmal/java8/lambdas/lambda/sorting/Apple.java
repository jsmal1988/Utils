/**
 * @author Jakub Smal 
 * 20.08.2016 21:11:53
 */
package pl.jakubsmal.java8.lambdas.lambda.sorting;

public class Apple {
    private Integer weight = 0;
    private String color = "";

    public Apple(Integer weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Apple{" +
               "color='" + color + '\'' +
               ", weight=" + weight +
               '}';
    }
}