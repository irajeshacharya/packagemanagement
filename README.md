A REST API for managing Packages using Spring Boot App.

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
## Product APIs
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

## Package APIs
A package can be composed by adding one or more product. Package price will be sum of all the individual product price.

### Package Structure
|Field|Type|Description|
|---|---|---|---|---| 
|id| Integer |Unique Key - Identifier of the Package|
| name | String |Name of the Product|
| description | String | Description of the Package |
| products | List<Product> | List of Products |
| price | double |Price of the Package |
| base | String |Base Currency|

### Example
    {
        "id": 1,
        "name": "Shirt",
        "description": "Black Shirt",
        "price": 50,
        "base": "USD"
    }
    
### Create Package :
**HTTP Verb :** `POST`
	
**URL :**
`http://localhost:8080/api/v1/packages`

 **Payload :**  
 
	{
	"name" : "Dasara",
	"description" : "Dasara Package",
	"products" : [
		    {
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
    }
		],
	"base"	 : "USD",
	"price" : 150

	}
    
 **Response :**
   
	{
    "id": 1,
    "name": "Dasara",
    "description": "Dasara Package",
    "products": [
        {
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
        }
    ],
    "price": 150,
    "base": "USD"
	}
        

### Get Package By ID :
**HTTP Verb :** `GET`

**URL :**
`http://localhost:8080/api/v1/packages/{ID}`

**Example URL :** `http://localhost:8080/api/v1/packages/1`

**Response :**
   
	{
    "id": 1,
    "name": "Dasara",
    "description": "Dasara Package",
    "products": [
        {
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
        }
    ],
    "price": 150,
    "base": "USD"
}

### Get All Packages :

**HTTP Verb :** `GET`

**URL :**
`http://localhost:8080/api/v1/packages`

**Response :**
   
	[{
    "id": 1,
    "name": "Dasara",
    "description": "Dasara Package",
    "products": [
        {
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
        }
    ],
    "price": 150,
    "base": "USD"
	},
    {
    "id": 2,
    "name": "Halloween",
    "description": "Halloween Package",
    "products": [
        {
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
    	}
    ],
    "price": 225,
    "base": "USD"
	}]
### Update Package :

**HTTP Verb :** `PUT`

**URL :**
`http://localhost:8080/api/v1/packages/{ID}`

**Example URL :** `http://localhost:8080/api/v1/packages/1`

**Old Value :**

	{
    "id": 1,
    "name": "Dasara",
    "description": "Dasara Package",
    "products": [
        {
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
        }
    ],
    "price": 150,
    "base": "USD"
	}
	
**Payload :**

	{
    "name": "Deepavali Celebration",
    "description": "Deepavali Celebration Package",
    "products": [
        {
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
        },
        {
            "id": 3,
            "name": "TShirt",
            "description": "Black TShirt",
            "price": 75,
            "base": "USD"
        }
    ],
    "price": 300,
    "base": "USD"
	}

	
**Response :**
   
	{
    "id": 1,
    "name": "Deepavali Celebration",
    "description": "Deepavali Celebration Package",
    "products": [
        {
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
        },
        {
            "id": 3,
            "name": "TShirt",
            "description": "Black TShirt",
            "price": 75,
            "base": "USD"
        }
    ],
    "price": 300,
    "base": "USD"
	}
    
###  Delete Product :

**HTTP Verb :** `DELETE`

**URL :**
`http://localhost:8080/api/v1/packages/{ID}`

**Example URL :** `http://localhost:8080/api/v1/packages/1`

**Response :**

	{
    "id": 1,
    "name": "Deepavali Celebration",
    "description": "Deepavali Celebration Package",
    "products": [
        {
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
        },
        {
            "id": 3,
            "name": "TShirt",
            "description": "Black TShirt",
            "price": 75,
            "base": "USD"
        }
    ],
    "price": 300,
    "base": "USD"
	}


### Exception Handle
|Exception Type|Scenario|Error Code|
|---|---|---|
|PackagePayloadError|Invalid Payload|401|
|PackageNotFoundException|Package Not Found|404|
|PackageInternalServerError|Internal Server Error|500|


## 
