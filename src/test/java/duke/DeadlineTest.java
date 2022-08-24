package duke;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest {
    @Test
    public void toStringTest() {
        assertEquals("[D][ ] watch lecture (by: Jul 24 2022)",
                new Deadline("watch lecture", "2022-07-24").toString());
    }

    @Test
    public void savedStringTest() {
        assertEquals("D | 0 | watch lecture | 2022-07-24",
                new Deadline("watch lecture", "2022-07-24").savedString() );
    }
}