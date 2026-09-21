package ticket.rest.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import jakarta.annotation.Generated;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.validation.constraints.NotEmpty;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import java.util.function.BiFunction;

import org.osgi.service.component.ComponentServiceObjects;

import ticket.rest.dto.v1_0.Ticket;
import ticket.rest.dto.v1_0.TicketCreate;
import ticket.rest.dto.v1_0.TicketUpdate;
import ticket.rest.resource.v1_0.TicketResource;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setTicketResourceComponentServiceObjects(
		ComponentServiceObjects<TicketResource>
			ticketResourceComponentServiceObjects) {

		_ticketResourceComponentServiceObjects =
			ticketResourceComponentServiceObjects;
	}

	@GraphQLField
	public Response deleteTicket(@GraphQLName("ticketId") Long ticketId)
		throws Exception {

		return _applyComponentServiceObjects(
			_ticketResourceComponentServiceObjects,
			this::_populateResourceContext,
			ticketResource -> ticketResource.deleteTicket(ticketId));
	}

	@GraphQLField
	public Response deleteTicketBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_ticketResourceComponentServiceObjects,
			this::_populateResourceContext,
			ticketResource -> ticketResource.deleteTicketBatch(
				callbackURL, object));
	}

	@GraphQLField
	public Ticket patchTicket(
			@GraphQLName("ticketId") Long ticketId,
			@GraphQLName("ticketUpdate") TicketUpdate ticketUpdate)
		throws Exception {

		return _applyComponentServiceObjects(
			_ticketResourceComponentServiceObjects,
			this::_populateResourceContext,
			ticketResource -> ticketResource.patchTicket(
				ticketId, ticketUpdate));
	}

	@GraphQLField
	public Ticket createSiteTicket(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("ticketCreate") TicketCreate ticketCreate)
		throws Exception {

		return _applyComponentServiceObjects(
			_ticketResourceComponentServiceObjects,
			this::_populateResourceContext,
			ticketResource -> ticketResource.postSiteTicket(
				Long.valueOf(siteKey), ticketCreate));
	}

	@GraphQLField
	public Response createSiteTicketBatch(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("ticketCreate") TicketCreate ticketCreate,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_ticketResourceComponentServiceObjects,
			this::_populateResourceContext,
			ticketResource -> ticketResource.postSiteTicketBatch(
				Long.valueOf(siteKey), ticketCreate, callbackURL, object));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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

		ticketResource.setVulcanBatchEngineImportTaskResource(
			_vulcanBatchEngineImportTaskResource);
	}

	private static ComponentServiceObjects<TicketResource>
		_ticketResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, com.liferay.portal.kernel.search.Sort[]>
		_sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;
	private VulcanBatchEngineImportTaskResource
		_vulcanBatchEngineImportTaskResource;

}