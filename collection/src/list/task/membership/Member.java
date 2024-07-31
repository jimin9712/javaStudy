package list.task.membership;

import java.util.Objects;

public class Member {
	private String userName;
	private String userGrade;
	private double useAmount;
	
	public Member() {;}
	
	public Member(Member member) {
		this(member.getUserName(), member.getUserGrade(), member.getuseAmount());
	}

	public Member(String userName, String userGrade, double useAmount) {
		super();
		this.userName = userName;
		this.userGrade = userGrade;
		this.useAmount = useAmount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public double getuseAmount() {
		return useAmount;
	}

	public void setUseAmount(double useAmount) {
		this.useAmount = useAmount;
	}

	@Override
	public String toString() {
		return "Member [userName=" + userName + ", userGrade=" + userGrade + ", useAmount=" + useAmount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(userName, other.userName);
	}

	
	
	
}