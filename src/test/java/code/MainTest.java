package code;

import net.wf0b.code.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@DisplayName("Main Unit Test")
class MainTest {

    @Retention(RetentionPolicy.RUNTIME)
    @Tag("detail")
    @Tag("MAIN")
    @Test
    public @interface DetailTest {
    }

    @DetailTest
    @DisplayName("Main.main()")
    void testMain() {
        Main.main(null);
    }
}