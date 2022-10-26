/*
 * CC BY-NC-SA 4.0
 *
 * Copyright 2022 Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;.
 *
 * Attribution-NonCommercial-ShareAlike 4.0 International (CC BY-NC-SA 4.0)
 *
 * You are free to:
 *   Share - copy and redistribute the material in any medium or format
 *   Adapt - remix, transform, and build upon the material
 *
 * Under the following terms:
 *   Attribution - You must give appropriate credit, provide 
 *   a link to the license, and indicate if changes were made.
 *   You may do so in any reasonable manner, but not in any 
 *   way that suggests the licensor endorses you or your use.
 *   NonCommercial - You may not use the material for commercial purposes.
 *   ShareAlike - If you remix, transform, or build upon the 
 *   material, you must distribute your contributions under 
 *   the same license as the original.
 *   No additional restrictions - You may not apply legal 
 *   terms or technological measures that legally restrict 
 *   others from doing anything the license permits.
 *
 * Notices:
 *   You do not have to comply with the license for elements 
 *   of the material in the public domain or where your use 
 *   is permitted by an applicable exception or limitation.
 *   No warranties are given. The license may not give you 
 *   all of the permissions necessary for your intended use. 
 *   For example, other rights such as publicity, privacy, 
 *   or moral rights may limit how you use the material.
 */
package io.github.guisso.taskmanagemen.task;

import io.github.guisso.taskmanagement.repository.Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe TaskDao
 *
 * <code>
 * CREATE TABLE `tarefa` (
 * `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 * `descricao` varchar(100) NOT NULL,
 * `progresso` tinyint(4) DEFAULT '0',
 * `conclusao` date DEFAULT NULL,
 * PRIMARY KEY (`id`),
 * UNIQUE KEY `id` (`id`)
 * ) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1
 * </code>
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 2022-10-24
 */
public class TaskDao extends Dao<Task> {

    @Override
    public String getSaveStatment() {
        return "insert into tarefa values (default, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update tarefa set descricao = ?, progresso = ?, conclusao = ? where id = ?";
    }

    @Override
    public void composeSaveStatement(PreparedStatement pstmt, Task e) {
        try {
            pstmt.setString(1, e.getDescription());
            // OR
            // pstmt.setObject(1, e.getDescription(), java.sql.Types.VARCHAR);

            // Null values
            // NOT! pstmt.setByte(2, e.getProgress());
            pstmt.setObject(2, e.getProgress(), java.sql.Types.TINYINT);

            // LocalDate
            pstmt.setObject(3, e.getConclusion(), java.sql.Types.DATE);
            
            // Update only
            if(e.getId() != null) {
                pstmt.setLong(4, e.getId());
            }

        } catch (SQLException ex) {
            Logger.getLogger(TaskDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getFindAllStatment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
