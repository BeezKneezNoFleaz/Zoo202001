/**
 * 
 */
package model;

/**
 * @author User
 *
 */
// Ashby Creighton Crum
public class Pig {
	private String name;
	private int age;
	private double weight;

	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pig(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String speak() {
		return "Oink Oink";
	}

}