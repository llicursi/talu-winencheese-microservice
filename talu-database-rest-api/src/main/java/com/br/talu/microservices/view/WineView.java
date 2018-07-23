package com.br.talu.microservices.view;

import com.br.talu.microservices.dbrest.WineRepository;
import com.br.talu.microservices.models.wine.Wine;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Route
public class WineView extends VerticalLayout {

    private final WineRepository repo;
    final Grid<Wine> grid;

    public WineView(WineRepository repo) {
        this.repo = repo;
        this.grid = new Grid<>(Wine.class);
        add(new Label("Wine List"));
        add(grid);
        grid.setHeight("300px");
        listCustomers();

    }

    private void listCustomers() {
        Iterable<Wine> source = repo.findAll();
        List<Wine> target = new ArrayList<>();
        source.forEach(target::add);
        grid.setItems(target);
    }

}
