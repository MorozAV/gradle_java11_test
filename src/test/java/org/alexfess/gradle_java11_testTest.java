package org.alexfess;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class gradle_java11_testTest {
    private final gradle_java11_test gj11t = new gradle_java11_test();

    @Test
    @DisplayName("check message")
    public void  checkMessage() {
        Assertions.assertTrue(StringUtils.isNotEmpty(gj11t.getMessage()));
    }

}
