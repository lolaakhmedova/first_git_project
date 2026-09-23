package m25_class_and_object;

import java.util.HashSet;
import java.util.Set;

public class AddressManager {

    private Set<String> uniqueIp;

    public AddressManager() {
        this.uniqueIp = new HashSet<>();
    }


    public void addAddress(String ip){
        uniqueIp.add(ip);
    }

    public Set<String> getUniqueIp() {
        return uniqueIp;
    }
}
