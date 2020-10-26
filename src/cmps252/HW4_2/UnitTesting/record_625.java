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

@Tag("1")
class Record_625 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 625: FirstName is Leo")
	void FirstNameOfRecord625() {
		assertEquals("Leo", customers.get(624).getFirstName());
	}

	@Test
	@DisplayName("Record 625: LastName is Liapis")
	void LastNameOfRecord625() {
		assertEquals("Liapis", customers.get(624).getLastName());
	}

	@Test
	@DisplayName("Record 625: Company is Bekins Moving & Storage")
	void CompanyOfRecord625() {
		assertEquals("Bekins Moving & Storage", customers.get(624).getCompany());
	}

	@Test
	@DisplayName("Record 625: Address is 1931 W San Carlos St")
	void AddressOfRecord625() {
		assertEquals("1931 W San Carlos St", customers.get(624).getAddress());
	}

	@Test
	@DisplayName("Record 625: City is San Jose")
	void CityOfRecord625() {
		assertEquals("San Jose", customers.get(624).getCity());
	}

	@Test
	@DisplayName("Record 625: County is Santa Clara")
	void CountyOfRecord625() {
		assertEquals("Santa Clara", customers.get(624).getCounty());
	}

	@Test
	@DisplayName("Record 625: State is CA")
	void StateOfRecord625() {
		assertEquals("CA", customers.get(624).getState());
	}

	@Test
	@DisplayName("Record 625: ZIP is 95128")
	void ZIPOfRecord625() {
		assertEquals("95128", customers.get(624).getZIP());
	}

	@Test
	@DisplayName("Record 625: Phone is 408-293-1953")
	void PhoneOfRecord625() {
		assertEquals("408-293-1953", customers.get(624).getPhone());
	}

	@Test
	@DisplayName("Record 625: Fax is 408-293-0207")
	void FaxOfRecord625() {
		assertEquals("408-293-0207", customers.get(624).getFax());
	}

	@Test
	@DisplayName("Record 625: Email is leo@liapis.com")
	void EmailOfRecord625() {
		assertEquals("leo@liapis.com", customers.get(624).getEmail());
	}

	@Test
	@DisplayName("Record 625: Web is http://www.leoliapis.com")
	void WebOfRecord625() {
		assertEquals("http://www.leoliapis.com", customers.get(624).getWeb());
	}
}
