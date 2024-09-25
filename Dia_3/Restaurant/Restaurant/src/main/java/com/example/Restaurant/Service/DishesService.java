package com.example.Restaurant.Service;

@Service
public class DishesService {

    @Autowired
    private DishesRepository dishesRepository;

    //obtener todos los platos
    public List<Dishes> getAllDishes() {
        return dishesRepository.findAll();
    }

    //Guardar plato
    public Dishes saveDishes(Dishes dishes) {
        return dishesRepository.save(dishes);
    }

    //Actualizar plato
    public Dishes updateDishes(Long id, Dishes dishesDetails) {
        Dishes dishes = dishesRepository.findById(id).orElseThrow();
        dishes.setNombre(dishesDetails.getNombre());
        dishes.setPrecio(dishesDetails.getPrecio());
        dishes.setDisponibilidad(dishesDetails.getDisponibilidad());
        return dishesRepository.save(dishes);
    }

    //Eliminar plato
    public void deleteDishes(Long id) {
        dishesRepository.deleteById(id);
    }
}
