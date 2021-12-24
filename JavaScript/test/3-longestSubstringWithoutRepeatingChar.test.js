/*
 * @Author: June
 */
import { lengthOfLongestSubstring } from '../src/3-longestSubstringWithoutRepeatingChar';

test('3-无重复字符的最长子串', () => {
  const source = 'abcabcbb';
  const target = 3;
  expect(lengthOfLongestSubstring(source)).toBe(target);
});
