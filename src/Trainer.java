public class Trainer extends User{
    public Trainer(String firstName, String lastName, String userName){
        super(firstName, lastName);
    }

    @Override
    public String getUserName(){
        return String.format("Trainer id: %s", this.getUserId());
    }


}
