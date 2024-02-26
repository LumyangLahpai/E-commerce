create index IX_60398E5E on onlineNewsportal_feedback (feedbacktext[$COLUMN_LENGTH:75$]);
create index IX_FFE268AC on onlineNewsportal_feedback (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A6052A2E on onlineNewsportal_feedback (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E354D951 on portalNews_feedback (feedbacktext[$COLUMN_LENGTH:75$]);
create index IX_9DA9021F on portalNews_feedback (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CF798461 on portalNews_feedback (uuid_[$COLUMN_LENGTH:75$], groupId);