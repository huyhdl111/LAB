package lab_6;

public class Lab_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String[] urlSplitExtraDomain = url.split("\\.");
        String[] urlSplitProtocol = url.split("://");
        String urlTmp = urlSplitProtocol[urlSplitProtocol.length-1].toString();
        String[] urlSplitDomain = urlTmp.split("\\.");
        System.out.printf("Protocol: %s\n", urlSplitProtocol[0]);
        System.out.printf("Domain: %s\n", urlSplitDomain[0]);
        System.out.printf("Extra Domain: %s\n", urlSplitExtraDomain[urlSplitExtraDomain.length-1]);
    }
}
