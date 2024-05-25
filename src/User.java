public abstract class User {
    private String firstName;
    private String lastname;
    private String userId;

    public User(String firstName, String lastname){
        this.firstName = firstName;
        this.lastname = lastname;
        this.createUserId();
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getUserName(){
        return String.format("Welcome %s %s", this.getFirstName(), this.getLastname());
    }

    public String getUserId() {
        return userId;
    }

    private void createUserId(){
        StringBuilder idString = new StringBuilder("U");
        for(int i = 1; i<8;i++) {
            idString.append((int) Math.floor(Math.random() * (9 + 1)));
        }

        this.userId = idString.toString();
    }
}
