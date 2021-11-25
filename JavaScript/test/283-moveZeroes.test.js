import { moveZeroes } from '../src/283-moveZeroes';

test('283-移动零moveZeroes测试', () => {
  const source = [1, 2, 0, 3, 0, 4];
  const target = [1, 2, 3, 4, 0, 0];
  expect(moveZeroes(source)).toEqual(target);
});
