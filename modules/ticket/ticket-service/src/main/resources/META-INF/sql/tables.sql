create table TICKET_Ticket (
	uuid_ VARCHAR(75) null,
	ticketId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	category VARCHAR(75) null,
	priority VARCHAR(75) null,
	status VARCHAR(75) null,
	assignedToUserId LONG
);