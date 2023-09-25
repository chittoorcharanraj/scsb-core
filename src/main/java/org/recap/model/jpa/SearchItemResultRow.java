package org.recap.model.jpa;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import org.recap.model.search.AbstractSearchItemResultRow;

/**
 * Created by rajesh on 18-Jul-16.
 */
@Data
@Schema(name="SearchItemResultRow", description="Model for Displaying Item Result")
public class SearchItemResultRow extends AbstractSearchItemResultRow implements Comparable<SearchItemResultRow> {

    @Schema(name= "itemId", description= "Item Id",maxLength = 8)
    private Integer itemId;

    @Override
    public int compareTo(SearchItemResultRow searchItemResultRow) {
        if (null != this.getChronologyAndEnum() && null != searchItemResultRow && null != searchItemResultRow.getChronologyAndEnum()) {
            return this.getChronologyAndEnum().compareTo(searchItemResultRow.getChronologyAndEnum());
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        SearchItemResultRow searchItemResultRow = (SearchItemResultRow) object;

        return getChronologyAndEnum() != null ? getChronologyAndEnum().equals(searchItemResultRow.getChronologyAndEnum()) : searchItemResultRow.getChronologyAndEnum() == null;

    }

    @Override
    public int hashCode() {
        return getChronologyAndEnum() != null ? getChronologyAndEnum().hashCode() : 0;
    }
}
