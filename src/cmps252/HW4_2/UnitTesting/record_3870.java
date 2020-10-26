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

@Tag("12")
class Record_3870 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3870: FirstName is Isabell")
	void FirstNameOfRecord3870() {
		assertEquals("Isabell", customers.get(3869).getFirstName());
	}

	@Test
	@DisplayName("Record 3870: LastName is Chrisman")
	void LastNameOfRecord3870() {
		assertEquals("Chrisman", customers.get(3869).getLastName());
	}

	@Test
	@DisplayName("Record 3870: Company is Fatsinger, Stephen R Esq")
	void CompanyOfRecord3870() {
		assertEquals("Fatsinger, Stephen R Esq", customers.get(3869).getCompany());
	}

	@Test
	@DisplayName("Record 3870: Address is 2940 West St")
	void AddressOfRecord3870() {
		assertEquals("2940 West St", customers.get(3869).getAddress());
	}

	@Test
	@DisplayName("Record 3870: City is Emeryville")
	void CityOfRecord3870() {
		assertEquals("Emeryville", customers.get(3869).getCity());
	}

	@Test
	@DisplayName("Record 3870: County is Alameda")
	void CountyOfRecord3870() {
		assertEquals("Alameda", customers.get(3869).getCounty());
	}

	@Test
	@DisplayName("Record 3870: State is CA")
	void StateOfRecord3870() {
		assertEquals("CA", customers.get(3869).getState());
	}

	@Test
	@DisplayName("Record 3870: ZIP is 94608")
	void ZIPOfRecord3870() {
		assertEquals("94608", customers.get(3869).getZIP());
	}

	@Test
	@DisplayName("Record 3870: Phone is 510-444-9032")
	void PhoneOfRecord3870() {
		assertEquals("510-444-9032", customers.get(3869).getPhone());
	}

	@Test
	@DisplayName("Record 3870: Fax is 510-444-4468")
	void FaxOfRecord3870() {
		assertEquals("510-444-4468", customers.get(3869).getFax());
	}

	@Test
	@DisplayName("Record 3870: Email is isabell@chrisman.com")
	void EmailOfRecord3870() {
		assertEquals("isabell@chrisman.com", customers.get(3869).getEmail());
	}

	@Test
	@DisplayName("Record 3870: Web is http://www.isabellchrisman.com")
	void WebOfRecord3870() {
		assertEquals("http://www.isabellchrisman.com", customers.get(3869).getWeb());
	}
}
