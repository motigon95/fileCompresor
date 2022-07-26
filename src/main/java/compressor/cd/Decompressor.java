package compressor.cd;

import compressor.interfaces.CD;
import compressor.utils.Constant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Decompressor implements CD {

    @Override
    public void compressOrDecompress(String nameOfTargetFile, String outputFileName) throws IOException {

        String decompressedFileLocation = System.getProperty(Constant.USER_HOME);
        File dir = new File(decompressedFileLocation + Constant.DESKTOP);
        File decompressedFile = new File(dir, outputFileName);

        FileInputStream fis= new FileInputStream(decompressedFileLocation + Constant.DESKTOP + Constant.PATH_SEPARATOR + nameOfTargetFile);
        FileOutputStream fos=new FileOutputStream( decompressedFile);
        InflaterInputStream iis=new InflaterInputStream(fis);

        int data;
        System.out.println(Constant.DECOMP_START_MESSAGE);
        while((data=iis.read())!=-1)
        {
            fos.write(data);
        }

        fos.close();
        iis.close();
        System.out.println(Constant.DECOMP_END_MESSAGE);
    }
}
