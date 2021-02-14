package leave;

public class Main {

	public static void main(String[] args) {

		Supervisor supervisor = new Supervisor();

		LeaveRequest leaveRequest1 = new LeaveRequest("Frodo", 2);
		supervisor.HandleRequest(leaveRequest1);

		LeaveRequest leaveRequest2 = new LeaveRequest("Gandalf", 4);
		supervisor.HandleRequest(leaveRequest2);

		LeaveRequest leaveRequest3 = new LeaveRequest("Arwen", 7);
		supervisor.HandleRequest(leaveRequest3);

		LeaveRequest leaveRequest4 = new LeaveRequest("Legolas", 20);
		supervisor.HandleRequest(leaveRequest4);

	}

}
