package PrototypeWithCloneableInterface;

public class User implements Cloneable {
    private String name;
    private int age;
    private String phoneNumber;
    private MembershipType type;

    public User(String name, int age, String phoneNumber, MembershipType type) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public MembershipType getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
