/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.am.repository.mongodb.management.internal.model;

import io.gravitee.am.model.account.AccountSettings;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

/**
 * @author Titouan COMPIEGNE (titouan.compiegne at graviteesource.com)
 * @author GraviteeSource Team
 */
public class AccountSettingsMongo {

    private boolean inherited;
    private boolean loginAttemptsDetectionEnabled;
    private Integer maxLoginAttempts;
    private Integer loginAttemptsResetTime;
    private Integer accountBlockedDuration;
    private boolean sendRecoverAccountEmail;
    private boolean completeRegistrationWhenResetPassword;
    private boolean autoLoginAfterRegistration;
    private String redirectUriAfterRegistration;
    private boolean dynamicUserRegistration;
    private String defaultIdentityProviderForRegistration;
    private boolean autoLoginAfterResetPassword;
    private String redirectUriAfterResetPassword;
    private boolean deletePasswordlessDevicesAfterResetPassword;
    private boolean useBotDetection;
    private String botDetectionPlugin;
    private boolean resetPasswordCustomForm;
    private List<FormFieldMongo> resetPasswordCustomFormFields;
    private boolean resetPasswordConfirmIdentity;
    private boolean resetPasswordInvalidateTokens;
    private boolean mfaChallengeAttemptsDetectionEnabled;
    private Integer mfaChallengeMaxAttempts;
    private Integer mfaChallengeAttemptsResetTime;
    private boolean mfaChallengeSendRecoverAccountEmail;
    private boolean sendVerifyRegistrationAccountEmail;

    public boolean isInherited() {
        return inherited;
    }

    public void setInherited(boolean inherited) {
        this.inherited = inherited;
    }

    public boolean isLoginAttemptsDetectionEnabled() {
        return loginAttemptsDetectionEnabled;
    }

    public void setLoginAttemptsDetectionEnabled(boolean loginAttemptsDetectionEnabled) {
        this.loginAttemptsDetectionEnabled = loginAttemptsDetectionEnabled;
    }

    public Integer getMaxLoginAttempts() {
        return maxLoginAttempts;
    }

    public void setMaxLoginAttempts(Integer maxLoginAttempts) {
        this.maxLoginAttempts = maxLoginAttempts;
    }

    public Integer getLoginAttemptsResetTime() {
        return loginAttemptsResetTime;
    }

    public void setLoginAttemptsResetTime(Integer loginAttemptsResetTime) {
        this.loginAttemptsResetTime = loginAttemptsResetTime;
    }

    public Integer getAccountBlockedDuration() {
        return accountBlockedDuration;
    }

    public void setAccountBlockedDuration(Integer accountBlockedDuration) {
        this.accountBlockedDuration = accountBlockedDuration;
    }

    public boolean isSendRecoverAccountEmail() {
        return sendRecoverAccountEmail;
    }

    public void setSendRecoverAccountEmail(boolean sendRecoverAccountEmail) {
        this.sendRecoverAccountEmail = sendRecoverAccountEmail;
    }

    public boolean isCompleteRegistrationWhenResetPassword() {
        return completeRegistrationWhenResetPassword;
    }

    public void setCompleteRegistrationWhenResetPassword(boolean completeRegistrationWhenResetPassword) {
        this.completeRegistrationWhenResetPassword = completeRegistrationWhenResetPassword;
    }

    public boolean isAutoLoginAfterRegistration() {
        return autoLoginAfterRegistration;
    }

    public void setAutoLoginAfterRegistration(boolean autoLoginAfterRegistration) {
        this.autoLoginAfterRegistration = autoLoginAfterRegistration;
    }

    public String getRedirectUriAfterRegistration() {
        return redirectUriAfterRegistration;
    }

    public void setRedirectUriAfterRegistration(String redirectUriAfterRegistration) {
        this.redirectUriAfterRegistration = redirectUriAfterRegistration;
    }

    public boolean isDynamicUserRegistration() {
        return dynamicUserRegistration;
    }

    public void setDynamicUserRegistration(boolean dynamicUserRegistration) {
        this.dynamicUserRegistration = dynamicUserRegistration;
    }

    public String getDefaultIdentityProviderForRegistration() {
        return defaultIdentityProviderForRegistration;
    }

    public void setDefaultIdentityProviderForRegistration(String defaultIdentityProviderForRegistration) {
        this.defaultIdentityProviderForRegistration = defaultIdentityProviderForRegistration;
    }

    public boolean isAutoLoginAfterResetPassword() {
        return autoLoginAfterResetPassword;
    }

    public void setAutoLoginAfterResetPassword(boolean autoLoginAfterResetPassword) {
        this.autoLoginAfterResetPassword = autoLoginAfterResetPassword;
    }

    public String getRedirectUriAfterResetPassword() {
        return redirectUriAfterResetPassword;
    }

    public void setRedirectUriAfterResetPassword(String redirectUriAfterResetPassword) {
        this.redirectUriAfterResetPassword = redirectUriAfterResetPassword;
    }

