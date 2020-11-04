A REST API for managing Packages using Spring Boot App.

# Components of the Project
## Product
Product is the basic entity inorder to create a package where as a package may contain one or many product.

### Product Structure
|Field|Type|Description|
|---|---|---|---|---| 
|id| Integer |Unique Key - Identifier of the Product|
| name | String |Name of the Product|
| description | String | Description of the Product|
| price | double |Price of the Product|
| base | String |Base Currency|
### Example
    {
        "id": 1,
        "name": "Shirt",
        "description": "Black Shirt",
        "price": 50,
        "base": "USD"
    }
## Available APIs
### Create Product :
**HTTP Verb :** `POST`
	
**URL :**
`http://localhost:8080/api/v1/products`

 **Payload :**  
 
	{
        	"name": "Shirt",
        	"description": "Black Shirt",
        	"price": 50
    }
    
 **Response :**
   
	{
        		"id": 1,
    		"name": "Shirt",
    		"description": "Black Shirt",
    		"price": 50,
    		"base": "USD"
    }
    
**Note :** `For all the products default base considered as USD.`    

### Get Product By ID :
**HTTP Verb :** `GET`

**URL :**
`http://localhost:8080/api/v1/products/{ID}`

**Example URL :**`http://localhost:8080/api/v1/products/1`

**Response :**
   
	{
        		"id": 1,
    		"name": "Shirt",
    		"description": "Black Shirt",
    		"price": 50,
    		"base": "USD"
    }

### Get All Products :

**HTTP Verb :** `GET`

**URL :**
`http://localhost:8080/api/v1/products`

**Response :**
   
	[{
        "id": 1,
        "name": "Shirt",
        "description": "Black Shirt",
        "price": 50,
        "base": "USD"
    },
    {
        "id": 2,
        "name": "Pant",
        "description": "Black Pant",
        "price": 100,
        "base": "USD"
    },
    {
        "id": 3,
        "name": "TShirt",
        "description": "Black TShirt",
        "price": 75,
        "base": "USD"
    }]
### Update a Product :

**HTTP Verb :** `PUT`

**URL :**
`http://localhost:8080/api/v1/products/{ID}`

**Example URL :**`http://localhost:8080/api/v1/products/1`

**Payload :**

	{
        	"name": "Shirt",
        	"description": "Black Shirt",
        	"price": 100
    }

**Response :**
   
	{
        "id": 1,
        "name": "Shirt",
        "description": "Black Shirt",
        "price": 100,
        "base": "USD"
    }
    
### Exception Handle
|Exception Type|Scenario|Error Code|
|---|---|---|
|ProductPayloadError|Invalid Payload|401|
|ProductNotFoundException|Product Not Found|404|
|ProductInternalServerError|Internal Server Error|500|

## Package

## Discount
