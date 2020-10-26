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

@Tag("38")
class Record_1868 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1868: FirstName is Bryce")
	void FirstNameOfRecord1868() {
		assertEquals("Bryce", customers.get(1867).getFirstName());
	}

	@Test
	@DisplayName("Record 1868: LastName is Verros")
	void LastNameOfRecord1868() {
		assertEquals("Verros", customers.get(1867).getLastName());
	}

	@Test
	@DisplayName("Record 1868: Company is Ware Nielson & Associates Cpas")
	void CompanyOfRecord1868() {
		assertEquals("Ware Nielson & Associates Cpas", customers.get(1867).getCompany());
	}

	@Test
	@DisplayName("Record 1868: Address is 31 River St")
	void AddressOfRecord1868() {
		assertEquals("31 River St", customers.get(1867).getAddress());
	}

	@Test
	@DisplayName("Record 1868: City is Millbury")
	void CityOfRecord1868() {
		assertEquals("Millbury", customers.get(1867).getCity());
	}

	@Test
	@DisplayName("Record 1868: County is Worcester")
	void CountyOfRecord1868() {
		assertEquals("Worcester", customers.get(1867).getCounty());
	}

	@Test
	@DisplayName("Record 1868: State is MA")
	void StateOfRecord1868() {
		assertEquals("MA", customers.get(1867).getState());
	}

	@Test
	@DisplayName("Record 1868: ZIP is 1527")
	void ZIPOfRecord1868() {
		assertEquals("1527", customers.get(1867).getZIP());
	}

	@Test
	@DisplayName("Record 1868: Phone is 508-865-6758")
	void PhoneOfRecord1868() {
		assertEquals("508-865-6758", customers.get(1867).getPhone());
	}

	@Test
	@DisplayName("Record 1868: Fax is 508-865-6131")
	void FaxOfRecord1868() {
		assertEquals("508-865-6131", customers.get(1867).getFax());
	}

	@Test
	@DisplayName("Record 1868: Email is bryce@verros.com")
	void EmailOfRecord1868() {
		assertEquals("bryce@verros.com", customers.get(1867).getEmail());
	}

	@Test
	@DisplayName("Record 1868: Web is http://www.bryceverros.com")
	void WebOfRecord1868() {
		assertEquals("http://www.bryceverros.com", customers.get(1867).getWeb());
	}
}
