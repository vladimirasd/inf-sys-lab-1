package entities;

public class Organization {
    private Address officialAddress; //Поле может быть null
    private double annualTurnover; //Значение поля должно быть больше 0
    private Long employeesCount; //Поле не может быть null, Значение поля должно быть больше 0
    private String fullName; //Длина строки не должна быть больше 1300, Поле может быть null
    private int rating; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null
    private Address postalAddress; //Поле не может быть null
}
