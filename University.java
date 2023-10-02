public class University {

    private Lab[] labs;

    int counter = 0;
    public void addLabs(Lab labs){
        labs[counter++] = new Lab(labs.getLab_id(), labs.getComputer(),labs.getLabAttendent() );
    }

    

}
