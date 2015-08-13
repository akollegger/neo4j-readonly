package org.neo4j.contrib.security;

import org.neo4j.server.rest.security.SecurityFilter;
import org.neo4j.server.rest.security.SecurityRule;

import javax.servlet.http.HttpServletRequest;

public class LockDownSecurityRule implements SecurityRule {

    public static final String REALM = "None";

    public boolean isAuthorized( HttpServletRequest request)
    {
        System.out.println("isAuthorized? NO!");
        return false;
    }

    public boolean isForbidden(HttpServletRequest request) {
        return false;
    }

    public String forUriPath()
    {
        return "*node/*";
    }

    public String wwwAuthenticateHeader()
    {
        return SecurityFilter.basicAuthenticationResponse(REALM);
    }

}
