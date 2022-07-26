package compressor.unit;

import compressor.cd.Compressor;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CompressorTest {

    @Test
    void compressorThrowsExceptionWhenFileIsNotFound() {
        //arrange
        Compressor compressor = new Compressor();
        //act & assert
        assertThrows(
                IOException.class, ()-> {
                    compressor.compressOrDecompress("test", "test");
                });
    }
}
