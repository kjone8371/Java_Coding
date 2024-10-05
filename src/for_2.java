public class for_2 {
    public static void main(String[] args) {

        // 2중 for문
        //직각삼각형 출력
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //직각삼격형 거꾸로 출력
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }



        // 정사각형 출력
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= 5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
