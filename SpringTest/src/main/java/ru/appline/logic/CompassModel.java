package ru.appline.logic;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CompassModel implements Serializable {

    private static final CompassModel instance = new CompassModel();

    private final Map<String, String> compassModel;
    public CompassModel() {
        compassModel = new HashMap<String, String>();

        compassModel.put("North", "337-359, 0-21");
        compassModel.put("North-East", "22-66");
        compassModel.put("East", "67-111");
        compassModel.put("East-South", "112-156");
        compassModel.put("South", "157-201");
        compassModel.put("South-West", "202-246");
        compassModel.put("West", "247-291");
        compassModel.put("West-North", "292-336");
    }





//    private final Map<String, Compass> compassModel;
//
//    public CompassModel() {
//        compassModel = new HashMap<String, Compass>();
//
//        compassModel.put("North", new Compass("337-359, 0-21"));
//        compassModel.put("North-East", new Compass("22-66"));
//        compassModel.put("East", new Compass("67-111"));
//        compassModel.put("East-South", new Compass("112-156"));
//        compassModel.put("South", new Compass("157-201"));
//        compassModel.put("South-West", new Compass("202-246"));
//        compassModel.put("West", new Compass("247-291"));
//        compassModel.put("West-North", new Compass("292-336"));
//    }

    // Пропишем метод, с помощью которого будем получать наш instance.
    public static CompassModel getInstance() {
        return instance;
    }

    public String getCompass(String arrow) {
        return compassModel.get(arrow);
    }

    public Map<String, String> getAllCompass() {
        return compassModel;
    }




//    public Compass getCompass(String arrow) {
//        return compassModel.get(arrow);
//    }
//
//    public Map<String, Compass> getAllCompass() {
//        return compassModel;
//    }


}
