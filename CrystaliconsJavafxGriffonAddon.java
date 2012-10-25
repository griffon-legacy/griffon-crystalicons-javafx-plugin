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

import griffon.util.ApplicationHolder;
import griffon.plugins.crystal.CrystalIconFactory;
import griffon.plugins.crystal.CrystalIconViewFactory;
import org.codehaus.griffon.runtime.core.AbstractGriffonAddon;

/**
 * @author Andres Almiray
 */
public class CrystaliconsJavafxGriffonAddon extends AbstractGriffonAddon {
    public CrystaliconsJavafxGriffonAddon() {
        super(ApplicationHolder.getApplication());
        factories.put("crystalIcon", new CrystalIconFactory());
        factories.put("crystalIconView", new CrystalIconViewFactory());
    }
}
