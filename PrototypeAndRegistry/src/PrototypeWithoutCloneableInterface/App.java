package PrototypeWithoutCloneableInterface;

import PrototypeWithCloneableInterface.MembershipType;

public class App {
    public static void main(String[] args){

        User p1 = new User("Rahul", 21, "88436711", MembershipType.ELITE);
        User p2 = (User) p1.cloneObject();
        User p3 = (User) p1.cloneObject();

    }
}
