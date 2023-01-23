

public class Main {
 
   public static void main(String[] args) {

      String city;
      city = "Galloway";
      System.out.println("City: "+city);

      int zip;
      zip = 43119;
      System.out.println("ZipCode: "+zip);

      int[] nums = {32,25,27,40,45};
      
      float sum = 0;
         
        //compute sum
        int i=0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }
         
        //compute average
        float average = (sum / nums.length); 
         
        System.out.println("Average : "+average);
    
      
      
   }
   
}
