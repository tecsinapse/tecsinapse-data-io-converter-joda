/*
 * Tecsinapse Data Importer and Exporter
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later
 * See the LICENSE file in the root directory or <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package br.com.tecsinapse.exporter.converter;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;

public abstract class AbstractTableCellConverter<T, C extends FromDateConverter<T>> {

    static final String EMPTY_STRING = "";

    protected abstract C getConverter();

    protected abstract Object[][] getValues();

    @Test(dataProvider = "values")
    public void testApply(final Object value, final T expected) {
        final T result = toTypedValue(value);
        assertEquals(result, expected);
    }

    private T toTypedValue(Object o) {
        if (o != null && o instanceof Date) {
            return this.getConverter().apply((Date) o);
        }
        return this.getConverter().apply((String) o);
    }

}
