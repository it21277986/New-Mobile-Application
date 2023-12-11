package com.example.newsapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006#"}, d2 = {"Lcom/example/newsapp/NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/newsapp/NewsViewHolder;", "item", "", "Lcom/example/newsapp/database/News;", "repository", "Lcom/example/newsapp/database/NewsRepository;", "viewModel", "Lcom/example/newsapp/MainActivity2Data;", "(Ljava/util/List;Lcom/example/newsapp/database/NewsRepository;Lcom/example/newsapp/MainActivity2Data;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getItem", "()Ljava/util/List;", "setItem", "(Ljava/util/List;)V", "getRepository", "()Lcom/example/newsapp/database/NewsRepository;", "getViewModel", "()Lcom/example/newsapp/MainActivity2Data;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.newsapp.NewsViewHolder> {
    @org.jetbrains.annotations.Nullable
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.newsapp.database.News> item;
    @org.jetbrains.annotations.NotNull
    private final com.example.newsapp.database.NewsRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.newsapp.MainActivity2Data viewModel = null;
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.newsapp.database.News> item, @org.jetbrains.annotations.NotNull
    com.example.newsapp.database.NewsRepository repository, @org.jetbrains.annotations.NotNull
    com.example.newsapp.MainActivity2Data viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.newsapp.database.News> getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.newsapp.database.News> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.newsapp.database.NewsRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.newsapp.MainActivity2Data getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.newsapp.NewsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.newsapp.NewsViewHolder holder, int position) {
    }
}