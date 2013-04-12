package br.com.igocoelho.gamers

import org.springframework.dao.DataIntegrityViolationException

class UserController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [userInstanceList: User.list(params), userInstanceTotal: User.count()]
    }

    def create() {
        [userInstance: new User(params)]
    }

    def save() {
        def userInstance = new User(params)
        if (userInstance.save(flush: true)) {
            flash.message = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
            redirect(action: "create")
        } else {
            render(view: "create", model: [userInstance: userInstance])
        }
    }

    def edit(Long id) {
        def userInstance = User.get(id)
        if (userInstance) {
            [userInstance: userInstance]
        } else {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
        }
    }

    def update(Long id, Long version) {
        def userInstance = User.get(id)
        if (!userInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (userInstance.version > version) {
                userInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'user.label', default: 'User')] as Object[],
                          "Another user has updated this User while you were editing")
                render(view: "edit", model: [userInstance: userInstance])
                return
            }
        }

        userInstance.properties = params
        if (userInstance.save(flush: true)) {
            flash.message = message(code: 'default.updated.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
            redirect(action: "list")
        } else {
            render(view: "edit", model: [userInstance: userInstance])
        }
    }

    def delete(Long id) {
        def userInstance = User.get(id)
        if (userInstance) {
            try {
                userInstance.delete(flush: true)
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'user.label', default: 'User'), id])
            }
            catch (DataIntegrityViolationException e) {
                flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'user.label', default: 'User'), id])
            }            
        } else {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), id])
        }

        redirect(action: "list")
    }
}