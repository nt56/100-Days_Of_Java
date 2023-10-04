public class Patterns {
   public static void main(String[] args) {

       //this loop for first pattern
       for(int i=1; i<=5; i++){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

       //this for loop for a second pattern
       for(int i=1; i<=5; i++){
           for(int j=4; j>=i; j--){
               System.out.print("*");
           }
           System.out.println();
       }

   }
}



public class Patterns {
   public static void main(String[] args) {

       for(int i=1; i<=5; i++){

           //for spaces
           for(int s=4; s>=i; s--){
               System.out.print(" ");
           }

           //for stars
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }

           System.out.println();

       }

   }
}
//4 space one star then 3 space 2 star then 2 space 3 start and so on



public class Patterns {
   public static void main(String[] args) {

       for(int i=1; i<=5; i++){

           //for spaces
           for(int s=1; s<=i; s++){
               System.out.print(" ");
           }

           //for stars
           for(int j=5; j>=i; j--){
               System.out.print("*");
           }

           System.out.println();

       }

   }
}



public class Patterns {
   public static void main(String[] args) {

       //first pattern
       for(int i=1; i<=5; i++){
           for(int s=4; s>=i; s--){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

       //second pattern
       for(int i=1; i<=5; i++){
           for(int s=1; s<=i; s++){
               System.out.print(" ");
           }
           for(int j=4; j>=i; j--){
               System.out.print("*");
           }
           System.out.println();
       }

   }
}



public class Patterns {
   public static void main(String[] args) {

       for(int i=1; i<=5; i++){
           for(int j=1; j<=5; j++){
               //from 2nd line to second last line same goes to columns also
               if(i>=2 && j>=2 && i<=4 && j<=4){
                   System.out.print(" ");
               }
               else {
                   System.out.print("*");
               }
           }
           System.out.println();
       }

   }
}



public class Patterns {
   public static void main(String[] args) {

//        for(int i=1; i<=5; i++){
//
//             //for space
//            for(int s=4; s>=i; s--){
//                System.out.print(" ");
//            }
//
//            //for first star triangle
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//
//            //for second star triangle
//            for(int k=2; k<=i; k++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

       for(int i=1; i<=5; i++){

           //for space
           for(int s=4; s>=i; s--){
               System.out.print(" ");
           }

           //for first star triangle
           for(int j=1; j<(2*i); j++){
               System.out.print("*");
           }

           System.out.println();
       }

   }
}



public class Patterns {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){

             //for space
            for(int s=2; s<=i; s++){
                System.out.print(" ");
            }

            //for first star triangle
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }

            //for second star triangle
            for(int k=4; k>=i-1; k--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
