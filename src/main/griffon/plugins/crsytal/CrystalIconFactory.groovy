/*
 * griffon-crystalicons-javafx: Crystal icons Griffon plugin for JavaFX
 * Copyright 2012 and beyond, Andres Almiray
 *
 * griffon-crystal is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package griffon.plugins.crystal

import groovyx.javafx.factory.ImageFactory

/**
 * @author Andres Almiray
 */
class CrystalIconFactory extends ImageFactory {
    Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) {
        super.newInstance(builder, name, parseArgs(name, value, attributes), [:])
    }

    static String parseArgs(Object name, Object value, Map attributes) {
        String size = attributes.remove('size') ?: '16'
        String category = attributes.remove('category') ?: 'actions'
        String icon = attributes.remove('icon') ?: value 

        if (!icon) throw new IllegalArgumentException("In $name you must define a node value or icon:")

        size = parseSize(size)
        if (icon.endsWith('.png')) icon -= '.png'

        "/com/everaldo/crystal/${size}/${category}/${icon}.png"
   }

    private static String parseSize(String size) {
        switch(size) {
            case '16':
            case '24':
            case '32':
                return size +'x'+ size
        }
        return '16x16'
    }
}
