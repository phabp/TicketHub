package ticket.rest.client.dto.v1_0;

import jakarta.annotation.Generated;

import java.io.Serializable;

import java.util.Objects;

import ticket.rest.client.function.UnsafeSupplier;
import ticket.rest.client.serdes.v1_0.TicketCreateSerDes;

/**
 * @author me
 * @generated
 */
@Generated("")
public class TicketCreate implements Cloneable, Serializable {

	public static TicketCreate toDTO(String json) {
		return TicketCreateSerDes.toDTO(json);
	}

	public Long getAssignedToUserId() {
		return assignedToUserId;
	}

	public void setAssignedToUserId(Long assignedToUserId) {
		this.assignedToUserId = assignedToUserId;
	}

	public void setAssignedToUserId(
		UnsafeSupplier<Long, Exception> assignedToUserIdUnsafeSupplier) {

		try {
			assignedToUserId = assignedToUserIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long assignedToUserId;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCategory(
		UnsafeSupplier<String, Exception> categoryUnsafeSupplier) {

		try {
			category = categoryUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String category;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setPriority(
		UnsafeSupplier<String, Exception> priorityUnsafeSupplier) {

		try {
			priority = priorityUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String priority;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String title;

	@Override
	public TicketCreate clone() throws CloneNotSupportedException {
		return (TicketCreate)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TicketCreate)) {
			return false;
		}

		TicketCreate ticketCreate = (TicketCreate)object;

		return Objects.equals(toString(), ticketCreate.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return TicketCreateSerDes.toJSON(this);
	}

}