create table onlineNewsportal_feedback (
	uuid_ VARCHAR(75) null,
	feedbackId LONG not null primary key,
	groupId LONG,
	feedbacktext VARCHAR(75) null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table portalNews_feedback (
	uuid_ VARCHAR(75) null,
	feedbackId LONG not null primary key,
	groupId LONG,
	feedbacktext VARCHAR(75) null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);