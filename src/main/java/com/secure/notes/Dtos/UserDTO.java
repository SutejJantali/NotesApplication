package com.secure.notes.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.secure.notes.models.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long userId;
    private String userName;
    private String email;
    private boolean accountNonLocked;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;
    private boolean enabled;
    private LocalDate credentialsExpiryDate;
    private LocalDate accountExpiryDate;
    private String twoFactorSecret;
    private boolean isTwoFactorEnabled;
    private String signUpMethod;
    private Role role; // Note: Ensure the proper Role entity or Enum package is imported here if required
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
