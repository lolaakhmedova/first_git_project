package m25_class_and_object;

public class WebsiteData {
    static void main() {
       AddressManager facebook = new AddressManager();

       facebook.addAddress("123.2.3.34.4");
        facebook.addAddress("123.2.3.34.7");
        facebook.addAddress("12.2.3.34.9");
        facebook.addAddress("15.2.3.34.9");

        System.out.println(facebook.getUniqueIp() );






    }
}
