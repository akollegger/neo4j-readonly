package org.neo4j.contrib.security;

import org.neo4j.server.rest.security.SecurityFilter;
import org.neo4j.server.rest.security.SecurityRule;

import javax.servlet.http.HttpServletRequest;

public class ReadOnlyCypherSecurityRule implements SecurityRule {

    public static final String REALM = "None";

    public boolean isAuthorized( HttpServletRequest request)
    {
        return true;
    }

    public boolean isForbidden(HttpServletRequest request) {
        return true;
    }

    public String forUriPath()
    {
        return "/db/data/cypher*";
    }

    public String wwwAuthenticateHeader()
    {
        return SecurityFilter.basicAuthenticationResponse(REALM);
    }

}
