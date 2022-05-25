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
public class C {
	@Autowired
	private A a;

	public C() {
		System.out.println("c is created");
	}
}
