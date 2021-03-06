/**
 * generated by Xtext 2.13.0
 */
package br.org.cursomde.math;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.org.cursomde.math.MathPackage
 * @generated
 */
public interface MathFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathFactory eINSTANCE = br.org.cursomde.math.impl.MathFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Problema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Problema</em>'.
   * @generated
   */
  Problema createProblema();

  /**
   * Returns a new object of class '<em>Expressao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expressao</em>'.
   * @generated
   */
  Expressao createExpressao();

  /**
   * Returns a new object of class '<em>Armazena</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Armazena</em>'.
   * @generated
   */
  Armazena createArmazena();

  /**
   * Returns a new object of class '<em>Operacao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operacao</em>'.
   * @generated
   */
  Operacao createOperacao();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MathPackage getMathPackage();

} //MathFactory
