package org.springframework.social.battlenet.connect;

import org.springframework.social.battlenet.api.Battlenet;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * @author sala
 */
public class BattlenetConnectionFactory extends OAuth2ConnectionFactory<Battlenet> {

    public BattlenetConnectionFactory(String clientId, String clientSecret) {
        super("battlenet", new BattlenetServiceProvider(clientId, clientSecret), new BattlenetAdapter());
    }
}
