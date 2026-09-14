package ticket.rest.internal.resource.v1_0;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.List;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import ticket.rest.dto.v1_0.Ticket;
import ticket.rest.resource.v1_0.TicketResource;
import ticket.service.TicketLocalService;

@Component(
		properties = "OSGI-INF/liferay/rest/v1_0/ticket.properties",
		scope = ServiceScope.PROTOTYPE, service = TicketResource.class
)
public class TicketResourceImpl extends BaseTicketResourceImpl {

	@Override
	public Ticket getTicket(Long ticketId) throws Exception {
		ticket.model.Ticket serviceBuilderTicket =
				_ticketLocalService.getTicket(ticketId);

		return _toTicketDTO(serviceBuilderTicket);
	}

	@Override
	public Page<Ticket> getTickets() throws Exception {
		List<ticket.model.Ticket> serviceBuilderTickets =
				_ticketLocalService.getTickets(
						QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		List<Ticket> tickets = serviceBuilderTickets.stream(
		).map(
				this::_toTicketDTO
		).collect(
				Collectors.toList()
		);

		return Page.of(tickets);
	}

	private Ticket _toTicketDTO(
			ticket.model.Ticket serviceBuilderTicket) {

		Ticket ticket = new Ticket();

		ticket.setTicketId(serviceBuilderTicket.getTicketId());
		ticket.setTitle(serviceBuilderTicket.getTitle());
		ticket.setDescription(serviceBuilderTicket.getDescription());
		ticket.setCategory(serviceBuilderTicket.getCategory());
		ticket.setPriority(serviceBuilderTicket.getPriority());
		ticket.setStatus(serviceBuilderTicket.getStatus());
		ticket.setAssignedToUserId(
				serviceBuilderTicket.getAssignedToUserId());

		return ticket;
	}

	@Reference
	private TicketLocalService _ticketLocalService;

}