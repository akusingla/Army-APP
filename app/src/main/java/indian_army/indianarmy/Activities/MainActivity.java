package indian_army.indianarmy.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import indian_army.indianarmy.R;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    public void chief(View v){
        String urlChief="http://indianarmy.nic.in/Site/FormTemplete/frmTemp1PTC2C.aspx?MnId=kE4bSwHN4qeH6IKP3gnDRA==&ParentID=Id4DZBpoI0LqUssExu7h7w==&flag=y8/7TKJS9fR9t/tSH7StDA==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(urlChief));
        startActivity(intent);
    }

    public void officer(View v){
        Intent officerIntent=new Intent(MainActivity.this,OfficerActivity.class);
        startActivity(officerIntent);
    }

    public void jco(View v){
        Intent jcoIntent=new Intent(MainActivity.this,IcoActivity.class);
        startActivity(jcoIntent);

    }

    public void term(View v){
        String urlTerm="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=FwLAfGtjk7j60G+/pqP1yg==&ParentID=TTejQ30Js4WrKCg0oFB/3Q==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(urlTerm));
        startActivity(intent);
    }

    public void news(View v){
        String urlNews="http://indianarmy.nic.in/Site/WhatsNew/frmwhatsnewDetails.aspx?w=V5kKgpqTI9WZni2B7J4S8A==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(urlNews));
        startActivity(intent);

    }

    public void faq(View v){
        String urlFAQ="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=bNGuH6DlOlvUGZTcpQ7bqg==&ParentID=BE8J5HPIfTAyhbZI3mPZ1w==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(urlFAQ));
        startActivity(intent);
    }

    public void downloads(View v){
        String urlDownloads="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=arbNe2urUm5azoAq1o+5vg==&ParentID=VAH2zKVTILOtyKuxR+/i8g==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(urlDownloads));
        startActivity(intent);
    }

    public void contact(View v){
        String urlContact="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=ivvGXFtjQhXtHvkY2Xpd9g==&ParentID=0VpqZ+pXJA3MubcH7ymMZw==&flag=uzXs6p56FOP+qgjN2POpZg==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(urlContact));
        startActivity(intent);
    }
}
