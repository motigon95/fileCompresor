package compressor.unit;

import compressor.utils.Command;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandTest {

    @Test
    void wrongCommandShouldReturnFalse() {
        //arrange
        Command command = new Command();
        String[] args = new String[3];
        args[0] = "-x";
        args[1] = "integers";
        args[2] = "newFile";

        //act & assert
        assertFalse(command.isValid(args));
    }

    @Test
    void rightCommandShouldReturnTrue() {
        //arrange
        Command command = new Command();
        String[] args = new String[3];
        args[0] = "-c";
        args[1] = "integers";
        args[2] = "newFile";

        //act & assert
        assertTrue(command.isValid(args));
    }

}
