import lombok.*;

@AllArgsConstructor
@Data


public class Flights {

    private String city1;
    private String city2;
    private String date;
    private Integer amount;

    public Flights() {
    }

    public Flights(String city1, String city2, Integer amount) {
        this.city1 = city1;
        this.city2 = city2;

        this.amount = amount;
    }

    public Flights(String city1, String city2, Integer date, Integer amount) {
        this.city1 = city1;
        this.city2 = city2;

        this.amount = amount;

    }


    @Override
    public String toString() {
        return "Flights{" +
                "ასაფრენი ქალაქი=" +  city1+
                ", ჩასაფრენი ქალაქი='" + city2 + '\'' +
                ", თარიღი='" + date + '\'' +
                ", ფასი=" + amount +
                '}';
    }

}

