package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PetModel implements Serializable {

    private static final PetModel instance = new PetModel();
    private final Map<Integer, Pet> model;

// Запись private final Map<Integer, Pet> model; подчеркнута красным - требует создания конструктора для инициализации нашего Map.
    public PetModel() {
        model = new HashMap<Integer, Pet>();
    }

// Пропишем метод, с помощью которого будем получать наш instance.
    public static PetModel getInstance() {
        return instance;
    }

    public void add(Pet pet, int id) {
        model.put(id, pet);
    }

    public Pet getFromList(int id) {
        return model.get(id);
    }

    public Map<Integer, Pet> getAll() {
        return model;
    }

    public void del(int id) {
        model.remove(id);
    }

    public void upd(Pet pet, int id) {
        model.replace(id, pet);
    }
}
