/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Ticket}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Ticket
 * @generated
 */
public class TicketWrapper
	extends BaseModelWrapper<Ticket> implements ModelWrapper<Ticket>, Ticket {

	public TicketWrapper(Ticket ticket) {
		super(ticket);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("ticketId", getTicketId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("category", getCategory());
		attributes.put("priority", getPriority());
		attributes.put("status", getStatus());
		attributes.put("assignedToUserId", getAssignedToUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long ticketId = (Long)attributes.get("ticketId");

		if (ticketId != null) {
			setTicketId(ticketId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String priority = (String)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long assignedToUserId = (Long)attributes.get("assignedToUserId");

		if (assignedToUserId != null) {
			setAssignedToUserId(assignedToUserId);
		}
	}

	@Override
	public Ticket cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the assigned to user ID of this ticket.
	 *
	 * @return the assigned to user ID of this ticket
	 */
	@Override
	public long getAssignedToUserId() {
		return model.getAssignedToUserId();
	}

	/**
	 * Returns the assigned to user uuid of this ticket.
	 *
	 * @return the assigned to user uuid of this ticket
	 */
	@Override
	public String getAssignedToUserUuid() {
		return model.getAssignedToUserUuid();
	}

	/**
	 * Returns the category of this ticket.
	 *
	 * @return the category of this ticket
	 */
	@Override
	public String getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the company ID of this ticket.
	 *
	 * @return the company ID of this ticket
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ticket.
	 *
	 * @return the create date of this ticket
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this ticket.
	 *
	 * @return the description of this ticket
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this ticket.
	 *
	 * @return the group ID of this ticket
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ticket.
	 *
	 * @return the modified date of this ticket
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this ticket.
	 *
	 * @return the primary key of this ticket
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the priority of this ticket.
	 *
	 * @return the priority of this ticket
	 */
	@Override
	public String getPriority() {
		return model.getPriority();
	}

	/**
	 * Returns the status of this ticket.
	 *
	 * @return the status of this ticket
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the ticket ID of this ticket.
	 *
	 * @return the ticket ID of this ticket
	 */
	@Override
	public long getTicketId() {
		return model.getTicketId();
	}

	/**
	 * Returns the title of this ticket.
	 *
	 * @return the title of this ticket
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this ticket.
	 *
	 * @return the user ID of this ticket
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ticket.
	 *
	 * @return the user name of this ticket
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ticket.
	 *
	 * @return the user uuid of this ticket
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this ticket.
	 *
	 * @return the uuid of this ticket
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the assigned to user ID of this ticket.
	 *
	 * @param assignedToUserId the assigned to user ID of this ticket
	 */
	@Override
	public void setAssignedToUserId(long assignedToUserId) {
		model.setAssignedToUserId(assignedToUserId);
	}

	/**
	 * Sets the assigned to user uuid of this ticket.
	 *
	 * @param assignedToUserUuid the assigned to user uuid of this ticket
	 */
	@Override
	public void setAssignedToUserUuid(String assignedToUserUuid) {
		model.setAssignedToUserUuid(assignedToUserUuid);
	}

	/**
	 * Sets the category of this ticket.
	 *
	 * @param category the category of this ticket
	 */
	@Override
	public void setCategory(String category) {
		model.setCategory(category);
	}

	/**
	 * Sets the company ID of this ticket.
	 *
	 * @param companyId the company ID of this ticket
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ticket.
	 *
	 * @param createDate the create date of this ticket
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this ticket.
	 *
	 * @param description the description of this ticket
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this ticket.
	 *
	 * @param groupId the group ID of this ticket
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ticket.
	 *
	 * @param modifiedDate the modified date of this ticket
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this ticket.
	 *
	 * @param primaryKey the primary key of this ticket
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the priority of this ticket.
	 *
	 * @param priority the priority of this ticket
	 */
	@Override
	public void setPriority(String priority) {
		model.setPriority(priority);
	}

	/**
	 * Sets the status of this ticket.
	 *
	 * @param status the status of this ticket
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the ticket ID of this ticket.
	 *
	 * @param ticketId the ticket ID of this ticket
	 */
	@Override
	public void setTicketId(long ticketId) {
		model.setTicketId(ticketId);
	}

	/**
	 * Sets the title of this ticket.
	 *
	 * @param title the title of this ticket
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this ticket.
	 *
	 * @param userId the user ID of this ticket
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ticket.
	 *
	 * @param userName the user name of this ticket
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ticket.
	 *
	 * @param userUuid the user uuid of this ticket
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this ticket.
	 *
	 * @param uuid the uuid of this ticket
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TicketWrapper wrap(Ticket ticket) {
		return new TicketWrapper(ticket);
	}

}
// LIFERAY-SERVICE-BUILDER-HASH:-2028390958