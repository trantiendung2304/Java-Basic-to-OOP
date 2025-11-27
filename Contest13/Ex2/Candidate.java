package Ex2;

/**
 *
 * @author Tran Tien Dung
 */

public class Candidate {
    private String fullname;
    private String birth;
    private double score1, score2, score3;

    public Candidate(String fullname, String birth, double score1, double score2, double score3){
        this.fullname = fullname;
        this.birth = birth;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    private void formatBirth(String birthDate){
        StringBuilder sb = new StringBuilder(birthDate);
        if(sb.charAt(1) == '/'){
            sb.insert(0, "0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3, "0");
        }
    }

    @Override
    public String toString(){
        double totalScore = this.score1 + this.score2 + this.score3;
        return this.fullname + " " + formatBirth(this.birth) + " " + String.format("%.1f", totalScore);
    }
}
