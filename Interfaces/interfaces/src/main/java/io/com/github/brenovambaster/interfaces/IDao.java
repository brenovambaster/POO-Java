/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package io.com.github.brenovambaster.interfaces;

/**
 *
 * @author Breno Vambaster C. L
 * @param <T>
 */
public interface IDao<T> {

    public Long salvar(T o);
}
