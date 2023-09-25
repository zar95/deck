public class Music {
    private String title;
    private String duration;
    private String genre;
    private Singer singer;

    public Music(String title, String duration, String genre, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.singer = singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Singer getSinger() {
        return singer;
    }

    public String toString(){
       return String.format("Title:%s  Duration:%s  Genre:%s  Singer %s",title,duration,genre,singer);
    }
    public boolean equals(Music m2){
        return this.getTitle().equals(m2.getTitle())? true : false ;
    }

}
