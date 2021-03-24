// 원하는 조건을 벗어날때까지 문자열을 순회하며 해당 문자를 출력한다.
// String.prototype[@@iterator]()
// syntax - str[Symbol.iterator]
const str = "this is string iterator example"

const iterator = str[Symbol.iterator]();
let getChar = iterator.next();

while (!getChar.done && getChar.value !== " ") {
    console.log(getChar.value);
    // > result "t"
    // > result "h"
    // > result "i"
    // > result "s"
    getChar = iterator.next();
}


// 원하는 문자열의 색인을 지정된 offset에 있는 UTF-16코드의 문자를 반환한다.
// String.prototype.charAt()
// syntax -  str.charAt(index)
const sentence = "this is method what variable get character on index";

const stringIndex = 3;

console.log(`the chracter at index ${index} is ${sentence.charAt(stringIndex)}`)
    // > result "the chracter at index 3 is s"


// UTF-16 코드 단위를 나타내는 0~65535의 인트를 반환한다.
// String.prototype.charCodeAt()
// syntax -  str.charAt(index)
const sentence1 = "this method returns integer code";
const codeIndex = 3;

console.log(`the chracter code is ${sentence1.charCodeAt(codeIndex)}`)
    // > result "the chracter code is 115"


// 두 문자열을 연결하여 새로운 문자열을 반환한다.
// String.prototype.concat()
// syntax - str.concat(str2 [, ...strN])
const first = "first";
const second = "second";

console.log(first.concat(" ", second))
console.log(second.concat(", ", first))
    //  > result first second
    //  > result second, first

// 배열도 concat 가능

const list = ["first", " ", "second", "!"];

console.log("".concat(...list))
    // result > "first second!"


// 문자열의 맨 마지막 문자열이 맞는지 확인하고, true / false를 반환한다.
// String.prototype.endsWith()
// syntax - str.endsWith(searchString[, length])
const ends = "this method determines whether a string ends, returning true or false"
console.log(ends.endsWith("false", 69))
    // > result true

const ends2 = "hello world ??"
console.log(ends2.endsWith("??"))
    // > result true


// 문자열이 해당 문자열을 포함하고 있는지 확인하여 true/ false를 반환한다 ( 대소문자 구분 )
// String.prototype.inclues()
// syntax - str.includes(searchString[, position])
const include = "this method performs a case sensitive search";

const word = "method"

console.log(`The word ${word}, ${include.includes(word) ? "is" : "is not"} in the sentence`)
    // > result "The word method, is in the sentence"


// 문자열에서 주어진 값과 일치하는 인덱스를 반환한다 ( 없으면 -1 반환 )
// String.prototype.indexOf()
// syntax - str.indexOf(searchValue[, fromIndex])
const text = "find current index";
const searchText = "current"
const noResult = "hello"
const index = (item) => text.indexOf(item);

console.log(`index is ${index(searchText)}`)
    // > result index is 5


console.log(`index is ${index(noResult)}`)
    // > result index is -1


// 문자열에서 주어진 값과 일치하는 부분을 역순으로 탐색하여 인덱스를 반환한다 ( 없으면 -1 반환 )
// String.prototype.lastIndexOf()
// syntax - str.lastIndexOf(searchValue[, fromIndex])
const text = "find current index current";
const searchText = "current"
const noResult = "hello"
const index = (item) => text.lastIndexOf(item);

console.log(`index is ${index(searchText)}`)
    // > result index is 19


console.log(`index is ${index(noResult)}`)
    // > result index is -1