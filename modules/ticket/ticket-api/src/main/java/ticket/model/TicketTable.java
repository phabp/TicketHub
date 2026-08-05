/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;TICKET_Ticket&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Ticket
 * @generated
 */
public class TicketTable extends BaseTable<TicketTable> {

	public static final TicketTable INSTANCE = new TicketTable();

	public final Column<TicketTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, Long> ticketId = createColumn(
		"ticketId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TicketTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TicketTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TicketTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TicketTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TicketTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TicketTable, String> title = createColumn(
		"title", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, String> category = createColumn(
		"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, String> priority = createColumn(
		"priority", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TicketTable, Long> assignedToUserId = createColumn(
		"assignedToUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private TicketTable() {
		super("TICKET_Ticket", TicketTable::new);
	}

}
// LIFERAY-SERVICE-BUILDER-HASH:1481230038