package ticket.rest.internal.resource.v1_0;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import ticket.rest.resource.v1_0.TicketResource;

/**
 * @author me
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/ticket.properties",
	scope = ServiceScope.PROTOTYPE, service = TicketResource.class
)
public class TicketResourceImpl extends BaseTicketResourceImpl {
}