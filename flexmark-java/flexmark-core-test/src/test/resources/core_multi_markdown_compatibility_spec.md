---
title: MultiMarkdown Compatibility Spec
author: Vladimir Schneider
version: 0.1
date: '2016-12-03'
license: '[CC-BY-SA 4.0](http://creativecommons.org/licenses/by-sa/4.0/)'
...

---

Tests processor compatibility flags for list processing where most of the differences are to be
found.

## Bullet Mismatch Starts a New List

Test to see if bullet mismatch starts a new list

```````````````````````````````` example Bullet Mismatch Starts a New List: 1
- item
+ item
* item

.
<ul>
    <li>item</li>
    <li>item</li>
    <li>item</li>
</ul>
.
Document[0, 22]
  BulletList[0, 21] isTight
    BulletListItem[0, 7] open:[0, 1, "-"] isTight
      Paragraph[2, 7]
        Text[2, 6] chars:[2, 6, "item"]
    BulletListItem[7, 14] open:[7, 8, "+"] isTight
      Paragraph[9, 14]
        Text[9, 13] chars:[9, 13, "item"]
    BulletListItem[14, 21] open:[14, 15, "*"] isTight hadBlankLineAfter
      Paragraph[16, 21] isTrailingBlankLine
        Text[16, 20] chars:[16, 20, "item"]
````````````````````````````````


## Ordered List Item Sets List Start

Test to see if ordered list item will set list start if not one

```````````````````````````````` example Ordered List Item Sets List Start: 1
2. Non One Start Item
.
<ol>
    <li>Non One Start Item</li>
</ol>
.
Document[0, 21]
  OrderedList[0, 21] isTight start:2 delimiter:'.'
    OrderedListItem[0, 21] open:[0, 2, "2."] isTight
      Paragraph[3, 21]
        Text[3, 21] chars:[3, 21, "Non O …  Item"]
````````````````````````````````


## Mismatched List Item Type Handling

Test how mismatches in item types are handled

```````````````````````````````` example Mismatched List Item Type Handling: 1
- Bullet List
1. With Ordered Item
.
<ul>
    <li>Bullet List</li>
    <li>With Ordered Item</li>
</ul>
.
Document[0, 34]
  BulletList[0, 34] isTight
    BulletListItem[0, 14] open:[0, 1, "-"] isTight
      Paragraph[2, 14]
        Text[2, 13] chars:[2, 13, "Bulle …  List"]
    OrderedListItem[14, 34] open:[14, 16, "1."] isTight
      Paragraph[17, 34]
        Text[17, 34] chars:[17, 34, "With  …  Item"]
````````````````````````````````


```````````````````````````````` example Mismatched List Item Type Handling: 2
1. Ordered Item
- With Bullet List
.
<ol>
    <li>Ordered Item</li>
    <li>With Bullet List</li>
</ol>
.
Document[0, 34]
  OrderedList[0, 34] isTight delimiter:'.'
    OrderedListItem[0, 16] open:[0, 2, "1."] isTight
      Paragraph[3, 16]
        Text[3, 15] chars:[3, 15, "Order …  Item"]
    BulletListItem[16, 34] open:[16, 17, "-"] isTight
      Paragraph[18, 34]
        Text[18, 34] chars:[18, 34, "With  …  List"]
````````````````````````````````


## Loose Item Handling

Tests how all tight items are generated

```````````````````````````````` example Loose Item Handling: 1
- item 1
- item 2 
- item 3 
- item 4 
.
<ul>
    <li>item 1</li>
    <li>item 2</li>
    <li>item 3</li>
    <li>item 4</li>
</ul>
.
Document[0, 38]
  BulletList[0, 38] isTight
    BulletListItem[0, 9] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
    BulletListItem[9, 19] open:[9, 10, "-"] isTight
      Paragraph[11, 19]
        Text[11, 17] chars:[11, 17, "item 2"]
    BulletListItem[19, 29] open:[19, 20, "-"] isTight
      Paragraph[21, 29]
        Text[21, 27] chars:[21, 27, "item 3"]
    BulletListItem[29, 38] open:[29, 30, "-"] isTight
      Paragraph[31, 38]
        Text[31, 37] chars:[31, 37, "item 4"]
````````````````````````````````


Test to see how trailing blank after item determines looseness

```````````````````````````````` example Loose Item Handling: 2
- item 1

- item 2 
- item 3 
- item 4 
.
<ul>
    <li>
        <p>item 1</p>
    </li>
    <li>
        <p>item 2</p>
    </li>
    <li>
        <p>item 3</p>
    </li>
    <li>
        <p>item 4</p>
    </li>
