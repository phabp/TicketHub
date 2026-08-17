create index IX_3D6AEE48 on TICKET_Ticket (assignedToUserId);
create index IX_C5162285 on TICKET_Ticket (groupId);
create unique index IX_4B470B3B on TICKET_Ticket (uuid_[$COLUMN_LENGTH:75$], groupId);