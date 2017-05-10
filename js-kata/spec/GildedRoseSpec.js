describe("Gilded Rose", function() {

  // it("should foo", function() {
  //   items = [ new Item("foo", 0, 0) ];
  //   update_quality();
  //   expect(items[0].name).toEqual("foo");
  // });

  it("Sulfuras is always 80", function(){
    items = [ new Item("Sulfuras, Hand of Ragnaros", 10, 80) ];
    update_quality();
    expect(items[0].quality).toEqual(80);
  });

  it("The quality of an item is never more than 50", function(){
    items = [ new Item("test item", 10, 50) ];
    update_quality();
    expect(items[0].quality).not.toEqual(51);
  });

  it("Aged Brie actually increases in quality the older it gets", function(){
    items = [ new Item("Aged Brie", 2, 0) ];
    update_quality();
    expect(items[0].quality).toEqual(1);
  });

  it("The quality of an item is never negative", function(){
    items = [ new Item("test item", 1, 0) ];
    update_quality();
    expect(items[0].quality).not.toEqual(-1);
  });

  it("Once the sell by date has passed, quality degrades twice as fast", function(){
    items = [ new Item("test item", -1, 10) ];
    update_quality();
    expect(items[0].quality).toEqual(8);
  });

  it("Backstage Passes increase in quality for more than 10 days to concert", function(){
    items = [ new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10) ];
    update_quality();
    expect(items[0].quality).toEqual(11);
  });

  it("Backstage Passes doubly increase in quality for less than 11 days to concert", function(){
    items = [ new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10) ];
    update_quality();
    expect(items[0].quality).toEqual(12);
  });

  it("Backstage Passes triply increase in quality for less than 6 days to concert", function(){
    items = [ new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) ];
    update_quality();
    expect(items[0].quality).toEqual(13);
  });

  it("Backstage Passes drop to zero after concert", function(){
    items = [ new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) ];
    update_quality();
    expect(items[0].quality).toEqual(0);
  });

  it("Conjured items degrade twice as fast", function(){
    items = [ new Item("Conjured Mana Cake", 3, 16) ];
    update_quality();
    expect(items[0].quality).toEqual(14);
  });

  it("Conjured items degrade four as fast past sell by date", function(){
    items = [ new Item("Conjured Mana Cake", 0, 16) ];
    update_quality();
    expect(items[0].quality).toEqual(12);
  });
});
