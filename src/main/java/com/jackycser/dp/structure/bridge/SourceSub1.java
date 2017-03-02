package com.jackycser.dp.structure.bridge;

/**
 * @author Jacky Zhang
 * @since 02/03/2017
 */
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}