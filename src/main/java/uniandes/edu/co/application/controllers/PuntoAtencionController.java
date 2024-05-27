package uniandes.edu.co.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.application.repositories.PuntoAtencionRepository;
import uniandes.edu.co.application.model.PuntoAtencion;


@RestController
@RequestMapping("/puntosAtencion")
public class PuntoAtencionController {
    @Autowired
    PuntoAtencionRepository puntoAtencionRepository;

    @GetMapping
    public String obtenerPuntosAtencion(Model model){
        model.addAttribute("puntosAtencion", puntoAtencionRepository.findAll());
        return "puntosAtencion";
    }

    @PostMapping("/nuevo/guardar")
    public String attentionPointGuardar(@ModelAttribute("attentionPoint") PuntoAtencion puntoAtencion) {
        puntoAtencionRepository.save(puntoAtencion);

        return "redirect:/puntosAtencion";
    }

    @GetMapping("/{id}/delete")
    public String accountEliminar(@PathVariable("id") Integer id){
        puntoAtencionRepository.deleteById(id);;;
        return  "redirect:/puntosAtencion";
    }


}