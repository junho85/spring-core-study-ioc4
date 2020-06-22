package kr.pe.junho85.demo;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private int data;

    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, int data) {
        super(source);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
