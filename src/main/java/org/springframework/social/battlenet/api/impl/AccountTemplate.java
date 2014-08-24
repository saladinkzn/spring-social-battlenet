package org.springframework.social.battlenet.api.impl;

import org.springframework.social.battlenet.api.AccountId;
import org.springframework.social.battlenet.api.AccountOperations;
import org.springframework.social.battlenet.api.BattleTag;
import org.springframework.web.client.RestTemplate;

/**
 * @author sala
 */
public class AccountTemplate implements AccountOperations {
    private String API_URL_BASE = "https://eu.api.battle.net";

    private final RestTemplate restTemplate;

    public AccountTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public long getAccountId() {
        return restTemplate.getForObject(API_URL_BASE + "/account/user/id", AccountId.class).getId();
    }

    @Override
    public String getBattleTag() {
        return restTemplate.getForObject(API_URL_BASE + "/account/user/battletag", BattleTag.class).getBattletag();
    }
}
