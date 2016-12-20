package arrays;

public class Array {
	
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        
        int [] biggerArray;
        biggerArray = new int[11];
        
        for(int count = 0; count < anArray.length; count++) {
        	biggerArray[count] = anArray[count];
        	System.out.println(count);
        	System.out.println(biggerArray[count]);
        }
        
        biggerArray[10] = 1000;
        
        //cat array
        Cat[] catsArray;
        catsArray = new Cat[10];
        
        Cat tabby;
        tabby = new Cat (4, "more orange");
       
        catsArray[0] = tabby;
        
        catsArray [1] = new Cat(8,"spider");
        catsArray [2] = new Cat(6,"alien");
        System.out.println(catsArray[0].getPaws());
        System.out.println(catsArray[1].getPaws());
        System.out.println(catsArray[0].getColor());
        System.out.println(catsArray[1].getColor());
        System.out.println(catsArray[2].getPaws());
        System.out.println(catsArray[2].getColor());
        
        
        
        for(int i= 0; i < 3; i++){
        	System.out.println(catsArray[i].getPaws());
        	System.out.println(catsArray[i].getColor());
        }
        
        		
        
        		
     
        
        
        
    }
    


}
