package compressor.factory;

import compressor.cd.Compressor;
import compressor.cd.Decompressor;
import compressor.interfaces.CD;
import compressor.utils.Constant;

public class CDFactory {

    public CDFactory() {}

    public CD getCD(String cdCommand){
        if(cdCommand.equals(Constant.COMPRESSOR_COMMAND)) return new Compressor();
        else return new Decompressor();
    }
}
