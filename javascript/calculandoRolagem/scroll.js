/*
* Referencias;
* http://wbruno.com.br/javascript-puro/afinal-como-e-orientacao-a-objetos-em-javascript-exemplos/
* https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Operators/instanceofs
* http://www.w3schools.com/jsref/met_element_addeventlistener.asp
* http://www.chrisb.com.br/blog/como-pegar-dimensoes-da-janela-e-da-barra-de-rolagem-por-javascript/
* http://sweet.ua.pt/miguelmoreira/JavaScript_sites/JavaScript3.htm
* http://css3.bradshawenterprises.com/transitions/
* http://caioproiete.net/pt/para-que-serve-o-use-strict-em-javascript/
* https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Function/bind
* http://forum.imasters.com.br/topic/310822-pegar-altura-da-pagina/
*/

(function Scrolling() {

    'use strict';

    /**
     * Instância da função Scrolling
     */
     if (!(this instanceof Scrolling)) {
        return new Scrolling();
    }

    /**
     * Referencia o this para ser usado no escopo global
     */
     var self = this;

    /**
     * Objeto contento as funções principais.
     */
     self.core = {

        /**
         * Método init para fazer a lógica de chamada das funções
         */
         init: function () {
            this.bind.scroll();
        },

        /**
         * Objeto bind que recebe funções que serão 'bindadas' ao DOM
         */
         bind: {

            /**
             * Captura o evento de scroll
             */
             scroll: function() {
                window.addEventListener('scroll', function() {
                    /**
                     * Pega altura total da página
                     */
                     var height = self.core.get.height();

                    /**
                     * Calcula a porcentagem de quanto o usuário já deu scroll
                     */
                     var percent = self.core.calc(height - innerHeight, Math.floor(document.body.scrollTop));

                    /**
                     * Chama a função de update na barra
                     */
                     self.core.update.bar('#scrolling .percent', percent);
                 });
            }
        },

        /**
         * Objeto que recebe funções que 'pegam' (get) alguma coisa
         */
         get: {

            /**
             * Pega a altura total do documento
             */
             height: function() {
                var body = document.body;
                var html = document.documentElement;

                return Math.max(body.scrollHeight, body.offsetHeight, html.clientHeight, html.scrollHeight, html.offsetHeight);
            }
        },

        /**
         * Calcula a porcentagem
         */
         calc: function(total, scrolled) {
            /**
             * Apenas de teste para ver o scroll em ação
             */
             document.querySelector('.status').innerHTML = total + ' :: ' + scrolled;

            /**
             * Retorna o valor em porcentagem
             */
             return (scrolled / total) * 100;
         },

        /**
         * Objeto para fazer update em algo
         * type {Object}
         */
         update: {

            /**
             * Faz o update na barra superior
             * @param selector [seletor do elemento que será manipulado]
             * @param percent  [porcentagem para aumentar a barra]
             */
             bar: function(selector, percent) {
                return document.querySelector(selector).style.width = percent + '%';
            }
        }
    };

    self.core.init();

}());