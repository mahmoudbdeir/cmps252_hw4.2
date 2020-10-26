package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("28")
class Record_4374 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4374: FirstName is Jame")
	void FirstNameOfRecord4374() {
		assertEquals("Jame", customers.get(4373).getFirstName());
	}

	@Test
	@DisplayName("Record 4374: LastName is Borner")
	void LastNameOfRecord4374() {
		assertEquals("Borner", customers.get(4373).getLastName());
	}

	@Test
	@DisplayName("Record 4374: Company is Dover Elevators Hawaiian Pac")
	void CompanyOfRecord4374() {
		assertEquals("Dover Elevators Hawaiian Pac", customers.get(4373).getCompany());
	}

	@Test
	@DisplayName("Record 4374: Address is 5333 Mcauley Dr")
	void AddressOfRecord4374() {
		assertEquals("5333 Mcauley Dr", customers.get(4373).getAddress());
	}

	@Test
	@DisplayName("Record 4374: City is Ypsilanti")
	void CityOfRecord4374() {
		assertEquals("Ypsilanti", customers.get(4373).getCity());
	}

	@Test
	@DisplayName("Record 4374: County is Washtenaw")
	void CountyOfRecord4374() {
		assertEquals("Washtenaw", customers.get(4373).getCounty());
	}

	@Test
	@DisplayName("Record 4374: State is MI")
	void StateOfRecord4374() {
		assertEquals("MI", customers.get(4373).getState());
	}

	@Test
	@DisplayName("Record 4374: ZIP is 48197")
	void ZIPOfRecord4374() {
		assertEquals("48197", customers.get(4373).getZIP());
	}

	@Test
	@DisplayName("Record 4374: Phone is 734-572-0117")
	void PhoneOfRecord4374() {
		assertEquals("734-572-0117", customers.get(4373).getPhone());
	}

	@Test
	@DisplayName("Record 4374: Fax is 734-572-4098")
	void FaxOfRecord4374() {
		assertEquals("734-572-4098", customers.get(4373).getFax());
	}

	@Test
	@DisplayName("Record 4374: Email is jame@borner.com")
	void EmailOfRecord4374() {
		assertEquals("jame@borner.com", customers.get(4373).getEmail());
	}

	@Test
	@DisplayName("Record 4374: Web is http://www.jameborner.com")
	void WebOfRecord4374() {
		assertEquals("http://www.jameborner.com", customers.get(4373).getWeb());
	}
}
