package hr.tvz.arydia.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class GameState implements Serializable {

    public static List<Player> players = new ArrayList<>();
    public static OpenWorld openWorld;

}
