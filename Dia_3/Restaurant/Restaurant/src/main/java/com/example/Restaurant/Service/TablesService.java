package com.example.Restaurant.Service;

@Service
public class TablesService {

    @Autowired
    private TablesRepository tablesRepository;

    //Obtener estado de mesas
    public List<Tables> getAllTables(){
        return tablesRepository.findAll();
    }

    //registrar mesas
    public Tables saveTables(Tables tables){
        return tablesRepository.save(tables);
    }

    //Actualizar estado
    public Tables updateTables(Long id, Tables tablesDetails){
        Tables tables = tablesRepository.findById(id).orElseThrow();
        tables.setOcupada(tablesDetails.getOcupada());
        return tablesRepository.save(tables);
    }

    //Eliminar registro
    public void deleteTables(Long id){
        tablesRepository.deleteById(id);
    }
}
