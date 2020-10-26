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

@Tag("49")
class Record_3918 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3918: FirstName is Walter")
	void FirstNameOfRecord3918() {
		assertEquals("Walter", customers.get(3917).getFirstName());
	}

	@Test
	@DisplayName("Record 3918: LastName is Malotte")
	void LastNameOfRecord3918() {
		assertEquals("Malotte", customers.get(3917).getLastName());
	}

	@Test
	@DisplayName("Record 3918: Company is Toxscan Inc")
	void CompanyOfRecord3918() {
		assertEquals("Toxscan Inc", customers.get(3917).getCompany());
	}

	@Test
	@DisplayName("Record 3918: Address is 2 Lyon Pl")
	void AddressOfRecord3918() {
		assertEquals("2 Lyon Pl", customers.get(3917).getAddress());
	}

	@Test
	@DisplayName("Record 3918: City is White Plains")
	void CityOfRecord3918() {
		assertEquals("White Plains", customers.get(3917).getCity());
	}

	@Test
	@DisplayName("Record 3918: County is Westchester")
	void CountyOfRecord3918() {
		assertEquals("Westchester", customers.get(3917).getCounty());
	}

	@Test
	@DisplayName("Record 3918: State is NY")
	void StateOfRecord3918() {
		assertEquals("NY", customers.get(3917).getState());
	}

	@Test
	@DisplayName("Record 3918: ZIP is 10601")
	void ZIPOfRecord3918() {
		assertEquals("10601", customers.get(3917).getZIP());
	}

	@Test
	@DisplayName("Record 3918: Phone is 914-684-7594")
	void PhoneOfRecord3918() {
		assertEquals("914-684-7594", customers.get(3917).getPhone());
	}

	@Test
	@DisplayName("Record 3918: Fax is 914-684-0876")
	void FaxOfRecord3918() {
		assertEquals("914-684-0876", customers.get(3917).getFax());
	}

	@Test
	@DisplayName("Record 3918: Email is walter@malotte.com")
	void EmailOfRecord3918() {
		assertEquals("walter@malotte.com", customers.get(3917).getEmail());
	}

	@Test
	@DisplayName("Record 3918: Web is http://www.waltermalotte.com")
	void WebOfRecord3918() {
		assertEquals("http://www.waltermalotte.com", customers.get(3917).getWeb());
	}
}
