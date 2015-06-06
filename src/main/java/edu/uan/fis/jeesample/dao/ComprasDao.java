/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Compras;
import java.util.List;

public interface ComprasDao {

    /**
     * Creates a new compras. 
     * @param compra
     * @return 
     */
    Compras create(Compras compra);

    /**
     * Updates an existing compras. Compras id can't be modified.
     * @param compra
     * @return 
     */
    Compras update(Compras compra);

    /**
     * Deletes an existing compras
     * @param compra 
     */
    void delete(Compras compra);

    /**
     * Find a compras by id
     * @param compraId
     * @return 
     */
    Compras findById(Integer compraId);

    /**
     * Returns all the compras in the database
     * @return 
     */
    List<Compras> findAll();
}
