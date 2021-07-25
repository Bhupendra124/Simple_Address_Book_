import javax.swing.*;
import java.util.ArrayList;

public class AdressBook {
    ArrayList<PersonInfo> persons;  //personinfo class store in Variable persons


    public AdressBook(){
        persons=new ArrayList<PersonInfo>();
    }
    //add new persion record to array list after taking input
    public void addPerson() {
        String firstName = JOptionPane.showInputDialog("Enter FirstName");
        String lastName = JOptionPane.showInputDialog("Enter lastName");
        String Address = JOptionPane.showInputDialog("Enter Address");
        String city = JOptionPane.showInputDialog("Enter city");
        String state = JOptionPane.showInputDialog("Enter state");
        String zip = JOptionPane.showInputDialog("Enter zip");
        String phoneNum = JOptionPane.showInputDialog("Enter phoneNo");
        String email = JOptionPane.showInputDialog("Enter email");

        //new person object class
        PersonInfo p = new PersonInfo(firstName, lastName, Address, city, state,zip, phoneNum, email);
        //add personInfo into array list
        persons.add(p);
    }
    //search person record from array list by itrating
    public void searchPerson(String n){
        for(int i=0; i<persons.size(); i++){
            PersonInfo p=(PersonInfo) persons.get(i);
            if (n.equals(p.getFirstName())) {
                p.print();
            }
            }
        }
public  void deletePerson(String n){
        for(int i=0; i<persons.size();i++){
            PersonInfo p=(PersonInfo) persons.get(i);
            if (n.equals(p.getFirstName())){
                p.print();
                persons.remove(i);
            }
        }
    }
}
