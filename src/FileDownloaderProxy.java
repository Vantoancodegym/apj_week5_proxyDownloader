import java.net.MalformedURLException;

public class FileDownloaderProxy implements Downloader{
    private FileDownloader fileDownloader=new FileDownloader("https://james.codegym.vn/mod/assign/view.php?id=7320");
    @Override
    public void download(String url, String targetFileName)  {
        fileDownloader.download(url,targetFileName);
    }
}
