package com.simbirsoft.Rado.service;

import com.simbirsoft.Rado.models.Message;
import com.simbirsoft.Rado.models.Role;
import com.simbirsoft.Rado.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(int id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public void saveOrUpdateRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(int id) {
        roleRepository.deleteById(id);
    }
}