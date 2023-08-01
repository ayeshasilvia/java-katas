package com.codility.etag;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import java.io.IOException;

class EtagMiddlewareFilter extends OncePerRequestFilter {

    @Autowired
    private AuthService authService;

    private static final String IF_NONE_MATCH_HEADER = "If-None-Match";
    private static final String USER_HEADER = "user";
    private static final String ETAG_HEADER = "ETag";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)  throws ServletException, IOException {
        String ifNoneMatchHeader = request.getHeader(IF_NONE_MATCH_HEADER);
        Stirng path = request.getContextPath();
        String user = request.getHeader(USER_HEADER);
        if (user != null && !user.isEmpty()) {
            user = "guest";
        }

        String etag = getEtag(user, path);

        response.setHeader(ETAG_HEADER, etag);

        if (ifNoneMatchHeader != null && !ifNoneMatchHeader.isEmpty() && ifNoneMatchHeader.equals(etag) ) {
            response.reset();
            response.setStatus(304);

        } else {
            chain.doFilter(request, response);
        }



    }

    // TODO
    private String getEtag(String user, String path) {

        String[] userGroups = authService.getUserGroups(user);
        String[] pathGroups = authService.getPathGroups(path);

        return "someEtag";
    }
}
