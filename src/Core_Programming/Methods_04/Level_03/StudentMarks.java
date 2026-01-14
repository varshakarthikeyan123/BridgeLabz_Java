package Core_Programming.Methods_04.Level_03;

public class StudentMarks {

    public static int[][] generateMarks(int students) {
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = 10 + (int)(Math.random() * 90);
        return pcm;
    }

    public static double[][] calculateResult(int[][] pcm) {
        double[][] res = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            res[i][0] = total;
            res[i][1] = Math.round((total / 3.0) * 100) / 100.0;
            res[i][2] = Math.round((total / 300.0) * 10000) / 100.0;
        }
        return res;
    }
}

