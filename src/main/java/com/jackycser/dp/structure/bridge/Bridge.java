package com.jackycser.dp.structure.bridge;

/**
 * @author Jacky Zhang
 * @since 02/03/2017
 */
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}