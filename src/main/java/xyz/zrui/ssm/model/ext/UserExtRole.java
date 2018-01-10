/*
 * Copyright (C) Benesse China Company, 2017.All rights reserved.
 */

package xyz.zrui.ssm.model.ext;

import xyz.zrui.ssm.model.Role;
import xyz.zrui.ssm.model.User;

import java.util.List;

public class UserExtRole extends User {

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}