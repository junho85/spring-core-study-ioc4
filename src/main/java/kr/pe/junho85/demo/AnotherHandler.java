package kr.pe.junho85.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {
    @EventListener
    public void handle(MyEvent myEvent) {
        System.out.println("Another " + myEvent.getData());
    }
}
