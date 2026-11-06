package entities; 

public class Worker {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Organization organization; //Поле не может быть null
    private Long salary; //Поле может быть null, Значение поля должно быть больше 0
    private Long rating; //Поле не может быть null, Значение поля должно быть больше 0
    private java.time.LocalDateTime startDate; //Поле не может быть null
    private Position position; //Поле может быть null
    private Status status; //Поле может быть null
    private Person person; //Поле может быть null
}