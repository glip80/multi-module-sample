package de.friedenhagen.multimodule.core;

import java.io.PrintStream;

/**
 * My fine Library.
 */
public class MyLib {

    /**
     * outstream
     */
    private final PrintStream out;

    /**
     * Public constructor.
     *
     * @param out to print to.
     */
    public MyLib(final PrintStream out) {
        this.out = out;
    }

    /**
     * My tested method.
     */
    public void tested() {
        out.println("I am tested");
    }

    public String untested() {
        return "untested";
    }
}