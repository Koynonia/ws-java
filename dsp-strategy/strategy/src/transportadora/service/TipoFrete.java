package transportadora.service;

import transportadora.service.frete.Normal;
import transportadora.service.frete.Sedex;

public enum TipoFrete {

    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();

}