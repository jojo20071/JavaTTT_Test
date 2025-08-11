public class rec {
    boolean ticked = false;
    public String owner = " ";

    public void changeOwner(String n){
        this.owner = n;
    }
    public void showOwner(){
        System.out.println("owner is "+this.owner);
    }
}
