package staticTest;

// 	company랑 같이 봐라
public class Gangnam {
	public static void main(String[] args) {
		Company 이지민 = new Company();
		Company 용호중 = new Company();
		Company 이세찬 = new Company();

//	이지민.income = 1_000_000;
//	용호중.income = 500_000;
//	이세찬.income = 1_500_000;

//	Company.totalIncome  = 	이지민.income + 용호중.income + 이세찬.income;
		이지민.getIncome(1_500_000);
		용호중.getIncome(500_000);
		이세찬.getIncome(1_000_000);

		System.out.println(Company.totalIncome);

	}
}
