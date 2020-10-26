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

@Tag("16")
class Record_532 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 532: FirstName is Tracey")
	void FirstNameOfRecord532() {
		assertEquals("Tracey", customers.get(531).getFirstName());
	}

	@Test
	@DisplayName("Record 532: LastName is Knoles")
	void LastNameOfRecord532() {
		assertEquals("Knoles", customers.get(531).getLastName());
	}

	@Test
	@DisplayName("Record 532: Company is Thielen, Arthur J")
	void CompanyOfRecord532() {
		assertEquals("Thielen, Arthur J", customers.get(531).getCompany());
	}

	@Test
	@DisplayName("Record 532: Address is 3135 S Taylor Ave")
	void AddressOfRecord532() {
		assertEquals("3135 S Taylor Ave", customers.get(531).getAddress());
	}

	@Test
	@DisplayName("Record 532: City is Milwaukee")
	void CityOfRecord532() {
		assertEquals("Milwaukee", customers.get(531).getCity());
	}

	@Test
	@DisplayName("Record 532: County is Milwaukee")
	void CountyOfRecord532() {
		assertEquals("Milwaukee", customers.get(531).getCounty());
	}

	@Test
	@DisplayName("Record 532: State is WI")
	void StateOfRecord532() {
		assertEquals("WI", customers.get(531).getState());
	}

	@Test
	@DisplayName("Record 532: ZIP is 53207")
	void ZIPOfRecord532() {
		assertEquals("53207", customers.get(531).getZIP());
	}

	@Test
	@DisplayName("Record 532: Phone is 414-744-7653")
	void PhoneOfRecord532() {
		assertEquals("414-744-7653", customers.get(531).getPhone());
	}

	@Test
	@DisplayName("Record 532: Fax is 414-744-4041")
	void FaxOfRecord532() {
		assertEquals("414-744-4041", customers.get(531).getFax());
	}

	@Test
	@DisplayName("Record 532: Email is tracey@knoles.com")
	void EmailOfRecord532() {
		assertEquals("tracey@knoles.com", customers.get(531).getEmail());
	}

	@Test
	@DisplayName("Record 532: Web is http://www.traceyknoles.com")
	void WebOfRecord532() {
		assertEquals("http://www.traceyknoles.com", customers.get(531).getWeb());
	}
}
