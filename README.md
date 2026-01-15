# Task App（Spring Boot）

## アプリ概要
Spring Boot を用いて作成したシンプルなタスク管理アプリです。  
Java の基礎学習後、Webアプリケーション開発の理解を深める目的で作成しました。

CRUD（作成・参照・更新・削除）の一連の流れを実装しています。

---

## 使用技術
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- HTML / CSS

---

## 機能一覧
- タスク一覧表示
- タスク追加
- タスク削除
- タスクの完了／未完了切り替え
- 完了タスクの表示切り替え（打ち消し線）

---

## 工夫した点
- MVC構成を意識し、Controller・Service・Repository の責務を分離しました
- 状態管理（完了／未完了）を boolean フィールドで管理し、UI に反映しました
- Thymeleaf の条件式を用いて、状態に応じた表示切り替えを実装しました
- CSS を用いて最低限のUI改善を行い、Webアプリらしい見た目にしました

---

## 今後の改善点
- MySQL への切り替え
- バリデーション（空文字チェックなど）
- ログイン機能の追加
- テストコードの作成

---

## 起動方法

```bash
git clone https://github.com/ユーザー名/task-app.git
cd task-app
./mvnw spring-boot:run
