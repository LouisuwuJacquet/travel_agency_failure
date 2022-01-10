package fr.lernejo.travelsite;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {
    //private final ArrayList<Travels> ListTravels = new ArrayList<>();
    //private final ArrayList<Inscription> ListInscription = new ArrayList<>();
    private final ArrayList<Travels> ListTravels; //liste contenant les infos des pays
    private final ArrayList<Inscription> ListInscription ; //liste que l'utilisateur doit remplir

    public TodoListController(ArrayList<Inscription> ListInscription, ArrayList<Travels> ListTravels) {
        this.ListInscription = ListInscription;
        this.ListTravels = ListTravels;
    }

    @GetMapping(value="/api/travels")
    public ArrayList<Travels> SendList(@RequestParam String userName){
        ListTravels.add(new Travels("Caribbean",32.4));
        ListTravels.add(new Travels("Australia",35.1));
        return ListTravels;
    }

    @PostMapping(value = "/api/inscription")
    public void postInscription(@RequestBody Inscription inscr){
        ListInscription.add(inscr);
    }


}
