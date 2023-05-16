public class Task2 {
    public static void main(String[] args) {
        int index = 10;
        int sumNumbers = 0;
        int[] arrayFib = new int[index];
        System.out.print("Последовательность: ");
        if (index > 0) {
            System.out.print(arrayFib[0]);
        } else {
            System.out.print("отсутствует");
        }
        if (index > 1) {
            arrayFib[1] = 1;
            System.out.print("\t" + arrayFib[1]);
        }
        for (int i = 2; i < index; i++) {
            arrayFib[i] = arrayFib[i - 1] + arrayFib[i - 2];
            if (arrayFib[i] % 2 == 0) {
                sumNumbers += arrayFib[i];
            }
            System.out.print("\t" + arrayFib[i]);
        }
        if (index > 0) {
            System.out.println("\nСумма всех четных чисел в заданной последовательности" +
                    " Фибоначи до " + index + "-го равна: " + sumNumbers);
        }
    }
}
