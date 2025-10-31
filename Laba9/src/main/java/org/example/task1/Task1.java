package org.example.task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void run() {
        Map<String, Electronic> devices = new HashMap<>();
        devices.put("Samsung", new TV("Samsung"));
        devices.put("LG", new TV("LG"));
        devices.put("SonyRadio", new Radio("SonyRadio"));

        System.out.println("Ключи всех устройств:");
        devices.keySet().forEach(System.out::println);

        for (Electronic device : devices.values()) {
            System.out.println(device);
        }
    }
}
