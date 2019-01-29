# Tutorial Mod

## Creating a basic custom item

To create a custom item called custom_item, you first need to add the item in the file
_ModItems.java_ located in the `com.username.modname.init` package with the following line.

    public static final Item CUSTOM_ITEM_NAME = new ItemBase("custom_item");

Then you need to create a file _custom_item.json_ in the `assets.modid.models.item` package
and write the following code where `modid` is the ID of your mod. 

    {
      "parent": "item/generated",
      "textures": {
        "layer0": "modid:items/custom_item"
      }
    }

Then you can put your PNG file in a 16x16 pixels resolution in the package
`assets.modid.textures.items` and **be sure** to name it _custom_item.png_.

Finally you must add the following line in the file _en_us.lang_ located in the
`assets.modid.lang` package.

    item.custom_item.name=Custom Item

The custom item should be now visible in the game.