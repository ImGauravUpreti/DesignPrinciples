package leave;

public interface ILeaveRequestHandler {
	public ILeaveRequestHandler nextHandler = null;

	void HandleRequest(LeaveRequest leaveRequest);

}
