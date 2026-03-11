package Registry;

import PrototypeWithCloneableInterface.MembershipType;

public class App {
    public static void main(String[] args){

        User p1 = new User("Rahul",21, "6341234213", MembershipType.PRO);
        UserRegistry registry = new UserRegistry();
        registry.addPrototype(p1);

        registry.getPrototype(MembershipType.PRO);

    }
}
