package leave;

public class ProjectManager implements ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler = new HR();

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 3 && leaveRequest.getLeaveDays() <= 5) {
			System.out.println(
					"Project Manager : Leave Accepted for " + leaveRequest.getEmployee() + ". Days - " + leaveRequest.getLeaveDays());
		} else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
