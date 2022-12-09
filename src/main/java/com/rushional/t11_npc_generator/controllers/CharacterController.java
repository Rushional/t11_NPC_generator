package com.rushional.t11_npc_generator.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.rushional.t11_npc_generator.models.CharacterFactory;
import com.rushional.t11_npc_generator.models.HeightType;
import com.rushional.t11_npc_generator.models.Race;
import com.rushional.t11_npc_generator.models.Sex;
import com.rushional.t11_npc_generator.models.character.RpgCharacter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @GetMapping("/character")
    public String getCharacter(@RequestParam Race race, @RequestParam Sex sex, @RequestParam HeightType heightType) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        RpgCharacter character = CharacterFactory.getCharacter(race, sex, heightType);
        try {
            return ow.writeValueAsString(character);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("Big sad!");
        }
        return "Parse failed:c";
    }
}
