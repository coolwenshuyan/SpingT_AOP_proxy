/**
 * Created by CoolWen on 2017/9/21.
 */

import com.coolwen.spring.controller.UserController;
import com.coolwen.spring.model.HelloWorld;
import com.coolwen.spring.model.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CoolWen
 * @version 2017-09-21 9:30
 */
public class TestSpring {
    //通过工厂获取Spring的对象
    BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void testHello() {
        //      HelloWorld helloWorld=new HelloWorld();
        //此处getBean中的helloWorld就是beans.xml配置文件中的id
        HelloWorld hello = (HelloWorld) factory.getBean("helloWold", HelloWorld.class);
        System.out.println(hello.hello());
        HelloWorld hello2 = (HelloWorld) factory.getBean("helloWold", HelloWorld.class);
        System.out.println(hello == hello2);
//        System.out.println("NoSpring---"+helloWorld.hello());
    }

    @Test
    public void testController() {
        UserController uc1 = (UserController) factory.getBean("userController", UserController.class);
        uc1.add();
        User user = new User(1, "冷锋");
        UserController uc = (UserController) factory.getBean("userController", UserController.class);
        uc.setUser(user);
        uc.add();
        uc.load();
    }
}
