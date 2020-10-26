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

@Tag("31")
class Record_3748 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3748: FirstName is Vern")
	void FirstNameOfRecord3748() {
		assertEquals("Vern", customers.get(3747).getFirstName());
	}

	@Test
	@DisplayName("Record 3748: LastName is Dellow")
	void LastNameOfRecord3748() {
		assertEquals("Dellow", customers.get(3747).getLastName());
	}

	@Test
	@DisplayName("Record 3748: Company is Fagg, Gary W Cpa")
	void CompanyOfRecord3748() {
		assertEquals("Fagg, Gary W Cpa", customers.get(3747).getCompany());
	}

	@Test
	@DisplayName("Record 3748: Address is 5 Allen St")
	void AddressOfRecord3748() {
		assertEquals("5 Allen St", customers.get(3747).getAddress());
	}

	@Test
	@DisplayName("Record 3748: City is Netcong")
	void CityOfRecord3748() {
		assertEquals("Netcong", customers.get(3747).getCity());
	}

	@Test
	@DisplayName("Record 3748: County is Morris")
	void CountyOfRecord3748() {
		assertEquals("Morris", customers.get(3747).getCounty());
	}

	@Test
	@DisplayName("Record 3748: State is NJ")
	void StateOfRecord3748() {
		assertEquals("NJ", customers.get(3747).getState());
	}

	@Test
	@DisplayName("Record 3748: ZIP is 7857")
	void ZIPOfRecord3748() {
		assertEquals("7857", customers.get(3747).getZIP());
	}

	@Test
	@DisplayName("Record 3748: Phone is 973-347-0975")
	void PhoneOfRecord3748() {
		assertEquals("973-347-0975", customers.get(3747).getPhone());
	}

	@Test
	@DisplayName("Record 3748: Fax is 973-347-1205")
	void FaxOfRecord3748() {
		assertEquals("973-347-1205", customers.get(3747).getFax());
	}

	@Test
	@DisplayName("Record 3748: Email is vern@dellow.com")
	void EmailOfRecord3748() {
		assertEquals("vern@dellow.com", customers.get(3747).getEmail());
	}

	@Test
	@DisplayName("Record 3748: Web is http://www.verndellow.com")
	void WebOfRecord3748() {
		assertEquals("http://www.verndellow.com", customers.get(3747).getWeb());
	}
}
