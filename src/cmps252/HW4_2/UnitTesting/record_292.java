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

@Tag("22")
class Record_292 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 292: FirstName is Tillie")
	void FirstNameOfRecord292() {
		assertEquals("Tillie", customers.get(291).getFirstName());
	}

	@Test
	@DisplayName("Record 292: LastName is Cowder")
	void LastNameOfRecord292() {
		assertEquals("Cowder", customers.get(291).getLastName());
	}

	@Test
	@DisplayName("Record 292: Company is Read, Nolan K Esq")
	void CompanyOfRecord292() {
		assertEquals("Read, Nolan K Esq", customers.get(291).getCompany());
	}

	@Test
	@DisplayName("Record 292: Address is 1852 Janke Dr")
	void AddressOfRecord292() {
		assertEquals("1852 Janke Dr", customers.get(291).getAddress());
	}

	@Test
	@DisplayName("Record 292: City is Northbrook")
	void CityOfRecord292() {
		assertEquals("Northbrook", customers.get(291).getCity());
	}

	@Test
	@DisplayName("Record 292: County is Cook")
	void CountyOfRecord292() {
		assertEquals("Cook", customers.get(291).getCounty());
	}

	@Test
	@DisplayName("Record 292: State is IL")
	void StateOfRecord292() {
		assertEquals("IL", customers.get(291).getState());
	}

	@Test
	@DisplayName("Record 292: ZIP is 60062")
	void ZIPOfRecord292() {
		assertEquals("60062", customers.get(291).getZIP());
	}

	@Test
	@DisplayName("Record 292: Phone is 847-559-8810")
	void PhoneOfRecord292() {
		assertEquals("847-559-8810", customers.get(291).getPhone());
	}

	@Test
	@DisplayName("Record 292: Fax is 847-559-3184")
	void FaxOfRecord292() {
		assertEquals("847-559-3184", customers.get(291).getFax());
	}

	@Test
	@DisplayName("Record 292: Email is tillie@cowder.com")
	void EmailOfRecord292() {
		assertEquals("tillie@cowder.com", customers.get(291).getEmail());
	}

	@Test
	@DisplayName("Record 292: Web is http://www.tilliecowder.com")
	void WebOfRecord292() {
		assertEquals("http://www.tilliecowder.com", customers.get(291).getWeb());
	}
}
