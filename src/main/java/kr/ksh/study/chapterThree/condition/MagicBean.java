package kr.ksh.study.chapterThree.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class MagicBean implements Condition {
	private String magic;

	public String getMagic() {
		return magic;
	}

	public void setMagic(String magic) {
		this.magic = magic;
	}

	@Override
	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		Environment env = context.getEnvironment();		
		return env.containsProperty("magic"); // magic 프로퍼티 체크
	}
	
}
