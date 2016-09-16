/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.xtext.mTL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.january.geometry.xtext.mTL.MTLPackage
 * @generated
 */
public interface MTLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MTLFactory eINSTANCE = org.eclipse.january.geometry.xtext.mTL.impl.MTLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Material Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Material Source</em>'.
   * @generated
   */
  MaterialSource createMaterialSource();

  /**
   * Returns a new object of class '<em>Material</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Material</em>'.
   * @generated
   */
  Material createMaterial();

  /**
   * Returns a new object of class '<em>Phong Material</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phong Material</em>'.
   * @generated
   */
  PhongMaterial createPhongMaterial();

  /**
   * Returns a new object of class '<em>Textured Material</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textured Material</em>'.
   * @generated
   */
  TexturedMaterial createTexturedMaterial();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MTLPackage getMTLPackage();

} //MTLFactory
