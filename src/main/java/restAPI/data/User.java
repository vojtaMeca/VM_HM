package restAPI.data;

/**
 * Created by Vojtech on 3.7.2017.
 */
public class User {
    private final long user_id;
    private final String name;

    public User(long user_id, String name) {
        this.user_id = user_id;
        this.name = name;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }
}
