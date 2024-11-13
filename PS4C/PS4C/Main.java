import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        System.out.println(Review.sentimentVal("vital")+"   " + Review.sentimentVal("valuable")+"    "+Review.sentimentVal("surprising"));
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
    }
    
    
}