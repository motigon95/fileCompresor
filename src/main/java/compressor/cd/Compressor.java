package compressor.cd;

import compressor.interfaces.CD;
import compressor.utils.Constant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Compressor implements CD {

    @Override
    public void compressOrDecompress(String nameOfTargetFile, String outputFileName) throws IOException {

        String path = System.getProperty(Constant.USER_DIR) + Constant.ADITIONAL_PATH + nameOfTargetFile;

        String compressedFileLocation = System.getProperty(Constant.USER_HOME);
        File dir = new File(compressedFileLocation + Constant.DESKTOP);
        File decompressedFile = new File(dir, outputFileName);

        if(!nameOfTargetFile.equals(Constant.FILE_NAME)){
            path = System.getProperty(Constant.USER_HOME) + Constant.DESKTOP + Constant.PATH_SEPARATOR + nameOfTargetFile;
        }

        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(decompressedFile);
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);

        System.out.println(Constant.COMP_START_MESSAGE);

        int data;
        while ((data = fis.read()) != -1) {
            dos.write(data);
        }

        fis.close();
        dos.close();
        System.out.println(Constant.COMP_END_MESSAGE);
    }
}

