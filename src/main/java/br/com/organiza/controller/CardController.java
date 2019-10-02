package br.com.organiza.controller;

import br.com.organiza.model.Card;
import br.com.organiza.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @ModelAttribute
    public void getAllCards(Model model){
        List<Card> cards = new ArrayList<>();
        cardRepository.findAll().forEach(cards::add);
        model.addAttribute("list_cards",cards);
    }

    @GetMapping
    public String show(Model model){
        return "index";
    }
}
