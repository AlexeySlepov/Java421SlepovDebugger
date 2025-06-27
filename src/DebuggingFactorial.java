public class DebuggingFactorial {
    //TODO: Вам предоставлена часть Java-программы, содержащая метод для вычисления факториала числа.
    // Однако метод содержит ошибку, и ваша задача - найти и исправить её с помощью отладки.
    // Программа предполагает, что метод computeFactorial должен вычислить факториал числа n.
    // Однако метод содержит ошибку. Ваша задача - найти и исправить эту ошибку с помощью отладки
    public static void main(String[] args) {
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int computeFactorial(int n) {
        if (n == 1) {  // Нужно было исправить n == 2  на n == 1
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}