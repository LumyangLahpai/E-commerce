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

package feedbackA5.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the feedback service. Represents a row in the &quot;portalNews_feedback&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>feedbackA5.model.impl.feedbackModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>feedbackA5.model.impl.feedbackImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see feedback
 * @generated
 */
@ProviderType
public interface feedbackModel
	extends BaseModel<feedback>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a feedback model instance should use the {@link feedback} interface instead.
	 */

	/**
	 * Returns the primary key of this feedback.
	 *
	 * @return the primary key of this feedback
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this feedback.
	 *
	 * @param primaryKey the primary key of this feedback
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this feedback.
	 *
	 * @return the uuid of this feedback
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this feedback.
	 *
	 * @param uuid the uuid of this feedback
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the feedback ID of this feedback.
	 *
	 * @return the feedback ID of this feedback
	 */
	public long getFeedbackId();

	/**
	 * Sets the feedback ID of this feedback.
	 *
	 * @param feedbackId the feedback ID of this feedback
	 */
	public void setFeedbackId(long feedbackId);

	/**
	 * Returns the group ID of this feedback.
	 *
	 * @return the group ID of this feedback
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this feedback.
	 *
	 * @param groupId the group ID of this feedback
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the feedbacktext of this feedback.
	 *
	 * @return the feedbacktext of this feedback
	 */
	@AutoEscape
	public String getFeedbacktext();

	/**
	 * Sets the feedbacktext of this feedback.
	 *
	 * @param feedbacktext the feedbacktext of this feedback
	 */
	public void setFeedbacktext(String feedbacktext);

	/**
	 * Returns the company ID of this feedback.
	 *
	 * @return the company ID of this feedback
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this feedback.
	 *
	 * @param companyId the company ID of this feedback
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this feedback.
	 *
	 * @return the user ID of this feedback
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this feedback.
	 *
	 * @param userId the user ID of this feedback
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this feedback.
	 *
	 * @return the user uuid of this feedback
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this feedback.
	 *
	 * @param userUuid the user uuid of this feedback
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this feedback.
	 *
	 * @return the user name of this feedback
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this feedback.
	 *
	 * @param userName the user name of this feedback
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this feedback.
	 *
	 * @return the create date of this feedback
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this feedback.
	 *
	 * @param createDate the create date of this feedback
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this feedback.
	 *
	 * @return the modified date of this feedback
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this feedback.
	 *
	 * @param modifiedDate the modified date of this feedback
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public feedback cloneWithOriginalValues();

}