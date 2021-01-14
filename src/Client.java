import java.net.MalformedURLException;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy=new FileDownloaderProxy();
        fileDownloaderProxy.download("https://james.codegym.vn/mod/assign/view.php?id=7320","toan.txt");
    }
}
