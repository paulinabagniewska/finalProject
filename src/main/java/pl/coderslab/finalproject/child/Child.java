package pl.coderslab.finalproject.child;

import lombok.Getter;
import lombok.Setter;
import pl.coderslab.finalproject.group.Group;
import pl.coderslab.finalproject.parent.Parent;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter

@Entity
@Table(name = "child")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String surname;

    @ManyToOne
    private Group group;

    @ManyToOne
    private Parent parent;
}