</ul>
.
Document[0, 39]
  BulletList[0, 39] isLoose
    BulletListItem[0, 9] open:[0, 1, "-"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
    BulletListItem[10, 20] open:[10, 11, "-"] isLoose
      Paragraph[12, 20]
        Text[12, 18] chars:[12, 18, "item 2"]
    BulletListItem[20, 30] open:[20, 21, "-"] isLoose
      Paragraph[22, 30]
        Text[22, 28] chars:[22, 28, "item 3"]
    BulletListItem[30, 39] open:[30, 31, "-"] isLoose
      Paragraph[32, 39]
        Text[32, 38] chars:[32, 38, "item 4"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 3
- item 1
- item 2 

- item 3 
- item 4 
.
<ul>
    <li>
        <p>item 1</p>
    </li>
    <li>
        <p>item 2</p>
    </li>
    <li>
        <p>item 3</p>
    </li>
    <li>
        <p>item 4</p>
    </li>
</ul>
.
Document[0, 39]
  BulletList[0, 39] isLoose
    BulletListItem[0, 9] open:[0, 1, "-"] isLoose
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
    BulletListItem[9, 19] open:[9, 10, "-"] isLoose hadBlankLineAfter
      Paragraph[11, 19] isTrailingBlankLine
        Text[11, 17] chars:[11, 17, "item 2"]
    BulletListItem[20, 30] open:[20, 21, "-"] isLoose
      Paragraph[22, 30]
        Text[22, 28] chars:[22, 28, "item 3"]
    BulletListItem[30, 39] open:[30, 31, "-"] isLoose
      Paragraph[32, 39]
        Text[32, 38] chars:[32, 38, "item 4"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 4
- item 1
- item 2 
- item 3 

- item 4 
.
<ul>
    <li>
        <p>item 1</p>
    </li>
    <li>
        <p>item 2</p>
    </li>
    <li>
        <p>item 3</p>
    </li>
    <li>
        <p>item 4</p>
    </li>
</ul>
.
Document[0, 39]
  BulletList[0, 39] isLoose
    BulletListItem[0, 9] open:[0, 1, "-"] isLoose
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
    BulletListItem[9, 19] open:[9, 10, "-"] isLoose
      Paragraph[11, 19]
        Text[11, 17] chars:[11, 17, "item 2"]
    BulletListItem[19, 29] open:[19, 20, "-"] isLoose hadBlankLineAfter
      Paragraph[21, 29] isTrailingBlankLine
        Text[21, 27] chars:[21, 27, "item 3"]
    BulletListItem[30, 39] open:[30, 31, "-"] isLoose
      Paragraph[32, 39]
        Text[32, 38] chars:[32, 38, "item 4"]
````````````````````````````````


Test looseness with child items

```````````````````````````````` example Loose Item Handling: 5
- item 1
    - item 1.1
- item 2 
    - item 2.1 
- item 3 
    - item 3.1 
- item 4 
    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 101]
  BulletList[0, 101] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight
          Paragraph[15, 24]
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[24, 50] open:[24, 25, "-"] isTight
      Paragraph[26, 34]
        Text[26, 32] chars:[26, 32, "item 2"]
      BulletList[38, 50] isTight
        BulletListItem[38, 50] open:[38, 39, "-"] isTight
          Paragraph[40, 50]
            Text[40, 48] chars:[40, 48, "item 2.1"]
    BulletListItem[50, 76] open:[50, 51, "-"] isTight
      Paragraph[52, 60]
        Text[52, 58] chars:[52, 58, "item 3"]
      BulletList[64, 76] isTight
        BulletListItem[64, 76] open:[64, 65, "-"] isTight
          Paragraph[66, 76]
            Text[66, 74] chars:[66, 74, "item 3.1"]
    BulletListItem[76, 101] open:[76, 77, "-"] isTight
      Paragraph[78, 86]
        Text[78, 84] chars:[78, 84, "item 4"]
      BulletList[90, 101] isTight
        BulletListItem[90, 101] open:[90, 91, "-"] isTight
          Paragraph[92, 101]
            Text[92, 100] chars:[92, 100, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 6
- item 1

    - item 1.1
- item 2 
    - item 2.1 
- item 3 
    - item 3.1 
- item 4 
    - item 4.1 
.
<ul>
    <li>
        <p>item 1</p>
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 25] open:[0, 1, "-"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[14, 25] isTight
        BulletListItem[14, 25] open:[14, 15, "-"] isTight
          Paragraph[16, 25]
            Text[16, 24] chars:[16, 24, "item 1.1"]
    BulletListItem[25, 51] open:[25, 26, "-"] isTight
      Paragraph[27, 35]
        Text[27, 33] chars:[27, 33, "item 2"]
      BulletList[39, 51] isTight
        BulletListItem[39, 51] open:[39, 40, "-"] isTight
          Paragraph[41, 51]
            Text[41, 49] chars:[41, 49, "item 2.1"]
    BulletListItem[51, 77] open:[51, 52, "-"] isTight
      Paragraph[53, 61]
        Text[53, 59] chars:[53, 59, "item 3"]
      BulletList[65, 77] isTight
        BulletListItem[65, 77] open:[65, 66, "-"] isTight
          Paragraph[67, 77]
            Text[67, 75] chars:[67, 75, "item 3.1"]
    BulletListItem[77, 102] open:[77, 78, "-"] isTight
      Paragraph[79, 87]
        Text[79, 85] chars:[79, 85, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 7
- item 1
    - item 1.1

- item 2 
    - item 2.1 
- item 3 
    - item 3.1 
- item 4 
    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight hadBlankLineAfter
          Paragraph[15, 24] isTrailingBlankLine
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[25, 51] open:[25, 26, "-"] isTight
      Paragraph[27, 35]
        Text[27, 33] chars:[27, 33, "item 2"]
      BulletList[39, 51] isTight
        BulletListItem[39, 51] open:[39, 40, "-"] isTight
          Paragraph[41, 51]
            Text[41, 49] chars:[41, 49, "item 2.1"]
    BulletListItem[51, 77] open:[51, 52, "-"] isTight
      Paragraph[53, 61]
        Text[53, 59] chars:[53, 59, "item 3"]
      BulletList[65, 77] isTight
        BulletListItem[65, 77] open:[65, 66, "-"] isTight
          Paragraph[67, 77]
            Text[67, 75] chars:[67, 75, "item 3.1"]
    BulletListItem[77, 102] open:[77, 78, "-"] isTight
      Paragraph[79, 87]
        Text[79, 85] chars:[79, 85, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 8
- item 1
    - item 1.1
- item 2 

    - item 2.1 
- item 3 
    - item 3.1 
- item 4 
    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>
        <p>item 2</p>
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight
          Paragraph[15, 24]
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[24, 51] open:[24, 25, "-"] isLoose hadBlankLineAfter
      Paragraph[26, 34] isTrailingBlankLine
        Text[26, 32] chars:[26, 32, "item 2"]
      BulletList[39, 51] isTight
        BulletListItem[39, 51] open:[39, 40, "-"] isTight
          Paragraph[41, 51]
            Text[41, 49] chars:[41, 49, "item 2.1"]
    BulletListItem[51, 77] open:[51, 52, "-"] isTight
      Paragraph[53, 61]
        Text[53, 59] chars:[53, 59, "item 3"]
      BulletList[65, 77] isTight
        BulletListItem[65, 77] open:[65, 66, "-"] isTight
          Paragraph[67, 77]
            Text[67, 75] chars:[67, 75, "item 3.1"]
    BulletListItem[77, 102] open:[77, 78, "-"] isTight
      Paragraph[79, 87]
        Text[79, 85] chars:[79, 85, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 9
- item 1
    - item 1.1
- item 2 
    - item 2.1 

- item 3 
    - item 3.1 
- item 4 
    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight
          Paragraph[15, 24]
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[24, 50] open:[24, 25, "-"] isTight
      Paragraph[26, 34]
        Text[26, 32] chars:[26, 32, "item 2"]
      BulletList[38, 50] isTight
        BulletListItem[38, 50] open:[38, 39, "-"] isTight hadBlankLineAfter
          Paragraph[40, 50] isTrailingBlankLine
            Text[40, 48] chars:[40, 48, "item 2.1"]
    BulletListItem[51, 77] open:[51, 52, "-"] isTight
      Paragraph[53, 61]
        Text[53, 59] chars:[53, 59, "item 3"]
      BulletList[65, 77] isTight
        BulletListItem[65, 77] open:[65, 66, "-"] isTight
          Paragraph[67, 77]
            Text[67, 75] chars:[67, 75, "item 3.1"]
    BulletListItem[77, 102] open:[77, 78, "-"] isTight
      Paragraph[79, 87]
        Text[79, 85] chars:[79, 85, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 10
- item 1
    - item 1.1
- item 2 
    - item 2.1 
- item 3 

    - item 3.1 
- item 4 
    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>
        <p>item 3</p>
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight
          Paragraph[15, 24]
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[24, 50] open:[24, 25, "-"] isTight
      Paragraph[26, 34]
        Text[26, 32] chars:[26, 32, "item 2"]
      BulletList[38, 50] isTight
        BulletListItem[38, 50] open:[38, 39, "-"] isTight
          Paragraph[40, 50]
            Text[40, 48] chars:[40, 48, "item 2.1"]
    BulletListItem[50, 77] open:[50, 51, "-"] isLoose hadBlankLineAfter
      Paragraph[52, 60] isTrailingBlankLine
        Text[52, 58] chars:[52, 58, "item 3"]
      BulletList[65, 77] isTight
        BulletListItem[65, 77] open:[65, 66, "-"] isTight
          Paragraph[67, 77]
            Text[67, 75] chars:[67, 75, "item 3.1"]
    BulletListItem[77, 102] open:[77, 78, "-"] isTight
      Paragraph[79, 87]
        Text[79, 85] chars:[79, 85, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 11
- item 1
    - item 1.1
- item 2 
    - item 2.1 
- item 3 
    - item 3.1 

- item 4 
    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>item 4
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight
          Paragraph[15, 24]
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[24, 50] open:[24, 25, "-"] isTight
      Paragraph[26, 34]
        Text[26, 32] chars:[26, 32, "item 2"]
      BulletList[38, 50] isTight
        BulletListItem[38, 50] open:[38, 39, "-"] isTight
          Paragraph[40, 50]
            Text[40, 48] chars:[40, 48, "item 2.1"]
    BulletListItem[50, 76] open:[50, 51, "-"] isTight
      Paragraph[52, 60]
        Text[52, 58] chars:[52, 58, "item 3"]
      BulletList[64, 76] isTight
        BulletListItem[64, 76] open:[64, 65, "-"] isTight hadBlankLineAfter
          Paragraph[66, 76] isTrailingBlankLine
            Text[66, 74] chars:[66, 74, "item 3.1"]
    BulletListItem[77, 102] open:[77, 78, "-"] isTight
      Paragraph[79, 87]
        Text[79, 85] chars:[79, 85, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


```````````````````````````````` example Loose Item Handling: 12
- item 1
    - item 1.1
- item 2 
    - item 2.1 
- item 3 
    - item 3.1 
- item 4 

    - item 4.1 
.
<ul>
    <li>item 1
        <ul>
            <li>item 1.1</li>
        </ul>
    </li>
    <li>item 2
        <ul>
            <li>item 2.1</li>
        </ul>
    </li>
    <li>item 3
        <ul>
            <li>item 3.1</li>
        </ul>
    </li>
    <li>
        <p>item 4</p>
        <ul>
            <li>item 4.1</li>
        </ul>
    </li>
</ul>
.
Document[0, 102]
  BulletList[0, 102] isTight
    BulletListItem[0, 24] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 24] isTight
        BulletListItem[13, 24] open:[13, 14, "-"] isTight
          Paragraph[15, 24]
            Text[15, 23] chars:[15, 23, "item 1.1"]
    BulletListItem[24, 50] open:[24, 25, "-"] isTight
      Paragraph[26, 34]
        Text[26, 32] chars:[26, 32, "item 2"]
      BulletList[38, 50] isTight
        BulletListItem[38, 50] open:[38, 39, "-"] isTight
          Paragraph[40, 50]
            Text[40, 48] chars:[40, 48, "item 2.1"]
    BulletListItem[50, 76] open:[50, 51, "-"] isTight
      Paragraph[52, 60]
        Text[52, 58] chars:[52, 58, "item 3"]
      BulletList[64, 76] isTight
        BulletListItem[64, 76] open:[64, 65, "-"] isTight
          Paragraph[66, 76]
            Text[66, 74] chars:[66, 74, "item 3.1"]
    BulletListItem[76, 102] open:[76, 77, "-"] isLoose hadBlankLineAfter
      Paragraph[78, 86] isTrailingBlankLine
        Text[78, 84] chars:[78, 84, "item 4"]
      BulletList[91, 102] isTight
        BulletListItem[91, 102] open:[91, 92, "-"] isTight
          Paragraph[93, 102]
            Text[93, 101] chars:[93, 101, "item 4.1"]
````````````````````````````````


## List Item Interrupts Paragraph

Test to see which list items can interrupt paragraphs.

```````````````````````````````` example List Item Interrupts Paragraph: 1
Bullet item can interrupt paragraph
* item

Empty bullet item with space can interrupt paragraph 
* 

Empty bullet item without space can interrupt paragraph
*

Numbered one item can interrupt paragraph
1. one item

Empty Numbered one item with space can interrupt paragraph
1. 

Empty Numbered one item without space can interrupt paragraph
1.

Numbered non-one item can interrupt paragraph
2. non-one item

Empty Numbered non-one item with space can interrupt paragraph
2. 

Empty Numbered non-one item without space can interrupt paragraph
2.

.
<p>Bullet item can interrupt paragraph * item</p>
<p>Empty bullet item with space can interrupt paragraph *</p>
<p>Empty bullet item without space can interrupt paragraph *</p>
<p>Numbered one item can interrupt paragraph 1. one item</p>
<p>Empty Numbered one item with space can interrupt paragraph 1.</p>
<p>Empty Numbered one item without space can interrupt paragraph 1.</p>
<p>Numbered non-one item can interrupt paragraph 2. non-one item</p>
<p>Empty Numbered non-one item with space can interrupt paragraph 2.</p>
<p>Empty Numbered non-one item without space can interrupt paragraph 2.</p>
.
Document[0, 547]
  Paragraph[0, 43] isTrailingBlankLine
    Text[0, 35] chars:[0, 35, "Bulle … graph"]
    SoftLineBreak[35, 36]
    Text[36, 42] chars:[36, 42, "* item"]
  Paragraph[44, 101] isTrailingBlankLine
    Text[44, 96] chars:[44, 96, "Empty … graph"]
    SoftLineBreak[97, 98]
    Text[98, 99] chars:[98, 99, "*"]
  Paragraph[102, 160] isTrailingBlankLine
    Text[102, 157] chars:[102, 157, "Empty … graph"]
    SoftLineBreak[157, 158]
    Text[158, 159] chars:[158, 159, "*"]
  Paragraph[161, 215] isTrailingBlankLine
    Text[161, 202] chars:[161, 202, "Numbe … graph"]
    SoftLineBreak[202, 203]
    Text[203, 214] chars:[203, 214, "1. on …  item"]
  Paragraph[216, 279] isTrailingBlankLine
    Text[216, 274] chars:[216, 274, "Empty … graph"]
    SoftLineBreak[274, 275]
    Text[275, 277] chars:[275, 277, "1."]
  Paragraph[280, 345] isTrailingBlankLine
    Text[280, 341] chars:[280, 341, "Empty … graph"]
    SoftLineBreak[341, 342]
    Text[342, 344] chars:[342, 344, "1."]
  Paragraph[346, 408] isTrailingBlankLine
    Text[346, 391] chars:[346, 391, "Numbe … graph"]
    SoftLineBreak[391, 392]
    Text[392, 407] chars:[392, 407, "2. no …  item"]
  Paragraph[409, 476] isTrailingBlankLine
    Text[409, 471] chars:[409, 471, "Empty … graph"]
    SoftLineBreak[471, 472]
    Text[472, 474] chars:[472, 474, "2."]
  Paragraph[477, 546] isTrailingBlankLine
    Text[477, 542] chars:[477, 542, "Empty … graph"]
    SoftLineBreak[542, 543]
    Text[543, 545] chars:[543, 545, "2."]
````````````````````````````````


Test to see which list items can interrupt another bullet list item's paragraphs

```````````````````````````````` example List Item Interrupts Paragraph: 2
* Bullet item can interrupt paragraph of a bullet list item
* item

<!--List Break-->

* Empty bullet item with space can interrupt paragraph of a bullet list item
* 

<!--List Break-->

* Empty bullet item without space can interrupt paragraph of a bullet list item
*

<!--List Break-->

* Numbered one item can interrupt paragraph of a bullet list item
1. one item

<!--List Break-->

* Empty Numbered one item with space can interrupt paragraph of a bullet list item
1. 

<!--List Break-->

* Empty Numbered one item without space can interrupt paragraph of a bullet list item
1.

<!--List Break-->

* Numbered non-one item can interrupt paragraph of a bullet list item
2. non-one item

<!--List Break-->

* Empty Numbered non-one item with space can interrupt paragraph of a bullet list item
2. 

<!--List Break-->

* Empty Numbered non-one item without space can interrupt paragraph of a bullet list item
2.

.
<ul>
    <li>Bullet item can interrupt paragraph of a bullet list item</li>
    <li>item</li>
</ul>
<!--List Break-->
<ul>
    <li>Empty bullet item with space can interrupt paragraph of a bullet list item</li>
    <li></li>
</ul>
<!--List Break-->
<ul>
    <li>Empty bullet item without space can interrupt paragraph of a bullet list item</li>
    <li></li>
</ul>
<!--List Break-->
<ul>
    <li>Numbered one item can interrupt paragraph of a bullet list item</li>
    <li>one item</li>
</ul>
<!--List Break-->
<ul>
    <li>Empty Numbered one item with space can interrupt paragraph of a bullet list item</li>
    <li></li>
</ul>
<!--List Break-->
<ul>
    <li>Empty Numbered one item without space can interrupt paragraph of a bullet list item</li>
    <li></li>
</ul>
<!--List Break-->
<ul>
    <li>Numbered non-one item can interrupt paragraph of a bullet list item</li>
    <li>non-one item</li>
</ul>
<!--List Break-->
<ul>
    <li>Empty Numbered non-one item with space can interrupt paragraph of a bullet list item</li>
    <li></li>
</ul>
<!--List Break-->
<ul>
    <li>Empty Numbered non-one item without space can interrupt paragraph of a bullet list item</li>
    <li></li>
</ul>
.
Document[0, 914]
  BulletList[0, 67] isTight
    BulletListItem[0, 60] open:[0, 1, "*"] isTight
      Paragraph[2, 60]
        Text[2, 59] chars:[2, 59, "Bulle …  item"]
    BulletListItem[60, 67] open:[60, 61, "*"] isTight hadBlankLineAfter
      Paragraph[62, 67] isTrailingBlankLine
        Text[62, 66] chars:[62, 66, "item"]
  HtmlCommentBlock[68, 86]
  BulletList[87, 165] isTight
    BulletListItem[87, 164] open:[87, 88, "*"] isTight
      Paragraph[89, 164]
        Text[89, 163] chars:[89, 163, "Empty …  item"]
    BulletListItem[164, 165] open:[164, 165, "*"] isTight hadBlankLineAfter
  HtmlCommentBlock[168, 186]
  BulletList[187, 268] isTight
    BulletListItem[187, 267] open:[187, 188, "*"] isTight
      Paragraph[189, 267]
        Text[189, 266] chars:[189, 266, "Empty …  item"]
    BulletListItem[267, 268] open:[267, 268, "*"] isTight hadBlankLineAfter
  HtmlCommentBlock[270, 288]
  BulletList[289, 367] isTight
    BulletListItem[289, 355] open:[289, 290, "*"] isTight
      Paragraph[291, 355]
        Text[291, 354] chars:[291, 354, "Numbe …  item"]
    OrderedListItem[355, 367] open:[355, 357, "1."] isTight hadBlankLineAfter
      Paragraph[358, 367] isTrailingBlankLine
        Text[358, 366] chars:[358, 366, "one item"]
  HtmlCommentBlock[368, 386]
  BulletList[387, 472] isTight
    BulletListItem[387, 470] open:[387, 388, "*"] isTight
      Paragraph[389, 470]
        Text[389, 469] chars:[389, 469, "Empty …  item"]
    OrderedListItem[470, 472] open:[470, 472, "1."] isTight hadBlankLineAfter
  HtmlCommentBlock[475, 493]
  BulletList[494, 582] isTight
    BulletListItem[494, 580] open:[494, 495, "*"] isTight
      Paragraph[496, 580]
        Text[496, 579] chars:[496, 579, "Empty …  item"]
    OrderedListItem[580, 582] open:[580, 582, "1."] isTight hadBlankLineAfter
  HtmlCommentBlock[584, 602]
  BulletList[603, 689] isTight
    BulletListItem[603, 673] open:[603, 604, "*"] isTight
      Paragraph[605, 673]
        Text[605, 672] chars:[605, 672, "Numbe …  item"]
    OrderedListItem[673, 689] open:[673, 675, "2."] isTight hadBlankLineAfter
      Paragraph[676, 689] isTrailingBlankLine
        Text[676, 688] chars:[676, 688, "non-o …  item"]
  HtmlCommentBlock[690, 708]
  BulletList[709, 798] isTight
    BulletListItem[709, 796] open:[709, 710, "*"] isTight
      Paragraph[711, 796]
        Text[711, 795] chars:[711, 795, "Empty …  item"]
    OrderedListItem[796, 798] open:[796, 798, "2."] isTight hadBlankLineAfter
  HtmlCommentBlock[801, 819]
  BulletList[820, 912] isTight
    BulletListItem[820, 910] open:[820, 821, "*"] isTight
      Paragraph[822, 910]
        Text[822, 909] chars:[822, 909, "Empty …  item"]
    OrderedListItem[910, 912] open:[910, 912, "2."] isTight hadBlankLineAfter
````````````````````````````````


Test to see which list items can interrupt another numbered list item's paragraphs

```````````````````````````````` example List Item Interrupts Paragraph: 3
1. Bullet item can interrupt paragraph of a numbered list item
* item

<!--List Break-->

1. Empty bullet item with space can interrupt paragraph of a numbered list item
* 

<!--List Break-->

1. Empty bullet item without space can interrupt paragraph of a numbered list item
*

<!--List Break-->

1. Numbered one item can interrupt paragraph of a numbered list item
1. one item

<!--List Break-->

1. Empty Numbered one item with space can interrupt paragraph of a numbered list item 
1. 

<!--List Break-->

1. Empty Numbered one item without space can interrupt paragraph of a numbered list item 
1.

<!--List Break-->

1. Numbered non-one item can interrupt paragraph of a numbered list item
2. non-one item

<!--List Break-->

1. Empty Numbered non-one item with space can interrupt paragraph of a numbered list item
2. 

<!--List Break-->

1. Empty Numbered non-one item without space can interrupt paragraph of a numbered list item
2.

.
<ol>
    <li>Bullet item can interrupt paragraph of a numbered list item</li>
    <li>item</li>
</ol>
<!--List Break-->
<ol>
    <li>Empty bullet item with space can interrupt paragraph of a numbered list item</li>
    <li></li>
</ol>
<!--List Break-->
<ol>
    <li>Empty bullet item without space can interrupt paragraph of a numbered list item</li>
    <li></li>
</ol>
<!--List Break-->
<ol>
    <li>Numbered one item can interrupt paragraph of a numbered list item</li>
    <li>one item</li>
</ol>
<!--List Break-->
<ol>
    <li>Empty Numbered one item with space can interrupt paragraph of a numbered list item</li>
    <li></li>
</ol>
<!--List Break-->
<ol>
    <li>Empty Numbered one item without space can interrupt paragraph of a numbered list item</li>
    <li></li>
</ol>
<!--List Break-->
<ol>
    <li>Numbered non-one item can interrupt paragraph of a numbered list item</li>
    <li>non-one item</li>
</ol>
<!--List Break-->
<ol>
    <li>Empty Numbered non-one item with space can interrupt paragraph of a numbered list item</li>
    <li></li>
</ol>
<!--List Break-->
<ol>
    <li>Empty Numbered non-one item without space can interrupt paragraph of a numbered list item</li>
    <li></li>
</ol>
.
Document[0, 943]
  OrderedList[0, 70] isTight delimiter:'.'
    OrderedListItem[0, 63] open:[0, 2, "1."] isTight
      Paragraph[3, 63]
        Text[3, 62] chars:[3, 62, "Bulle …  item"]
    BulletListItem[63, 70] open:[63, 64, "*"] isTight hadBlankLineAfter
      Paragraph[65, 70] isTrailingBlankLine
        Text[65, 69] chars:[65, 69, "item"]
  HtmlCommentBlock[71, 89]
  OrderedList[90, 171] isTight delimiter:'.'
    OrderedListItem[90, 170] open:[90, 92, "1."] isTight
      Paragraph[93, 170]
        Text[93, 169] chars:[93, 169, "Empty …  item"]
    BulletListItem[170, 171] open:[170, 171, "*"] isTight hadBlankLineAfter
  HtmlCommentBlock[174, 192]
  OrderedList[193, 277] isTight delimiter:'.'
    OrderedListItem[193, 276] open:[193, 195, "1."] isTight
      Paragraph[196, 276]
        Text[196, 275] chars:[196, 275, "Empty …  item"]
    BulletListItem[276, 277] open:[276, 277, "*"] isTight hadBlankLineAfter
  HtmlCommentBlock[279, 297]
  OrderedList[298, 379] isTight delimiter:'.'
    OrderedListItem[298, 367] open:[298, 300, "1."] isTight
      Paragraph[301, 367]
        Text[301, 366] chars:[301, 366, "Numbe …  item"]
    OrderedListItem[367, 379] open:[367, 369, "1."] isTight hadBlankLineAfter
      Paragraph[370, 379] isTrailingBlankLine
        Text[370, 378] chars:[370, 378, "one item"]
  HtmlCommentBlock[380, 398]
  OrderedList[399, 488] isTight delimiter:'.'
    OrderedListItem[399, 486] open:[399, 401, "1."] isTight
      Paragraph[402, 486]
        Text[402, 484] chars:[402, 484, "Empty …  item"]
    OrderedListItem[486, 488] open:[486, 488, "1."] isTight hadBlankLineAfter
  HtmlCommentBlock[491, 509]
  OrderedList[510, 602] isTight delimiter:'.'
    OrderedListItem[510, 600] open:[510, 512, "1."] isTight
      Paragraph[513, 600]
        Text[513, 598] chars:[513, 598, "Empty …  item"]
    OrderedListItem[600, 602] open:[600, 602, "1."] isTight hadBlankLineAfter
  HtmlCommentBlock[604, 622]
  OrderedList[623, 712] isTight delimiter:'.'
    OrderedListItem[623, 696] open:[623, 625, "1."] isTight
      Paragraph[626, 696]
        Text[626, 695] chars:[626, 695, "Numbe …  item"]
    OrderedListItem[696, 712] open:[696, 698, "2."] isTight hadBlankLineAfter
      Paragraph[699, 712] isTrailingBlankLine
        Text[699, 711] chars:[699, 711, "non-o …  item"]
  HtmlCommentBlock[713, 731]
  OrderedList[732, 824] isTight delimiter:'.'
    OrderedListItem[732, 822] open:[732, 734, "1."] isTight
      Paragraph[735, 822]
        Text[735, 821] chars:[735, 821, "Empty …  item"]
    OrderedListItem[822, 824] open:[822, 824, "2."] isTight hadBlankLineAfter
  HtmlCommentBlock[827, 845]
  OrderedList[846, 941] isTight delimiter:'.'
    OrderedListItem[846, 939] open:[846, 848, "1."] isTight
      Paragraph[849, 939]
        Text[849, 938] chars:[849, 938, "Empty …  item"]
    OrderedListItem[939, 941] open:[939, 941, "2."] isTight hadBlankLineAfter
````````````````````````````````


## List Item Indent Handling

Test if list item indent handling for edge cases

```````````````````````````````` example List Item Indent Handling: 1
* item 1
 * item 2
  * item 3
   * item 4
    * item 5
     * item 6
      * item 7
       * item 8
        * item 9
.
<ul>
    <li>item 1</li>
    <li>item 2</li>
    <li>item 3</li>
    <li>item 4
        <ul>
            <li>item 5</li>
            <li>item 6</li>
            <li>item 7</li>
            <li>item 8
                <ul>
                    <li>item 9</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>
.
Document[0, 116]
  BulletList[0, 116] isTight
    BulletListItem[0, 9] open:[0, 1, "*"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
    BulletListItem[10, 19] open:[10, 11, "*"] isTight
      Paragraph[12, 19]
        Text[12, 18] chars:[12, 18, "item 2"]
    BulletListItem[21, 30] open:[21, 22, "*"] isTight
      Paragraph[23, 30]
        Text[23, 29] chars:[23, 29, "item 3"]
    BulletListItem[33, 116] open:[33, 34, "*"] isTight
      Paragraph[35, 42]
        Text[35, 41] chars:[35, 41, "item 4"]
      BulletList[46, 116] isTight
        BulletListItem[46, 55] open:[46, 47, "*"] isTight
          Paragraph[48, 55]
            Text[48, 54] chars:[48, 54, "item 5"]
        BulletListItem[60, 69] open:[60, 61, "*"] isTight
          Paragraph[62, 69]
            Text[62, 68] chars:[62, 68, "item 6"]
        BulletListItem[75, 84] open:[75, 76, "*"] isTight
          Paragraph[77, 84]
            Text[77, 83] chars:[77, 83, "item 7"]
        BulletListItem[91, 116] open:[91, 92, "*"] isTight
          Paragraph[93, 100]
            Text[93, 99] chars:[93, 99, "item 8"]
          BulletList[108, 116] isTight
            BulletListItem[108, 116] open:[108, 109, "*"] isTight
              Paragraph[110, 116]
                Text[110, 116] chars:[110, 116, "item 9"]
````````````````````````````````


```````````````````````````````` example List Item Indent Handling: 2
* item 1

 * item 2
 
  * item 3
  
   * item 4
   
    * item 5
    
     * item 6
     
      * item 7
      
       * item 8
       
        * item 9
.
<ul>
    <li>
        <p>item 1</p>
    </li>
    <li>
        <p>item 2</p>
    </li>
    <li>
        <p>item 3</p>
    </li>
    <li>
        <p>item 4</p>
        <ul>
            <li>
                <p>item 5</p>
            </li>
            <li>
                <p>item 6</p>
            </li>
            <li>
                <p>item 7</p>
            </li>
            <li>
                <p>item 8</p>
                <ul>
                    <li>item 9</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>
.
Document[0, 152]
  BulletList[0, 152] isTight
    BulletListItem[0, 9] open:[0, 1, "*"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
    BulletListItem[11, 20] open:[11, 12, "*"] isLoose hadBlankLineAfter
      Paragraph[13, 20] isTrailingBlankLine
        Text[13, 19] chars:[13, 19, "item 2"]
    BulletListItem[24, 33] open:[24, 25, "*"] isLoose hadBlankLineAfter
      Paragraph[26, 33] isTrailingBlankLine
        Text[26, 32] chars:[26, 32, "item 3"]
    BulletListItem[39, 152] open:[39, 40, "*"] isLoose hadBlankLineAfter
      Paragraph[41, 48] isTrailingBlankLine
        Text[41, 47] chars:[41, 47, "item 4"]
      BulletList[56, 152] isTight
        BulletListItem[56, 65] open:[56, 57, "*"] isLoose hadBlankLineAfter
          Paragraph[58, 65] isTrailingBlankLine
            Text[58, 64] chars:[58, 64, "item 5"]
        BulletListItem[75, 84] open:[75, 76, "*"] isLoose hadBlankLineAfter
          Paragraph[77, 84] isTrailingBlankLine
            Text[77, 83] chars:[77, 83, "item 6"]
        BulletListItem[96, 105] open:[96, 97, "*"] isLoose hadBlankLineAfter
          Paragraph[98, 105] isTrailingBlankLine
            Text[98, 104] chars:[98, 104, "item 7"]
        BulletListItem[119, 152] open:[119, 120, "*"] isLoose hadBlankLineAfter
          Paragraph[121, 128] isTrailingBlankLine
            Text[121, 127] chars:[121, 127, "item 8"]
          BulletList[144, 152] isTight
            BulletListItem[144, 152] open:[144, 145, "*"] isTight
              Paragraph[146, 152]
                Text[146, 152] chars:[146, 152, "item 9"]
````````````````````````````````


```````````````````````````````` example List Item Indent Handling: 3
*  item 1
 *  item 2
  *  item 3
   *  item 4
    *  item 5
     *  item 6
      *  item 7
       *  item 8
        *  item 9
.
<ul>
    <li>item 1</li>
    <li>item 2</li>
    <li>item 3</li>
    <li>item 4
        <ul>
            <li>item 5</li>
            <li>item 6</li>
            <li>item 7</li>
            <li>item 8
                <ul>
                    <li>item 9</li>
                </ul>
            </li>
        </ul>
    </li>
</ul>
.
Document[0, 125]
  BulletList[0, 125] isTight
    BulletListItem[0, 10] open:[0, 1, "*"] isTight
      Paragraph[3, 10]
        Text[3, 9] chars:[3, 9, "item 1"]
    BulletListItem[11, 21] open:[11, 12, "*"] isTight
      Paragraph[14, 21]
        Text[14, 20] chars:[14, 20, "item 2"]
    BulletListItem[23, 33] open:[23, 24, "*"] isTight
      Paragraph[26, 33]
        Text[26, 32] chars:[26, 32, "item 3"]
    BulletListItem[36, 125] open:[36, 37, "*"] isTight
      Paragraph[39, 46]
        Text[39, 45] chars:[39, 45, "item 4"]
      BulletList[50, 125] isTight
        BulletListItem[50, 60] open:[50, 51, "*"] isTight
          Paragraph[53, 60]
            Text[53, 59] chars:[53, 59, "item 5"]
        BulletListItem[65, 75] open:[65, 66, "*"] isTight
          Paragraph[68, 75]
            Text[68, 74] chars:[68, 74, "item 6"]
        BulletListItem[81, 91] open:[81, 82, "*"] isTight
          Paragraph[84, 91]
            Text[84, 90] chars:[84, 90, "item 7"]
        BulletListItem[98, 125] open:[98, 99, "*"] isTight
          Paragraph[101, 108]
            Text[101, 107] chars:[101, 107, "item 8"]
          BulletList[116, 125] isTight
            BulletListItem[116, 125] open:[116, 117, "*"] isTight
              Paragraph[119, 125]
                Text[119, 125] chars:[119, 125, "item 9"]
````````````````````````````````


Test shows where the boundary switch to indented code occurs. Sub-items first paragraph is a
paragraph, the second is indented code

```````````````````````````````` example List Item Indent Handling: 4
-   test
    - sub item

         sub item child para

          indented code
          
---

1.  test
    1. sub item

          sub item child para

           indented code

.
<ul>
    <li>test
        <ul>
            <li>
                <p>sub item</p>
                <p>sub item child para</p>
                <p>indented code</p>
            </li>
        </ul>
    </li>
</ul>
<hr />
<ol>
    <li>test
        <ol>
            <li>
                <p>sub item</p>
                <p>sub item child para</p>
                <p>indented code</p>
            </li>
        </ol>
    </li>
</ol>
.
Document[0, 178]
  BulletList[0, 79] isTight
    BulletListItem[0, 79] open:[0, 1, "-"] isTight hadBlankLine
      Paragraph[4, 9]
        Text[4, 8] chars:[4, 8, "test"]
      BulletList[13, 79] isTight
        BulletListItem[13, 79] open:[13, 14, "-"] isLoose hadBlankLineAfter
          Paragraph[15, 24] isTrailingBlankLine
            Text[15, 23] chars:[15, 23, "sub item"]
          Paragraph[34, 54] isTrailingBlankLine
            Text[34, 53] chars:[34, 53, "sub i …  para"]
          Paragraph[65, 79] isTrailingBlankLine
            Text[65, 78] chars:[65, 78, "inden …  code"]
  ThematicBreak[90, 93]
  OrderedList[95, 177] isTight delimiter:'.'
    OrderedListItem[95, 177] open:[95, 97, "1."] isTight hadBlankLine
      Paragraph[99, 104]
        Text[99, 103] chars:[99, 103, "test"]
      OrderedList[108, 177] isTight delimiter:'.'
        OrderedListItem[108, 177] open:[108, 110, "1."] isLoose hadBlankLineAfter
          Paragraph[111, 120] isTrailingBlankLine
            Text[111, 119] chars:[111, 119, "sub item"]
          Paragraph[131, 151] isTrailingBlankLine
            Text[131, 150] chars:[131, 150, "sub i …  para"]
          Paragraph[163, 177] isTrailingBlankLine
            Text[163, 176] chars:[163, 176, "inden …  code"]
````````````````````````````````


Test shows where the boundary switch to indented code occurs. Sub-items first paragraph is a
paragraph, the second is indented code

More extensive test to show where the boundary switch to indented code occurs. Sub-items first
paragraph is a paragraph, the second is indented code

```````````````````````````````` example List Item Indent Handling: 5
* item 1
    
  item para 1
  
   item para 2
   
    item para 3
    
     item para 4
     
      item para 5
      
       item para 6
       
        item para 7
        
 * item 2
    
   item para 1
   
    item para 2
    
     item para 3
     
      item para 4
      
       item para 5
       
        item para 6
        
         item para 7
        
  * item 3
    
    item para 1
    
     item para 2
     
      item para 3
      
       item para 4
       
        item para 5
        
         item para 6
         
          item para 7
        
   * item 4
    
     item para 1
     
      item para 2
      
       item para 3
       
        item para 4
        
         item para 5
         
          item para 6
          
           item para 7
        
    * item 5
    
      item para 1
  
       item para 2
   
        item para 3
    
         item para 4
     
          item para 5
      
           item para 6
       
            item para 7
.
<ul>
    <li>item 1</li>
</ul>
<p>item para 1</p>
<p>item para 2</p>
<pre><code>item para 3

 item para 4
 
  item para 5
  
   item para 6
   
    item para 7
</code></pre>
<ul>
    <li>item 2</li>
</ul>
<p>item para 1</p>
<pre><code>item para 2

 item para 3
 
  item para 4
  
   item para 5
   
    item para 6
    
     item para 7
</code></pre>
<ul>
    <li>
        <p>item 3</p>
        <p>item para 1</p>
        <p>item para 2</p>
        <p>item para 3</p>
        <p>item para 4</p>
        <pre><code>item para 5

 item para 6

  item para 7
</code></pre>
    </li>
    <li>
        <p>item 4</p>
        <p>item para 1</p>
        <p>item para 2</p>
        <p>item para 3</p>
        <pre><code>item para 4

 item para 5

  item para 6

   item para 7
</code></pre>
        <ul>
            <li>item 5</li>
        </ul>
        <p>item para 1</p>
        <p>item para 2</p>
        <pre><code>item para 3

 item para 4

  item para 5

   item para 6

    item para 7
</code></pre>
    </li>
</ul>
.
Document[0, 981]
  BulletList[0, 9] isTight
    BulletListItem[0, 9] open:[0, 1, "*"] isTight hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
  Paragraph[16, 28] isTrailingBlankLine
    Text[16, 27] chars:[16, 27, "item  … ara 1"]
  Paragraph[34, 46] isTrailingBlankLine
    Text[34, 45] chars:[34, 45, "item  … ara 2"]
  IndentedCodeBlock[54, 166]
  BulletList[176, 185] isTight
    BulletListItem[176, 185] open:[176, 177, "*"] isTight hadBlankLineAfter
      Paragraph[178, 185] isTrailingBlankLine
        Text[178, 184] chars:[178, 184, "item 2"]
  Paragraph[193, 205] isTrailingBlankLine
    Text[193, 204] chars:[193, 204, "item  … ara 1"]
  IndentedCodeBlock[213, 355]
  BulletList[366, 981] isTight
    BulletListItem[366, 558] open:[366, 367, "*"] isLoose hadBlankLineAfter
      Paragraph[368, 375] isTrailingBlankLine
        Text[368, 374] chars:[368, 374, "item 3"]
      Paragraph[384, 396] isTrailingBlankLine
        Text[384, 395] chars:[384, 395, "item  … ara 1"]
      Paragraph[406, 418] isTrailingBlankLine
        Text[406, 417] chars:[406, 417, "item  … ara 2"]
      Paragraph[430, 442] isTrailingBlankLine
        Text[430, 441] chars:[430, 441, "item  … ara 3"]
      Paragraph[456, 468] isTrailingBlankLine
        Text[456, 467] chars:[456, 467, "item  … ara 4"]
      IndentedCodeBlock[484, 558]
    BulletListItem[570, 981] open:[570, 571, "*"] isLoose hadBlankLineAfter
      Paragraph[572, 579] isTrailingBlankLine
        Text[572, 578] chars:[572, 578, "item 4"]
      Paragraph[589, 601] isTrailingBlankLine
        Text[589, 600] chars:[589, 600, "item  … ara 1"]
      Paragraph[613, 625] isTrailingBlankLine
        Text[613, 624] chars:[613, 624, "item  … ara 2"]
      Paragraph[639, 651] isTrailingBlankLine
        Text[639, 650] chars:[639, 650, "item  … ara 3"]
      IndentedCodeBlock[667, 775]
      BulletList[788, 797] isTight
        BulletListItem[788, 797] open:[788, 789, "*"] isTight hadBlankLineAfter
          Paragraph[790, 797] isTrailingBlankLine
            Text[790, 796] chars:[790, 796, "item 5"]
      Paragraph[808, 820] isTrailingBlankLine
        Text[808, 819] chars:[808, 819, "item  … ara 1"]
      Paragraph[830, 842] isTrailingBlankLine
        Text[830, 841] chars:[830, 841, "item  … ara 2"]
      IndentedCodeBlock[854, 981]
````````````````````````````````


Test for how items with indent > first list item's indent but < previous item's content indent
are handled. Mainly, if they are handled in a weird way of treating the item as a sub-item of
the previous list item. There was one that did it that way, GitHub comments if I can remember
right, but now they switched to commonmark list handling with mods. Guess it is now GFC--GitHub
Flavoured Commonmark.

```````````````````````````````` example List Item Indent Handling: 6
*  item 1
   * item 2
  * item 3
.
<ul>
    <li>item 1</li>
    <li>item 2</li>
    <li>item 3</li>
</ul>
.
Document[0, 32]
  BulletList[0, 32] isTight
    BulletListItem[0, 10] open:[0, 1, "*"] isTight
      Paragraph[3, 10]
        Text[3, 9] chars:[3, 9, "item 1"]
    BulletListItem[13, 22] open:[13, 14, "*"] isTight
      Paragraph[15, 22]
        Text[15, 21] chars:[15, 21, "item 2"]
    BulletListItem[24, 32] open:[24, 25, "*"] isTight
      Paragraph[26, 32]
        Text[26, 32] chars:[26, 32, "item 3"]
````````````````````````````````


Test how headings in list items are handled, leading space allowed or not

```````````````````````````````` example List Item Indent Handling: 7
* item 1

    # Heading 1
    
     ## Heading 2
    
      ### Heading 3
    
       #### Heading 4
    
        ##### Heading 5
    
         ###### Heading 6

    * item 2

        # Heading 1
        
         ## Heading 2
        
          ### Heading 3
        
           #### Heading 3
        
            ##### Heading 5
          
             ###### Heading 6

.
<ul>
    <li>
        <p>item 1</p>
        <h1 id="heading1">Heading 1</h1>
        <h2 id="heading2">Heading 2</h2>
        <h3 id="heading3">Heading 3</h3>
        <h4 id="heading4">Heading 4</h4>
        <pre><code>##### Heading 5

 ###### Heading 6
</code></pre>
        <ul>
            <li>
                <p>item 2</p>
                <h1 id="heading1">Heading 1</h1>
                <h2 id="heading2">Heading 2</h2>
                <h3 id="heading3">Heading 3</h3>
                <h4 id="heading3">Heading 3</h4>
                <pre><code>##### Heading 5

 ###### Heading 6
</code></pre>
            </li>
        </ul>
    </li>
</ul>
.
Document[0, 374]
  BulletList[0, 373] isTight
    BulletListItem[0, 373] open:[0, 1, "*"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
      Heading[14, 25] textOpen:[14, 15, "#"] text:[16, 25, "Heading 1"]
        Text[16, 25] chars:[16, 25, "Heading 1"]
      Heading[36, 48] textOpen:[36, 38, "##"] text:[39, 48, "Heading 2"]
        Text[39, 48] chars:[39, 48, "Heading 2"]
      Heading[60, 73] textOpen:[60, 63, "###"] text:[64, 73, "Heading 3"]
        Text[64, 73] chars:[64, 73, "Heading 3"]
      Heading[86, 100] textOpen:[86, 90, "####"] text:[91, 100, "Heading 4"]
        Text[91, 100] chars:[91, 100, "Heading 4"]
      IndentedCodeBlock[114, 161]
      BulletList[166, 373] isTight
        BulletListItem[166, 373] open:[166, 167, "*"] isLoose hadBlankLineAfter
          Paragraph[168, 175] isTrailingBlankLine
            Text[168, 174] chars:[168, 174, "item 2"]
          Heading[184, 195] textOpen:[184, 185, "#"] text:[186, 195, "Heading 1"]
            Text[186, 195] chars:[186, 195, "Heading 1"]
          Heading[214, 226] textOpen:[214, 216, "##"] text:[217, 226, "Heading 2"]
            Text[217, 226] chars:[217, 226, "Heading 2"]
          Heading[246, 259] textOpen:[246, 249, "###"] text:[250, 259, "Heading 3"]
            Text[250, 259] chars:[250, 259, "Heading 3"]
          Heading[280, 294] textOpen:[280, 284, "####"] text:[285, 294, "Heading 3"]
            Text[285, 294] chars:[285, 294, "Heading 3"]
          IndentedCodeBlock[316, 373]
````````````````````````````````


## Block quote parsing

Whether blank lines are required to start a block quote

```````````````````````````````` example Block quote parsing: 1
paragraph text
> block quoted text
.
<p>paragraph text</p>
<blockquote>
    <p>block quoted text</p>
</blockquote>
.
Document[0, 34]
  Paragraph[0, 15]
    Text[0, 14] chars:[0, 14, "parag …  text"]
  BlockQuote[15, 34] marker:[15, 16, ">"]
    Paragraph[17, 34]
      Text[17, 34] chars:[17, 34, "block …  text"]
````````````````````````````````


Whether blank lines are required to start a block quote

```````````````````````````````` example Block quote parsing: 2
paragraph text

> block quoted text
.
<p>paragraph text</p>
<blockquote>
    <p>block quoted text</p>
</blockquote>
.
Document[0, 35]
  Paragraph[0, 15] isTrailingBlankLine
    Text[0, 14] chars:[0, 14, "parag …  text"]
  BlockQuote[16, 35] marker:[16, 17, ">"]
    Paragraph[18, 35]
      Text[18, 35] chars:[18, 35, "block …  text"]
````````````````````````````````


Whether blank lines are ignored and treated as if prefixed with block quote

```````````````````````````````` example Block quote parsing: 3
> block quoted text

> more block quoted text
.
<blockquote>
    <p>block quoted text</p>
    <p>more block quoted text</p>
</blockquote>
.
Document[0, 45]
  BlockQuote[0, 45] marker:[0, 1, ">"]
    Paragraph[2, 20] isTrailingBlankLine
      Text[2, 19] chars:[2, 19, "block …  text"]
    Paragraph[23, 45]
      Text[23, 45] chars:[23, 45, "more  …  text"]
````````````````````````````````


Whether block quotes continue to a blank line

```````````````````````````````` example Block quote parsing: 4
> block quoted text
lazy continuation

another paragraph
.
<blockquote>
    <p>block quoted text lazy continuation</p>
</blockquote>
<p>another paragraph</p>
.
Document[0, 56]
  BlockQuote[0, 38] marker:[0, 1, ">"]
    Paragraph[2, 38] isTrailingBlankLine
      Text[2, 19] chars:[2, 19, "block …  text"]
      SoftLineBreak[19, 20]
      Text[20, 37] chars:[20, 37, "lazy  … ation"]
  Paragraph[39, 56]
    Text[39, 56] chars:[39, 56, "anoth … graph"]
````````````````````````````````


Whether leading spaces are allowed before block quote marker

```````````````````````````````` example Block quote parsing: 5
 > block quote paragraph text
.
<blockquote>
    <p>block quote paragraph text</p>
</blockquote>
.
Document[0, 29]
  BlockQuote[1, 29] marker:[1, 2, ">"]
    Paragraph[3, 29]
      Text[3, 29] chars:[3, 29, "block …  text"]
````````````````````````````````


Whether trailing spaces are required after block quote marker

```````````````````````````````` example Block quote parsing: 6
>block quote paragraph text
.
<blockquote>
    <p>block quote paragraph text</p>
</blockquote>
.
Document[0, 27]
  BlockQuote[0, 27] marker:[0, 1, ">"]
    Paragraph[1, 27]
      Text[1, 27] chars:[1, 27, "block …  text"]
````````````````````````````````


Whether block quotes can interrupt item paragraph

```````````````````````````````` example Block quote parsing: 7
* item 1
    > block quoted text

<!-- list break -->

1. item 1
    > block quoted text

.
<ul>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ul>
<!-- list break -->
<ol>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ol>
.
Document[0, 90]
  BulletList[0, 33] isLoose
    BulletListItem[0, 33] open:[0, 1, "*"] isLoose
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BlockQuote[13, 33] marker:[13, 14, ">"]
        Paragraph[15, 33] isTrailingBlankLine
          Text[15, 32] chars:[15, 32, "block …  text"]
  HtmlCommentBlock[34, 54]
  OrderedList[55, 89] isLoose delimiter:'.'
    OrderedListItem[55, 89] open:[55, 57, "1."] isLoose
      Paragraph[58, 65]
        Text[58, 64] chars:[58, 64, "item 1"]
      BlockQuote[69, 89] marker:[69, 70, ">"]
        Paragraph[71, 89] isTrailingBlankLine
          Text[71, 88] chars:[71, 88, "block …  text"]
````````````````````````````````


Whether block quotes can interrupt item paragraph

```````````````````````````````` example Block quote parsing: 8
* item 1

    > block quoted text

<!-- list break -->

1. item 1

    > block quoted text

.
<ul>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ul>
<!-- list break -->
<ol>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ol>
.
Document[0, 92]
  BulletList[0, 34] isLoose
    BulletListItem[0, 34] open:[0, 1, "*"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
      BlockQuote[14, 34] marker:[14, 15, ">"]
        Paragraph[16, 34] isTrailingBlankLine
          Text[16, 33] chars:[16, 33, "block …  text"]
  HtmlCommentBlock[35, 55]
  OrderedList[56, 91] isLoose delimiter:'.'
    OrderedListItem[56, 91] open:[56, 58, "1."] isLoose hadBlankLineAfter
      Paragraph[59, 66] isTrailingBlankLine
        Text[59, 65] chars:[59, 65, "item 1"]
      BlockQuote[71, 91] marker:[71, 72, ">"]
        Paragraph[73, 91] isTrailingBlankLine
          Text[73, 90] chars:[73, 90, "block …  text"]
````````````````````````````````


Whether block quotes with leading space can interrupt item paragraphs

```````````````````````````````` example Block quote parsing: 9
* item 1
     > block quoted text

<!-- list break -->

1. item 1
     > block quoted text

.
<ul>
    <li>item 1 &gt; block quoted text</li>
</ul>
<!-- list break -->
<ol>
    <li>item 1 &gt; block quoted text</li>
</ol>
.
Document[0, 92]
  BulletList[0, 34] isTight
    BulletListItem[0, 34] open:[0, 1, "*"] isTight hadBlankLineAfter
      Paragraph[2, 34] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
        SoftLineBreak[8, 9]
        Text[14, 33] chars:[14, 33, "> blo …  text"]
  HtmlCommentBlock[35, 55]
  OrderedList[56, 91] isTight delimiter:'.'
    OrderedListItem[56, 91] open:[56, 58, "1."] isTight hadBlankLineAfter
      Paragraph[59, 91] isTrailingBlankLine
        Text[59, 65] chars:[59, 65, "item 1"]
        SoftLineBreak[65, 66]
        Text[71, 90] chars:[71, 90, "> blo …  text"]
````````````````````````````````


Whether block quotes with leading space can interrupt item paragraph

```````````````````````````````` example Block quote parsing: 10
* item 1

     > block quoted text

<!-- list break -->

1. item 1

     > block quoted text

.
<ul>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ul>
<!-- list break -->
<ol>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ol>
.
Document[0, 94]
  BulletList[0, 35] isLoose
    BulletListItem[0, 35] open:[0, 1, "*"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
      BlockQuote[15, 35] marker:[15, 16, ">"]
        Paragraph[17, 35] isTrailingBlankLine
          Text[17, 34] chars:[17, 34, "block …  text"]
  HtmlCommentBlock[36, 56]
  OrderedList[57, 93] isLoose delimiter:'.'
    OrderedListItem[57, 93] open:[57, 59, "1."] isLoose hadBlankLineAfter
      Paragraph[60, 67] isTrailingBlankLine
        Text[60, 66] chars:[60, 66, "item 1"]
      BlockQuote[73, 93] marker:[73, 74, ">"]
        Paragraph[75, 93] isTrailingBlankLine
          Text[75, 92] chars:[75, 92, "block …  text"]
````````````````````````````````


Whether block quotes without trailing space can interrupt item paragraphs

```````````````````````````````` example Block quote parsing: 11
* item 1
    >block quoted text

<!-- list break -->

1. item 1
    >block quoted text

.
<ul>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ul>
<!-- list break -->
<ol>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ol>
.
Document[0, 88]
  BulletList[0, 32] isLoose
    BulletListItem[0, 32] open:[0, 1, "*"] isLoose
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BlockQuote[13, 32] marker:[13, 14, ">"]
        Paragraph[14, 32] isTrailingBlankLine
          Text[14, 31] chars:[14, 31, "block …  text"]
  HtmlCommentBlock[33, 53]
  OrderedList[54, 87] isLoose delimiter:'.'
    OrderedListItem[54, 87] open:[54, 56, "1."] isLoose
      Paragraph[57, 64]
        Text[57, 63] chars:[57, 63, "item 1"]
      BlockQuote[68, 87] marker:[68, 69, ">"]
        Paragraph[69, 87] isTrailingBlankLine
          Text[69, 86] chars:[69, 86, "block …  text"]
````````````````````````````````


Whether block quotes without trailing space can interrupt item paragraph

```````````````````````````````` example Block quote parsing: 12
* item 1

    >block quoted text

<!-- list break -->

1. item 1

    >block quoted text

.
<ul>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ul>
<!-- list break -->
<ol>
    <li>
        <p>item 1</p>
        <blockquote>
            <p>block quoted text</p>
        </blockquote>
    </li>
</ol>
.
Document[0, 90]
  BulletList[0, 33] isLoose
    BulletListItem[0, 33] open:[0, 1, "*"] isLoose hadBlankLineAfter
      Paragraph[2, 9] isTrailingBlankLine
        Text[2, 8] chars:[2, 8, "item 1"]
      BlockQuote[14, 33] marker:[14, 15, ">"]
        Paragraph[15, 33] isTrailingBlankLine
          Text[15, 32] chars:[15, 32, "block …  text"]
  HtmlCommentBlock[34, 54]
  OrderedList[55, 89] isLoose delimiter:'.'
    OrderedListItem[55, 89] open:[55, 57, "1."] isLoose hadBlankLineAfter
      Paragraph[58, 65] isTrailingBlankLine
        Text[58, 64] chars:[58, 64, "item 1"]
      BlockQuote[70, 89] marker:[70, 71, ">"]
        Paragraph[71, 89] isTrailingBlankLine
          Text[71, 88] chars:[71, 88, "block …  text"]
````````````````````````````````


Test to make sure content indented deeply nested lists process correctly

```````````````````````````````` example Block quote parsing: 13
- item 1
    - item 2
        - item 3
            - item 4
                - item 5
                    - item 6
                        - item 7
                            - item 8
                                - item 9

.
<ul>
    <li>item 1
        <ul>
            <li>item 2
                <ul>
                    <li>item 3
                        <ul>
                            <li>item 4
                                <ul>
                                    <li>item 5
                                        <ul>
                                            <li>item 6
                                                <ul>
                                                    <li>item 7
                                                        <ul>
                                                            <li>item 8
                                                                <ul>
                                                                    <li>item 9</li>
                                                                </ul>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
    </li>
</ul>
.
Document[0, 226]
  BulletList[0, 225] isTight
    BulletListItem[0, 225] open:[0, 1, "-"] isTight
      Paragraph[2, 9]
        Text[2, 8] chars:[2, 8, "item 1"]
      BulletList[13, 225] isTight
        BulletListItem[13, 225] open:[13, 14, "-"] isTight
          Paragraph[15, 22]
            Text[15, 21] chars:[15, 21, "item 2"]
          BulletList[30, 225] isTight
            BulletListItem[30, 225] open:[30, 31, "-"] isTight
              Paragraph[32, 39]
                Text[32, 38] chars:[32, 38, "item 3"]
              BulletList[51, 225] isTight
                BulletListItem[51, 225] open:[51, 52, "-"] isTight
                  Paragraph[53, 60]
                    Text[53, 59] chars:[53, 59, "item 4"]
                  BulletList[76, 225] isTight
                    BulletListItem[76, 225] open:[76, 77, "-"] isTight
                      Paragraph[78, 85]
                        Text[78, 84] chars:[78, 84, "item 5"]
                      BulletList[105, 225] isTight
                        BulletListItem[105, 225] open:[105, 106, "-"] isTight
                          Paragraph[107, 114]
                            Text[107, 113] chars:[107, 113, "item 6"]
                          BulletList[138, 225] isTight
                            BulletListItem[138, 225] open:[138, 139, "-"] isTight
                              Paragraph[140, 147]
                                Text[140, 146] chars:[140, 146, "item 7"]
                              BulletList[175, 225] isTight
                                BulletListItem[175, 225] open:[175, 176, "-"] isTight
                                  Paragraph[177, 184]
                                    Text[177, 183] chars:[177, 183, "item 8"]
                                  BulletList[216, 225] isTight
                                    BulletListItem[216, 225] open:[216, 217, "-"] isTight hadBlankLineAfter
                                      Paragraph[218, 225] isTrailingBlankLine
                                        Text[218, 224] chars:[218, 224, "item 9"]
````````````````````````````````


```````````````````````````````` example Block quote parsing: 14
1. item 1
    1. item 2
        1. item 3
            1. item 4
                1. item 5
                    1. item 6
                        1. item 7
                            1. item 8
                                1. item 9

.
<ol>
    <li>item 1
        <ol>
            <li>item 2
                <ol>
                    <li>item 3
                        <ol>
                            <li>item 4
                                <ol>
                                    <li>item 5
                                        <ol>
                                            <li>item 6
                                                <ol>
                                                    <li>item 7
                                                        <ol>
                                                            <li>item 8
                                                                <ol>
                                                                    <li>item 9</li>
                                                                </ol>
                                                            </li>
                                                        </ol>
                                                    </li>
                                                </ol>
                                            </li>
                                        </ol>
                                    </li>
                                </ol>
                            </li>
                        </ol>
                    </li>
                </ol>
            </li>
        </ol>
    </li>
</ol>
.
Document[0, 235]
  OrderedList[0, 234] isTight delimiter:'.'
    OrderedListItem[0, 234] open:[0, 2, "1."] isTight
      Paragraph[3, 10]
        Text[3, 9] chars:[3, 9, "item 1"]
      OrderedList[14, 234] isTight delimiter:'.'
        OrderedListItem[14, 234] open:[14, 16, "1."] isTight
          Paragraph[17, 24]
            Text[17, 23] chars:[17, 23, "item 2"]
          OrderedList[32, 234] isTight delimiter:'.'
            OrderedListItem[32, 234] open:[32, 34, "1."] isTight
              Paragraph[35, 42]
                Text[35, 41] chars:[35, 41, "item 3"]
              OrderedList[54, 234] isTight delimiter:'.'
                OrderedListItem[54, 234] open:[54, 56, "1."] isTight
                  Paragraph[57, 64]
                    Text[57, 63] chars:[57, 63, "item 4"]
                  OrderedList[80, 234] isTight delimiter:'.'
                    OrderedListItem[80, 234] open:[80, 82, "1."] isTight
                      Paragraph[83, 90]
                        Text[83, 89] chars:[83, 89, "item 5"]
                      OrderedList[110, 234] isTight delimiter:'.'
                        OrderedListItem[110, 234] open:[110, 112, "1."] isTight
                          Paragraph[113, 120]
                            Text[113, 119] chars:[113, 119, "item 6"]
                          OrderedList[144, 234] isTight delimiter:'.'
                            OrderedListItem[144, 234] open:[144, 146, "1."] isTight
                              Paragraph[147, 154]
                                Text[147, 153] chars:[147, 153, "item 7"]
                              OrderedList[182, 234] isTight delimiter:'.'
                                OrderedListItem[182, 234] open:[182, 184, "1."] isTight
                                  Paragraph[185, 192]
                                    Text[185, 191] chars:[185, 191, "item 8"]
                                  OrderedList[224, 234] isTight delimiter:'.'
                                    OrderedListItem[224, 234] open:[224, 226, "1."] isTight hadBlankLineAfter
                                      Paragraph[227, 234] isTrailingBlankLine
                                        Text[227, 233] chars:[227, 233, "item 9"]
````````````````````````````````


## HTML Parsing

```````````````````````````````` example HTML Parsing: 1
<div>

  This is html text

</div>

This is markdown paragraph
.
<div>

  This is html text

</div>
<p>This is markdown paragraph</p>
.
Document[0, 62]
  HtmlBlock[0, 35]
  Paragraph[36, 62]
    Text[36, 62] chars:[36, 62, "This  … graph"]
````````````````````````````````


```````````````````````````````` example HTML Parsing: 2
<div><strong>

  This is html text

</div>

This is markdown paragraph
.
<div><strong>

  This is html text

</div>
<p>This is markdown paragraph</p>
.
Document[0, 70]
  HtmlBlock[0, 43]
  Paragraph[44, 70]
    Text[44, 70] chars:[44, 70, "This  … graph"]
````````````````````````````````


```````````````````````````````` example HTML Parsing: 3
<div>
  <!--

  This is comment

  -->
  
  This is html text

</div>

This is markdown paragraph
.
<div>
  <!--

  This is comment

  -->
  
  This is html text

</div>
<p>This is markdown paragraph</p>
.
Document[0, 97]
  HtmlBlock[0, 70]
  Paragraph[71, 97]
    Text[71, 97] chars:[71, 97, "This  … graph"]
````````````````````````````````


```````````````````````````````` example(HTML Parsing: 4) options(FAIL)
<hr>
# Heading
.
<p>
    <hr>
</p>

<h1 id="heading">Heading</h1>
.
Document[0, 15]
  HtmlBlock[0, 5]
  Heading[5, 14] textOpen:[5, 6, "#"] text:[7, 14, "Heading"]
    Text[7, 14] chars:[7, 14, "Heading"]
````````````````````````````````


this is how we generate it

```````````````````````````````` example HTML Parsing: 5
<hr>
# Heading
.
<hr>
<h1 id="heading">Heading</h1>
.
Document[0, 14]
  HtmlBlock[0, 5]
  Heading[5, 14] textOpen:[5, 6, "#"] text:[7, 14, "Heading"]
    Text[7, 14] chars:[7, 14, "Heading"]
````````````````````````````````


```````````````````````````````` example HTML Parsing: 6
<div attr
    attr1="test"
>

    html text
    
</div>    

.
<div attr
    attr1="test"
>

    html text
    
</div>    
.
Document[0, 61]
  HtmlBlock[0, 60]
````````````````````````````````


```````````````````````````````` example(HTML Parsing: 7) options(FAIL)
<div attr
    attr1="test"
    
>

    html text
    
</div>    

.
<p>
    <div attr attr1="test">
</p>
<pre><code>html text
</code></pre>

<p>
    </div>
</p>
.
Document[0, 66]
  HtmlBlock[0, 65]
````````````````````````````````


How it is actually parsed

```````````````````````````````` example HTML Parsing: 8
<div attr
    attr1="test"
    
>

    html text
    
</div>    

.
<div attr
    attr1="test"
    
>

    html text
    
</div>    
.
Document[0, 66]
  HtmlBlock[0, 65]
````````````````````````````````


```````````````````````````````` example HTML Parsing: 9
<div>
  <div>

    <div>nested-2-levels</div>

    <div>nested-2-levels</div>
  
  </div>
</div>

.
<div>
  <div>

    <div>nested-2-levels</div>

    <div>nested-2-levels</div>
  
  </div>
</div>
.
Document[0, 98]
  HtmlBlock[0, 97]
````````````````````````````````


```````````````````````````````` example HTML Parsing: 10
<p>par</p>
    <ul>
      <li>list item</li>
    </ul>
.
<p>par</p>
<pre><code>&lt;ul&gt;
  &lt;li&gt;list item&lt;/li&gt;
&lt;/ul&gt;
</code></pre>
.
Document[0, 54]
  HtmlBlock[0, 11]
  IndentedCodeBlock[15, 54]
````````````````````````````````


