/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Vladimir
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.devproserv.courses.servlet;

import com.devproserv.courses.command.Command;
import com.devproserv.courses.command.Enroll;
import com.devproserv.courses.command.Login;
import com.devproserv.courses.command.Logout;
import com.devproserv.courses.command.NotFound;
import com.devproserv.courses.command.SignUp;
import com.devproserv.courses.command.Unroll;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controls application lifecycle.
 *
 * @since 1.0.0
 */
public class AppContext {
    /**
     * Login command name.
     */
    static final String COMMAND_LOGIN = "login";

    /**
     * Sign up command name.
     */
    private static final String COMMAND_SIGNUP = "signup";

    /**
     * Logout command name.
     */
    private static final String COMMAND_LOGOUT = "logout";

    /**
     * Enroll command name.
     */
    private static final String COMMAND_SUBSCRIBE = "subscribe";

    /**
     * Unroll command name.
     */
    private static final String COMMAND_UNROLL = "unsubscribe";

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(
        AppContext.class
    );

    /**
     * Commands.
     */
    private final Map<String, Command> commands = new HashMap<>();

    /**
     * Constructor.
     */
    AppContext() {
        this.commands.put(AppContext.COMMAND_SIGNUP, new SignUp());
        this.commands.put(AppContext.COMMAND_LOGIN, new Login());
        this.commands.put(AppContext.COMMAND_LOGOUT, new Logout());
        this.commands.put(AppContext.COMMAND_SUBSCRIBE, new Enroll());
        this.commands.put(AppContext.COMMAND_UNROLL, new Unroll());
    }

    /**
     * Delivers a path of a page defined by given request.
     *
     * @param request HTTP request
     * @return String with a path defined by parameter "command" in request
     */
    String getPath(final HttpServletRequest request) {
        final String par = request.getParameter("command");
        Command command = this.commands.get(par);
        if (command == null) {
            LOGGER.warn("Invalid command given!");
            command = new NotFound();
        }
        return command.path(request);
    }
}
