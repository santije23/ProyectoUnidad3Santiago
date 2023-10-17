package org.santiago.model;
// Se genera record con los atributos requeridos para generacion de datos estadisticos
public record PersonAttributes(String name, String lastName, Integer age, Character gender,
                               boolean employmentStatus, Integer stratum, Integer numberOfChildren,
                               String educationalLevel, Double salary) {
}
