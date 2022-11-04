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
Artist unholy=new Artist("Unholy","Sam smith",8000000);
Artist sweetbutpsycho=new Artist("Sweet but Psyco","Ava Max",9000000);
Artist toxic=new Artist("Toxic","Ray Parker",1000000);
Artist smoothcriminal=new Artist("Smooth criminal","Macheal Jackson",1100000);
Artist seasonofthewith=new Artist("Seasonofthewith","Lana Del Roy",1200000);






ArrayList<Artist>Artist= new ArrayList<Artist>();
Artist.add(ghostbuster);
Artist.add(thriller);
Artist.add(spookyscaryskeleton);
Artist.add(somebodywatchingme);
Artist.add(thisishalloween);
Artist.add(monstermash);
Artist.add(superfreak);
Artist.add(unholy);
Artist.add(sweetbutpsycho);
Artist.add(toxic);
Artist.add(smoothcriminal);
Artist.add(seasonofthewith);



for(Artist song:Artist)

  song.Print();
}
   }