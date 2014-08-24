package org.springframework.social.battlenet.connect;

import org.springframework.social.battlenet.api.Battlenet;
import org.springframework.social.battlenet.api.impl.BattlenetTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author sala
 */
public class BattlenetServiceProvider extends AbstractOAuth2ServiceProvider<Battlenet> {
    public BattlenetServiceProvider(String clientId, String clientSecret) {
        super(new OAuth2Template(clientId, clientSecret,
                // TODO eu -> settings
                "https://eu.battle.net/oauth/authorize",
                "https://eu.battle.net/oauth/token"));
    }

    @Override
    public Battlenet getApi(String accessToken) {
        return new BattlenetTemplate(accessToken);
    }
}
