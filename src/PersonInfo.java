import javax.swing.*;
import java.util.Scanner;

public class PersonInfo {
    Scanner s=new Scanner(System.in);
    public String firstName;
    public String lastName;
    public String address;
    public  String city;
    public  String state;
    public String  zip;
    public String phoneNo;
    public  String emailID;



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        zip = zip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

//Parametrized constructor
    public PersonInfo(String firstName, String lastName, String address, String city, String state,
                      String zip, String phoneNo, String emailID){
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setZip(zip);
        setPhoneNo(phoneNo);
        setEmailID(emailID);
    }
        //method for Displying Persion Record
   public void print(){
       JOptionPane.showMessageDialog(null,"  firstName  :" +firstName+ "  lastName  :" +lastName+
                                      "  Address  :"+address+"  city  :"+city+"  state :"+state+
                                        "  zip :"+zip+ "  phone :"+phoneNo+ "  email :"+emailID);
   }


//    public static void main(String[] args) {
//        PersonInfo a=new PersonInfo("jkj","jkhsd","uhdiu","hdiuh","uidiu","uhdiu","DJLSAJ","UDHIUSD");
//        a.print();
//    }

}
