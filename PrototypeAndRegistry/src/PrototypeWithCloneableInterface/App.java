package PrototypeWithCloneableInterface;

public class App {
    public static void main(String[] args) throws Exception {

        // Prototype pattern - Each class should have its own copy/clone method
        User p1 = new User("Rahul", 21, "88436711", MembershipType.ELITE);
        User p2 = (User) p1.clone();
        User p3 = (User) p1.clone();

    }
}
