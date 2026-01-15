# タスク管理アプリ（Spring Boot）

## 概要
Spring Boot を用いて作成したシンプルなタスク管理アプリです。  
Webエンジニアへの転職を目指し、バックエンドを中心に開発しました。

## 主な機能
- タスク一覧表示
- タスク新規登録
- タスク削除
- （今後追加予定：更新機能、ログイン機能 など）

## 使用技術
- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven
- Git / GitHub

## 画面イメージ
※ スクリーンショットは後日追加予定

## 工夫した点
- Controller / Service / Repository の責務を分離し、保守性を意識した設計にしました
- Spring Data JPA を利用し、SQLを極力書かずにCRUD処理を実装しました
- 初学者でも理解しやすい構成を意識しました

## 学習目的
- Spring Boot の基本構成の理解
- MVCモデルの理解
- データベース連携（JPA）の習得
- Git / GitHub を使った開発フローの習得

## 実行方法
1. このリポジトリをクローン
   ```bash
   git clone https://github.com/t-katsuyama-dev/taskapp-springboot.git
