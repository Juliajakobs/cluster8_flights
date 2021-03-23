package Flights;

public class Customer {
    private String firstName;
    private String lastName;
    private String cardNo;
    private String email;
    private int phoneNo;


    public Customer(String firstName, String lastName, String cardNo, String email, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNo = cardNo;
        this.email = email;
        this.phoneNo = phoneNo;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;

    }

    public String getCardNo() {
        return cardNo;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNo() {
        return phoneNo;

    }
}
