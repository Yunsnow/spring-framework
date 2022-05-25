import org.springframework.stereotype.Component;

/**
 * @author 丁云龙
 * @program spring
 * @description
 * @date 2022-01-21 18:11
 **/
public class User {
	private String name;
	private Integer age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
