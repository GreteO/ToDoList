package com.example.todolist

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.provider.SyncStateContract
import android.util.Log
import android.view.View
import android.widget.RemoteViews
import com.example.todolist.DTO.ToDo
import kotlinx.android.synthetic.main.rv_child_dashboard.*
import kotlinx.android.synthetic.main.rv_child_dashboard.view.*

/**
 * Implementation of App Widget functionality.
 */
class ToDoListWidget : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            super.onUpdate(context,appWidgetManager,appWidgetIds)

          /*  val widgetText = context.getString(R.string.appwidget_text)

            val toDoText = context.getString(R.string.appwidget_text)
            // val widgetText = INTENT_TODO_NAME
            Log.d("answer",toDoText)
            Log.d("answer2",widgetText)

            // Construct the RemoteViews object
            val views = RemoteViews(context.packageName, R.layout.to_do_list_widget)
            views.setTextViewText(R.id.appwidget_text,widgetText)
            views.setTextViewText(R.id.appwidget_text, toDoText)*/

          /*

            // Construct the RemoteViews object
            val views = RemoteViews(context.packageName, R.layout.to_do_list_widget)
            //views.setTextViewText(R.id.appwidget_text, widgetText)

            views.setTextViewText(R.id.tv_todo_name,widgetText)

            //views.setOnClickPendingIntent(R.id.todo_button,
            //getPendingIntent(context))*/

            // Instruct the widget manager to update the widget
          // appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }

 /*   companion object {

        internal fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int, getToDo: ToDo) {

            val widgetText = context.getString(R.string.appwidget_text)
            val toDoText = getToDo.name
            // val widgetText = INTENT_TODO_NAME
            Log.d("answer",toDoText)
            Log.d("answer2",widgetText)

            // Construct the RemoteViews object
            val views = RemoteViews(context.packageName, R.layout.to_do_list_widget)
            views.setTextViewText(R.id.appwidget_text,widgetText)
            views.setTextViewText(R.id.tv_todo_name, toDoText)

            //views.setOnClickPendingIntent(R.id.todo_button,
                //getPendingIntent(context))

            // Instruct the widget manager to update the widget
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }

        /*private fun getPendingIntent(context: Context, value: Int): PendingIntent {
            //1
            val intent = Intent(context, DashboardActivity::class.java)
            //2
            intent.action = COL_ID
            //3
            intent.putExtra(COL_NAME, value)
            //4
            return PendingIntent.getActivity(context, value, intent, 0)
        }*/

    }*/
}

