import org.junit.Before;
import org.junit.Test;
import parts.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(500);
    }

    @Test
    public void hasHorsepower(){
        assertEquals(500, engine.getHorsepower());
    }

    @Test
    public void canStart(){
        assertEquals("Vroom", engine.start());
    }

    @Test
    public void canStop(){
        assertEquals("*Silence*", engine.stop());
    }

}
