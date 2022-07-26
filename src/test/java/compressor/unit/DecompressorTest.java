package compressor.unit;

import compressor.cd.Decompressor;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DecompressorTest {

    @Test
    void decompressorThrowsExceptionWhenFileIsNotFound() {
        //arrange
        Decompressor decompressor = new Decompressor();
        //act & assert
        assertThrows(
                IOException.class, ()-> {
                    decompressor.compressOrDecompress("test", "test");
                });
    }
}
