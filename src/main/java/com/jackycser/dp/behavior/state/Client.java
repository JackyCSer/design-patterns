package com.jackycser.dp.behavior.state;

/**
 * @author Jacky Zhang
 * @since 06/02/2017
 */
public class Client {

    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context(state);
        //初始状态是A
        context.change();
        //装换一次后变成B
        context.change();
        //再转换一次后又变成A
        context.change();
    }

}
