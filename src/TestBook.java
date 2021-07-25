import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        AdressBook ab=new AdressBook();
        String input, s;
        int cs;
        while (true) {

            input= JOptionPane.showInputDialog("Enter 1 to Add" + "\n Enter 2 to Search \n Enter 3 to Delete"
            +"\n Enter 4 to Exit");
            cs=Integer.parseInt(input);
            switch (cs){
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    s=JOptionPane.showInputDialog("Enter name to search ");
                    ab.searchPerson(s);
                    break;
                case 3:
                    s=JOptionPane.showInputDialog("Enter name to delete ");
                    ab.deletePerson(s);
                    break;
                case 4:
                   System.exit(0);

            }
        }
    }
}
