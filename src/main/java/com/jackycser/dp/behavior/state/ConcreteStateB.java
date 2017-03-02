package com.jackycser.dp.behavior.state;

/**
 * @author Jacky Zhang
 * @since 06/02/2017
 */
public class ConcreteStateB implements State {

    @Override
    public void change(Context context) {
        System.out.println("this is ConcreteStateB");
        context.setState(new ConcreteStateA());
    }
}
