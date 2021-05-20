package com.example.firmanskripsi.jpeg;

public class JpegIO {
    static {
        System.loadLibrary("MobiJpegLib");
        //     System.loadLibrary("MobiPngLib");
    }
    public native int  writeJpeg(int width,int height,int quality,byte[] raw_image,String filename);
    @Deprecated
    public native int  writePng(int width,int height,int quality,byte[] raw_image,String filename);
    public native byte[]  readJpeg();
    @Deprecated
    public native String hello();

}