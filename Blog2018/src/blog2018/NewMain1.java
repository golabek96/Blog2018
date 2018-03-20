/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog2018;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Student
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comment c = new Comment("adam", "jakiś tekst", LocalDateTime.of(2018, 3, 19, 8, 9));
        Comment c2 = new Comment("marek", "jakiś tekst", LocalDateTime.of(2017, 5, 17, 8, 9));
        Comment c3 = new Comment("stefan", "jakiś tekst");
        Comment c4 = new Comment("michal", "jakiś tekst", LocalDateTime.of(2018, 2, 5, 7, 3));
        Comment c5 = new Comment("zdzich", "jakiś tekst", LocalDateTime.of(2018, 1, 8, 8, 9));

/*        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
*/
        TreeSet set = new TreeSet();
        set.add(c);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        System.out.println(set);

    }

}
