package tacos.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TacoResource {

    @RequestMapping("/say")
    public String say() {
        System.out.println("hello world");
        return "hello world";
    }

}
