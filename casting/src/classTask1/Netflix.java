package classTask1;

public class Netflix {
	public void checkGenre(Genre genre) {
		if(genre instanceof Animation) {
			Animation animation = (Animation) genre;
			animation.showSubTtile();
		} else if(genre instanceof Drama) {
			Drama drama = (Drama)genre;
			drama.sellGoods();
		} else if(genre instanceof Movie) {
			Movie movie = (Movie) genre;
			movie.shakeChair();
		}
	}
}
