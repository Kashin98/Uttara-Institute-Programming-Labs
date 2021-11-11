public class Song{
    private String name;
    private String lyrics;

    public Song (String name, String lyrics){
        if(name == null ||lyrics == null || name.equals("") || lyrics.equals("")){
            System.out.println("Please pass a valid lyrics");
        }else {
            this.lyrics = lyrics;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
		// always check using refVar == null because refVar != null using else statement will cause NullPointerException and else won't execute as the code is programmed to throw exception if it is not addressed individually.
        if(name == null || name.equals("")){
			System.out.println("Please pass a valid song name");
			return;
        }
        this.name = name;

    }

    public String play() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        if(lyrics == null || lyrics.equals("")){
			System.out.println("Please pass a valid lyrics");
        }
        this.lyrics = lyrics;

    }
}


// PACKAGE PRIVATE as default access modifier/specifier is set.
class TestSong{
    public static void main(String[] args){
        Song song1 = new Song("Voyager","HotLine Miami 2 OST 2" );
        Song song2 = new Song("She Swallowed Burning Coals","HotLine Miami 2 OST 9");

		System.out.println(song1.play());
		System.out.println(song2.play());
		System.out.println(song1.getName());
        System.out.println(song2.getName());

    }
}