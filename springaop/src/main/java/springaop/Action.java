package springaop;

import org.springframework.stereotype.Component;

@Component
public class Action {
    public void doWork(){
        System.out.println("do working ......");
    }
}
