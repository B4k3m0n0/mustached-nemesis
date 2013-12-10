/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.tripPlanner.gui.Utils;

import pt.ipleiria.tripPlanner.gui.Models.Localidade;
import pt.ipleiria.tripPlanner.gui.Models.Participante;

/**
 *
 * @author norberto
 */
public class CellRendererLocalidade extends Utils.CellRendererGeneric {

    protected String getTextToDisplay(Object value) {

        // verifica se o valor de entrada e' mesmo uma instancia de IRegistoEntradaSaidaDTO
        if (value instanceof Localidade) {
            Localidade row = (Localidade) value;

            // cria a string que sera' exibida na linha da lista
            String textToDisplay = "<html>" + row.getNome() + "</html>";

            return textToDisplay;

        } else {
            return "valor inválido";
        }
    }
}
