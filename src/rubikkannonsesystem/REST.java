/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikkannonsesystem;

import java.util.List;

/**
 *
 * @author Stigus
 * REST service class to be used by the UI */
public class REST {
    
    
    
/**
* Public method that returns items with photos sold in the shop
*/
    public List<Item> getItems(){
        
    }
    
    
    
/**
* A registered user may purchase an Item. An email will be sent to the
* seller if the purchase is successful
*
* @param itemid unique id for item
* @return result of purchase request
*/
    public Response purchase(Long itemid) {
        
    }
    
 /**
 * A registered user may remove an item and associated photos owned by the
 * calling user. An user with administrator privileges may remove any item
 * and associated photos.
 *
 * @param itemid unique id for item to be deleted
 * @return result of delete request
 */
    public Response delete(Long itemid) {
        
    }
    
 /**
 * A registered user may add an item and photo(s) to Fant.
 *
 * @param title the title of Item
 * @param description the description of Item
 * @param price the price of Item
 * @param photos one or more photos associated with Item
 * @return result of the request. If successful, the request will include
 * the new unique ids of the Item and associated Photos
 */
    public Response addItem(String title, String description, BigDecimal price, FormDataMultiPart Photos) {
        
    }
    
 /**
 * Streams an image to the browser (the actual compressed pixels). The image
 * will be scaled to the appropriate width if the width parameter is provided.
 * This is a public method available to all callers.
 *
 * @param name the filename of the image
 * @param width the required scaled with of the image
 *
 * @return the image in original format or in jpeg if scaled
 */
    public Response getPhoto(String name, int width) {
    }
    
    
    

