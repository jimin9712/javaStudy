package anonymousTask;

public class Building {
	public static void main(String[] args) {
		System.out.println("===강남점===");
		Nike gangnam = new Nike();
//		추상 클래스는 뒤에 익명으로 일단 열어놔라 / 일반 클래스는 구현체로 사용할 수 있음
		gangnam.register(new FormAdapter() {

			@Override
			public String[] getMenu() {
				return new String[] { "신발", "옷" };
			}
		});

		System.out.println("===잠실점===");
		Nike jamsil = new Nike();

		gangnam.register(new Form() {

			@Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if (menu[i].equals(order)) {
						System.out.println(order + " 판매완료");

					}
				}
			}

			@Override
			public String[] getMenu() {
				return new String[] { "신발", "옷" };
			}
		});
	}
}
