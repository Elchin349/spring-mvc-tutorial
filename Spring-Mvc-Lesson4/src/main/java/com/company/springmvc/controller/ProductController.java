package com.company.springmvc.controller;

import com.company.springmvc.model.Product;
import com.company.springmvc.util.ProductUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// list seklinde gelecek melumatlari nece gostermek olar onun uzerinde isliyeck
//novbeti dersden mvc spring boot ile yaradilacaq

@Controller
public class ProductController {

    @GetMapping("/list")
    public String list(Model model) {
        List<Product> productsObject = ProductUtil.generateProductObjectList();
        List<String> productName = productsObject.stream().map(Product::getName).collect(Collectors.toList());

        model.addAttribute("productsObject", productsObject);
        model.addAttribute("productsName", productName);
        return "list";
    }

    public String map(Model model) {
        List<Product> productsObject = ProductUtil.generateProductObjectList();
        Map<String, String> productMap = productsObject.stream().collect(Collectors.toMap(Product::getId, Product::getName));

        model.addAttribute("productsMap", productMap);
        return "map";
    }
}
