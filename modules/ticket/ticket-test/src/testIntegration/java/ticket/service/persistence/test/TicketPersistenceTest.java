/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package ticket.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ticket.exception.NoSuchTicketException;

import ticket.model.Ticket;

import ticket.service.TicketLocalServiceUtil;
import ticket.service.persistence.TicketPersistence;
import ticket.service.persistence.TicketUtil;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class TicketPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED, "ticket.service"));

	@Before
	public void setUp() {
		_persistence = TicketUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Ticket> iterator = _tickets.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Ticket ticket = _persistence.create(pk);

		Assert.assertNotNull(ticket);

		Assert.assertEquals(ticket.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Ticket newTicket = addTicket();

		_persistence.remove(newTicket);

		Ticket existingTicket = _persistence.fetchByPrimaryKey(
			newTicket.getPrimaryKey());

		Assert.assertNull(existingTicket);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addTicket();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Ticket newTicket = _persistence.create(pk);

		newTicket.setUuid(RandomTestUtil.randomString());

		newTicket.setGroupId(RandomTestUtil.nextLong());

		newTicket.setCompanyId(RandomTestUtil.nextLong());

		newTicket.setUserId(RandomTestUtil.nextLong());

		newTicket.setUserName(RandomTestUtil.randomString());

		newTicket.setCreateDate(RandomTestUtil.nextDate());

		newTicket.setModifiedDate(RandomTestUtil.nextDate());

		newTicket.setTitle(RandomTestUtil.randomString());

		newTicket.setDescription(RandomTestUtil.randomString());

		newTicket.setCategory(RandomTestUtil.randomString());

		newTicket.setPriority(RandomTestUtil.randomString());

		newTicket.setStatus(RandomTestUtil.randomString());

		newTicket.setAssignedToUserId(RandomTestUtil.nextLong());

		_tickets.add(_persistence.update(newTicket));

		Ticket existingTicket = _persistence.findByPrimaryKey(
			newTicket.getPrimaryKey());

		Assert.assertEquals(existingTicket.getUuid(), newTicket.getUuid());
		Assert.assertEquals(
			existingTicket.getTicketId(), newTicket.getTicketId());
		Assert.assertEquals(
			existingTicket.getGroupId(), newTicket.getGroupId());
		Assert.assertEquals(
			existingTicket.getCompanyId(), newTicket.getCompanyId());
		Assert.assertEquals(existingTicket.getUserId(), newTicket.getUserId());
		Assert.assertEquals(
			existingTicket.getUserName(), newTicket.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingTicket.getCreateDate()),
			Time.getShortTimestamp(newTicket.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingTicket.getModifiedDate()),
			Time.getShortTimestamp(newTicket.getModifiedDate()));
		Assert.assertEquals(existingTicket.getTitle(), newTicket.getTitle());
		Assert.assertEquals(
			existingTicket.getDescription(), newTicket.getDescription());
		Assert.assertEquals(
			existingTicket.getCategory(), newTicket.getCategory());
		Assert.assertEquals(
			existingTicket.getPriority(), newTicket.getPriority());
		Assert.assertEquals(existingTicket.getStatus(), newTicket.getStatus());
		Assert.assertEquals(
			existingTicket.getAssignedToUserId(),
			newTicket.getAssignedToUserId());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByAssignedToUserId() throws Exception {
		_persistence.countByAssignedToUserId(RandomTestUtil.nextLong());

		_persistence.countByAssignedToUserId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Ticket newTicket = addTicket();

		Ticket existingTicket = _persistence.findByPrimaryKey(
			newTicket.getPrimaryKey());

		Assert.assertEquals(existingTicket, newTicket);
	}

	@Test(expected = NoSuchTicketException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Ticket> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"TICKET_Ticket", "uuid", true, "ticketId", true, "groupId", true,
			"companyId", true, "userId", true, "userName", true, "createDate",
			true, "modifiedDate", true, "title", true, "description", true,
			"category", true, "priority", true, "status", true,
			"assignedToUserId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Ticket newTicket = addTicket();

		Ticket existingTicket = _persistence.fetchByPrimaryKey(
			newTicket.getPrimaryKey());

		Assert.assertEquals(existingTicket, newTicket);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Ticket missingTicket = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingTicket);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Ticket newTicket1 = addTicket();
		Ticket newTicket2 = addTicket();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTicket1.getPrimaryKey());
		primaryKeys.add(newTicket2.getPrimaryKey());

		Map<Serializable, Ticket> tickets = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, tickets.size());
		Assert.assertEquals(
			newTicket1, tickets.get(newTicket1.getPrimaryKey()));
		Assert.assertEquals(
			newTicket2, tickets.get(newTicket2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Ticket> tickets = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(tickets.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Ticket newTicket = addTicket();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTicket.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Ticket> tickets = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, tickets.size());
		Assert.assertEquals(newTicket, tickets.get(newTicket.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Ticket> tickets = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(tickets.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Ticket newTicket = addTicket();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTicket.getPrimaryKey());

		Map<Serializable, Ticket> tickets = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, tickets.size());
		Assert.assertEquals(newTicket, tickets.get(newTicket.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			TicketLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Ticket>() {

				@Override
				public void performAction(Ticket ticket) {
					Assert.assertNotNull(ticket);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Ticket newTicket = addTicket();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Ticket.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("ticketId", newTicket.getTicketId()));

		List<Ticket> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Ticket existingTicket = result.get(0);

		Assert.assertEquals(existingTicket, newTicket);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Ticket.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("ticketId", RandomTestUtil.nextLong()));

		List<Ticket> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Ticket newTicket = addTicket();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Ticket.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("ticketId"));

		Object newTicketId = newTicket.getTicketId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("ticketId", new Object[] {newTicketId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingTicketId = result.get(0);

		Assert.assertEquals(existingTicketId, newTicketId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Ticket.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("ticketId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"ticketId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Ticket newTicket = addTicket();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newTicket.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		Ticket newTicket = addTicket();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Ticket.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("ticketId", newTicket.getTicketId()));

		List<Ticket> result = _persistence.findWithDynamicQuery(dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Ticket ticket) {
		Assert.assertEquals(
			ticket.getUuid(),
			ReflectionTestUtil.invoke(
				ticket, "getColumnOriginalValue", new Class<?>[] {String.class},
				"uuid_"));
		Assert.assertEquals(
			Long.valueOf(ticket.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				ticket, "getColumnOriginalValue", new Class<?>[] {String.class},
				"groupId"));
	}

	protected Ticket addTicket() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Ticket ticket = _persistence.create(pk);

		ticket.setUuid(RandomTestUtil.randomString());

		ticket.setGroupId(RandomTestUtil.nextLong());

		ticket.setCompanyId(RandomTestUtil.nextLong());

		ticket.setUserId(RandomTestUtil.nextLong());

		ticket.setUserName(RandomTestUtil.randomString());

		ticket.setCreateDate(RandomTestUtil.nextDate());

		ticket.setModifiedDate(RandomTestUtil.nextDate());

		ticket.setTitle(RandomTestUtil.randomString());

		ticket.setDescription(RandomTestUtil.randomString());

		ticket.setCategory(RandomTestUtil.randomString());

		ticket.setPriority(RandomTestUtil.randomString());

		ticket.setStatus(RandomTestUtil.randomString());

		ticket.setAssignedToUserId(RandomTestUtil.nextLong());

		_tickets.add(_persistence.update(ticket));

		return ticket;
	}

	private List<Ticket> _tickets = new ArrayList<Ticket>();
	private TicketPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}