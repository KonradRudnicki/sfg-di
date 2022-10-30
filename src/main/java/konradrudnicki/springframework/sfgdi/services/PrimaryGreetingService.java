package konradrudnicki.springframework.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Primary
@Controller
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - from the PRIMARY Bean";
    }
}
