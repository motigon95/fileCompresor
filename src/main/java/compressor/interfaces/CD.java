package compressor.interfaces;

import java.io.IOException;

public interface CD {
    void compressOrDecompress(String nameOfTargetFile, String outputFileName) throws IOException;
}
