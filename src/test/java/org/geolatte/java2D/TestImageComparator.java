/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Copyright (C) 2010 - 2011 and Ownership of code is shared by:
 *  Qmino bvba - Esperantolaan 4 - 3001 Heverlee  (http://www.qmino.com)
 *  Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.java2D;

import org.geolatte.maprenderer.java2D.ImageComparator;
import org.geolatte.test.ExpectedImages;
import org.junit.Test;

import java.awt.image.RenderedImage;
import java.io.IOException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * @author Karel Maesen, Geovise BVBA
 *         creation-date: 9/10/11
 */
public class TestImageComparator {


    @Test
    public void testSameImageReturnsTrue() throws IOException {
        RenderedImage img1 = ExpectedImages.getExpectedRenderedImage("image-compare-base.png");
        RenderedImage img2 = ExpectedImages.getExpectedRenderedImage("image-compare-base.png");

        ImageComparator comparator = new ImageComparator();
        assertTrue(comparator.equals(img1, img2));


    }

    @Test
    public void testModigiedImageReturnsFalse() throws IOException {
        RenderedImage img1 = ExpectedImages.getExpectedRenderedImage("image-compare-base.png");
        RenderedImage img2 = ExpectedImages.getExpectedRenderedImage("image-compare-edited.png");

        ImageComparator comparator = new ImageComparator();
        assertFalse(comparator.equals(img1, img2));


    }
}
