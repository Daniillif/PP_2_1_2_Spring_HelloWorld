import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(cat.getName());
        System.out.println(cat2.getName());
    }
}