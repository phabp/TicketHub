package ticket.rest.internal.graphql.query.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import jakarta.annotation.Generated;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.ws.rs.core.UriInfo;

import java.util.Map;
import java.util.function.BiFunction;

import org.osgi.service.component.ComponentServiceObjects;

import ticket.rest.dto.v1_0.Ticket;
import ticket.rest.resource.v1_0.TicketResource;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Query {

	public static void setTicketResourceComponentServiceObjects(
		ComponentServiceObjects<TicketResource>
			ticketResourceComponentServiceObjects) {

		_ticketResourceComponentServiceObjects =
			ticketResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {ticket(ticketId: ___){ticketId, title, description, category, priority, status, assignedToUserId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public Ticket ticket(@GraphQLName("ticketId") Long ticketId)
		throws Exception {

		return _applyComponentServiceObjects(
			_ticketResourceComponentServiceObjects,
			this::_populateResourceContext,
			ticketResource -> ticketResource.getTicket(ticketId));
	}

	@GraphQLName("TicketPage")
	public class TicketPage {

		public TicketPage(Page ticketPage) {
			actions = ticketPage.getActions();

			items = ticketPage.getItems();
			lastPage = ticketPage.getLastPage();
			page = ticketPage.getPage();
			pageSize = ticketPage.getPageSize();
			totalCount = ticketPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<Ticket> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(TicketResource ticketResource)
		throws Exception {

		ticketResource.setContextAcceptLanguage(_acceptLanguage);
		ticketResource.setContextCompany(_company);
		ticketResource.setContextHttpServletRequest(_httpServletRequest);
		ticketResource.setContextHttpServletResponse(_httpServletResponse);
		ticketResource.setContextUriInfo(_uriInfo);
		ticketResource.setContextUser(_user);
		ticketResource.setGroupLocalService(_groupLocalService);
		ticketResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<TicketResource>
		_ticketResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction
		<Object, String, com.liferay.portal.kernel.search.filter.Filter>
			_filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, com.liferay.portal.kernel.search.Sort[]>
		_sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}