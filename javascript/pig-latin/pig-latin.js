const VOWELS = /^([aeiou]|xr|yt)/
const CONSONANTS = /^(s?ch|s?qu|thr?|rh|[^aeiou])(.*)$/

export class translator {
  static translate(inputs) {
    return inputs.split(' ').map((word) => {
      if (VOWELS.test(word)) return `${word}ay`;
      let matches = word.match(CONSONANTS);
      if (matches) return `${matches[2]}${matches[1]}ay`;
    })
    .join(' ');
  }
}