package leave;

public class HR implements ILeaveRequestHandler {

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 5 && leaveRequest.getLeaveDays() <= 10) {
			System.out.println(
					"HR : Leave Accepted for " + leaveRequest.getEmployee() + ". Days - " + leaveRequest.getLeaveDays());
		} else {
			System.out.println(
					"HR : Leave Rejected for " + leaveRequest.getEmployee() + ". Days - " + leaveRequest.getLeaveDays());

		}
	}

}
