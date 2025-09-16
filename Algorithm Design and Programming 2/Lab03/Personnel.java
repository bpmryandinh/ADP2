public abstract class Personnel {
    String name;
    String email;

    
    //name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //email
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    //default constructor
    Personnel(){
        String name = "No Name";
        String email = "No Email";
    }
    
    
}
