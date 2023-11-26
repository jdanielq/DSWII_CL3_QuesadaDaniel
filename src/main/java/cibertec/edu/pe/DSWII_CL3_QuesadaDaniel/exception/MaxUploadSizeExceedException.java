package cibertec.edu.pe.DSWII_CL3_QuesadaDaniel.exception;

public class MaxUploadSizeExceedException extends RuntimeException {
    public MaxUploadSizeExceedException (String message){
        super(message);
    }
}