package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
      MovieReview movie1 = new MovieReview();
      MovieReview movie2 = new MovieReview();

      movie1.title ="인셉션";
      movie2.title ="어바웃 타임";

      movie1.review = "인생은 무한 루프";
      movie2.review = "인생 시간 영화!";

      MovieReview[] movieReview = {movie1,movie2};

        for (MovieReview review : movieReview) {
            System.out.println("영화제목: "+review.title+"영화 리뷰: "+review.review);
        }



    }
}
