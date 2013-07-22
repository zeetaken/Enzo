/*
 * Copyright (c) 2013 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.enzo.gauge;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Dimension2D;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.List;


/**
 * Created by
 * User: hansolo
 * Date: 22.07.13
 * Time: 07:47
 */
public class SimpleGaugeBuilder<B extends SimpleGaugeBuilder<B>> {
    private HashMap<String, Property> properties = new HashMap<>();


    // ******************** Constructors **************************************
    protected SimpleGaugeBuilder() {}


    // ******************** Methods *******************************************
    public static final SimpleGaugeBuilder create() {
        return new SimpleGaugeBuilder();
    }

    public final SimpleGaugeBuilder value(final double VALUE) {
        properties.put("value", new SimpleDoubleProperty(VALUE));
        return this;
    }

    public final SimpleGaugeBuilder threshold(final double THRESHOLD) {
        properties.put("threshold", new SimpleDoubleProperty(THRESHOLD));
        return this;
    }

    public final SimpleGaugeBuilder sections(final Section... SECTIONS) {
        properties.put("sectionsArray", new SimpleObjectProperty<>(SECTIONS));
        return this;
    }

    public final SimpleGaugeBuilder sections(final List<Section> SECTIONS) {
        properties.put("sectionsList", new SimpleObjectProperty<>(SECTIONS));
        return this;
    }

    public final SimpleGaugeBuilder decimals(final int DECIMALS) {
        properties.put("decimals", new SimpleIntegerProperty(DECIMALS));
        return this;
    }

    public final SimpleGaugeBuilder unit(final String UNIT) {
        properties.put("unit", new SimpleStringProperty(UNIT));
        return this;
    }

    public final SimpleGaugeBuilder animated(final boolean ANIMATED) {
        properties.put("animated", new SimpleBooleanProperty(ANIMATED));
        return this;
    }

    public final SimpleGaugeBuilder animationDuration(final double ANIMATION_DURATION) {
        properties.put("animationDuration", new SimpleDoubleProperty(ANIMATION_DURATION));
        return this;
    }

    public final SimpleGaugeBuilder startAngle(final double START_ANGLE) {
        properties.put("startAngle", new SimpleDoubleProperty(START_ANGLE));
        return this;
    }

    public final SimpleGaugeBuilder angleRange(final double ANGLE_RANGE) {
        properties.put("angleRange", new SimpleDoubleProperty(ANGLE_RANGE));
        return this;
    }

    public final SimpleGaugeBuilder autoScale(final boolean AUTO_SCALE) {
        properties.put("autoScale", new SimpleBooleanProperty(AUTO_SCALE));
        return this;
    }

    public final SimpleGaugeBuilder needleColor(final Color NEEDLE_COLOR) {
        properties.put("needleColor", new SimpleObjectProperty<>(NEEDLE_COLOR));
        return this;
    }

