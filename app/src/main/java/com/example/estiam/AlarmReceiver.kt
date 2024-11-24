package com.example.estiam

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val taskName = intent.getStringExtra("task_name")
        Toast.makeText(context, "C'est l'heure de votre tâche: $taskName!", Toast.LENGTH_LONG).show()
    }
}