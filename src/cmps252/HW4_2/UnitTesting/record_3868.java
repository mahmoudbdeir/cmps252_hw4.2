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

@Tag("30")
class Record_3868 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3868: FirstName is Mara")
	void FirstNameOfRecord3868() {
		assertEquals("Mara", customers.get(3867).getFirstName());
	}

	@Test
	@DisplayName("Record 3868: LastName is Tiedt")
	void LastNameOfRecord3868() {
		assertEquals("Tiedt", customers.get(3867).getLastName());
	}

	@Test
	@DisplayName("Record 3868: Company is Mulligan & Mulligan")
	void CompanyOfRecord3868() {
		assertEquals("Mulligan & Mulligan", customers.get(3867).getCompany());
	}

	@Test
	@DisplayName("Record 3868: Address is 29176 Euclid Ave")
	void AddressOfRecord3868() {
		assertEquals("29176 Euclid Ave", customers.get(3867).getAddress());
	}

	@Test
	@DisplayName("Record 3868: City is Wickliffe")
	void CityOfRecord3868() {
		assertEquals("Wickliffe", customers.get(3867).getCity());
	}

	@Test
	@DisplayName("Record 3868: County is Lake")
	void CountyOfRecord3868() {
		assertEquals("Lake", customers.get(3867).getCounty());
	}

	@Test
	@DisplayName("Record 3868: State is OH")
	void StateOfRecord3868() {
		assertEquals("OH", customers.get(3867).getState());
	}

	@Test
	@DisplayName("Record 3868: ZIP is 44092")
	void ZIPOfRecord3868() {
		assertEquals("44092", customers.get(3867).getZIP());
	}

	@Test
	@DisplayName("Record 3868: Phone is 440-942-5244")
	void PhoneOfRecord3868() {
		assertEquals("440-942-5244", customers.get(3867).getPhone());
	}

	@Test
	@DisplayName("Record 3868: Fax is 440-942-2401")
	void FaxOfRecord3868() {
		assertEquals("440-942-2401", customers.get(3867).getFax());
	}

	@Test
	@DisplayName("Record 3868: Email is mara@tiedt.com")
	void EmailOfRecord3868() {
		assertEquals("mara@tiedt.com", customers.get(3867).getEmail());
	}

	@Test
	@DisplayName("Record 3868: Web is http://www.maratiedt.com")
	void WebOfRecord3868() {
		assertEquals("http://www.maratiedt.com", customers.get(3867).getWeb());
	}
}
