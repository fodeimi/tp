

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djiddi
 */
public class Point 
{
  float x;
  float y;
  public Point ()
   
   {
      x=0; y=0;
     
   }
 // Ou sont les get
  public void setX(float a)
    { 
      x=a; 
    }
  public void setY(float b)
     {
      y=b;
      }
          
   public void afficherCoordonnee()
       {
       System.out.println("Abscisse =" +x);
       System.out.println("Ordonné =" +y);
        }
 // ou sont les autres méthodes?
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
     {
     Point p=new Point();
     p.x= 2; p.y= 3;
     p.afficherCoordonnée();
     
 
     }
    
}
