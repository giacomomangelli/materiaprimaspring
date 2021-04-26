package materiaprimaspring.it.prova.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import materiaprimaspring.it.prova.service.ILavorazioneService;
import materiaprimaspring.it.prova.service.IMateriaPrimaService;

public class MyServiceFactory {

	private static ApplicationContext ctx;

	static {
		try {
			ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static IMateriaPrimaService getMateriaPrimaService() {
		return  ctx.getBean(IMateriaPrimaService.class);
	}
	
	public static ILavorazioneService getInLavorazioneService() {
		return ctx.getBean(ILavorazioneService.class);
	}

}
