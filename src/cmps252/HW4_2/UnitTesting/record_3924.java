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

@Tag("8")
class Record_3924 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3924: FirstName is Ruby")
	void FirstNameOfRecord3924() {
		assertEquals("Ruby", customers.get(3923).getFirstName());
	}

	@Test
	@DisplayName("Record 3924: LastName is Lenk")
	void LastNameOfRecord3924() {
		assertEquals("Lenk", customers.get(3923).getLastName());
	}

	@Test
	@DisplayName("Record 3924: Company is Voice")
	void CompanyOfRecord3924() {
		assertEquals("Voice", customers.get(3923).getCompany());
	}

	@Test
	@DisplayName("Record 3924: Address is 2302 W Badger Rd")
	void AddressOfRecord3924() {
		assertEquals("2302 W Badger Rd", customers.get(3923).getAddress());
	}

	@Test
	@DisplayName("Record 3924: City is Madison")
	void CityOfRecord3924() {
		assertEquals("Madison", customers.get(3923).getCity());
	}

	@Test
	@DisplayName("Record 3924: County is Dane")
	void CountyOfRecord3924() {
		assertEquals("Dane", customers.get(3923).getCounty());
	}

	@Test
	@DisplayName("Record 3924: State is WI")
	void StateOfRecord3924() {
		assertEquals("WI", customers.get(3923).getState());
	}

	@Test
	@DisplayName("Record 3924: ZIP is 53713")
	void ZIPOfRecord3924() {
		assertEquals("53713", customers.get(3923).getZIP());
	}

	@Test
	@DisplayName("Record 3924: Phone is 608-275-7463")
	void PhoneOfRecord3924() {
		assertEquals("608-275-7463", customers.get(3923).getPhone());
	}

	@Test
	@DisplayName("Record 3924: Fax is 608-275-6132")
	void FaxOfRecord3924() {
		assertEquals("608-275-6132", customers.get(3923).getFax());
	}

	@Test
	@DisplayName("Record 3924: Email is ruby@lenk.com")
	void EmailOfRecord3924() {
		assertEquals("ruby@lenk.com", customers.get(3923).getEmail());
	}

	@Test
	@DisplayName("Record 3924: Web is http://www.rubylenk.com")
	void WebOfRecord3924() {
		assertEquals("http://www.rubylenk.com", customers.get(3923).getWeb());
	}
}
