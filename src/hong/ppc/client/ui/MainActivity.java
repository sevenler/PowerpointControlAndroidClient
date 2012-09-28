package hong.ppc.client.ui;

import hong.ppc.client.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText ipaddress;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_activity);

		Button connect = (Button) findViewById(R.id.connect);
		ipaddress = (EditText) findViewById(R.id.ipaddress);

		connect.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String ip = ipaddress.getText().toString();
				Intent intent = new Intent(MainActivity.this,
						ControlActivity.class);
				intent.putExtra("ip", ip);
				startActivity(intent);
			}
		});

	}
}
