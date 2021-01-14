import sun.reflect.misc.FieldUtil;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloader implements Downloader{
    private String userAgent;
    public FileDownloader(String userAgent){
        this.userAgent=userAgent;
    }
    @Override
    public void download(String url, String targetFileName) {
        try{
        URL website = new URL(url);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream(targetFileName);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }catch (Exception e){

        }
    }
}
