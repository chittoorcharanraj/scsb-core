package org.recap.model.jpa;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajeshbabuk on 11/7/16.
 */
@Schema(name="SearchResultRow", description="Model for Displaying Search Result")
public class SearchResultRow {

    @Schema(name= "bibId", description= "Bibliographic Id",maxLength = 0)
    private Integer bibId;
    @Schema(name= "title", description= "Book Title",maxLength = 1)
    private String title;
    @Schema(name= "author", description= "Author",maxLength = 2)
    private String author;
    @Schema(name= "publisher", description= "Publisher",maxLength = 3)
    private String publisher;
    @Schema(name= "publisherDate", description= "Publisher Date",maxLength = 4)
    private String publisherDate;
    @Schema(name= "owningInstitution", description= "Owning Institution",maxLength = 5)
    private String owningInstitution;
    @Schema(name= "customerCode", description= "Customer Code",maxLength = 6)
    private String customerCode;
    @Schema(name= "collectionGroupDesignation", description= "Collection Group Designation",maxLength = 7)
    private String collectionGroupDesignation;
    @Schema(name= "useRestriction", description= "use Restriction",maxLength = 8)
    private String useRestriction;
    @Schema(name= "barcode", description= "barcode",maxLength = 9)
    private String barcode;
    @Schema(name= "summary Holdings", description= "summary Holdings",maxLength = 10)
    private String summaryHoldings;
    @Schema(name= "availability", description= "availability",maxLength = 11)
    private String availability;
    @Schema(name= "leaderMaterialType", description= "Leader Material Type",maxLength = 12)
    private String leaderMaterialType;
    @Schema(name= "selected", description= "selected",maxLength = 13)
    private boolean selected = false;
    @Schema(name= "showItems", description= "Show Items",maxLength = 14)
    private boolean showItems = false;
    @Schema(name= "selectAllItems", description= "Select All Items",maxLength = 15)
    private boolean selectAllItems = false;
    @Schema(name= "searchItemResultRows", description= "Item Results",maxLength = 16)
    private List<SearchItemResultRow> searchItemResultRows = new ArrayList<>();
    @Schema(name= "itemId", description= "Item Id",maxLength = 17)
    private Integer itemId;

    private Integer patronBarcode;
    private String requestingInstitution;
    private String deliveryLocation;
    private String requestType;
    private String requestNotes;

    /**
     * Gets bib id.
     *
     * @return the bib id
     */
    public Integer getBibId() {
        return bibId;
    }

    /**
     * Sets bib id.
     *
     * @param bibId the bib id
     */
    public void setBibId(Integer bibId) {
        this.bibId = bibId;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets publisher.
     *
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets publisher.
     *
     * @param publisher the publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets publisher date.
     *
     * @return the publisher date
     */
    public String getPublisherDate() {
        return publisherDate;
    }

    /**
     * Sets publisher date.
     *
     * @param publisherDate the publisher date
     */
    public void setPublisherDate(String publisherDate) {
        this.publisherDate = publisherDate;
    }

    /**
     * Gets owning institution.
     *
     * @return the owning institution
     */
    public String getOwningInstitution() {
        return owningInstitution;
    }

    /**
     * Sets owning institution.
     *
     * @param owningInstitution the owning institution
     */
    public void setOwningInstitution(String owningInstitution) {
        this.owningInstitution = owningInstitution;
    }

    /**
     * Gets customer code.
     *
     * @return the customer code
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets customer code.
     *
     * @param customerCode the customer code
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * Gets collection group designation.
     *
     * @return the collection group designation
     */
    public String getCollectionGroupDesignation() {
        return collectionGroupDesignation;
    }

    /**
     * Sets collection group designation.
     *
     * @param collectionGroupDesignation the collection group designation
     */
    public void setCollectionGroupDesignation(String collectionGroupDesignation) {
        this.collectionGroupDesignation = collectionGroupDesignation;
    }

    /**
     * Gets use restriction.
     *
     * @return the use restriction
     */
    public String getUseRestriction() {
        return useRestriction;
    }

    /**
     * Sets use restriction.
     *
     * @param useRestriction the use restriction
     */
    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }

    /**
     * Gets barcode.
     *
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets barcode.
     *
     * @param barcode the barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * Gets summary holdings.
     *
     * @return the summary holdings
     */
    public String getSummaryHoldings() {
        return summaryHoldings;
    }

    /**
     * Sets summary holdings.
     *
     * @param summaryHoldings the summary holdings
     */
    public void setSummaryHoldings(String summaryHoldings) {
        this.summaryHoldings = summaryHoldings;
    }

    /**
     * Gets availability.
     *
     * @return the availability
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets availability.
     *
     * @param availability the availability
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Gets leader material type.
     *
     * @return the leader material type
     */
    public String getLeaderMaterialType() {
        return leaderMaterialType;
    }

    /**
     * Sets leader material type.
     *
     * @param leaderMaterialType the leader material type
     */
    public void setLeaderMaterialType(String leaderMaterialType) {
        this.leaderMaterialType = leaderMaterialType;
    }

    /**
     * Is selected boolean.
     *
     * @return the boolean
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets selected.
     *
     * @param selected the selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * Is show items boolean.
     *
     * @return the boolean
     */
    public boolean isShowItems() {
        return showItems;
    }

    /**
     * Sets show items.
     *
     * @param showItems the show items
     */
    public void setShowItems(boolean showItems) {
        this.showItems = showItems;
    }

    /**
     * Gets search item result rows.
     *
     * @return the search item result rows
     */
    public List<SearchItemResultRow> getSearchItemResultRows() {
        return searchItemResultRows;
    }

    /**
     * Sets search item result rows.
     *
     * @param searchItemResultRows the search item result rows
     */
    public void setSearchItemResultRows(List<SearchItemResultRow> searchItemResultRows) {
        this.searchItemResultRows = searchItemResultRows;
    }

    /**
     * Is select all items boolean.
     *
     * @return the boolean
     */
    public boolean isSelectAllItems() {
        return selectAllItems;
    }

    /**
     * Sets select all items.
     *
     * @param selectAllItems the select all items
     */
    public void setSelectAllItems(boolean selectAllItems) {
        this.selectAllItems = selectAllItems;
    }

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * Gets patron barcode.
     *
     * @return the patron barcode
     */
    public Integer getPatronBarcode() {
        return patronBarcode;
    }

    /**
     * Sets patron barcode.
     *
     * @param patronBarcode the patron barcode
     */
    public void setPatronBarcode(Integer patronBarcode) {
        this.patronBarcode = patronBarcode;
    }

    /**
     * Gets requesting institution.
     *
     * @return the requesting institution
     */
    public String getRequestingInstitution() {
        return requestingInstitution;
    }

    /**
     * Sets requesting institution.
     *
     * @param requestingInstitution the requesting institution
     */
    public void setRequestingInstitution(String requestingInstitution) {
        this.requestingInstitution = requestingInstitution;
    }

    /**
     * Gets delivery location.
     *
     * @return the delivery location
     */
    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Sets delivery location.
     *
     * @param deliveryLocation the delivery location
     */
    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    /**
     * Gets request type.
     *
     * @return the request type
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets request type.
     *
     * @param requestType the request type
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * Gets request notes.
     *
     * @return the request notes
     */
    public String getRequestNotes() {
        return requestNotes;
    }

    /**
     * Sets request notes.
     *
     * @param requestNotes the request notes
     */
    public void setRequestNotes(String requestNotes) {
        this.requestNotes = requestNotes;
    }
}