package printf;

public class printf {
    public static void main(String[] args) {
        
        String arr[][] = {{"ali", "veli", "hasan", "huseyin"},{"furkan","zuhtu", "ismail"}};



            try {
                for (int i = 0; i <= arr[0].length; i++) {
                    for (int j = 0; j <= arr[1].length; j++) {
                        System.out.printf("%10s\n", arr[i][j]);
                    }
                }}
            catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("");
                } finally {
                System.out.println("Her zaman yazdir");
            }
    }
}
