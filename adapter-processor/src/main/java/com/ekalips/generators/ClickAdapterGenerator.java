package com.ekalips.generators;

import com.ekalips.stuff.Consts;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;

/**
 * Created by wldev on 8/2/17.
 */

public class ClickAdapterGenerator implements TypeSpecGenerator {

    @Override
    public TypeSpec generate() {
        TypeSpec.Builder builder = TypeSpec.classBuilder(Consts.CLASS_NAME_CLICK_ADAPTER);
        builder.addSuperinterface(Consts.View.nestedClass("OnClickListener"));
        builder.addModifiers(Modifier.ABSTRACT, Modifier.PUBLIC);
        return builder.build();
    }
}
