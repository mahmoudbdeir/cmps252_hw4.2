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

@Tag("42")
class Record_1115 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1115: FirstName is Terrell")
	void FirstNameOfRecord1115() {
		assertEquals("Terrell", customers.get(1114).getFirstName());
	}

	@Test
	@DisplayName("Record 1115: LastName is Prez")
	void LastNameOfRecord1115() {
		assertEquals("Prez", customers.get(1114).getLastName());
	}

	@Test
	@DisplayName("Record 1115: Company is Helman, Grant M Esq")
	void CompanyOfRecord1115() {
		assertEquals("Helman, Grant M Esq", customers.get(1114).getCompany());
	}

	@Test
	@DisplayName("Record 1115: Address is 601 S Wilson Way")
	void AddressOfRecord1115() {
		assertEquals("601 S Wilson Way", customers.get(1114).getAddress());
	}

	@Test
	@DisplayName("Record 1115: City is Stockton")
	void CityOfRecord1115() {
		assertEquals("Stockton", customers.get(1114).getCity());
	}

	@Test
	@DisplayName("Record 1115: County is San Joaquin")
	void CountyOfRecord1115() {
		assertEquals("San Joaquin", customers.get(1114).getCounty());
	}

	@Test
	@DisplayName("Record 1115: State is CA")
	void StateOfRecord1115() {
		assertEquals("CA", customers.get(1114).getState());
	}

	@Test
	@DisplayName("Record 1115: ZIP is 95205")
	void ZIPOfRecord1115() {
		assertEquals("95205", customers.get(1114).getZIP());
	}

	@Test
	@DisplayName("Record 1115: Phone is 209-463-6705")
	void PhoneOfRecord1115() {
		assertEquals("209-463-6705", customers.get(1114).getPhone());
	}

	@Test
	@DisplayName("Record 1115: Fax is 209-463-7606")
	void FaxOfRecord1115() {
		assertEquals("209-463-7606", customers.get(1114).getFax());
	}

	@Test
	@DisplayName("Record 1115: Email is terrell@prez.com")
	void EmailOfRecord1115() {
		assertEquals("terrell@prez.com", customers.get(1114).getEmail());
	}

	@Test
	@DisplayName("Record 1115: Web is http://www.terrellprez.com")
	void WebOfRecord1115() {
		assertEquals("http://www.terrellprez.com", customers.get(1114).getWeb());
	}
}
