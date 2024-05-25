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

    public abstract String getUserName();

    public String getUserId() {
        return userId;
    }

    /**
     * Generates a unique user ID and assigns it to the userId field.
     * User ID format: U followed by 7 random digits.
     */
    private void createUserId() {
        // Initialize a StringBuilder with "U" as the initial content
        StringBuilder idString = new StringBuilder("U");

        // Loop to generate 7 random digits and append them to idString
        for (int i = 1; i < 8; i++) {
            // Generate a random digit between 0 and 9 and append it to idString
            idString.append((int) Math.floor(Math.random() * (9 + 1)));
        }

        // Convert idString to a String and assign it to the userId field
        this.userId = idString.toString();
    }

}
