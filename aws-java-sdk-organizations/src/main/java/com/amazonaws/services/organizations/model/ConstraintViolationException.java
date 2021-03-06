/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * <p>
 * Performing this operation violates a minimum or maximum value limit. For example, attempting to removing the last SCP
 * from an OU or root, inviting or creating too many accounts to the organization, or attaching too many policies to an
 * account, OU, or root. This exception includes a reason that contains additional information about the violated limit:
 * </p>
 * <p/>
 * <note>
 * <p>
 * Some of the reasons in the following list might not be applicable to this specific API or operation:
 * </p>
 * </note>
 * <ul>
 * <li>
 * <p>
 * ACCOUNT_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the limit on the number of accounts in an organization. If you
 * need more accounts, contact AWS Support to request an increase in your limit.
 * </p>
 * <p>
 * Or, The number of invitations that you tried to send would cause you to exceed the limit of accounts in your
 * organization. Send fewer invitations, or contact AWS Support to request an increase in the number of accounts.
 * </p>
 * <p>
 * <b>Note</b>: deleted and closed accounts still count toward your limit.
 * </p>
 * <important>
 * <p>
 * If you get an exception that indicates that you exceeded your account limits for the organization or that you
 * can"t add an account because your organization is still initializing, please contact <a href="
 * https://console.aws.amazon.com/support/home#/"> AWS Customer Support</a>.
 * </p>
 * </important></li>
 * <li>
 * <p>
 * HANDSHAKE_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of handshakes you can send in one day.
 * </p>
 * </li>
 * <li>
 * <p>
 * OU_NUMBER_LIMIT_EXCEEDED: You attempted to exceed the number of organizational units you can have in an organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * OU_DEPTH_LIMIT_EXCEEDED: You attempted to create an organizational unit tree that is too many levels deep.
 * </p>
 * </li>
 * <li>
 * <p>
 * POLICY_NUMBER_LIMIT_EXCEEDED. You attempted to exceed the number of policies that you can have in an organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to exceed the number of policies of a certain type that can
 * be attached to an entity at one time.
 * </p>
 * </li>
 * <li>
 * <p>
 * MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED: You attempted to detach a policy from an entity that would cause the
 * entity to have fewer than the minimum number of policies of a certain type required.
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA: You attempted to remove an account from the organization that does not yet have
 * enough information to exist as a stand-alone account. This account requires you to first agree to the AWS Customer
 * Agreement. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * >To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
 * Organizations User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION: You attempted to remove an account from the organization that does
 * not yet have enough information to exist as a stand-alone account. This account requires you to first complete phone
 * verification. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * >To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
 * Organizations User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To create an organization with this account, you first must associate a
 * payment instrument, such as a credit card, with the account. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * >To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
 * Organizations User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED: To complete this operation with this member account, you first must
 * associate a payment instrument, such as a credit card, with the account. Follow the steps at <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
 * >To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
 * Organizations User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED: You attempted to exceed the number of accounts that you can create in one day.
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE: To create an account in this organization, you first must migrate
 * the organization's master account to the marketplace that corresponds to the master account's address. For example,
 * accounts with India addresses must be associated with the AISPL marketplace. All accounts in an organization must be
 * associated with the same marketplace.
 * </p>
 * </li>
 * <li>
 * <p>
 * MASTER_ACCOUNT_MISSING_CONTACT_INFO: To complete this operation, you must first provide contact a valid address and
 * phone number for the master account. Then try the operation again.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConstraintViolationException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new ConstraintViolationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConstraintViolationException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see ConstraintViolationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see ConstraintViolationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConstraintViolationExceptionReason
     */

    public ConstraintViolationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @see ConstraintViolationExceptionReason
     */

    public void setReason(ConstraintViolationExceptionReason reason) {
        withReason(reason);
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConstraintViolationExceptionReason
     */

    public ConstraintViolationException withReason(ConstraintViolationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