    public final SimpleGaugeBuilder section0Fill(final Color SECTION_0_FILL) {
        properties.put("section0Fill", new SimpleObjectProperty<>(SECTION_0_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section1Fill(final Color SECTION_1_FILL) {
        properties.put("section1Fill", new SimpleObjectProperty<>(SECTION_1_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section2Fill(final Color SECTION_2_FILL) {
        properties.put("section2Fill", new SimpleObjectProperty<>(SECTION_2_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section3Fill(final Color SECTION_3_FILL) {
        properties.put("section3Fill", new SimpleObjectProperty<>(SECTION_3_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section4Fill(final Color SECTION_4_FILL) {
        properties.put("section4Fill", new SimpleObjectProperty<>(SECTION_4_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section5Fill(final Color SECTION_5_FILL) {
        properties.put("section5Fill", new SimpleObjectProperty<>(SECTION_5_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section6Fill(final Color SECTION_6_FILL) {
        properties.put("section6Fill", new SimpleObjectProperty<>(SECTION_6_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section7Fill(final Color SECTION_7_FILL) {
        properties.put("section7Fill", new SimpleObjectProperty<>(SECTION_7_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section8Fill(final Color SECTION_8_FILL) {
        properties.put("section8Fill", new SimpleObjectProperty<>(SECTION_8_FILL));
        return this;
    }

    public final SimpleGaugeBuilder section9Fill(final Color SECTION_9_FILL) {
        properties.put("section9Fill", new SimpleObjectProperty<>(SECTION_9_FILL));
        return this;
    }

    public final SimpleGaugeBuilder styleClass(final String... STYLES) {
        properties.put("styleClass", new SimpleObjectProperty<>(STYLES));
        return this;
    }

    public final B prefSize(final double WIDTH, final double HEIGHT) {
        properties.put("prefSize", new SimpleObjectProperty<>(new Dimension2D(WIDTH, HEIGHT)));
        return (B)this;
    }

    public final B prefWidth(final double PREF_WIDTH) {
        properties.put("prefWidth", new SimpleDoubleProperty(PREF_WIDTH));
        return (B)this;
    }
    public final B prefHeight(final double PREF_HEIGHT) {
        properties.put("prefHeight", new SimpleDoubleProperty(PREF_HEIGHT));
        return (B)this;
    }

    public final B minWidth(final double MIN_WIDTH) {
        properties.put("minWidth", new SimpleDoubleProperty(MIN_WIDTH));
        return (B)this;
    }
    public final B minHeight(final double MIN_HEIGHT) {
        properties.put("minHeight", new SimpleDoubleProperty(MIN_HEIGHT));
        return (B)this;
    }

    public final B maxWidth(final double MAX_WIDTH) {
        properties.put("maxWidth", new SimpleDoubleProperty(MAX_WIDTH));
        return (B)this;
    }
    public final B maxHeight(final double MAX_HEIGHT) {
        properties.put("maxHeight", new SimpleDoubleProperty(MAX_HEIGHT));
        return (B)this;
    }

    public final B scaleX(final double SCALE_X) {
        properties.put("scaleX", new SimpleDoubleProperty(SCALE_X));
        return (B)this;
    }
    public final B scaleY(final double SCALE_Y) {
        properties.put("scaleY", new SimpleDoubleProperty(SCALE_Y));
        return (B)this;
    }

    public final B layoutX(final double LAYOUT_X) {
        properties.put("layoutX", new SimpleDoubleProperty(LAYOUT_X));
        return (B)this;
    }
    public final B layoutY(final double LAYOUT_Y) {
        properties.put("layoutY", new SimpleDoubleProperty(LAYOUT_Y));
        return (B)this;
    }

    public final B translateX(final double TRANSLATE_X) {
        properties.put("translateX", new SimpleDoubleProperty(TRANSLATE_X));
        return (B)this;
    }
    public final B translateY(final double TRANSLATE_Y) {
        properties.put("translateY", new SimpleDoubleProperty(TRANSLATE_Y));
        return (B)this;
    }

    public final SimpleGauge build() {
        final SimpleGauge CONTROL = new SimpleGauge();
        for (String key : properties.keySet()) {
            if ("prefSize".equals(key)) {
                Dimension2D dim = ((ObjectProperty<Dimension2D>) properties.get(key)).get();
                CONTROL.setPrefSize(dim.getWidth(), dim.getHeight());
            } else if("prefWidth".equals(key)) {
                CONTROL.setPrefWidth(((DoubleProperty) properties.get(key)).get());
            } else if("prefHeight".equals(key)) {
                CONTROL.setPrefHeight(((DoubleProperty) properties.get(key)).get());
            } else if("minWidth".equals(key)) {
                CONTROL.setMinWidth(((DoubleProperty) properties.get(key)).get());
            } else if("minHeight".equals(key)) {
                CONTROL.setMinHeight(((DoubleProperty) properties.get(key)).get());
            } else if("maxWidth".equals(key)) {
                CONTROL.setMaxWidth(((DoubleProperty) properties.get(key)).get());
            } else if("maxHeight".equals(key)) {
                CONTROL.setMaxHeight(((DoubleProperty) properties.get(key)).get());
            } else if("scaleX".equals(key)) {
                CONTROL.setScaleX(((DoubleProperty) properties.get(key)).get());
            } else if("scaleY".equals(key)) {
                CONTROL.setScaleY(((DoubleProperty) properties.get(key)).get());
            } else if ("layoutX".equals(key)) {
                CONTROL.setLayoutX(((DoubleProperty) properties.get(key)).get());
            } else if ("layoutY".equals(key)) {
                CONTROL.setLayoutY(((DoubleProperty) properties.get(key)).get());
            } else if ("translateX".equals(key)) {
                CONTROL.setTranslateX(((DoubleProperty) properties.get(key)).get());
            } else if ("translateY".equals(key)) {
                CONTROL.setTranslateY(((DoubleProperty) properties.get(key)).get());
            } else if("styleClass".equals(key)) {
                CONTROL.getStyleClass().setAll("gauge");
                CONTROL.getStyleClass().addAll(((ObjectProperty<String[]>) properties.get(key)).get());
            } else if("value".equals(key)) {
                CONTROL.setValue(((DoubleProperty) properties.get(key)).get());
            } else if("minValue".equals(key)) {
                CONTROL.setMinValue(((DoubleProperty) properties.get(key)).get());
            } else if("maxValue".equals(key)) {
                CONTROL.setMaxValue(((DoubleProperty) properties.get(key)).get());
            } else if("sectionsArray".equals(key)) {
                CONTROL.setSections(((ObjectProperty<Section[]>) properties.get(key)).get());
            } else if("sectionsList".equals(key)) {
                CONTROL.setSections(((ObjectProperty<List<Section>>) properties.get(key)).get());
            } else if("decimals".equals(key)) {
                CONTROL.setDecimals(((IntegerProperty) properties.get(key)).get());
            } else if("unit".equals(key)) {
                CONTROL.setUnit(((StringProperty) properties.get(key)).get());
            } else if("animated".equals(key)) {
                CONTROL.setAnimated(((BooleanProperty) properties.get(key)).get());
            } else if("animationDuration".equals(key)) {
                CONTROL.setAnimationDuration(((DoubleProperty) properties.get(key)).get());
            } else if("startAngle".equals(key)) {
                CONTROL.setStartAngle(((DoubleProperty) properties.get(key)).get());
            } else if("angleRange".equals(key)) {
                CONTROL.setAngleRange(((DoubleProperty) properties.get(key)).get());
            } else if ("autoScale".equals(key)) {
                CONTROL.setAutoScale(((BooleanProperty) properties.get(key)).get());
            } else if("needleColor".equals(key)) {
                CONTROL.setNeedleColor(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("majorTickSpace".equals(key)) {
                CONTROL.setMajorTickSpace(((DoubleProperty) properties.get(key)).get());
            } else if("minorTickSpace".equals(key)) {
                CONTROL.setMinorTickSpace(((DoubleProperty) properties.get(key)).get());
            } else if("section0Fill".equals(key)) {
                CONTROL.setSection0Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section1Fill".equals(key)) {
                CONTROL.setSection1Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section2Fill".equals(key)) {
                CONTROL.setSection2Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section3Fill".equals(key)) {
                CONTROL.setSection3Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section4Fill".equals(key)) {
                CONTROL.setSection4Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section5Fill".equals(key)) {
                CONTROL.setSection5Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section6Fill".equals(key)) {
                CONTROL.setSection6Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section7Fill".equals(key)) {
                CONTROL.setSection7Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section8Fill".equals(key)) {
                CONTROL.setSection8Fill(((ObjectProperty<Color>) properties.get(key)).get());
            } else if("section9Fill".equals(key)) {
                CONTROL.setSection9Fill(((ObjectProperty<Color>) properties.get(key)).get());
            }
        }
        return CONTROL;
    }
}
