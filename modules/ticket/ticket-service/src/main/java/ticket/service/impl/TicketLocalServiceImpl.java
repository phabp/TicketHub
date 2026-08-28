/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import java.util.Date;
import java.util.List;
import org.osgi.service.component.annotations.Component;
import ticket.model.Ticket;
import ticket.service.base.TicketLocalServiceBaseImpl;


/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=ticket.model.Ticket",
	service = AopService.class
)
public class TicketLocalServiceImpl extends TicketLocalServiceBaseImpl {

	public Ticket addTicket(
			long groupId, long userId, String title, String description,
			String category, String priority, long assignedToUserId)
			throws PortalException {

		User user = userLocalService.getUser(userId);

		long ticketId = counterLocalService.increment();

		Ticket ticket = ticketPersistence.create(ticketId);

		Date now = new Date();

		ticket.setGroupId(groupId);
		ticket.setCompanyId(user.getCompanyId());
		ticket.setUserId(userId);
		ticket.setUserName(user.getFullName());
		ticket.setCreateDate(now);
		ticket.setModifiedDate(now);

		ticket.setTitle(title);
		ticket.setDescription(description);
		ticket.setCategory(category);
		ticket.setPriority(priority);
		ticket.setStatus("OPEN");
		ticket.setAssignedToUserId(assignedToUserId);

		return ticketPersistence.update(ticket);
	}

	public List<Ticket> getTicketsByAssignedToUserId(
			long assignedToUserId) {

		return ticketPersistence.findByAssignedToUserId(
				assignedToUserId);
	}

	public Ticket updateTicket(
			long ticketId, String title, String description,
			String category, String priority, String status,
			long assignedToUserId)
			throws PortalException {

		Ticket ticket = getTicket(ticketId);

		ticket.setTitle(title);
		ticket.setDescription(description);
		ticket.setCategory(category);
		ticket.setPriority(priority);
		ticket.setStatus(status);
		ticket.setAssignedToUserId(assignedToUserId);
		ticket.setModifiedDate(new Date());

		return updateTicket(ticket);
	}

	public Ticket deleteTicket(long ticketId) throws PortalException {
		Ticket ticket = getTicket(ticketId);

		if ("CLOSED".equals(ticket.getStatus())) {
			throw new PortalException(
					"IMPORTANT: A closed ticket cannot be deleted, for record reasons!");
		}

		return deleteTicket(ticket);
	}
}
// LIFERAY-SERVICE-BUILDER-HASH:1612458912