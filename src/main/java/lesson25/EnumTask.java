package lesson25;

public enum EnumTask {
    /*
    Создайте enum `Season`, который включает четыре времени года:\
     `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`. Напишите метод в этом enum,
      который возвращает рекомендуемую активность для каждого сезона (например, лыжи зимой).
      Используя созданный enum `Season`, напишите метод, который принимает значение `Season`
       и выводит сообщение о том, как одеваться в этот сезон, используя конструкцию `switch`.
     */
    SPRING, SUMMER, AUTUMN, WINTER;
    private String sportForSeason;


    public String getSportForSeason() {
        return sportForSeason;
    }
}
