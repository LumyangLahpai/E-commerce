/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package feedbackA5.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import feedbackA5.model.feedback;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing feedback in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class feedbackCacheModel
	implements CacheModel<feedback>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof feedbackCacheModel)) {
			return false;
		}

		feedbackCacheModel feedbackCacheModel = (feedbackCacheModel)object;

		if (feedbackId == feedbackCacheModel.feedbackId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, feedbackId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", feedbackId=");
		sb.append(feedbackId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", feedbacktext=");
		sb.append(feedbacktext);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public feedback toEntityModel() {
		feedbackImpl feedbackImpl = new feedbackImpl();

		if (uuid == null) {
			feedbackImpl.setUuid("");
		}
		else {
			feedbackImpl.setUuid(uuid);
		}

		feedbackImpl.setFeedbackId(feedbackId);
		feedbackImpl.setGroupId(groupId);

		if (feedbacktext == null) {
			feedbackImpl.setFeedbacktext("");
		}
		else {
			feedbackImpl.setFeedbacktext(feedbacktext);
		}

		feedbackImpl.setCompanyId(companyId);
		feedbackImpl.setUserId(userId);

		if (userName == null) {
			feedbackImpl.setUserName("");
		}
		else {
			feedbackImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			feedbackImpl.setCreateDate(null);
		}
		else {
			feedbackImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			feedbackImpl.setModifiedDate(null);
		}
		else {
			feedbackImpl.setModifiedDate(new Date(modifiedDate));
		}

		feedbackImpl.resetOriginalValues();

		return feedbackImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		feedbackId = objectInput.readLong();

		groupId = objectInput.readLong();
		feedbacktext = objectInput.readUTF();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(feedbackId);

		objectOutput.writeLong(groupId);

		if (feedbacktext == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(feedbacktext);
		}

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
	}

	public String uuid;
	public long feedbackId;
	public long groupId;
	public String feedbacktext;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}