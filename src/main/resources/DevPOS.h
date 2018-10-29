
// The following ifdef block is the standard way of creating macros which make exporting
// from a DLL simpler. All files within this DLL are compiled with the DEVPOS_EXPORTS
// symbol defined on the command line. this symbol should not be defined on any project
// that uses this DLL. This way any other project whose source files include this file see
// DEVPOS_API functions as being imported from a DLL, wheras this DLL sees symbols
// defined with this macro as being exported.
#include <string>
using namespace std;
 
#ifdef DEVPOS_EXPORTS
#define DEVPOS_API __declspec(dllexport)
#else
#define DEVPOS_API __declspec(dllimport)
#endif
//STDAPI  qr_trans(char *url,char * termidm,char * mercode,char * termcde,char * imei,char * mer_order_no ,char * bar_code,char * pay_amount,char * pay_type);
//STDAPI  qr_canceqr_returnl(char *url,char * mer_order_no,char * trancde);
//STDAPI  (char *url,char *mer_order_no,char *trancde,char* mer_refund_order_no,char  * refund_amount);
string payCash(string jsonData);
string login(string jsonData);
string getPOSInfo(string jsonData);
string printAndTransByTrace(string jsonData);
string settle(string jsonData);
string refund(string jsonData);
string payCancel(string jsonData);
string queryAllTrans(string jsonData);

