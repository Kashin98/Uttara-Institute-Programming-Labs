public class Song {
    private String name;
    private String lyrics;

    public void play(){
        System.out.println(this.lyrics);
    }

    public Song(String name, String lyrics) {
        if(name == null || lyrics == null|| name.trim().equals("") ||lyrics.trim().equals("")){
            System.out.println("enter valid value");
        }else {
            this.name = name;
            this.lyrics = lyrics;
        }
    }
    public Song(String name) {
        if(name == null || name.trim().equals("")){
            System.out.println("enter valid value");
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().equals("")){
            System.out.println("enter valid value");
        }else {
            this.name = name;
        }
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        if(lyrics == null ||lyrics.trim().equals("")){
            System.out.println("enter valid value");
        }else {
            this.lyrics = lyrics;
        }
    }
}

class TestSong{
    public static void main(String[] args) {
        Song song = new Song("song 1","lyrics 1");
        Song song2 = new Song("song 2");
        song.play();
        song2.play();
//        song.setLyrics("lyrics 1");
        song2.setLyrics("lyrics 2");
        song2.play();

    }
}