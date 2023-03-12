import java.util.Scanner;

public class Email
{
     private String firstName;
    private String lastName;
    private String password;

    private String email;
    private String department;
    private int mailBoxCapacity = 500;
    private int defaultPasswordlength=10;
    private String alternativeEmail;
    private  String comapnysuffix= "company.com";

    public Email(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New email created: " + this.firstName + " " + this.lastName);


        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPasswords(defaultPasswordlength);
        System.out.println("Your password is:" + this.password);

       email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ comapnysuffix;
        System.out.println("Your email is: " + email);
    }



    private String setDepartment()
    {
        System.out.println("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner keyscan =  new Scanner(System.in);
        int depChoice = keyscan.nextInt();
        if (depChoice == 1 ){
             return "Sales";
        } else if (depChoice == 2 ){
            return  "Dev";
        } else if (depChoice == 3 ){
            return  "Acct";
        } else return "";
    }

    private String randomPasswords(int length){

        String passwordset = "ABCDEFGHIKLMNOPQRSTVXYZ123456789@%$#";
        char[] password = new char[length];
        for (int i=0; i <length; i++){
           int rand = (int) (Math.random() * passwordset.length());
           password[i] = passwordset.charAt(rand);

        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){ return mailBoxCapacity;}
    public  String getAlternativeEmail(){ return alternativeEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "Display Name: "+ firstName+ " "+lastName + "\nCompany Email: "+ email + "\nMailbox capacity: " +mailBoxCapacity + "mb";
    }

}
