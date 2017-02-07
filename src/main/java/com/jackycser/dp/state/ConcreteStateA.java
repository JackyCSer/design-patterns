package com.jackycser.dp.state;

/**
 * @author Jacky Zhang
 * @since 06/02/2017
 */
public class ConcreteStateA implements State {

    @Override
    public void change(Context context) {
        System.out.println("this is ConcreteStateA");
        context.setState(new ConcreteStateB());
    }
}
