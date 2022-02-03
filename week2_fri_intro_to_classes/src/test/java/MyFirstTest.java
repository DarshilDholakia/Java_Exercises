import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    @Test
    void hello() { //tests don't return anything so void and are package protected so no need for access modifier
        int result = 4+4;
        assertEquals(8, result);
        assertThat(result).isEqualTo(8); //above and this line do the same but this assertj has better syntax and api
    } //this is the test (called 'hello')

    @Test
    void hello2() { //another test named 'hello2' being added
        //Given 2 numbers...
        int num1 = 4;
        int num2 = 4;
        //When we add them together...
        int result = num1 + num2;
        //Then the result should be...
        assertThat(result).isEqualTo(8);
    }
}
