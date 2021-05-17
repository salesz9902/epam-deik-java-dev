package com.epam.project.ticketservice.presentation.cli.handler;

import org.springframework.shell.standard.ShellMethod;

public class AccountCommandHandler {

    @ShellMethod(value = "Sign in to a privileged account", key = "sign in privileged")
    public void signInPrivileged(String userName, String password) {
    }

    @ShellMethod(value = "Sign out from any account", key = "sign out")
    public void signOut(){
    }

    @ShellMethod(value = "Show information about the current account signed in", key = "describe account")
    public void describeAccount(){

    }

    @ShellMethod(value = "Sign in with a normal account", key = "sign in")
    public void userSignIn() {

    }


}
