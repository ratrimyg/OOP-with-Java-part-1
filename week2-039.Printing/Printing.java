public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        int i = 0;
        while(i<amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        for(int i=0; i < sideSize; i++){
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int count = 1;
        while(count<=height){
            printStars(width);
            count++;
        }
    }
    

    public static void printTriangle(int size) {
        // 39.4
        int counterT = 1;
        while(counterT <= size){
            printStars(counterT);
            counterT++;
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(1);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(3);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
