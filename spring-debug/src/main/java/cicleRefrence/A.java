package cicleRefrence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 丁云龙
 * @program spring
 * @description
 * @date 2022-02-11 16:53
 **/
@Component
public class A {
	@Autowired
	private B b;

	public A() {
		System.out.println("a is created");
	}
}
