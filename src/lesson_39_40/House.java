package lesson_39_40;

/**
 * Класс House представляет дом с определенным количеством этажей, комнат и наличием либо отсутствием гаража.
 * Вкючает паттерн Builder для упрощенного создания объектов.
 */
public class House {
    private final int floors;       // количество этажей
    private final int rooms;        // количество комнат
    private final boolean hasGarage; // наличие гаража

    /**
     * Приватный конструктор для класса House, который может быть вызван только из Builder.
     *
     * @param builder объект Builder, содержащий параметры для создания Дома.
     */
    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
    }

    /**
     * Возвращает количество этажей в доме.
     *
     * @return количество этажей
     */
    public int getFloors() {
        return floors;
    }

    /**
     * Возвращает количество комнат в доме.
     *
     * @return количество комнат
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Возвращает наличие гаража в доме.
     *
     * @return true, если есть гараж, иначе false.
     */
    public boolean hasGarage() {
        return hasGarage;
    }

    /**
     * Возвращает строковое представление объекта House.
     *
     * @return строка с информацией об объекте House
     */
    @Override
    public String toString() {
        String garage = hasGarage ? "Есть" : "Нет";
        return "Дом - " +
                "Этажей: " + floors +
                ", Комнат: " + rooms +
                ", Наличие Гаража: " + garage +
                '.';
    }

    /**
     * Вложенный статический класс Builder.
     */
    public static class Builder {
        private int floors;
        private int rooms;
        private boolean hasGarage;

        /**
         * Устанавливает количество этажей в доме.
         *
         * @param floors количество этажей
         * @return текущий объект Builder (для цепочки вызовов)
         */
        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        /**
         * Устанавливает количество комнат в доме.
         *
         * @param rooms количество комнат
         * @return текущий объект Builder (для цепочки вызовов)
         */
        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        /**
         * Устанавливает наличие гаража в доме.
         *
         * @param hasGarage наличие гаража (true - есть гараж, false - нет гаража)
         * @return текущий объект Builder (для цепочки вызовов)
         */
        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        /**
         * Создает объект House с текущими параметрами Builder.
         *
         * @return новый объект House
         */
        public House build() {
            return new House(this);
        }
    }
}
