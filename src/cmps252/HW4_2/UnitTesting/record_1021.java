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

@Tag("2")
class Record_1021 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1021: FirstName is Sonny")
	void FirstNameOfRecord1021() {
		assertEquals("Sonny", customers.get(1020).getFirstName());
	}

	@Test
	@DisplayName("Record 1021: LastName is Labeots")
	void LastNameOfRecord1021() {
		assertEquals("Labeots", customers.get(1020).getLastName());
	}

	@Test
	@DisplayName("Record 1021: Company is Marra, Kenneth A Esq")
	void CompanyOfRecord1021() {
		assertEquals("Marra, Kenneth A Esq", customers.get(1020).getCompany());
	}

	@Test
	@DisplayName("Record 1021: Address is 1008 E Geneva Rd")
	void AddressOfRecord1021() {
		assertEquals("1008 E Geneva Rd", customers.get(1020).getAddress());
	}

	@Test
	@DisplayName("Record 1021: City is Wheaton")
	void CityOfRecord1021() {
		assertEquals("Wheaton", customers.get(1020).getCity());
	}

	@Test
	@DisplayName("Record 1021: County is DuPage")
	void CountyOfRecord1021() {
		assertEquals("DuPage", customers.get(1020).getCounty());
	}

	@Test
	@DisplayName("Record 1021: State is IL")
	void StateOfRecord1021() {
		assertEquals("IL", customers.get(1020).getState());
	}

	@Test
	@DisplayName("Record 1021: ZIP is 60187")
	void ZIPOfRecord1021() {
		assertEquals("60187", customers.get(1020).getZIP());
	}

	@Test
	@DisplayName("Record 1021: Phone is 630-752-7948")
	void PhoneOfRecord1021() {
		assertEquals("630-752-7948", customers.get(1020).getPhone());
	}

	@Test
	@DisplayName("Record 1021: Fax is 630-752-2923")
	void FaxOfRecord1021() {
		assertEquals("630-752-2923", customers.get(1020).getFax());
	}

	@Test
	@DisplayName("Record 1021: Email is sonny@labeots.com")
	void EmailOfRecord1021() {
		assertEquals("sonny@labeots.com", customers.get(1020).getEmail());
	}

	@Test
	@DisplayName("Record 1021: Web is http://www.sonnylabeots.com")
	void WebOfRecord1021() {
		assertEquals("http://www.sonnylabeots.com", customers.get(1020).getWeb());
	}
}
