const voters = [ 
    { name: 'Bob', age: 30, voted: true}, 
    { name: 'Jake', age: 32, voted: true}, 
    { name: 'Kate', age: 25, voted: false}, 
    { name: 'Sam', age: 20, voted: false}, 
    { name: 'Phil', age: 21, voted: true}, 
    { name: 'Ed', age: 55, voted: true}, 
    { name: 'Tami', age: 54, voted: true},
    { name: 'Mary', age: 31, voted: false}, 
    { name: 'Becky', age: 43, voted: false}, 
    { name: 'Joey', age: 41, voted: true}, 
    { name: 'Jeff', age: 30, voted: true}, 
    { name: 'Zack', age: 19, voted: false} 
]

let handleVoter = (propVotos, propPessoas) => (totals, voters) => ({
    ...totals,
    [propVotos]: voters.voted ? totals[propVotos] + 1 : totals[propVotos],
    [propPessoas] : totals[propPessoas] + 1,
})

let handleYoung = handleVoter('numYoungVoters', 'numYoungPeople')
  
let handleMid = handleVoter('numMidVoters', 'numMidPeople')

let handleOld = handleVoter('numOldVoters', 'numOldPeople')

function ageBetween (voter, initialAge, lastAge) {
    return (voter.age >= initialAge && voter.age <= lastAge);
} 

function getResults(array) {
    return array.reduce(
        (totals, currentVoter) => {
            if (ageBetween(currentVoter, 18, 25)) {
                return handleYoung(totals, currentVoter)
            } 
            if (ageBetween(currentVoter, 26, 35)) {
                return handleMid(totals, currentVoter)
            } 
            if (ageBetween(currentVoter, 36, 55)) { 
                return handleOld(totals, currentVoter)
            }
        },
        {
            numYoungVoters: 0,
            numYoungPeople: 0,
            numMidVoters: 0,
            numMidPeople: 0,
            numOldVoters: 0,
            numOldPeople: 0
        }
    )
}
console.log(getResults(voters))