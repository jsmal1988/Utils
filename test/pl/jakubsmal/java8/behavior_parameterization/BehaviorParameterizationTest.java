/**
 * @author Jakub Smal 
 * 15.08.2016 18:14:25
 */
package pl.jakubsmal.java8.behavior_parameterization;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import pl.jakubsmal.java8.behavior_parameterization.model.Apple;
import pl.jakubsmal.java8.behavior_parameterization.predicate.AppleColorPredicate;
import pl.jakubsmal.java8.behavior_parameterization.predicate.ApplePredicate;
import pl.jakubsmal.java8.behavior_parameterization.predicate.AppleRedAndHeavyPredicate;
import pl.jakubsmal.java8.behavior_parameterization.predicate.AppleWeightPredicate;

public class BehaviorParameterizationTest {
	BehaviorParameterization behaviorParam = new BehaviorParameterization();
	List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
	
	@Test
	public void checkCorrectResult1(){
		List<Apple> greenApples2 = behaviorParam.filter(inventory, new AppleColorPredicate());
		assertEquals(greenApples2.toString(),"[Apple{color='green', weight=80}, Apple{color='green', weight=155}]" );
	}
	
	@Test
	public void checkCorrectResult2(){
		List<Apple> heavyApples = behaviorParam.filter(inventory, new AppleWeightPredicate());
		assertEquals(heavyApples.toString(),"[Apple{color='green', weight=155}]" );
	}
	
	@Test
	public void checkCorrectResult3(){
		List<Apple> redAndHeavyApples = behaviorParam.filter(inventory, new AppleRedAndHeavyPredicate());
		assertEquals(redAndHeavyApples.toString(),"[]" );
	}
	
	@Test
	public void checkCorrectResult4(){
		List<Apple> redApples2 = behaviorParam.filter(inventory, new ApplePredicate() {
			public boolean test(Apple a) {
				return a.getColor().equals("red");
			}
		});
		assertEquals(redApples2.toString(),"[Apple{color='red', weight=120}]" );
	}
}
