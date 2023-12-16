public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка формата даты!");
        System.out.printf("Эта дата в неверном формате: %s", i);
        System.out.println();
    }
}