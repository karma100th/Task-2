package homework1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {8, 7, 6, 6, 3, 0};
        int sumOfElements = 0;
        int notSumNumber = 6;
        for (int element : array) {
            if (element == notSumNumber) {
                continue;
            }
            sumOfElements += element;
        }
        System.out.println("Сумма эдементов равна: " + sumOfElements);
    }
}
