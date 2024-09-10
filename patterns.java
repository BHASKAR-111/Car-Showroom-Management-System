class patters{
    public static void main(String[] args) {
       pattern8();
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


    public static void pattern6(){
        for(int i=0;i<5;i++){
        for(int k=0;k<5-i;k++){
        System.out.print(" ");
        }
        for(int j=0;j<=i;j++){ 
            System.out.print("*");
        }
            System.out.println();
        }
    }

    public static void pattern7(){
        for(int i=0;i<5;i++){
            for(int k=0;k<i;k++){
            System.out.print(" ");
            }
            for(int j=0;j<5-i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8(){
        for(int i=0;i<5;i++){
            // for(int k=0;k<i;k++){
            // System.out.print(" ");
            // }
            for(int j=0;j<9;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}