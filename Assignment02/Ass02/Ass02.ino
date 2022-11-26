#include "MsgService.h"

char data;

void setup(){ 
  MsgService.init();
}

void loop(){
  //if (MsgService.isMsgAvailable()){
    MsgService.sendMsg("StateN");
    MsgService.sendMsg("LightON");
    delay(2000);
    MsgService.sendMsg("StatePA");
    MsgService.sendMsg("LightON");
    delay(3000);
    MsgService.sendMsg("StateA");
    MsgService.sendMsg("LightOFF");
    delay(2000);
  //}
};