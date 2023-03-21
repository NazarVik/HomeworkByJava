package Seminar6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Notebook> list = new ArrayList<>();

        Notebook note1 = new Notebook("Lenova", 17.0, "i5", "Windows", 8, 128);
        Notebook note2 = new Notebook("Asus", 15.6, "i7", "Windows", 16, 128);
        Notebook note3 = new Notebook("HP", 15.6, "i3", "Linux", 8, 128);
        Notebook note4 = new Notebook("MacBook Pro ", 13.3, "i5", "IOS", 8, 254);
        Notebook note5 = new Notebook("MacBooK Air", 13.3, "i3", "IOS", 4, 128);
        Notebook note6 = new Notebook("Acer", 15.6, "i3", "Windows", 4, 128);

        Collections.addAll(list, note1, note2, note3, note4, note5, note6);

        Map<Integer, String > mapChoice = new HashMap<>();
//        mapChoice.put(1, "model");
//        mapChoice.put(2, "size");
//        mapChoice.put(3, "cpu");
//        mapChoice.put(4, "os");
//        mapChoice.put(5, "ram");
//        mapChoice.put(6, "ssd");

        System.out.println("введите критерий сортировки: 1 - модель \n" +
                "2 - диогональ экрана\n" +
                "3 - процессор\n" +
                "4 - операционная система\n" +
                "5 - оперативная память\n" +
                "6 - объем накопителя");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch(choice) {
            case 1: {
                System.out.println("введите модель (Acer, Lenova, HP, Asus, MacBook Pro, MacBooK Air:");
                modelSort(list, in.next());
                break;
            }
            case 2: {
                sizeSort();
                break;
            }
            case 3: {
                cpuSort();
                break;
            }
            case 4: {
                osSort();
                break;
            }
            case 5: {
                ramSort();
                break;
            }
            case 6: {
                ssdSort();
                break;
            }

            default:
                System.out.println("fail");
        }



    }

    private static void modelSort(List<Notebook> list, String str){

        List<Notebook> resultList = new ArrayList<>();

        for (Notebook item : list) {
            if (str.equals(item.getModel())) {
                resultList.add(item);
            }
        }
        System.out.println(resultList);

    }

    private static void sizeSort(){

    }
    private static void cpuSort(){

    }
    private static void osSort(){

    }
    private static void ramSort(){

    }
    private static void ssdSort(){

    }
}
