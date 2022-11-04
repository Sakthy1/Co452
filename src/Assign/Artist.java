package Assign;

public class Artist
{
private String songname;
private String artistname;
private int playcount;
public Artist (String songname, String  artistname,int playcount)
{
    this.songname=songname;
    this.artistname=artistname;
    this.playcount=playcount;
}
public void Print()
{
    System.out.print("songname"+this.songname);
    System.out.print("\tartistname"+this.artistname);
    System.out.println("\tplaycount"+this.playcount);
}
    
   
    }     
    

