package ticket.rest.client.serdes.v1_0;

import jakarta.annotation.Generated;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import ticket.rest.client.dto.v1_0.TicketUpdate;
import ticket.rest.client.json.BaseJSONParser;

/**
 * @author me
 * @generated
 */
@Generated("")
public class TicketUpdateSerDes {

	public static TicketUpdate toDTO(String json) {
		TicketUpdateJSONParser ticketUpdateJSONParser =
			new TicketUpdateJSONParser();

		return ticketUpdateJSONParser.parseToDTO(json);
	}

	public static TicketUpdate[] toDTOs(String json) {
		TicketUpdateJSONParser ticketUpdateJSONParser =
			new TicketUpdateJSONParser();

		return ticketUpdateJSONParser.parseToDTOs(json);
	}

	public static String toJSON(TicketUpdate ticketUpdate) {
		if (ticketUpdate == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (ticketUpdate.getAssignedToUserId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"assignedToUserId\": ");

			sb.append(ticketUpdate.getAssignedToUserId());
		}

		if (ticketUpdate.getCategory() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"category\": ");

			sb.append("\"");

			sb.append(_escape(ticketUpdate.getCategory()));

			sb.append("\"");
		}

		if (ticketUpdate.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(ticketUpdate.getDescription()));

			sb.append("\"");
		}

		if (ticketUpdate.getPriority() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"priority\": ");

			sb.append("\"");

			sb.append(_escape(ticketUpdate.getPriority()));

			sb.append("\"");
		}

		if (ticketUpdate.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(ticketUpdate.getStatus()));

			sb.append("\"");
		}

		if (ticketUpdate.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(ticketUpdate.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		TicketUpdateJSONParser ticketUpdateJSONParser =
			new TicketUpdateJSONParser();

		return ticketUpdateJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(TicketUpdate ticketUpdate) {
		if (ticketUpdate == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (ticketUpdate.getAssignedToUserId() == null) {
			map.put("assignedToUserId", null);
		}
		else {
			map.put(
				"assignedToUserId",
				String.valueOf(ticketUpdate.getAssignedToUserId()));
		}

		if (ticketUpdate.getCategory() == null) {
			map.put("category", null);
		}
		else {
			map.put("category", String.valueOf(ticketUpdate.getCategory()));
		}

		if (ticketUpdate.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put(
				"description", String.valueOf(ticketUpdate.getDescription()));
		}

		if (ticketUpdate.getPriority() == null) {
			map.put("priority", null);
		}
		else {
			map.put("priority", String.valueOf(ticketUpdate.getPriority()));
		}

		if (ticketUpdate.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(ticketUpdate.getStatus()));
		}

		if (ticketUpdate.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(ticketUpdate.getTitle()));
		}

		return map;
	}

	public static class TicketUpdateJSONParser
		extends BaseJSONParser<TicketUpdate> {

		@Override
		protected TicketUpdate createDTO() {
			return new TicketUpdate();
		}

		@Override
		protected TicketUpdate[] createDTOArray(int size) {
			return new TicketUpdate[size];
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
			else if (Objects.equals(jsonParserFieldName, "title")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			TicketUpdate ticketUpdate, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "assignedToUserId")) {
				if (jsonParserFieldValue != null) {
					ticketUpdate.setAssignedToUserId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "category")) {
				if (jsonParserFieldValue != null) {
					ticketUpdate.setCategory((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					ticketUpdate.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "priority")) {
				if (jsonParserFieldValue != null) {
					ticketUpdate.setPriority((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					ticketUpdate.setStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					ticketUpdate.setTitle((String)jsonParserFieldValue);
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