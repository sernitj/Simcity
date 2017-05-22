package model.event;

import java.util.ArrayList;
import java.util.List;

import localization.LocalizedTexts;
import model.CityResources;


/**
 * The CriminalEvent make you loose money.
 */
public class DiseaseEvent extends Event {

    /**
     * Default Constructor.
     */
	public DiseaseEvent() {
        super();
    }

    /**
     * Apply no effects.
     */
	@Override
    public List<Event> applyEffects(CityResources resources) {
        resources.decreasePopulation(5);
        return new ArrayList<>(0);
    }

    /**
     * Return an empty message.
     */
	@Override
    public String getMessage(LocalizedTexts texts) {
		if(texts.getLangageName()=="Fran�ais"){
			return "Une maladie a fait des victimes";
		}
		else{
			return "A disease killed people";
		}
    }

}

