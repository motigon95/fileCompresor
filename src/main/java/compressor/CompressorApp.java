package compressor;

import compressor.factory.CDFactory;
import compressor.interfaces.CD;
import compressor.utils.Command;
import compressor.utils.Constant;

import java.io.IOException;

public class CompressorApp {

    private static final Command command = new Command();

    public static void main(String[] args) throws IOException {

        if(!command.isValid(args)){
            System.out.println(Constant.COMMAND_ERROR_MESSAGE);
            return;
        }

        CDFactory cdFactory = new CDFactory();
        CD cd = cdFactory.getCD(command.getDcCommand());
        cd.compressOrDecompress(command.getFileNameToCD(), command.getFileNameOfCD());
    }

}
