import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 丁云龙
 * @program spring
 * @description
 * @date 2022-01-21 17:52
 **/
public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
//		context.registerSingleton("user",new User());
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
//		annotationConfigApplicationContext.registerBean(User.class,()->{
//			User user = new User();
//			user.setAge(11);
//			return user;
//		});
//		annotationConfigApplicationContext.refresh();
//		System.out.println(context.getEnvironment().getSystemEnvironment());
		User bean = context.getBean("user",User.class);
//		User bean1 = context.getBean("user",User.class);

//		User bean = context.getBean(User.class);
		System.out.println(bean);
	}
}
