package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;


@RequestMapping
public class HelloController {
    private final HelloService helloService;
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping ("/hello")
    @ResponseBody
    public String hello(String name) {

      return helloService.sayHello(Objects.requireNonNull(name)); // name이 null이면 예외를 던지고 아니면 name을 리턴해줌
    }

}
