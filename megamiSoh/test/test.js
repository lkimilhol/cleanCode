var assert = require('assert');

describe('String', function() {
    describe('#indexOf()', function() {
        it('indexof안에 있는 문자열을 찾을 수 없으면 -1을 리턴한다.', function() {
            assert.equal([1, 2, 3].indexOf(4), -1);
        });
    });
});

describe('String', function() {
    describe('#Concat()', function() {
        it('두 문자열을 연결하여 새로운 문자열을 반환한다.', function() {
            const first = "first";
            const second = "second";
            assert.equal(first.concat(" ", second), "first second");
        });
    });
});

describe('String', function() {
    describe('#endsWith()', function() {
        it('문자열의 맨 마지막 문자열이 맞는지 확인하고,  맞으면 true를 반환한다.', function() {
            const ends = "this method determines whether a string ends, returning true or false"
            assert.equal(ends.endsWith("false", 69), true);
        });
    });
});


describe('String', function() {
    describe('#lastIndexOf()', function() {
        it('문자열에서 주어진 값과 일치하는 부분을 역순으로 탐색하여 인덱스를 반환한다 ( 없으면 -1 반환 )', function() {
            const text = "find current index current";
            const searchText = "current"
            const noResult = "hello"
            const index = (item) => text.lastIndexOf(item);
            assert.equal(index(searchText), 19);
        });
    });
});


describe('String', function() {
    describe('#inclues()', function() {
        it('문자열이 해당 문자열을 포함하고 있는지 확인하여 true/ false를 반환한다 ( 대소문자 구분 )', function() {
            const include = "this method performs a case sensitive search";

            const word = "method"

            assert.equal(include.includes(word), true);
        });
    });
});