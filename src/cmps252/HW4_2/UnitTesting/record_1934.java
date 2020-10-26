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
class Record_1934 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1934: FirstName is Rosario")
	void FirstNameOfRecord1934() {
		assertEquals("Rosario", customers.get(1933).getFirstName());
	}

	@Test
	@DisplayName("Record 1934: LastName is Fabian")
	void LastNameOfRecord1934() {
		assertEquals("Fabian", customers.get(1933).getLastName());
	}

	@Test
	@DisplayName("Record 1934: Company is Parole District Office No 9")
	void CompanyOfRecord1934() {
		assertEquals("Parole District Office No 9", customers.get(1933).getCompany());
	}

	@Test
	@DisplayName("Record 1934: Address is 319 Sw Washington St  #-520")
	void AddressOfRecord1934() {
		assertEquals("319 Sw Washington St  #-520", customers.get(1933).getAddress());
	}

	@Test
	@DisplayName("Record 1934: City is Portland")
	void CityOfRecord1934() {
		assertEquals("Portland", customers.get(1933).getCity());
	}

	@Test
	@DisplayName("Record 1934: County is Multnomah")
	void CountyOfRecord1934() {
		assertEquals("Multnomah", customers.get(1933).getCounty());
	}

	@Test
	@DisplayName("Record 1934: State is OR")
	void StateOfRecord1934() {
		assertEquals("OR", customers.get(1933).getState());
	}

	@Test
	@DisplayName("Record 1934: ZIP is 97204")
	void ZIPOfRecord1934() {
		assertEquals("97204", customers.get(1933).getZIP());
	}

	@Test
	@DisplayName("Record 1934: Phone is 503-241-6949")
	void PhoneOfRecord1934() {
		assertEquals("503-241-6949", customers.get(1933).getPhone());
	}

	@Test
	@DisplayName("Record 1934: Fax is 503-241-3103")
	void FaxOfRecord1934() {
		assertEquals("503-241-3103", customers.get(1933).getFax());
	}

	@Test
	@DisplayName("Record 1934: Email is rosario@fabian.com")
	void EmailOfRecord1934() {
		assertEquals("rosario@fabian.com", customers.get(1933).getEmail());
	}

	@Test
	@DisplayName("Record 1934: Web is http://www.rosariofabian.com")
	void WebOfRecord1934() {
		assertEquals("http://www.rosariofabian.com", customers.get(1933).getWeb());
	}
}
