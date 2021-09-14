/**
 * [프로그래머스][위클리 챌린지] 1주차_부족한금액계산하기
 */
public class Week1 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static int solution(int price, int money, int count) {
        int total = 0;
    
        for(int i=1; i<=count; i++) {
            total += (price * i);
        }
    
        if(total > money) {
            return (total - money);
        }

        return 0;
    }
    
}
