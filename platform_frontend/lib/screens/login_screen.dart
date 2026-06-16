// screens/login_screen.dart
import 'package:flutter/material.dart';
import '../services/api_service.dart';

class LoginScreen extends StatelessWidget {
  final _emailController = TextEditingController();
  final _passController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: EdgeInsets.all(20),
        child: Column(
          children: [
            TextField(controller: _emailController, decoration: InputDecoration(labelText: "Email")),
            TextField(controller: _passController, obscureText: true, decoration: InputDecoration(labelText: "Mot de passe")),
            ElevatedButton(
              onPressed: () async {
                // Appel API
                var res = await ApiService().login(_emailController.text, _passController.text);
                print(res.data);
              },
              child: Text("Connexion"),
            )
          ],
        ),
      ),
    );
  }
}