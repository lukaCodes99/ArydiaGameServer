package hr.tvz.arydia.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements Serializable {

    private String name;
    private Location openWorldLocation;
    private Location specialWOrldLocation;
    private Integer moveAbilityLevel = 2;



}
