package com.example.Restaurant.Controller;

@RestController
@RequestMapping("/api/tables")
public class TablesController {

    @Autowired
    private TablesService tablesService;

    //Obtener estado de mesas
    @GetMapping
    public List<Tables> getAllTables() {
        return tablesService.getAllTables();
    }

    //Guardar registro de mesa
    @PostMapping
    public Tables createTables(@RequestBody Tables tables) {
        return tablesService.saveTables(tables);
    }

    //Actualizar estado de mesa
    @PutMapping("/{id}")
    public Tables updateTables(@PathVariable Long id, @RequestBody Tables tables) {
        return tablesService.updateTables(id, tables);
    }

    //Eliminar estado de mesa
    @DeleteMapping("/{id}")
    public void deleteTables(@PathVariable Long id) {
        tablesService.deleteTables(id);
    }
}