    public boolean isDeletePasswordlessDevicesAfterResetPassword() {
        return deletePasswordlessDevicesAfterResetPassword;
    }

    public void setDeletePasswordlessDevicesAfterResetPassword(boolean deletePasswordlessDevicesAfterResetPassword) {
        this.deletePasswordlessDevicesAfterResetPassword = deletePasswordlessDevicesAfterResetPassword;
    }

    public boolean isUseBotDetection() {
        return useBotDetection;
    }

    public void setUseBotDetection(boolean useBotDetection) {
        this.useBotDetection = useBotDetection;
    }

    public String getBotDetectionPlugin() {
        return botDetectionPlugin;
    }

    public void setBotDetectionPlugin(String botDetectionPlugin) {
        this.botDetectionPlugin = botDetectionPlugin;
    }

    public boolean isResetPasswordCustomForm() {
        return resetPasswordCustomForm;
    }

    public void setResetPasswordCustomForm(boolean resetPasswordCustomForm) {
        this.resetPasswordCustomForm = resetPasswordCustomForm;
    }

    public List<FormFieldMongo> getResetPasswordCustomFormFields() {
        return resetPasswordCustomFormFields;
    }

    public void setResetPasswordCustomFormFields(List<FormFieldMongo> resetPasswordCustomFormFields) {
        this.resetPasswordCustomFormFields = resetPasswordCustomFormFields;
    }

    public boolean isResetPasswordConfirmIdentity() {
        return resetPasswordConfirmIdentity;
    }

    public void setResetPasswordConfirmIdentity(boolean resetPasswordConfirmIdentity) {
        this.resetPasswordConfirmIdentity = resetPasswordConfirmIdentity;
    }

    public boolean isResetPasswordInvalidateTokens() {
        return resetPasswordInvalidateTokens;
    }

    public void setResetPasswordInvalidateTokens(boolean resetPasswordInvalidateTokens) {
        this.resetPasswordInvalidateTokens = resetPasswordInvalidateTokens;
    }

    public boolean isMfaChallengeAttemptsDetectionEnabled() {
        return mfaChallengeAttemptsDetectionEnabled;
    }

    public void setMfaChallengeAttemptsDetectionEnabled(boolean mfaChallengeAttemptsDetectionEnabled) {
        this.mfaChallengeAttemptsDetectionEnabled = mfaChallengeAttemptsDetectionEnabled;
    }

    public Integer getMfaChallengeMaxAttempts() {
        return mfaChallengeMaxAttempts;
    }

    public void setMfaChallengeMaxAttempts(Integer mfaChallengeMaxAttempts) {
        this.mfaChallengeMaxAttempts = mfaChallengeMaxAttempts;
    }

    public Integer getMfaChallengeAttemptsResetTime() {
        return mfaChallengeAttemptsResetTime;
    }

    public void setMfaChallengeAttemptsResetTime(Integer mfaChallengeAttemptsResetTime) {
        this.mfaChallengeAttemptsResetTime = mfaChallengeAttemptsResetTime;
    }

    public boolean isMfaChallengeSendRecoverAccountEmail() {
        return mfaChallengeSendRecoverAccountEmail;
    }

    public void setMfaChallengeSendRecoverAccountEmail(boolean mfaChallengeSendRecoverAccountEmail) {
        this.mfaChallengeSendRecoverAccountEmail = mfaChallengeSendRecoverAccountEmail;
    }

    public boolean isSendVerifyRegistrationAccountEmail() {
        return sendVerifyRegistrationAccountEmail;
    }

    public void setSendVerifyRegistrationAccountEmail(boolean sendVerifyRegistrationAccountEmail) {
        this.sendVerifyRegistrationAccountEmail = sendVerifyRegistrationAccountEmail;
    }

