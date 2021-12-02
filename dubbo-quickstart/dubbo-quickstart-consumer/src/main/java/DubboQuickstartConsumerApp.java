import com.huey.learning.dubbo.quickstart.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huey
 */
public class DubboQuickstartConsumerApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        // 获取远程服务代理
        HelloService helloService = (HelloService) context.getBean("helloService");
        // 执行远程方法
        String message = helloService.sayHello("World");
        // 显示调用结果
        System.out.println(message);

    }

}
