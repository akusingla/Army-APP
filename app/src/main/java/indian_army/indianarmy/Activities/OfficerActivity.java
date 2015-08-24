package indian_army.indianarmy.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import indian_army.indianarmy.R;

public class OfficerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_officer, menu);
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

    public void mode(View v){
        String url="http://indianarmy.nic.in/Default2.aspx?MnId=aQSek9kmgEO9fa3vUyjo2Q==&ParentID=1bD0Z1uLmkHe3AEQAmNL0w==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void pc(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=/FnUVqRBKegCSDYguTrGhw==&ParentID=9MWxpg1bwByTTnUb7kO6eg==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void ssc(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=7j+2oJwgjVYWD6uGHGXKIQ==&ParentID=bxw3p8kGO5uEVXkTcQKcNA==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }
    public void tao(View v){
        String url="http://indianarmy.nic.in/Site/FormTemplete/frmTempSimple.aspx?MnId=pLcSvuk9LisCPl3aveCOLg==&ParentID=kMQS8I5mfn0H4u4aYnzZrg==&flag=T9LLLt/uj9WM5Y29OZXTqg==";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void commission(View v){
        String url="";
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

}
