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

@Tag("7")
class Record_1337 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1337: FirstName is Phillis")
	void FirstNameOfRecord1337() {
		assertEquals("Phillis", customers.get(1336).getFirstName());
	}

	@Test
	@DisplayName("Record 1337: LastName is Arrant")
	void LastNameOfRecord1337() {
		assertEquals("Arrant", customers.get(1336).getLastName());
	}

	@Test
	@DisplayName("Record 1337: Company is Sierra Fire Protection")
	void CompanyOfRecord1337() {
		assertEquals("Sierra Fire Protection", customers.get(1336).getCompany());
	}

	@Test
	@DisplayName("Record 1337: Address is 143 Roseland Ave")
	void AddressOfRecord1337() {
		assertEquals("143 Roseland Ave", customers.get(1336).getAddress());
	}

	@Test
	@DisplayName("Record 1337: City is Caldwell")
	void CityOfRecord1337() {
		assertEquals("Caldwell", customers.get(1336).getCity());
	}

	@Test
	@DisplayName("Record 1337: County is Essex")
	void CountyOfRecord1337() {
		assertEquals("Essex", customers.get(1336).getCounty());
	}

	@Test
	@DisplayName("Record 1337: State is NJ")
	void StateOfRecord1337() {
		assertEquals("NJ", customers.get(1336).getState());
	}

	@Test
	@DisplayName("Record 1337: ZIP is 7006")
	void ZIPOfRecord1337() {
		assertEquals("7006", customers.get(1336).getZIP());
	}

	@Test
	@DisplayName("Record 1337: Phone is 973-226-7081")
	void PhoneOfRecord1337() {
		assertEquals("973-226-7081", customers.get(1336).getPhone());
	}

	@Test
	@DisplayName("Record 1337: Fax is 973-226-9232")
	void FaxOfRecord1337() {
		assertEquals("973-226-9232", customers.get(1336).getFax());
	}

	@Test
	@DisplayName("Record 1337: Email is phillis@arrant.com")
	void EmailOfRecord1337() {
		assertEquals("phillis@arrant.com", customers.get(1336).getEmail());
	}

	@Test
	@DisplayName("Record 1337: Web is http://www.phillisarrant.com")
	void WebOfRecord1337() {
		assertEquals("http://www.phillisarrant.com", customers.get(1336).getWeb());
	}
}
