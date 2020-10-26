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

@Tag("19")
class Record_1530 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1530: FirstName is Lynwood")
	void FirstNameOfRecord1530() {
		assertEquals("Lynwood", customers.get(1529).getFirstName());
	}

	@Test
	@DisplayName("Record 1530: LastName is Noneman")
	void LastNameOfRecord1530() {
		assertEquals("Noneman", customers.get(1529).getLastName());
	}

	@Test
	@DisplayName("Record 1530: Company is Alside Supply Co North Phila")
	void CompanyOfRecord1530() {
		assertEquals("Alside Supply Co North Phila", customers.get(1529).getCompany());
	}

	@Test
	@DisplayName("Record 1530: Address is 717 Grove St")
	void AddressOfRecord1530() {
		assertEquals("717 Grove St", customers.get(1529).getAddress());
	}

	@Test
	@DisplayName("Record 1530: City is Irvington")
	void CityOfRecord1530() {
		assertEquals("Irvington", customers.get(1529).getCity());
	}

	@Test
	@DisplayName("Record 1530: County is Essex")
	void CountyOfRecord1530() {
		assertEquals("Essex", customers.get(1529).getCounty());
	}

	@Test
	@DisplayName("Record 1530: State is NJ")
	void StateOfRecord1530() {
		assertEquals("NJ", customers.get(1529).getState());
	}

	@Test
	@DisplayName("Record 1530: ZIP is 7111")
	void ZIPOfRecord1530() {
		assertEquals("7111", customers.get(1529).getZIP());
	}

	@Test
	@DisplayName("Record 1530: Phone is 973-373-5281")
	void PhoneOfRecord1530() {
		assertEquals("973-373-5281", customers.get(1529).getPhone());
	}

	@Test
	@DisplayName("Record 1530: Fax is 973-373-5301")
	void FaxOfRecord1530() {
		assertEquals("973-373-5301", customers.get(1529).getFax());
	}

	@Test
	@DisplayName("Record 1530: Email is lynwood@noneman.com")
	void EmailOfRecord1530() {
		assertEquals("lynwood@noneman.com", customers.get(1529).getEmail());
	}

	@Test
	@DisplayName("Record 1530: Web is http://www.lynwoodnoneman.com")
	void WebOfRecord1530() {
		assertEquals("http://www.lynwoodnoneman.com", customers.get(1529).getWeb());
	}
}
