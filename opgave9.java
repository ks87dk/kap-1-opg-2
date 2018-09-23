
package helloworld;

import java.util.Scanner;

/**
 *
 * @author ks87d
 */
public class opgave9 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        int height = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        System.out.print("enter length of the rectangle : ");
        height = scanner.nextInt();
        
        System.out.print("enter width of the rectangle : ");
        width = scanner.nextInt();
        
        area = height * width;
        perimeter = 2 * (height + height);
    
        System.out.println("The area of the rectangle is :" + area);
        System.out.println("The perimeter of the rectangle is :" + perimeter);
        
}
}