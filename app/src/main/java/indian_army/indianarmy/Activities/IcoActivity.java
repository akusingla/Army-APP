package indian_army.indianarmy.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import indian_army.indianarmy.R;

public class IcoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ico);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ico, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void categories(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=2lRfccjk9OTtrkKSpuTuQg==&ParentID=TPfQREwolJwQaTkOawKcuA==";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void ror(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=SCa+MivKp8oOk3pUIDLZLA==&ParentID=5xJ7yVxVwn0/H/VzJsAKDg==";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void uhq(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=MqzfPjF3fcUhUgCydkWUNQ==&ParentID=9ppjNNj+RPg6CfQTTfsOIw==";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void pgm(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=e5UIElNbrHKRkA8AlLUs/A==&ParentID=LTwsv6s3r3oj1AGMRbc8lA==";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void dis(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=6pIBwyUDt5U5FGUOHElD3g==&ParentID=Ouiho2hqbySQN7ECSPlqCw==";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void ta(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=SnQAR4Vjcc+mdLDQrgeqcQ==&ParentID=ln8XGRM4W45xm/R/MXFA8w==&flag=YREvBa500/x+R0j3vw5ofA==";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }
}
