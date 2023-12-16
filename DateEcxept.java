public class DateExcept extends Exception {
    public DateExcept() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка формата даты!");
        System.out.printf("Эта дата в неверном формате: %s", i);
        System.out.println();
    }
}