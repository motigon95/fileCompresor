package compressor.utils;

public class Command {

    private String dcCommand;
    private String fileNameToCD;
    private String fileNameOfCD;

    public Command(){}

    public boolean isValid(String[] args) {
        if(args.length != 3) return false;
        if(args[0].equals(Constant.COMPRESSOR_COMMAND) || args[0].equals(Constant.DECOMPRESSOR_COMMAND)){
            this.dcCommand = args[0];
            this.fileNameToCD = args[1];
            this.fileNameOfCD = args[2];
            return true;
        }
        return false;
    }

    public String getDcCommand(){ return dcCommand; }

    public String getFileNameToCD(){ return fileNameToCD; }

    public String getFileNameOfCD(){ return fileNameOfCD; }
}
