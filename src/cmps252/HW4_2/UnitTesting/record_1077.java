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

@Tag("44")
class Record_1077 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1077: FirstName is Martin")
	void FirstNameOfRecord1077() {
		assertEquals("Martin", customers.get(1076).getFirstName());
	}

	@Test
	@DisplayName("Record 1077: LastName is Louque")
	void LastNameOfRecord1077() {
		assertEquals("Louque", customers.get(1076).getLastName());
	}

	@Test
	@DisplayName("Record 1077: Company is Travel Etc")
	void CompanyOfRecord1077() {
		assertEquals("Travel Etc", customers.get(1076).getCompany());
	}

	@Test
	@DisplayName("Record 1077: Address is 724 W 11mile Rd")
	void AddressOfRecord1077() {
		assertEquals("724 W 11mile Rd", customers.get(1076).getAddress());
	}

	@Test
	@DisplayName("Record 1077: City is Madison Hyghts")
	void CityOfRecord1077() {
		assertEquals("Madison Hyghts", customers.get(1076).getCity());
	}

	@Test
	@DisplayName("Record 1077: County is Oakland")
	void CountyOfRecord1077() {
		assertEquals("Oakland", customers.get(1076).getCounty());
	}

	@Test
	@DisplayName("Record 1077: State is MI")
	void StateOfRecord1077() {
		assertEquals("MI", customers.get(1076).getState());
	}

	@Test
	@DisplayName("Record 1077: ZIP is 48071")
	void ZIPOfRecord1077() {
		assertEquals("48071", customers.get(1076).getZIP());
	}

	@Test
	@DisplayName("Record 1077: Phone is 248-548-4674")
	void PhoneOfRecord1077() {
		assertEquals("248-548-4674", customers.get(1076).getPhone());
	}

	@Test
	@DisplayName("Record 1077: Fax is 248-548-6942")
	void FaxOfRecord1077() {
		assertEquals("248-548-6942", customers.get(1076).getFax());
	}

	@Test
	@DisplayName("Record 1077: Email is martin@louque.com")
	void EmailOfRecord1077() {
		assertEquals("martin@louque.com", customers.get(1076).getEmail());
	}

	@Test
	@DisplayName("Record 1077: Web is http://www.martinlouque.com")
	void WebOfRecord1077() {
		assertEquals("http://www.martinlouque.com", customers.get(1076).getWeb());
	}
}
