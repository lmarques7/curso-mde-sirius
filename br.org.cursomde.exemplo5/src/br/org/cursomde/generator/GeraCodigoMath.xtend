package br.org.cursomde.generator

import br.org.cursomde.math.Armazena
import br.org.cursomde.math.Operacao
import br.org.cursomde.math.Problema
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext

class GeraCodigoMath implements IGenerator2 {

  override doGenerate(Resource resource, IFileSystemAccess2 fsa, 
  	                  IGeneratorContext context) {
    for (e : resource.allContents.toIterable.filter(typeof(Problema))) {
      fsa.generateFile(e.name + ".java", e.compile)
    }
  }

  def compile(Problema p) '''
    public class «p.name» {
    	public static void main(String args[]) {
    		double resultado = 0;
    		«FOR expressao : p.expressoes»
    		  «expressao.compile»
    		«ENDFOR»
    		System.out.println("O resultado é "+resultado);
    	}
    }
  '''

  def dispatch compile(Armazena a) '''
    resultado = «a.termo»;
  '''

  def dispatch compile(Operacao o) '''
    resultado = resultado «o.sinal» «o.termo»;
  '''

  override afterGenerate(Resource input, IFileSystemAccess2 fsa, 
  	                     IGeneratorContext context) {
    // TODO implementar se necessário
  }

  override beforeGenerate(Resource input, IFileSystemAccess2 fsa, 
                          IGeneratorContext context) {
    // TODO implementar se necessário
  }

}
