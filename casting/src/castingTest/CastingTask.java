package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스

// 사용자가 선택한 영상이
// 1. 애니메이션이라면, "자막 지원" 기능 사용
// 2. 영화라면, "4D" 기능 사용
// 3. 드라마라면, "굿즈" 기능 사용

public class CastingTask {
	public void getService(Video video) {
		if (video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.printSubtitle();
		} else if (video instanceof Drama) {
			Drama drama = (Drama) video;
			drama.sellGoods();
		} else if (video instanceof Film) {
			Film film = (Film) video;
			film.shake();
		}
	}

	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
		Video[] videos = { 
				new Animation(),
				new Drama(),
				new Film() 
				};

		for (int i = 0; i < videos.length; i++) {
			castingTask.getService(videos[i]);
		}
	}
}
