/*
 * Tecsinapse Data Input and Output
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later
 * See the LICENSE file in the root directory or <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package br.com.tecsinapse.exporter.converter;

import org.joda.time.YearMonth;
import org.testng.annotations.DataProvider;

import java.util.Date;

public class YearMonthTableCellConverterTest extends AbstractTableCellConverter<YearMonth, YearMonthTableCellConverter> {

    private final YearMonthTableCellConverter converter = new YearMonthTableCellConverter();

    private static final String YEAR_MONTH_STR = "201301";
    private static final Date DATE = new Date(1357005600000L);

    @Override
    protected YearMonthTableCellConverter getConverter() {
        return converter;
    }

    @Override
    @DataProvider(name = "values")
    protected Object[][] getValues() {
        return new Object[][]{
                {null, null},
                {EMPTY_STRING, null},
                {YEAR_MONTH_STR, YearMonth.fromDateFields(DATE)},
                {DATE, YearMonth.fromDateFields(DATE)}
        };
    }

}
