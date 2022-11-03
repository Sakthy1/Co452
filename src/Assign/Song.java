package Assign;
import Assign.Artist;
import java.util.*;

public class Song{

   public static void main(String[] args) {
    
  


Artist ghostbuster=new Artist("Ghost Buster","Ray Parker",1000000);
Artist thriller=new Artist("Thriller","Macheljackson",2000000);
Artist spookyscaryskeleton=new Artist("spookyscaryskeleton","Andrew gold",3000000);

Artist somebodywatchingme=new Artist("somebodywatchingme","Rockwell",4000000);
Artist thisishalloween=new Artist("thisishalloween","The citizens of Halloween",5000000);
Artist monstermash=new Artist("Monstermash","Boris",6000000);
Artist superfreak=new Artist("SuperFreak","Rick James",7000000);
Artist un=new Artist("Ghost Buster","Ray Parker",1000000);
//Song unholy =new Song(playcount:800000,songname:"unholy",artistname:"Sam smith");
//Song sweetbutpsyco=new Song(playcount:900000,songname:"sweet but psyco",artistname:"Ava Max");
//Song Toxic=new Song(playcount:1000000,songname:"Toxic",artistname:"britney spears");
//Song SeasonoftheWith=new Song(playcount:1100000,songname:"Season of the with", artisttname:"Lana Del Roy");
//Song smoothcriminal=new Song(playcount:1200000,songname:"smooth criminal",artistname:"Macheal Jackson");
//Song witchdoctor=new Song(playcount:1300000,songname:"witch doctor",artistname:"David seville");

ArrayList<Artist>Artist= new ArrayList<Artist>();
Artist.add(ghostbuster);
Artist.add(thriller);
Artist.add(spookyscaryskeleton);
//songs.add(somebodywatchingme);
//songs.add(thisishalloween);
//songs.add(monstermash);
//songs.add(superFreak);
//songs.add(unholy);
//songs.add(sweetbutpsyco);
//songs.add(Toxic);
//songs.add(SeasonoftheWith);
//songs.add(smoothcriminal);
//songs.add(witchdoctor);


for(Artist song:Artist)

  song.Print();
}
   }