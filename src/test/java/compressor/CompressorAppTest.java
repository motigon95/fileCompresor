package compressor;

import org.junit.jupiter.api.Test;

public class CompressorAppTest {

    @Test
    void compressorAppDoNotStartIfCommandIsWrong() throws Exception {
        String[] args = new String[3];
        args[0] = "-x";
        args[1] = "integers";
        args[2] = "newFile";
        CompressorApp.main(args);
    }
}
