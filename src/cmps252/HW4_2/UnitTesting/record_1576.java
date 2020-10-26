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

@Tag("35")
class Record_1576 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1576: FirstName is Valarie")
	void FirstNameOfRecord1576() {
		assertEquals("Valarie", customers.get(1575).getFirstName());
	}

	@Test
	@DisplayName("Record 1576: LastName is Simitian")
	void LastNameOfRecord1576() {
		assertEquals("Simitian", customers.get(1575).getLastName());
	}

	@Test
	@DisplayName("Record 1576: Company is Disc Inc")
	void CompanyOfRecord1576() {
		assertEquals("Disc Inc", customers.get(1575).getCompany());
	}

	@Test
	@DisplayName("Record 1576: Address is 372 Henry St")
	void AddressOfRecord1576() {
		assertEquals("372 Henry St", customers.get(1575).getAddress());
	}

	@Test
	@DisplayName("Record 1576: City is Orange")
	void CityOfRecord1576() {
		assertEquals("Orange", customers.get(1575).getCity());
	}

	@Test
	@DisplayName("Record 1576: County is Essex")
	void CountyOfRecord1576() {
		assertEquals("Essex", customers.get(1575).getCounty());
	}

	@Test
	@DisplayName("Record 1576: State is NJ")
	void StateOfRecord1576() {
		assertEquals("NJ", customers.get(1575).getState());
	}

	@Test
	@DisplayName("Record 1576: ZIP is 7050")
	void ZIPOfRecord1576() {
		assertEquals("7050", customers.get(1575).getZIP());
	}

	@Test
	@DisplayName("Record 1576: Phone is 973-673-3833")
	void PhoneOfRecord1576() {
		assertEquals("973-673-3833", customers.get(1575).getPhone());
	}

	@Test
	@DisplayName("Record 1576: Fax is 973-673-3407")
	void FaxOfRecord1576() {
		assertEquals("973-673-3407", customers.get(1575).getFax());
	}

	@Test
	@DisplayName("Record 1576: Email is valarie@simitian.com")
	void EmailOfRecord1576() {
		assertEquals("valarie@simitian.com", customers.get(1575).getEmail());
	}

	@Test
	@DisplayName("Record 1576: Web is http://www.valariesimitian.com")
	void WebOfRecord1576() {
		assertEquals("http://www.valariesimitian.com", customers.get(1575).getWeb());
	}
}
