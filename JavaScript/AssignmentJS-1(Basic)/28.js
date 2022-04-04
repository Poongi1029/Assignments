var a = [ 1,2, 4,6,1,100, 0,10000,3
];

a.sort(function (a, b) {
    return a - b;
});

document.write('a,', a);

function binarySearch(arr, i) {
    var mid = Math.floor(arr.length / 2);
    document.write(arr[mid], i);

    if (arr[mid] === i) {
       document.write('match', arr[mid], i);
        return arr[mid];
    } else if (arr[mid] < i && arr.length > 1) {
        document.write('mid lower', arr[mid], i);
        binarySearch(arr.splice(mid, Number.MAX_VALUE), i);
    } else if (arr[mid] > i && arr.length > 1) {
        document.write('mid higher', arr[mid], i);
        binarySearch(arr.splice(0, mid), i);
    } else {
        document.write('not here', i);
        return -1;
    }

}
var result = binarySearch(a, 100);
document.write(result);