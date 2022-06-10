package ru.appline.controller;

import org.springframework.web.bind.annotation.*;
import ru.appline.logic.CompassModel;
import ru.appline.logic.Pet;
import ru.appline.logic.PetModel;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {

    // Создаем экземпляр нашего PetModel.
    private static final PetModel petModel = PetModel.getInstance();

    private static final AtomicInteger newId = new AtomicInteger(1);

    // Метод для создания питомца. Для того, чтобы дать понять приложению, как обращаться к методу, сначала создаем аннотацию для POST-запроса.
    @PostMapping(value = "/createPet", consumes = "application/json", produces = "application/json")
    public String createPet(@RequestBody Pet pet) {
        petModel.add(pet, newId.getAndIncrement());
        if(petModel.getAll().containsKey(2)) {
            return "Питомец создан.";
        } else {
            return "Поздравляем, вы создали первого питомца!";
        }
    }

    // Метод для получения списка всех доступных питомцев. Требуется применение аннотаций.
    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<Integer, Pet> getAll() {
        return petModel.getAll();
    }

    // Метод для получения конкретного питомца по id. Трубется применение аннотаций.
    @GetMapping(value = "/getPet", consumes = "application/json", produces = "application/json")
    public Pet getPet(@RequestBody Map<String, Integer> id) {
        return petModel.getFromList(id.get("id"));
    }

    // Метод для удаления питомца по id. Требуется применение аннотаций.
    @DeleteMapping(value = "/delPet", consumes = "application/json", produces = "application/json")
    public String deletePet(@RequestBody Map<String, Integer> id) {
        petModel.del(id.get("id"));
        return "Питомец нашел Дом.";
    }

    // Метод для обновления данных питомца Требует применения аннотаций. Требует указания id в адресной строке, а не теле запроса.
    @PutMapping(value = "/getAll/{id}", consumes = "application/json", produces = "application/json")
    public String updatePet(@PathVariable("id") int id, @RequestBody Pet pet) {
        petModel.upd(pet, id);
        return "Данные о питомце успешно обновлены";
    }


                                                // Создание Компаса.


    //Создаем экземпляр CompassModel
    private static final CompassModel compass = CompassModel.getInstance();

    // Запрос направления по сторонам Света.
    @GetMapping(value = "/getCompass", consumes = "application/json", produces = "application/json")
    public String getCompass(@RequestBody Map<String, String> compassArrow) {
        return compass.getCompass(compassArrow.get("direction"));
    }

    // Запрос всех параметров компаса.
    @GetMapping(value = "/getAllCompass", produces = "application/json")
    public Map<String, String> getAllCompass() {
        return compass.getAllCompass();
    }

//    // Запрос направления по сторонам Света.
//    @GetMapping(value = "/getCompass", consumes = "application/json", produces = "application/json")
//    public Compass getCompass(@RequestBody Map<String, String> compassArrow) {
//        return compass.getCompass(compassArrow.get("direction"));
//    }
//
//    // Запрос всех параметров компаса.
//    @GetMapping(value = "/getAllCompass", produces = "application/json")
//    public Map<String, Compass> getAllCompass() {
//        return compass.getAllCompass();
//    }
}
