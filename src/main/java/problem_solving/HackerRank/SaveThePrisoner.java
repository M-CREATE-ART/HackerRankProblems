package problem_solving.HackerRank;

public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7,19,2));
        System.out.println(saveThePrisoner(3,7,3));

        System.out.println(saveThePrisoner(5,2,1));
        System.out.println(saveThePrisoner(5,2,2));
    }

    static int saveThePrisoner(int n, int m, int s) {
        return ((m +s - 2)) % n+1;
    }
}
