import { Directive, EventEmitter, ElementRef, HostListener, Output } from '@angular/core';

@Directive({ selector: '[clickOut]' })

export class ClickOutDirective {
  @Output() clickOut= new EventEmitter<MouseEvent>();
  constructor(private elementRef: ElementRef) {}

  @HostListener('document:click', ['$event'])
    public onDocumentClick(event: MouseEvent): void {
      const target= event.target as HTMLElement;
      if (target && !this.elementRef.nativeElement.contains(target)) {

         this.clickOut.emit(event);
      }
  }

}
