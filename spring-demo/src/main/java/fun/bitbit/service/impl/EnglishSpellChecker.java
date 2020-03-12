package fun.bitbit.service.impl;

import fun.bitbit.service.ISpellChecker;
import org.springframework.stereotype.Component;

@Component
public class EnglishSpellChecker implements ISpellChecker{
	@Override
	public void check(String word) {
		System.out.println("check " + word);
	}
}
