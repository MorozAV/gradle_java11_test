package org.alexfess;

import org.apache.commons.lang3.StringUtils;

public class gradle_java11_test {
    public String getMessage() {
        return "Hello World";
    }

    public gradle_java11_test() {
        System.out.println(getMessage());
        System.out.println(StringUtils.upperCase(getMessage()));
    }

    public static void main(String[] args) {
        new gradle_java11_test();
    }
}
