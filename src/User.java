public class User {
    private String id;
    private String type;
    private String name;
    private String email;

    public User(String id, String type, String name, String email){
        this.id = id;
        this.type = type;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
