package world.sai.misc.quickstart.sai02.web.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by sai on 15. 10. 13..
 */
public class CommonWebFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String context = request.getServletContext().getContextPath();
        request.setAttribute("CONTEXT", context);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
