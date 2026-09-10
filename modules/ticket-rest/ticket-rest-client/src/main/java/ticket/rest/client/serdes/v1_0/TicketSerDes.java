package ticket.rest.client.serdes.v1_0;

import jakarta.annotation.Generated;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import ticket.rest.client.dto.v1_0.Ticket;
import ticket.rest.client.json.BaseJSONParser;

/**
 * @author me
 * @generated
 */
@Generated("")
public class TicketSerDes {

	public static Ticket toDTO(String json) {
		TicketJSONParser ticketJSONParser = new TicketJSONParser();

		return ticketJSONParser.parseToDTO(json);
	}

	public static Ticket[] toDTOs(String json) {
		TicketJSONParser ticketJSONParser = new TicketJSONParser();

		return ticketJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Ticket ticket) {
		if (ticket == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (ticket.getAssignedToUserId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assignedToUserId\": ");

			sb.append(ticket.getAssignedToUserId());
		}

		if (ticket.getCategory() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"category\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getCategory()));

			sb.append("\"");
		}

		if (ticket.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getDescription()));

			sb.append("\"");
		}

		if (ticket.getPriority() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getPriority()));

			sb.append("\"");
		}

		if (ticket.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getStatus()));

			sb.append("\"");
		}

		if (ticket.getTicketId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"ticketId\": ");

			sb.append(ticket.getTicketId());
		}

		if (ticket.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(ticket.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		TicketJSONParser ticketJSONParser = new TicketJSONParser();

		return ticketJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Ticket ticket) {
		if (ticket == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (ticket.getAssignedToUserId() == null) {
			map.put("assignedToUserId", null);
		}
		else {
			map.put(
				"assignedToUserId",
				String.valueOf(ticket.getAssignedToUserId()));
		}

		if (ticket.getCategory() == null) {
			map.put("category", null);
		}
		else {
			map.put("category", String.valueOf(ticket.getCategory()));
		}

		if (ticket.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(ticket.getDescription()));
		}

		if (ticket.getPriority() == null) {
			map.put("priority", null);
		}
		else {
			map.put("priority", String.valueOf(ticket.getPriority()));
		}

		if (ticket.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(ticket.getStatus()));
		}

		if (ticket.getTicketId() == null) {
			map.put("ticketId", null);
		}
		else {
			map.put("ticketId", String.valueOf(ticket.getTicketId()));
		}

		if (ticket.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(ticket.getTitle()));
		}

		return map;
	}

	public static class TicketJSONParser extends BaseJSONParser<Ticket> {

		@Override
		protected Ticket createDTO() {
			return new Ticket();
		}

		@Override
		protected Ticket[] createDTOArray(int size) {
			return new Ticket[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "assignedToUserId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "category")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "priority")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "ticketId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Ticket ticket, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "assignedToUserId")) {
				if (jsonParserFieldValue != null) {
					ticket.setAssignedToUserId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "category")) {
				if (jsonParserFieldValue != null) {
					ticket.setCategory((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					ticket.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "priority")) {
				if (jsonParserFieldValue != null) {
					ticket.setPriority((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					ticket.setStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "ticketId")) {
				if (jsonParserFieldValue != null) {
					ticket.setTicketId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					ticket.setTitle((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			sb.append(_toJSON(value));

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static String _toJSON(Object value) {
		if (value == null) {
			return "null";
		}

		if (value instanceof Map) {
			return _toJSON((Map)value);
		}

		Class<?> clazz = value.getClass();

		if (clazz.isArray()) {
			StringBuilder sb = new StringBuilder("[");

			Object[] values = (Object[])value;

			for (int i = 0; i < values.length; i++) {
				sb.append(_toJSON(values[i]));

				if ((i + 1) < values.length) {
					sb.append(", ");
				}
			}

			sb.append("]");

			return sb.toString();
		}

		if (value instanceof String) {
			return "\"" + _escape(value) + "\"";
		}

		return String.valueOf(value);
	}

}