
class findAverage{
    public static void main(String [] args){
        
        System.out.println(calculateAverage(2,3,4,3));
        
    }
    // variable arguments method to find average
    static double calculateAverage(double...values){
        double sum = 0;

        for(double value: values){
            sum+=value;
        }
        
        return sum / values.length;
    }
}