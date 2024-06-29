/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe(valBe){
            if(val === valBe){
                return true;
            }else{
                throw new Error("Not Equal");
            }
        },
        notToBe(valNot){
            if(val !== valNot){
                return true;
            }else{
                throw new Error("Equal");
            }
        }

    }
    
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */