package model.event;

import java.util.ArrayList;
import java.util.List;

import localization.LocalizedTexts;
import model.CityResources;
import model.tiles.IndustrialTile;

/**
 * The InvestmentEvent make you earn more money.
 */
public class InvestmentEvent extends Event {

    /**
     * Default Constructor.
     */
	public InvestmentEvent() {
        super();
    }


    /**
     * Apply no effects.
     */
	@Override
    public List<Event> applyEffects(CityResources resources) {
        IndustrialTile.maxProduction+=3;
        return new ArrayList<>(0);
    }

	/**
     * Return an empty message.
     */
	@Override
    public String getMessage(LocalizedTexts texts) {
		if(texts.getLangageName()=="Fran�ais"){
			return "Des investisseurs ont cru en votre industrie";
		}
		else{
			return "Investors believed in your industry";
		}
    }

}

