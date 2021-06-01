package com.simbirsoft.Rado.service;

import com.simbirsoft.Rado.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(int id);
    void saveOrUpdateRole(Role role);
    void deleteRoleById(int id);
}
