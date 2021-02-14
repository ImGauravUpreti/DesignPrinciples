package solid_principles.dependency_inversion;

public class Main {
	public static void main(String[] args) {
		SamsungNote samsungNote = new SamsungNote();
		Redmi7 redmi7 = new Redmi7();
		ProcessPhoneRepair processPhoneRepair = new ProcessPhoneRepair();
		processPhoneRepair.repairSteps(samsungNote);
		processPhoneRepair.repairSteps(redmi7);
	}
}
