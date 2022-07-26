package compressor.unit;

import compressor.cd.Compressor;
import compressor.cd.Decompressor;
import compressor.factory.CDFactory;
import compressor.interfaces.CD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CDFactoryTest {

    @Test
    void cCommandShouldCreateCompressorClass() {
        //arrange
        CDFactory cdFactory = new CDFactory();
        //act
        CD cd = cdFactory.getCD("-c");
        //assert
        assertEquals(Compressor.class, cd.getClass());
    }

    @Test
    void cCommandShouldNotCreateDecompressorClass() {
        //arrange
        CDFactory cdFactory = new CDFactory();
        //act
        CD cd = cdFactory.getCD("-c");
        //assert
        assertNotEquals(Decompressor.class, cd.getClass());
    }

    @Test
    void dCommandShouldCreateDecompressorClass() {
        //arrange
        CDFactory cdFactory = new CDFactory();
        //act
        CD cd = cdFactory.getCD("-d");
        //assert
        assertEquals(Decompressor.class, cd.getClass());
    }

    @Test
    void dCommandShouldNotCreateCompressorClass() {
        //arrange
        CDFactory cdFactory = new CDFactory();
        //act
        CD cd = cdFactory.getCD("-d");
        //assert
        assertNotEquals(Compressor.class, cd.getClass());
    }

}
