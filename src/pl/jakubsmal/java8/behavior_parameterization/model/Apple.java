/**
 * @author Jakub Smal 
 * 15.08.2016 16:03:41
 */
package pl.jakubsmal.java8.behavior_parameterization.model;

public class Apple {
	private int weight = 0;
	private String color = "";

	public Apple(int weight, String color) {
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
		return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
	}
}
