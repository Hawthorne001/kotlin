/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByReferenceTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByReference")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleSymbolByReferenceTestGenerated extends AbstractSymbolByReferenceTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fe10,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    @TestMetadata("accessorField.kt")
    public void testAccessorField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/accessorField.kt");
    }

    @Test
    public void testAllFilesPresentInSymbolByReference() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByReference"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("constructorValueParameter.kt")
    public void testConstructorValueParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/constructorValueParameter.kt");
    }

    @Test
    @TestMetadata("constructorViaTypeAlias.kt")
    public void testConstructorViaTypeAlias() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/constructorViaTypeAlias.kt");
    }

    @Test
    @TestMetadata("enumEntries.kt")
    public void testEnumEntries() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/enumEntries.kt");
    }

    @Test
    @TestMetadata("enumValueOf.kt")
    public void testEnumValueOf() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/enumValueOf.kt");
    }

    @Test
    @TestMetadata("enumValues.kt")
    public void testEnumValues() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/enumValues.kt");
    }

    @Test
    @TestMetadata("explicitLambdaParameter.kt")
    public void testExplicitLambdaParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/explicitLambdaParameter.kt");
    }

    @Test
    @TestMetadata("functionReceiverParameter.kt")
    public void testFunctionReceiverParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/functionReceiverParameter.kt");
    }

    @Test
    @TestMetadata("genericFromFunctionInLocalClass.kt")
    public void testGenericFromFunctionInLocalClass() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/genericFromFunctionInLocalClass.kt");
    }

    @Test
    @TestMetadata("genericFromOuterClassInInnerClass.kt")
    public void testGenericFromOuterClassInInnerClass() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/genericFromOuterClassInInnerClass.kt");
    }

    @Test
    @TestMetadata("implicitLambdaParameter.kt")
    public void testImplicitLambdaParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/implicitLambdaParameter.kt");
    }

    @Test
    @TestMetadata("javaClassWithEmptyAnnotationName.kt")
    public void testJavaClassWithEmptyAnnotationName() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaClassWithEmptyAnnotationName.kt");
    }

    @Test
    @TestMetadata("javaField.kt")
    public void testJavaField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaField.kt");
    }

    @Test
    @TestMetadata("javaFieldWithTypeAnnotation.kt")
    public void testJavaFieldWithTypeAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaFieldWithTypeAnnotation.kt");
    }

    @Test
    @TestMetadata("javaMethod.kt")
    public void testJavaMethod() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaMethod.kt");
    }

    @Test
    @TestMetadata("javaMethodWithExternalNotNullAnnotation.kt")
    public void testJavaMethodWithExternalNotNullAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaMethodWithExternalNotNullAnnotation.kt");
    }

    @Test
    @TestMetadata("javaMethodWithNotNullAnnotation.kt")
    public void testJavaMethodWithNotNullAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaMethodWithNotNullAnnotation.kt");
    }

    @Test
    @TestMetadata("javaStaticField.kt")
    public void testJavaStaticField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaStaticField.kt");
    }

    @Test
    @TestMetadata("javaStaticMethod.kt")
    public void testJavaStaticMethod() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaStaticMethod.kt");
    }

    @Test
    @TestMetadata("javaSyntheticAccessor.kt")
    public void testJavaSyntheticAccessor() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/javaSyntheticAccessor.kt");
    }

    @Test
    @TestMetadata("primaryConstructorValueParameter.kt")
    public void testPrimaryConstructorValueParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/primaryConstructorValueParameter.kt");
    }

    @Test
    @TestMetadata("primaryConstructorValueParameterAsProperty.kt")
    public void testPrimaryConstructorValueParameterAsProperty() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/primaryConstructorValueParameterAsProperty.kt");
    }

    @Test
    @TestMetadata("propertyReceiverParameter.kt")
    public void testPropertyReceiverParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/propertyReceiverParameter.kt");
    }

    @Test
    @TestMetadata("samConstructor.kt")
    public void testSamConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/samConstructor.kt");
    }

    @Test
    @TestMetadata("setterValueParameter.kt")
    public void testSetterValueParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/setterValueParameter.kt");
    }

    @Test
    @TestMetadata("syntheticProperty.kt")
    public void testSyntheticProperty() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/syntheticProperty.kt");
    }

    @Test
    @TestMetadata("typeAnnotationOnBackingField.kt")
    public void testTypeAnnotationOnBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/typeAnnotationOnBackingField.kt");
    }

    @Test
    @TestMetadata("typeParameter.kt")
    public void testTypeParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/typeParameter.kt");
    }

    @Test
    @TestMetadata("valueParameter.kt")
    public void testValueParameter() throws Exception {
        runTest("analysis/analysis-api/testData/symbols/symbolByReference/valueParameter.kt");
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/symbols/symbolByReference/js")
    @TestDataPath("$PROJECT_ROOT")
    public class Js {
        @Test
        public void testAllFilesPresentInJs() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByReference/js"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("functionFromJsDynamicScopeNoArguments.kt")
        public void testFunctionFromJsDynamicScopeNoArguments() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByReference/js/functionFromJsDynamicScopeNoArguments.kt");
        }

        @Test
        @TestMetadata("functionFromJsDynamicScopeWithArguments.kt")
        public void testFunctionFromJsDynamicScopeWithArguments() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByReference/js/functionFromJsDynamicScopeWithArguments.kt");
        }

        @Test
        @TestMetadata("propertyFromJsDynamicScope.kt")
        public void testPropertyFromJsDynamicScope() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByReference/js/propertyFromJsDynamicScope.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/symbols/symbolByReference/withTestCompilerPluginEnabled")
    @TestDataPath("$PROJECT_ROOT")
    public class WithTestCompilerPluginEnabled {
        @Test
        public void testAllFilesPresentInWithTestCompilerPluginEnabled() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByReference/withTestCompilerPluginEnabled"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("generatedCompanionWorksAsValue.kt")
        public void testGeneratedCompanionWorksAsValue() throws Exception {
            runTest("analysis/analysis-api/testData/symbols/symbolByReference/withTestCompilerPluginEnabled/generatedCompanionWorksAsValue.kt");
        }
    }
}
