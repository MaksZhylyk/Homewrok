package lesson42.homework;

public class Review {
   private String travelerName;
    private String country;
    private String reviewText;
    private String visitDate;

    public Review(String travelerName, String country, String reviewText, String visitDate) {
        this.travelerName = travelerName;
        this.country = country;
        this.reviewText = reviewText;
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "travelerName='" + travelerName + '\'' +
                ", country='" + country + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }

}

