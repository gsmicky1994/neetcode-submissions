class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations) {
        let record = [];
        operations.forEach((num)=>{
            if(num === "D"){
                record.push(2*(record[record.length-1]))
            } else if(num === "+"){
                record.push(record[record.length-1] + 
                record[record.length-2])
            } else if(num === "C"){
                record.pop();
            } else {
                record.push(Number(num));
            }
        })
        return record.reduce((total, score)=> total+score,0)
    }
}
