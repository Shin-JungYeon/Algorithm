import java.util.HashSet;
import java.util.Set;

/**
 * [프로그래머스][위클리 챌린지] 2주차_상호평가
 */
public class Week2 {
    public static void main(String[] args) {
        int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        System.out.println(solution(scores));
    }
    
    public static String solution(int[][] scores) {
        StringBuffer answer = new StringBuffer();
        int len = scores.length;
        
        Set<Integer> uniqueScore = new HashSet<>();
        boolean unique = true;
        for(int i=0; i<len; i++) {
            int min = scores[i][0];
            int max = scores[i][0];
            
            int total = 0;
            int totalLen = len;
            for(int j=0; j<len; j++) {
                int score = scores[i][j];
                if(score >= max) {
                    max = score;
                    unique = uniqueScore.add(max);
                } else if(score <= min) {
                    min = score;
                    unique = uniqueScore.add(min);
                }
                total += scores[j][i];
            }
            if(unique && (max == scores[i][i] || min == scores[i][i])) {
                total -= scores[i][i];
                totalLen -= 1;
            }

            answer.append(getGrade(total/(double)totalLen));
        }
        
        return answer.toString();
    }
    
    public static String getGrade(double score) {
        String grade = "F";
        if(score >= 90) {
            grade = "A";
        } else if(score < 90 && score >= 80) {
            grade = "B";
        } else if(score < 80 && score >= 70) {
            grade = "C";
        } else if(score < 70 && score >= 50) {
            grade = "D";
        }
        return grade;
    }
    
}
