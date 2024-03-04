package atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCreation {
    private int ac;
    private String name;
    private String fname;
    private String address;
    private String pinCode;
    private String education;
    private String occupation;
    private String phone;
    private String dob;
    private static Double balance;
    private static String exist;
    private static List<Transaction> transactionHistory;

    public static boolean isExist(){
        if (exist==null){
            return false;
        }return true;
    }


   static Map<Integer,String> map = new HashMap<>();

    static List<UserCreation> userList = new ArrayList<>();

    public UserCreation(int ac, String name, String fname,
                        String address, String pinCode,
                        String education, String occupation,
                        String phone, String dob) {
        this.transactionHistory = new ArrayList<>();
        this.ac = ac;
        this.name = name;
        this.fname = fname;
        this.address = address;
        this.pinCode = pinCode;
        this.education = education;
        this.occupation = occupation;
        this.phone = phone;
        this.dob = dob;
        balance = 0.0;
        exist = map.putIfAbsent(ac,pinCode);

    }
    public String toString() {
        return "UserCreation{" +
                "accountNumber=" + ac +
                ", name='" + name + '\'' +
                ", fatherName='" + fname + '\'' +
                ", address='" + address + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", education='" + education + '\'' +
                ", occupation='" + occupation + '\'' +
                ", phone='" + phone + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }




}