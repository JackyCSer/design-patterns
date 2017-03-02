package com.jackycser.dp.structure.bridge;

/**
 * @author Jacky Zhang
 * @since 02/03/2017
 */
public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}
