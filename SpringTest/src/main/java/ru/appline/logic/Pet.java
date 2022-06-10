package ru.appline.logic;

public class Pet {

    private String name;
    private String type;
    private int age;

// Добавляем конструктор, который позволит избежать возможной Системной ошибки.
    public Pet() {
        super();
    }

// Комбинацией Alt + Ins  вызываем меню автодобавления конструктора, геттеров и сеттеров.
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
