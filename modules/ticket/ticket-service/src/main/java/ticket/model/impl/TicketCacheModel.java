/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import ticket.model.Ticket;

/**
 * The cache model class for representing Ticket in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TicketCacheModel implements CacheModel<Ticket>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TicketCacheModel)) {
			return false;
		}

		TicketCacheModel ticketCacheModel = (TicketCacheModel)object;

		if (ticketId == ticketCacheModel.ticketId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ticketId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ticketId=");
		sb.append(ticketId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", category=");
		sb.append(category);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", status=");
		sb.append(status);
		sb.append(", assignedToUserId=");
		sb.append(assignedToUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Ticket toEntityModel() {
		TicketImpl ticketImpl = new TicketImpl();

		if (uuid == null) {
			ticketImpl.setUuid("");
		}
		else {
			ticketImpl.setUuid(uuid);
		}

		ticketImpl.setTicketId(ticketId);
		ticketImpl.setGroupId(groupId);
		ticketImpl.setCompanyId(companyId);
		ticketImpl.setUserId(userId);

		if (userName == null) {
			ticketImpl.setUserName("");
		}
		else {
			ticketImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ticketImpl.setCreateDate(null);
		}
		else {
			ticketImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ticketImpl.setModifiedDate(null);
		}
		else {
			ticketImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			ticketImpl.setTitle("");
		}
		else {
			ticketImpl.setTitle(title);
		}

		if (description == null) {
			ticketImpl.setDescription("");
		}
		else {
			ticketImpl.setDescription(description);
		}

		if (category == null) {
			ticketImpl.setCategory("");
		}
		else {
			ticketImpl.setCategory(category);
		}

		if (priority == null) {
			ticketImpl.setPriority("");
		}
		else {
			ticketImpl.setPriority(priority);
		}

		if (status == null) {
			ticketImpl.setStatus("");
		}
		else {
			ticketImpl.setStatus(status);
		}

		ticketImpl.setAssignedToUserId(assignedToUserId);

		ticketImpl.resetOriginalValues();

		return ticketImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ticketId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		category = objectInput.readUTF();
		priority = objectInput.readUTF();
		status = objectInput.readUTF();

		assignedToUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(ticketId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (priority == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(priority);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(assignedToUserId);
	}

	public String uuid;
	public long ticketId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String description;
	public String category;
	public String priority;
	public String status;
	public long assignedToUserId;

}