package ticket.rest.internal.graphql.servlet.v1_0;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import jakarta.annotation.Generated;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

import ticket.rest.internal.graphql.mutation.v1_0.Mutation;
import ticket.rest.internal.graphql.query.v1_0.Query;
import ticket.rest.internal.resource.v1_0.TicketResourceImpl;
import ticket.rest.resource.v1_0.TicketResource;

/**
 * @author me
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setTicketResourceComponentServiceObjects(
			_ticketResourceComponentServiceObjects);

		Query.setTicketResourceComponentServiceObjects(
			_ticketResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "TicketRest";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/ticket-rest-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#patchTicket",
						new ObjectValuePair<>(
							TicketResourceImpl.class, "patchTicket"));
					put(
						"mutation#createSiteTicket",
						new ObjectValuePair<>(
							TicketResourceImpl.class, "postSiteTicket"));
					put(
						"mutation#createSiteTicketBatch",
						new ObjectValuePair<>(
							TicketResourceImpl.class, "postSiteTicketBatch"));

					put(
						"query#ticket",
						new ObjectValuePair<>(
							TicketResourceImpl.class, "getTicket"));
					put(
						"query#tickets",
						new ObjectValuePair<>(
							TicketResourceImpl.class, "getTickets"));
					put(
						"query#ticketsByAssignedToUserId",
						new ObjectValuePair<>(
							TicketResourceImpl.class,
							"getTicketsByAssignedToUserId"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<TicketResource>
		_ticketResourceComponentServiceObjects;

}