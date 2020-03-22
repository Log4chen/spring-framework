package fun.bitbit;

import fun.bitbit.lifecycle.Order;
import fun.bitbit.service.ISpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TextEditor {
	@Autowired
//	@Resource
//	@Inject
//	@Qualifier("englishSpellChecker")
	private ISpellChecker spellChecker;

	@Autowired
	private Order order;

	public void inputText(String text){
		spellChecker.check(text);
	}
}
