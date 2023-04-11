// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package HW_6;
import java.util.*;
public class task_01 {
    public static void main(String[] args){
        List<Notebook> notebooks = initListNotebooks();
        Map<String, String> params = new HashMap<>();
        params.put("RAM", "16");
        params.put("HDD", "512");
        params.put("OS", "Windows 10");
        params.put("Color", "Черный");
        List<Notebook> filteredNotebooks = filter(params, notebooks);
        for(Notebook notebook: filteredNotebooks){
            notebook.displayInfo();
            System.out.println("----------");
        }
    }

    public static List<Notebook> initListNotebooks(){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Asus ZenBook", "Asus", 13.3, "1920x1080", "Intel Core i5", 4, 1.6, 8, 256, "Intel UHD Graphics 620", "Windows 10", "Серый", 59990));
        notebooks.add(new Notebook("Lenovo ThinkPad X1 Carbon", "Lenovo", 14, "1920x1080", "Intel Core i7", 4, 1.8, 16, 512, "Intel UHD Graphics 620", "Windows 10", "Черный", 109990));
        notebooks.add(new Notebook("Apple MacBook Pro", "Apple", 13.3, "2560x1600", "Intel Core i5", 4, 2.0, 8, 256, "Intel Iris Plus Graphics 645", "macOS", "Серебристый", 119990));
        notebooks.add(new Notebook("DEXP Aquilon", "DEXP", 14, "1920x1080", "Intel Celeron N4020", 2, 1.1, 16, 512, "Intel UHD Graphics 600", "Windows 10", "Черный", 15199));
        return notebooks;
    }

    public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            boolean passFilter = true;
            for (String key: params.keySet()){
                String value = params.get(key);
                switch (key) {
                    case "RAM":
                        if (notebook.getRam() < Integer.parseInt(value)) {
                            passFilter = false;
                        }
                        break;
                    case "HDD":
                        if (notebook.getHDD() < Integer.parseInt(value)) {
                            passFilter = false;
                        }
                        break;
                    case "OS":
                        if (!notebook.getOS().equals(value)) {
                            passFilter = false;
                        }
                        break;
                    case "Color":
                        if (!notebook.getColor().equals(value)) {
                            passFilter = false;
                        }
                        break;
                }
            }
            if (passFilter) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

}
