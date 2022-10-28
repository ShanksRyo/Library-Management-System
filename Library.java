//GETTER AND SETTER
package ernest;
public class Library 
{
    private int fbid;
    private String btitle, bauthor, bgenre, bstatus;   
    Library(int id, String title, String author, String genre, String status){
        this.fbid = id;
        this.btitle = title;
        this.bauthor = author;
        this.bgenre = genre;
        this.bstatus = status;         
  }
  public int getfbid(){
      return fbid;
  }
  public void setfbid(int id){
      this.fbid = id;
  } 
  public String getbtitle(){
      return btitle;
  }
  public void setbtitle(String title){
      this.btitle = title;
  }
  public String getbauthor(){
       return bauthor;
  }
  public void setbauthor(String author){
      this.bauthor = author;
  }
  public String getbgenre(){
      return bgenre;
  }
  public void setbgenre(String genre){
      this.bgenre = genre;
  }
  public String getbstatus(){
      return bstatus;
  }
  public void setbstatus(String status){
      this.bstatus = status;
  }   
}
