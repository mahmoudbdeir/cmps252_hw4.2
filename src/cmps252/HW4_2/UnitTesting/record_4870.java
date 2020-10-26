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

@Tag("39")
class Record_4870 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4870: FirstName is Jae")
	void FirstNameOfRecord4870() {
		assertEquals("Jae", customers.get(4869).getFirstName());
	}

	@Test
	@DisplayName("Record 4870: LastName is Kresal")
	void LastNameOfRecord4870() {
		assertEquals("Kresal", customers.get(4869).getLastName());
	}

	@Test
	@DisplayName("Record 4870: Company is Halvorson Concrete Inc")
	void CompanyOfRecord4870() {
		assertEquals("Halvorson Concrete Inc", customers.get(4869).getCompany());
	}

	@Test
	@DisplayName("Record 4870: Address is 100 N Chestnut St")
	void AddressOfRecord4870() {
		assertEquals("100 N Chestnut St", customers.get(4869).getAddress());
	}

	@Test
	@DisplayName("Record 4870: City is Seymour")
	void CityOfRecord4870() {
		assertEquals("Seymour", customers.get(4869).getCity());
	}

	@Test
	@DisplayName("Record 4870: County is Jackson")
	void CountyOfRecord4870() {
		assertEquals("Jackson", customers.get(4869).getCounty());
	}

	@Test
	@DisplayName("Record 4870: State is IN")
	void StateOfRecord4870() {
		assertEquals("IN", customers.get(4869).getState());
	}

	@Test
	@DisplayName("Record 4870: ZIP is 47274")
	void ZIPOfRecord4870() {
		assertEquals("47274", customers.get(4869).getZIP());
	}

	@Test
	@DisplayName("Record 4870: Phone is 812-522-9682")
	void PhoneOfRecord4870() {
		assertEquals("812-522-9682", customers.get(4869).getPhone());
	}

	@Test
	@DisplayName("Record 4870: Fax is 812-522-2237")
	void FaxOfRecord4870() {
		assertEquals("812-522-2237", customers.get(4869).getFax());
	}

	@Test
	@DisplayName("Record 4870: Email is jae@kresal.com")
	void EmailOfRecord4870() {
		assertEquals("jae@kresal.com", customers.get(4869).getEmail());
	}

	@Test
	@DisplayName("Record 4870: Web is http://www.jaekresal.com")
	void WebOfRecord4870() {
		assertEquals("http://www.jaekresal.com", customers.get(4869).getWeb());
	}
}
