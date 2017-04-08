import {Component} from '@angular/core';

@Component({
  selector: 'app-test',
  template: `Author : {{name}}<br/>
            License : {{license}}`
})
export class TestComponent {
  name = "Sakib Sami";
  license = "MIT";
}
