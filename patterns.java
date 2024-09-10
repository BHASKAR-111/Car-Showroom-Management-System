class patters{
    public static void main(String[] args) {
       pattern5();
    }

    public static void pattern1(){
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
    public static void pattern2(){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
    public static void pattern3(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
    public static void pattern4(){
        for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){ 
            System.out.print(j+" ");
        }
            System.out.println();
        }
    }

    public static void pattern5(){
        for(int i=0;i<9;i++){
            if(i<5){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
        }
        else{
            for(int j=0;j<9-i;j++){
                System.out.print("* ");
            }
        }
            System.out.println();
        }
    }
}