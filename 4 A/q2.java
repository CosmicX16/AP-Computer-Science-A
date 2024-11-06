
/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
 
    
    public static void main(String[] args) {
            
            
    }
     public static void drawGrid(){
        StdDraw.setScale(0, 500);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i = 0; i < 500/20; i++){
            StdDraw.line(i*20,0,i*20,500);
            StdDraw.line(0,i*20,500,i*20);
        }
    }
    public static void drawCurve(){
        StdDraw.setScale(0, 500);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i = 0; i < 500/20; i++){
            StdDraw.line(i*20,0,500,i*20);
            StdDraw.line(500-i*20,500,0,500-i*20);
        }
    }
    public static void drawConcentricRings(){
        StdDraw.setScale(0, 500);
        
        for(int i = 800/20; i > 0; i--){
            if(i%2 == 0 ) StdDraw.setPenColor(StdDraw.BLACK);
            else StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledCircle(500/2,500/2,i*10);
        }
    }
}
