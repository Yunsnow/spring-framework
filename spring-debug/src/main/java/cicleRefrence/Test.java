package cicleRefrence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 丁云龙
 * @program spring
 * @description
 * @date 2022-02-11 16:57
 **/
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = (A) context.getBean("a");


	}
}
