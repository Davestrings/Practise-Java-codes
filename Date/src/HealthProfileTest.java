
public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthProfile yourHealthProfile = new HealthProfile("Olayemi", "Badmus", "male", 192, 89, 12, 6, 1930);
				System.out.printf("Your max Heart rate and BMI is %d and %f respectively", yourHealthProfile.maxHeartRate(), yourHealthProfile.BMI());
				System.out.println();
		HealthProfile myHealthProfile = new HealthProfile();
		
		myHealthProfile.setGender();
		
		System.out.print("my gender is " + myHealthProfile.getGender());
	}

}
