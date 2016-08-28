/*
 * Tecsinapse Data Importer and Exporter
 *
 * License: GNU Lesser General Public License (LGPL), version 3 or later
 * See the LICENSE file in the root directory or <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */
package br.com.tecsinapse.exporter.converter;

import com.google.common.base.Strings;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.util.Date;

public class LocalDateTableCellConverter implements FromDateConverter<LocalDate> {

    @Override
    public LocalDate apply(Date input) {
        return LocalDate.fromDateFields(input);
    }

    @Override
    public LocalDate apply(String input) {
        return Strings.isNullOrEmpty(input) ? null : LocalDateTime.parse(input).toLocalDate();
    }

}