    public AccountSettings convert() {
        AccountSettings accountSettings = new AccountSettings();
        accountSettings.setInherited(isInherited());
        accountSettings.setLoginAttemptsDetectionEnabled(isLoginAttemptsDetectionEnabled());
        accountSettings.setMaxLoginAttempts(getMaxLoginAttempts());
        accountSettings.setLoginAttemptsResetTime(getLoginAttemptsResetTime());
        accountSettings.setAccountBlockedDuration(getAccountBlockedDuration());
        accountSettings.setCompleteRegistrationWhenResetPassword(isCompleteRegistrationWhenResetPassword());
        accountSettings.setAutoLoginAfterRegistration(isAutoLoginAfterRegistration());
        accountSettings.setRedirectUriAfterRegistration(getRedirectUriAfterRegistration());
        accountSettings.setDynamicUserRegistration(isDynamicUserRegistration());
        accountSettings.setDefaultIdentityProviderForRegistration(getDefaultIdentityProviderForRegistration());
        accountSettings.setAutoLoginAfterResetPassword(isAutoLoginAfterResetPassword());
        accountSettings.setRedirectUriAfterResetPassword(getRedirectUriAfterResetPassword());
        accountSettings.setSendRecoverAccountEmail(isSendRecoverAccountEmail());
        accountSettings.setDeletePasswordlessDevicesAfterResetPassword(isDeletePasswordlessDevicesAfterResetPassword());
        accountSettings.setBotDetectionPlugin(getBotDetectionPlugin());
        accountSettings.setUseBotDetection(isUseBotDetection());
        accountSettings.setResetPasswordConfirmIdentity(isResetPasswordConfirmIdentity());
        accountSettings.setResetPasswordCustomForm(isResetPasswordCustomForm());
        ofNullable(getResetPasswordCustomFormFields())
                .map(customFormFields -> customFormFields.stream().map(FormFieldMongo::convert).collect(toList()))
                .ifPresent(accountSettings::setResetPasswordCustomFormFields);
        accountSettings.setResetPasswordInvalidateTokens(isResetPasswordInvalidateTokens());
        accountSettings.setMfaChallengeAttemptsDetectionEnabled(isMfaChallengeAttemptsDetectionEnabled());
        accountSettings.setMfaChallengeMaxAttempts(getMfaChallengeMaxAttempts());
        accountSettings.setMfaChallengeAttemptsResetTime(getMfaChallengeAttemptsResetTime());
        accountSettings.setMfaChallengeSendVerifyAlertEmail(isMfaChallengeSendRecoverAccountEmail());
        accountSettings.setSendVerifyRegistrationAccountEmail(isSendVerifyRegistrationAccountEmail());
        return accountSettings;
    }

    public static AccountSettingsMongo convert(AccountSettings accountSettings) {
        if (accountSettings == null) {
            return null;
        }
        AccountSettingsMongo accountSettingsMongo = new AccountSettingsMongo();
        accountSettingsMongo.setInherited(accountSettings.isInherited());
        accountSettingsMongo.setLoginAttemptsDetectionEnabled(accountSettings.isLoginAttemptsDetectionEnabled());
        accountSettingsMongo.setMaxLoginAttempts(accountSettings.getMaxLoginAttempts());
        accountSettingsMongo.setLoginAttemptsResetTime(accountSettings.getLoginAttemptsResetTime());
        accountSettingsMongo.setAccountBlockedDuration(accountSettings.getAccountBlockedDuration());
        accountSettingsMongo.setCompleteRegistrationWhenResetPassword(accountSettings.isCompleteRegistrationWhenResetPassword());
        accountSettingsMongo.setAutoLoginAfterRegistration(accountSettings.isAutoLoginAfterRegistration());
        accountSettingsMongo.setRedirectUriAfterRegistration(accountSettings.getRedirectUriAfterRegistration());
        accountSettingsMongo.setDynamicUserRegistration(accountSettings.isDynamicUserRegistration());
        accountSettingsMongo.setDefaultIdentityProviderForRegistration(accountSettings.getDefaultIdentityProviderForRegistration());
        accountSettingsMongo.setAutoLoginAfterResetPassword(accountSettings.isAutoLoginAfterResetPassword());
        accountSettingsMongo.setRedirectUriAfterResetPassword(accountSettings.getRedirectUriAfterResetPassword());
        accountSettingsMongo.setSendRecoverAccountEmail(accountSettings.isSendRecoverAccountEmail());
        accountSettingsMongo.setDeletePasswordlessDevicesAfterResetPassword(accountSettings.isDeletePasswordlessDevicesAfterResetPassword());
        accountSettingsMongo.setBotDetectionPlugin(accountSettings.getBotDetectionPlugin());
        accountSettingsMongo.setUseBotDetection(accountSettings.isUseBotDetection());
        accountSettingsMongo.setResetPasswordConfirmIdentity(accountSettings.isResetPasswordConfirmIdentity());
        accountSettingsMongo.setResetPasswordCustomForm(accountSettings.isResetPasswordCustomForm());
        ofNullable(accountSettings.getResetPasswordCustomFormFields())
                .map(customFormFields -> customFormFields.stream().map(FormFieldMongo::convert).collect(toList()))
                .ifPresent(accountSettingsMongo::setResetPasswordCustomFormFields);
        accountSettingsMongo.setResetPasswordInvalidateTokens(accountSettings.isResetPasswordInvalidateTokens());
        accountSettingsMongo.setMfaChallengeAttemptsDetectionEnabled(accountSettings.isMfaChallengeAttemptsDetectionEnabled());
        accountSettingsMongo.setMfaChallengeMaxAttempts(accountSettings.getMfaChallengeMaxAttempts());
        accountSettingsMongo.setMfaChallengeAttemptsResetTime(accountSettings.getMfaChallengeAttemptsResetTime());
        accountSettingsMongo.setMfaChallengeSendRecoverAccountEmail(accountSettings.isMfaChallengeSendVerifyAlertEmail());
        accountSettingsMongo.setSendVerifyRegistrationAccountEmail(accountSettings.isSendVerifyRegistrationAccountEmail());
        return accountSettingsMongo;
    }
}
