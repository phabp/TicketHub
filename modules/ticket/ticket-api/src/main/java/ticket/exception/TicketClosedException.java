package ticket.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class TicketClosedException extends PortalException {

	public TicketClosedException() {
		super("A closed ticket cannot be deleted, for record reasons");
	}

}