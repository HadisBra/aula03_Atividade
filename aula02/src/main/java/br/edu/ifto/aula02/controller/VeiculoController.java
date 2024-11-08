package br.edu.ifto.aula02.controller;

import br.edu.ifto.aula02.model.repository.VeiculoRepository;
import br.edu.ifto.aula02.model.entity.Veiculo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Transactional
@Controller
@RequestMapping("/veiculo")

public class VeiculoController {

    @Autowired
    VeiculoRepository repository;

    public VeiculoController() {
        repository = new VeiculoRepository();
    }

    @GetMapping("/form")
    public String form(Veiculo veiculo){
        return "/veiculo/form";
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("veiculos", repository.buscarVeiculos());
        return new ModelAndView("/veiculo/list");
    }

    @PostMapping("/save")
    public ModelAndView save(Veiculo veiculo, RedirectAttributes attr) {
        repository.save(veiculo);
        attr.addFlashAttribute("message", "Veículo cadastrado com sucesso.");
        return new ModelAndView("redirect:/veiculo/list");
    }


    // Delete esta sendo chamado no VeiculoController
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id, RedirectAttributes attr) {
       repository.deletar(id);
            attr.addFlashAttribute("message", "Veículo deletado com sucesso.");
        return new ModelAndView("redirect:/veiculo/list");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editar(@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("veiculo", repository.buscarVeiculo(id));
        return new ModelAndView("/veiculo/form", model);
    }


    @PostMapping("/update")
    public ModelAndView editar(Veiculo veiculo, RedirectAttributes attr) {
        repository.editar(veiculo);
        attr.addFlashAttribute("message", "Veículo atualizado com sucesso.");
        return new ModelAndView("redirect:/veiculo/list");
    }

}
