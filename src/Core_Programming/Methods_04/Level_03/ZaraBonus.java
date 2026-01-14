package Core_Programming.Methods_04.Level_03;

public class ZaraBonus {

    public static double[][] generateEmployees() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] emp) {
        double[][] result = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double bonus = emp[i][1] > 5 ? emp[i][0] * 0.05 : emp[i][0] * 0.02;
            result[i][0] = emp[i][0];
            result[i][1] = bonus;
            result[i][2] = emp[i][0] + bonus;
        }
        return result;
    }
}

