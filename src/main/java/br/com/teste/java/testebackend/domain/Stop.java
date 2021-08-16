package br.com.teste.java.testebackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Stop implements Serializable {
    private static final long serialVersionUID = -3656431259068389491L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stop_id", unique = true)
    private Long id;

    @NotNull(message = "The name stop cannot be null")
    @NotEmpty(message = "The name stop cannot be empty")
    private String name;
    private double latitude;
    private double longitude;

    @ManyToMany(mappedBy = "stops")
    private List<Line> lines = new ArrayList();

}

