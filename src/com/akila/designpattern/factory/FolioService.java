package com.akila.designpattern.factory;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project design_patterns
 */
public abstract class FolioService {

    public String generateFolioNo(Folio folio) {
        return null;
    }

    abstract Folio saveFolio(Folio folio);

    abstract Folio updateFolio(Folio folio);

    abstract Folio searchFolio(Folio folio);

}
