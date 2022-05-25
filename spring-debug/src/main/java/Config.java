import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 丁云龙
 * @program spring
 * @description
 * @date 2022-01-22 21:18
 **/
@Component
public class Config {
	@Bean
	public User user(){
		return new User();
	}
}
