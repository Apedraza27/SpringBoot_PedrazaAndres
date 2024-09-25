package com.example.Restaurant.Controller;

@RestController
@RequestMapping("/api/dishes")
public class DishesController {

    @Autowired
    private DishesService dishesService;

    //Obtener todos los platos
    @GetMapping
    public List<Dishes> getAllDishes() {
        return dishesService.getAllDishes();
    }

    //Guardar platos
    @PostMapping
    public Dishes createDishes(@RequestBody Dishes dishes) {
        return dishesService.saveDishes(dishes);
    }

    //Actualizar plato
    @PutMapping("/{id}")
    public Dishes updateDishes(@PathVariable Long id, @RequestBody Dishes dishes) {
        return dishesService.updateDishes(id, dishes);
    }

    //Eliminar plato
    @DeleteMapping("/{id}")
    public void deleteDishes(@PathVariable Long id) {
        dishesService.deleteDishes(id);
    }
}
