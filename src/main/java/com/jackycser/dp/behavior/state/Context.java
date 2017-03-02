package com.jackycser.dp.behavior.state;

/**
 * @author Jacky Zhang
 * @since 06/02/2017
 */
public class Context {

    private State state;

    public void change() {
        state.change(this);
    }


    public Context(State state) {
        super();
        this.state = state;
    }


    public State getState() {
        return state;
    }


    public void setState(State state) {
        this.state = state;
    }


}
