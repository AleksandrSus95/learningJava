package Patterns;

public class SingletonClass {
    private static SingletonClass singletonClass;
    private static String stringSingleton = "";

    public static synchronized SingletonClass getSingletonClass() {
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    private SingletonClass(){

    }

    public void addSingletonString(String somethingString){
        stringSingleton += somethingString + "\n";
    }

    public void printSingletonString(){
        System.out.println(stringSingleton);
    }
}

// Шаблон: Одиночка (Singleton)
// Гарантирует что у класса будет только один единственный экземлпяр и к нему будет предоставлена глобальная точка доступа
//
// Для чего используют:
// Для создания единственного экземпляра определенного класса
