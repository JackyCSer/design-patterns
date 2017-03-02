package com.jackycser.dp.behavior.state.example;

/**
 * @author Jacky Zhang
 * @since 07/02/2017
 */
public class Client {

    public static void main(String[] args) {
        //假设路灯开始是绿灯
        State state = new GreenState();
        Light light = new Light(state);
        light.work();
    }

}
