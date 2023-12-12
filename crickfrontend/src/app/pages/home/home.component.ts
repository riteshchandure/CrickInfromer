import { Component } from '@angular/core';
import { LiveComponent } from "../live/live.component";

@Component({
    selector: 'app-home',
    standalone: true,
    templateUrl: './home.component.html',
    styleUrl: './home.component.css',
    imports: [LiveComponent]
})
export class HomeComponent {

}
