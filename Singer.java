public class Singer {
    private String name;
    private String gender;
    private String nationality;
    private Date debutyear;

    public Singer(String name, String gender, String nationality, Date debutyear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutyear = debutyear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDebutyear(Date debutyear) {
        this.debutyear = debutyear;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getDebutyear() {
        return debutyear;
    }

    public String toString(){
        return String.format("Name:%s Gender:%s Nationality:%s  Debutyear: %s",name,gender,nationality,debutyear);

    }



}
