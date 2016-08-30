/*
 * Tecsinapse Data Input and Output
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later
 * See the LICENSE file in the root directory or <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package br.com.tecsinapse.exporter.converter;

import org.joda.time.LocalDateTime;
import org.testng.annotations.DataProvider;

import java.util.Date;

public class LocalDateTimeTableCellConverterTest extends AbstractTableCellConverter<LocalDateTime, LocalDateTimeTableCellConverter> {

    private static final String LOCAL_DATE_TIME = "2016-01-01T12:45:56";
    private static final Date DATE = LocalDateTime.parse("2016-01-01T12:45:56").toDate();

    private final LocalDateTimeTableCellConverter converter = new LocalDateTimeTableCellConverter();

    @Override
    protected LocalDateTimeTableCellConverter getConverter() {
        return converter;
    }

    @Override
    @DataProvider(name = "values")
    protected Object[][] getValues() {
        return new Object[][]{
                {null, null},
                {EMPTY_STRING, null},
                {LOCAL_DATE_TIME, LocalDateTime.parse(LOCAL_DATE_TIME)},
                {DATE, LocalDateTime.parse(LOCAL_DATE_TIME)}
        };
    }

}
