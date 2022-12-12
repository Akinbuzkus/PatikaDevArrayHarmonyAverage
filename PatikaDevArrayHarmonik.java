
public class PatikaDevArrayHarmonik {
    public static void main(String[] args) {
       double[] arr={1,2,3,4,5};
        Harmonik(arr);
    }
    
    static double Harmonik(double[] array){
        
        double harmonik=0;
        double average = 0;
        for(int i=0;i<array.length;i++){
            harmonik+=(1/array[i]);
            average=array.length/harmonik;
        }
           
            
        System.out.println("The average of Harmony :"+average);
    
    return average;
    }
}
