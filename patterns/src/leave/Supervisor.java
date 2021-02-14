package leave;

public class Supervisor implements ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler = new ProjectManager();

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 1 && leaveRequest.getLeaveDays() <= 3) {
			System.out.println(
					"Supervisor : Leave Accepted for " + leaveRequest.getEmployee() + ". Days - " + leaveRequest.getLeaveDays());
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
