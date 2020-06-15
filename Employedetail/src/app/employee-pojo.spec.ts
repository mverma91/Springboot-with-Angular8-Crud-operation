import {EmployeePojo } from './employee-pojo';

describe('EmployeePojo', () => {
  it('should create an instance', () => {
    expect(new EmployeePojo("","","","")).toBeTruthy();
  });
});
