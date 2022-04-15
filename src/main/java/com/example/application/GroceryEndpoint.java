package com.example.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint 
@AnonymousAllowed 
public class GroceryEndpoint {

  private List<GroceryItem> groceryList = new ArrayList<>();

  public @Nonnull List<@Nonnull GroceryItem> getGroceries() { 
    return groceryList;
  }

  public GroceryItem save(GroceryItem item) {
    groceryList.add(item);
    return item;
  }
  public GroceryItem deleteId(GroceryItem item) {

    groceryList=groceryList.stream().filter(i -> !item.getName().equalsIgnoreCase(i.getName())).collect(Collectors.toList());
    return item;
  }
}