function merge(left, right) {
    let sortedArr = [] 
    while (left.length && right.length) {
      
      if (left[0] < right[0]) {
        sortedArr.push(left.shift())
      } else {
        sortedArr.push(right.shift())
      }
    }
    return [...sortedArr, ...left, ...right]
  }
  document.write(merge([1, 4], [2, 6, 9]))