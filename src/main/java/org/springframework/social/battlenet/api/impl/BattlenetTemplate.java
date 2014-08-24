package org.springframework.social.battlenet.api.impl;

import org.springframework.social.battlenet.api.AccountOperations;
import org.springframework.social.battlenet.api.Battlenet;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;

/**
 * @author sala
 */
public class BattlenetTemplate extends AbstractOAuth2ApiBinding implements Battlenet {
    private AccountOperations accountOperations;

    public BattlenetTemplate(String accessToken) {
        super(accessToken, TokenStrategy.ACCESS_TOKEN_PARAMETER);
        initSubApi();
    }

    private void initSubApi() {
        accountOperations = new AccountTemplate(super.getRestTemplate());
    }

    @Override
    public AccountOperations accountOperations() {
        return accountOperations;
    }
}
