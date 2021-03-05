package ru.project.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //@Override
    public void getBook() {
        System.out.println("Мы берем книгу из " + this.getClass());
    }

    public void getBook(Book book) {
        System.out.println("Мы берем " + book.getName() + " книгу из " + this.getClass());
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в " + this.getClass());
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из " + this.getClass());
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в " + this.getClass());
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в " + this.getClass());
    }

    public void addBook(Book book) {
        System.out.println("Добавляем книгу в " + this.getClass());
    }
}
