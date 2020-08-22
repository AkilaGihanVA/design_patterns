package com.akila.designpattern.factory;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project design_patterns
 */
public class FolioServiceFactory {

    public static FolioService getFolioService(FolioType type) {
        switch (type) {
            case GENERAL:
                return new GeneralFolioService();
            case LDO:
                return new LDOFolioService();
            case EXPRESS_TRUST:
                return new ExpressTrustFolioService();
            default:
                return null;
        }
    }
}
