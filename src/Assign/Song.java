package Assign;
import Assign.Artist;
import java.util.*;

public class Song{

   public static void main(String[] args) {
    
  


Artist ghostbuster=new Artist("Ghost Buster","Ray Parker",1000000);
Artist thriller=new Artist("Thriller","Macheljackson",2000000);
Artist spookyscaryskeleton=new Artist("spookyscary","Andrew gold",3000000);
Artist somebodywatchingme=new Artist("somebody","Rockwell    ",4000000);
Artist thisishalloween=new Artist("Thisishallow","Citizensof",5000000);
Artist monstermash=new Artist("Monstermash","Boris    ",6000000);
Artist superfreak=new Artist("SuperFreak","Rick James",7000000);
Artist unholy=new Artist("Unholy","Sam smith",8000000);
Artist sweetbutpsycho=new Artist("SweetbutPsy","Ava Max   ",9000000);
Artist toxic=new Artist("Toxic","Ray Parker",1000000);
Artist smoothcriminal=new Artist("Smoothcrim","Macheal Jackson",1100000);
Artist seasonofthewith=new Artist("Seasonofthe","Lana Del Roy",1200000);






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

Artist.remove(seasonofthewith);
Artist.remove(unholy);
for(Artist song:Artist)

  song.Print();
}
   

}  