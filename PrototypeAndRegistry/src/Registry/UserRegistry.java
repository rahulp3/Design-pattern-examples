package Registry;

import java.util.HashMap;
import java.util.Map;

import PrototypeWithCloneableInterface.MembershipType;

public class UserRegistry {
    Map<MembershipType, User> mp = new HashMap<>();
    public void  addPrototype(User user){
        mp.put(user.getType(), user);
    }

    public User getPrototype(MembershipType type){
        return mp.get(type);
    }

}
