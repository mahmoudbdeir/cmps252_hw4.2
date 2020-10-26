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

@Tag("45")
class Record_1258 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1258: FirstName is Willian")
	void FirstNameOfRecord1258() {
		assertEquals("Willian", customers.get(1257).getFirstName());
	}

	@Test
	@DisplayName("Record 1258: LastName is Longstaff")
	void LastNameOfRecord1258() {
		assertEquals("Longstaff", customers.get(1257).getLastName());
	}

	@Test
	@DisplayName("Record 1258: Company is Eastern California Museum")
	void CompanyOfRecord1258() {
		assertEquals("Eastern California Museum", customers.get(1257).getCompany());
	}

	@Test
	@DisplayName("Record 1258: Address is 950 S Federal Blvd")
	void AddressOfRecord1258() {
		assertEquals("950 S Federal Blvd", customers.get(1257).getAddress());
	}

	@Test
	@DisplayName("Record 1258: City is Denver")
	void CityOfRecord1258() {
		assertEquals("Denver", customers.get(1257).getCity());
	}

	@Test
	@DisplayName("Record 1258: County is Denver")
	void CountyOfRecord1258() {
		assertEquals("Denver", customers.get(1257).getCounty());
	}

	@Test
	@DisplayName("Record 1258: State is CO")
	void StateOfRecord1258() {
		assertEquals("CO", customers.get(1257).getState());
	}

	@Test
	@DisplayName("Record 1258: ZIP is 80219")
	void ZIPOfRecord1258() {
		assertEquals("80219", customers.get(1257).getZIP());
	}

	@Test
	@DisplayName("Record 1258: Phone is 303-936-8620")
	void PhoneOfRecord1258() {
		assertEquals("303-936-8620", customers.get(1257).getPhone());
	}

	@Test
	@DisplayName("Record 1258: Fax is 303-936-0822")
	void FaxOfRecord1258() {
		assertEquals("303-936-0822", customers.get(1257).getFax());
	}

	@Test
	@DisplayName("Record 1258: Email is willian@longstaff.com")
	void EmailOfRecord1258() {
		assertEquals("willian@longstaff.com", customers.get(1257).getEmail());
	}

	@Test
	@DisplayName("Record 1258: Web is http://www.willianlongstaff.com")
	void WebOfRecord1258() {
		assertEquals("http://www.willianlongstaff.com", customers.get(1257).getWeb());
	}
}
