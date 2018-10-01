import java.util.*;

class Vote {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String n[] = new String[6];
        int vote[] = new int[6];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Input Prime Minister ID => ");
            int id = sc.nextInt();
            System.out.print("Input Prime Minister Name => ");
            String name = sc.next();
            n[id] = name;
        }
        for (int i = 1; i <= 200; i++) {
            System.out.print("Vote ID => ");
            int v = sc.nextInt();
            vote[v]++;
        }

        int max = 0;
        int maxIndex = 0;
        for (int k = 1; k < 6; k++) {
            if (vote[k] > max) {
                max = vote[k];
                maxIndex = k;
            }
        }

        System.out.println(vote[maxIndex]);
        System.out.println(n[maxIndex]);

    }
}