function newList(alph, num) {
    var list = [];
    for (var i=0;i<alph.length;++i) {
    list.push(alph[i]);
    list.push(num[i]);
    }
    return list;
    }
    document.write(newList(['a','b','c'],[1,2,3]));