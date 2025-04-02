package br.com.fiap.apisecurity.model;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private final String role;

    UserRole(final String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
}