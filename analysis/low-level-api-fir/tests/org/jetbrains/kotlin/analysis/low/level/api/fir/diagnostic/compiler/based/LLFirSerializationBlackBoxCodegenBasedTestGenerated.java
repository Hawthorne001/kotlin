/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.diagnostic.compiler.based;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class LLFirSerializationBlackBoxCodegenBasedTestGenerated extends AbstractLLFirSerializationBlackBoxCodegenBasedTest {
  @Nested
  @TestMetadata("plugins/kotlinx-serialization/testData/boxIr")
  @TestDataPath("$PROJECT_ROOT")
  public class BoxIr {
    @Test
    @TestMetadata("allConstructorsAccessible.kt")
    public void testAllConstructorsAccessible() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/allConstructorsAccessible.kt");
    }

    @Test
    public void testAllFilesPresentInBoxIr() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/boxIr"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationsOnFile.kt")
    public void testAnnotationsOnFile() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/annotationsOnFile.kt");
    }

    @Test
    @TestMetadata("annotationsOnFileExplicitArray.kt")
    public void testAnnotationsOnFileExplicitArray() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/annotationsOnFileExplicitArray.kt");
    }

    @Test
    @TestMetadata("caching.kt")
    public void testCaching() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/caching.kt");
    }

    @Test
    @TestMetadata("clashBetweenSerializableAndNonSerializableProperty.kt")
    public void testClashBetweenSerializableAndNonSerializableProperty() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/clashBetweenSerializableAndNonSerializableProperty.kt");
    }

    @Test
    @TestMetadata("classSerializerAsObject.kt")
    public void testClassSerializerAsObject() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/classSerializerAsObject.kt");
    }

    @Test
    @TestMetadata("constValInSerialName.kt")
    public void testConstValInSerialName() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/constValInSerialName.kt");
    }

    @Test
    @TestMetadata("contextualByDefault.kt")
    public void testContextualByDefault() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/contextualByDefault.kt");
    }

    @Test
    @TestMetadata("contextualFallback.kt")
    public void testContextualFallback() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/contextualFallback.kt");
    }

    @Test
    @TestMetadata("contextualWithTypeParameters.kt")
    public void testContextualWithTypeParameters() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/contextualWithTypeParameters.kt");
    }

    @Test
    @TestMetadata("delegatedInterface.kt")
    public void testDelegatedInterface() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/delegatedInterface.kt");
    }

    @Test
    @TestMetadata("delegatedProperty.kt")
    public void testDelegatedProperty() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/delegatedProperty.kt");
    }

    @Test
    @TestMetadata("enumsAreCached.kt")
    public void testEnumsAreCached() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/enumsAreCached.kt");
    }

    @Test
    @TestMetadata("excludedFromExport.kt")
    public void testExcludedFromExport() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/excludedFromExport.kt");
    }

    @Test
    @TestMetadata("excludedFromFileExport.kt")
    public void testExcludedFromFileExport() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/excludedFromFileExport.kt");
    }

    @Test
    @TestMetadata("expectActual.kt")
    public void testExpectActual() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/expectActual.kt");
    }

    @Test
    @TestMetadata("expectActualSealedClass.kt")
    public void testExpectActualSealedClass() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/expectActualSealedClass.kt");
    }

    @Test
    @TestMetadata("externalSerialierJava.kt")
    public void testExternalSerialierJava() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/externalSerialierJava.kt");
    }

    @Test
    @TestMetadata("externalSerializerForClassWithNonSerializableType.kt")
    public void testExternalSerializerForClassWithNonSerializableType() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/externalSerializerForClassWithNonSerializableType.kt");
    }

    @Test
    @TestMetadata("generatedClassifiersViaLibraryDependency.kt")
    public void testGeneratedClassifiersViaLibraryDependency() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/generatedClassifiersViaLibraryDependency.kt");
    }

    @Test
    @TestMetadata("genericBaseClassMultiple.kt")
    public void testGenericBaseClassMultiple() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/genericBaseClassMultiple.kt");
    }

    @Test
    @TestMetadata("genericBaseClassSimple.kt")
    public void testGenericBaseClassSimple() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/genericBaseClassSimple.kt");
    }

    @Test
    @TestMetadata("generics.kt")
    public void testGenerics() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/generics.kt");
    }

    @Test
    @TestMetadata("inlineClasses.kt")
    public void testInlineClasses() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/inlineClasses.kt");
    }

    @Test
    @TestMetadata("interfaces.kt")
    public void testInterfaces() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/interfaces.kt");
    }

    @Test
    @TestMetadata("intrinsicAnnotations.kt")
    public void testIntrinsicAnnotations() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicAnnotations.kt");
    }

    @Test
    @TestMetadata("intrinsicsBox.kt")
    public void testIntrinsicsBox() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicsBox.kt");
    }

    @Test
    @TestMetadata("intrinsicsConsistency.kt")
    public void testIntrinsicsConsistency() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicsConsistency.kt");
    }

    @Test
    @TestMetadata("intrinsicsNonReified.kt")
    public void testIntrinsicsNonReified() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicsNonReified.kt");
    }

    @Test
    @TestMetadata("intrinsicsNullable.kt")
    public void testIntrinsicsNullable() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicsNullable.kt");
    }

    @Test
    @TestMetadata("intrinsicsPolymorphicPriority.kt")
    public void testIntrinsicsPolymorphicPriority() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicsPolymorphicPriority.kt");
    }

    @Test
    @TestMetadata("intrinsicsStarProjections.kt")
    public void testIntrinsicsStarProjections() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/intrinsicsStarProjections.kt");
    }

    @Test
    @TestMetadata("KeepGeneratedSerializer.kt")
    public void testKeepGeneratedSerializer() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/KeepGeneratedSerializer.kt");
    }

    @Test
    @TestMetadata("localSerializable.kt")
    public void testLocalSerializable() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/localSerializable.kt");
    }

    @Test
    @TestMetadata("metaSerializable.kt")
    public void testMetaSerializable() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/metaSerializable.kt");
    }

    @Test
    @TestMetadata("mpp.kt")
    public void testMpp() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/mpp.kt");
    }

    @Test
    @TestMetadata("multiFieldValueClasses.kt")
    public void testMultiFieldValueClasses() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/multiFieldValueClasses.kt");
    }

    @Test
    @TestMetadata("multimoduleInheritance.kt")
    public void testMultimoduleInheritance() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/multimoduleInheritance.kt");
    }

    @Test
    @TestMetadata("multimoduleInheritanceJs.kt")
    public void testMultimoduleInheritanceJs() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/multimoduleInheritanceJs.kt");
    }

    @Test
    @TestMetadata("multimoduleInheritanceJsGeneric.kt")
    public void testMultimoduleInheritanceJsGeneric() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/multimoduleInheritanceJsGeneric.kt");
    }

    @Test
    @TestMetadata("multipleGenericsPolymorphic.kt")
    public void testMultipleGenericsPolymorphic() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/multipleGenericsPolymorphic.kt");
    }

    @Test
    @TestMetadata("namedCompanions.kt")
    public void testNamedCompanions() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/namedCompanions.kt");
    }

    @Test
    @TestMetadata("polymorphic.kt")
    public void testPolymorphic() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/polymorphic.kt");
    }

    @Test
    @TestMetadata("privateCustomSerializer.kt")
    public void testPrivateCustomSerializer() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/privateCustomSerializer.kt");
    }

    @Test
    @TestMetadata("repeatableSerialInfo.kt")
    public void testRepeatableSerialInfo() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/repeatableSerialInfo.kt");
    }

    @Test
    @TestMetadata("sealedClassMultifile.kt")
    public void testSealedClassMultifile() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/sealedClassMultifile.kt");
    }

    @Test
    @TestMetadata("sealedInterfaces.kt")
    public void testSealedInterfaces() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/sealedInterfaces.kt");
    }

    @Test
    @TestMetadata("serialInfo.kt")
    public void testSerialInfo() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serialInfo.kt");
    }

    @Test
    @TestMetadata("serializableCompanion.kt")
    public void testSerializableCompanion() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serializableCompanion.kt");
    }

    @Test
    @TestMetadata("serializableFromAnotherModule.kt")
    public void testSerializableFromAnotherModule() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serializableFromAnotherModule.kt");
    }

    @Test
    @TestMetadata("serializableFromAnotherModule_multipleFields.kt")
    public void testSerializableFromAnotherModule_multipleFields() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serializableFromAnotherModule_multipleFields.kt");
    }

    @Test
    @TestMetadata("serializableOnPropertyType.kt")
    public void testSerializableOnPropertyType() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serializableOnPropertyType.kt");
    }

    @Test
    @TestMetadata("serializerFactory.kt")
    public void testSerializerFactory() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serializerFactory.kt");
    }

    @Test
    @TestMetadata("serializerFactoryInUserDefined.kt")
    public void testSerializerFactoryInUserDefined() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/serializerFactoryInUserDefined.kt");
    }

    @Test
    @TestMetadata("starProjections.kt")
    public void testStarProjections() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/starProjections.kt");
    }

    @Test
    @TestMetadata("typealiasesInContextualTest.kt")
    public void testTypealiasesInContextualTest() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/typealiasesInContextualTest.kt");
    }

    @Test
    @TestMetadata("typealiasesTest.kt")
    public void testTypealiasesTest() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/typealiasesTest.kt");
    }

    @Test
    @TestMetadata("useSerializersChain.kt")
    public void testUseSerializersChain() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/useSerializersChain.kt");
    }

    @Test
    @TestMetadata("userDefinedSerializerInCompanion.kt")
    public void testUserDefinedSerializerInCompanion() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/userDefinedSerializerInCompanion.kt");
    }

    @Test
    @TestMetadata("uuidSerializer.kt")
    public void testUuidSerializer() {
      runTest("plugins/kotlinx-serialization/testData/boxIr/uuidSerializer.kt");
    }
  }

  @Nested
  @TestMetadata("plugins/kotlinx-serialization/testData/codegen")
  @TestDataPath("$PROJECT_ROOT")
  public class Codegen {
    @Test
    public void testAllFilesPresentInCodegen() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlinx-serialization/testData/codegen"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("Basic.kt")
    public void testBasic() {
      runTest("plugins/kotlinx-serialization/testData/codegen/Basic.kt");
    }

    @Test
    @TestMetadata("Intrinsics.kt")
    public void testIntrinsics() {
      runTest("plugins/kotlinx-serialization/testData/codegen/Intrinsics.kt");
    }

    @Test
    @TestMetadata("IntrinsicsAdvanced.kt")
    public void testIntrinsicsAdvanced() {
      runTest("plugins/kotlinx-serialization/testData/codegen/IntrinsicsAdvanced.kt");
    }

    @Test
    @TestMetadata("IntrinsicsNonReified.kt")
    public void testIntrinsicsNonReified() {
      runTest("plugins/kotlinx-serialization/testData/codegen/IntrinsicsNonReified.kt");
    }

    @Test
    @TestMetadata("KeepGeneratedSerializer.kt")
    public void testKeepGeneratedSerializer() {
      runTest("plugins/kotlinx-serialization/testData/codegen/KeepGeneratedSerializer.kt");
    }

    @Test
    @TestMetadata("Sealed.kt")
    public void testSealed() {
      runTest("plugins/kotlinx-serialization/testData/codegen/Sealed.kt");
    }
  }
}
